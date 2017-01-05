package demo;

import java.util.Date;
import java.util.Scanner;

/**
 * ¿ìËÙÅÅĞò
 * 
 * @author Administrator
 * 
 */

public class quick {

	public static void main(String[] args) {
		int s[] = new int[] { 6532, 3651, 351, 3152, 3512, 351, 35, 65413, 321,
				646, 65396, 651, 4651, 541, 651, 6849, 61653 };
		int len = s.length;
		System.out.println(len);
		Date date1 = new Date();
		System.out.println(date1.getSeconds());
		new quick().sort(s, 0, len - 1);

		System.out.println("\n");
		Date date2 = new Date();
		System.out.println(date2.getSeconds());
		System.out.println(date2.getSeconds() - date1.getSeconds());
	}

	public void sort(int[] s, int o, int e) {
		int left = o;
		int right = e;
		int temp;
		if (o < e) {
			while (left < right) {
				while (left < e && s[left] <= s[o]) {
					left++;
				}
				while (right > o && s[right] > s[o]) {
					right--;
				}
				if (left < right) {
					temp = s[left];
					s[left] = s[right];
					s[right] = temp;
				}
			}
			temp = s[o];
			s[o] = s[right];
			s[right] = temp;

			this.sort(s, o, right - 1);
			this.sort(s, right + 1, e);

		}
	}

}
