
INSERT INTO `tb_schooltime_grade` VALUES (UUID(), '402881f64becb22c014becb5ab2b0001', '0', '4028823c4d0487fe014d0815eb2b0014', '1', null);


DROP PROCEDURE IF EXISTS `proc_search_norecord_student`;

CREATE PROCEDURE `proc_search_norecord_student`(IN in_begin_date datetime, IN in_end_date datetime, IN in_search_first_date datetime, IN in_search_last_date datetime, IN page_index INT, IN page_size INT, IN departids VARCHAR(10000))
BEGIN

declare page_first int default 0;

set page_first = (page_index-1)*page_size;

if departids != '' then 

select t_stuatt.*, t_maxatt.* from
(
		select stu.id stuid, stu.name, stu.departid, d.departname from tb_student stu
		left join 
		(
			 select id aid, att.tb_student_id from tb_attendance att
			 where  att.occurtime BETWEEN in_begin_date and in_end_date 
			 group by att.tb_student_id
		) att2 on (stu.id = att2.tb_student_id)
    inner join t_s_depart d on (stu.departid = d.id)
		where aid is null and role_id = (select id from t_s_role where rolecode = 'student') 
		and card_status != '0' 
    and find_in_set(stu.departid, departids)
    order by d.seq
		
) t_stuatt
left join
(
		select a2.sid, a1.io, a1.occurtime from tb_attendance a1,
		( 
			select a.tb_student_id as sid,max(a.occurtime) maxtime 
			from tb_attendance a 
			where  a.occurtime BETWEEN in_search_first_date and in_search_last_date 
			GROUP BY a.tb_student_id 
		) a2 
		where a1.tb_student_id = a2.sid and a1.occurtime = a2.maxtime 
) t_maxatt 
on (t_stuatt.stuid = t_maxatt.sid)
LIMIT page_first,page_size;




ELSE 


select t_stuatt.*, t_maxatt.* from
(
		select stu.id stuid, stu.name, stu.departid, d.departname from tb_student stu
		left join 
		(
			 select id aid, att.tb_student_id from tb_attendance att
			 where  att.occurtime BETWEEN in_begin_date and in_end_date 
			 group by att.tb_student_id
		) att2 on (stu.id = att2.tb_student_id)
    inner join t_s_depart d on (stu.departid = d.id)
		where aid is null and role_id = (select id from t_s_role where rolecode = 'student') 
		and card_status != '0' 
    order by d.seq
		
) t_stuatt
left join
(
		select a2.sid, a1.io, a1.occurtime from tb_attendance a1,
		( 
			select a.tb_student_id as sid,max(a.occurtime) maxtime 
			from tb_attendance a 
			where  a.occurtime BETWEEN in_search_first_date and in_search_last_date 
			GROUP BY a.tb_student_id 
		) a2 
		where a1.tb_student_id = a2.sid and a1.occurtime = a2.maxtime 
) t_maxatt 
on (t_stuatt.stuid = t_maxatt.sid)
LIMIT page_first,page_size;



end if;
END;


DROP PROCEDURE IF EXISTS `proc_search_norecord_student_count`;

CREATE PROCEDURE `proc_search_norecord_student_count`(IN in_begin_date datetime, IN in_end_date datetime, IN in_search_first_date datetime, IN in_search_last_date datetime, IN departids VARCHAR(10000))
BEGIN

if departids != '' then 

select count(stuid) total from
(
		select stu.id stuid, stu.name, stu.departid, d.departname from tb_student stu
		left join 
		(
			 select id aid, att.tb_student_id from tb_attendance att
			 where  att.occurtime BETWEEN in_begin_date and in_end_date 
			 group by att.tb_student_id
		) att2 on (stu.id = att2.tb_student_id)
    inner join t_s_depart d on (stu.departid = d.id)
		where aid is null and role_id = (select id from t_s_role where rolecode = 'student') 
		and card_status != '0' 
    and find_in_set(stu.departid, departids)
	
) t_stuatt
left join
(
		select a2.sid, a1.io, a1.occurtime from tb_attendance a1,
		( 
			select a.tb_student_id as sid,max(a.occurtime) maxtime 
			from tb_attendance a 
			where  a.occurtime BETWEEN in_search_first_date and in_search_last_date 
			GROUP BY a.tb_student_id 
		) a2 
		where a1.tb_student_id = a2.sid and a1.occurtime = a2.maxtime 
) t_maxatt 
on (t_stuatt.stuid = t_maxatt.sid);


ELSE 
select count(stuid) total from
(
		select stu.id stuid, stu.name, stu.departid, d.departname from tb_student stu
		left join 
		(
			 select id aid, att.tb_student_id from tb_attendance att
			 where  att.occurtime BETWEEN in_begin_date and in_end_date 
			 group by att.tb_student_id
		) att2 on (stu.id = att2.tb_student_id)
    inner join t_s_depart d on (stu.departid = d.id)
		where aid is null and role_id = (select id from t_s_role where rolecode = 'student') 
		and card_status != '0' 
	
) t_stuatt
left join
(
		select a2.sid, a1.io, a1.occurtime from tb_attendance a1,
		( 
			select a.tb_student_id as sid,max(a.occurtime) maxtime 
			from tb_attendance a 
			where  a.occurtime BETWEEN in_search_first_date and in_search_last_date 
			GROUP BY a.tb_student_id 
		) a2
		where a1.tb_student_id = a2.sid and a1.occurtime = a2.maxtime 
) t_maxatt 
on (t_stuatt.stuid = t_maxatt.sid);

END IF;
END;

DROP TRIGGER IF EXISTS `tb_schooltime_grade_binsert_clouddb`;
DELIMITER ;;
CREATE TRIGGER `tb_schooltime_grade_binsert_clouddb` BEFORE INSERT ON `tb_schooltime_grade` FOR EACH ROW BEGIN
	IF NEW.SYN IS NULL THEN
		SET NEW.SYN = '2';

		UPDATE cloud_syn set UPLOADINSERT = '1'
		WHERE TABLE_NAME = 'tb_schooltime_grade';
	END IF;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tb_schooltime_grade_bupdate_clouddb`;
DELIMITER ;;
CREATE TRIGGER `tb_schooltime_grade_bupdate_clouddb` BEFORE UPDATE ON `tb_schooltime_grade` FOR EACH ROW BEGIN
	IF NEW.SYN IS NULL THEN 
		SET NEW.SYN = '1';
		UPDATE cloud_syn set UPLOADUPDATE = '1'
		WHERE TABLE_NAME = 'tb_schooltime_grade';
  ELSEIF OLD.SYN = '0' AND NEW.SYN = '0' THEN 
		SET NEW.SYN = '1';
		UPDATE cloud_syn set UPLOADUPDATE = '1' 
		WHERE TABLE_NAME = 'tb_schooltime_grade';
	ELSEIF NEW.SYN = '9' THEN 
		SET NEW.SYN = '0';

		
	END IF;
END
;;
DELIMITER ;