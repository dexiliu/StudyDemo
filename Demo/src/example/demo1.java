package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer,List<Integer>> map = a(11);
		System.out.println(map.size());
	}
	
	public static Map<Integer,List<Integer>> a(int n){
		Map<Integer,List<Integer>> map = new HashMap<>();
		List<Integer> list = null;
		for(int i=0;i<n;i++){
			if(i%3==0){
				list = new ArrayList<>();
			}
			list.add(i);
			if((i+1)%3==0){
				map.put(i, list);
			}
			if((i+1)==n){
				map.put(i, list);
			}
		}
		return map;
		
	}

}
