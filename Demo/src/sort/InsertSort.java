package sort;

public class InsertSort {

	/**直接插入排序
	 * 基本思想：在要排序的一组数中，假设前面有（n-1）[n>=2]个数已经是
	 * 排好顺序的，现在要把第n个数插到前面的有序数中，使得这n个数也是
	 * 排好序的。如此反复循环，直到全部排好顺序。
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {49,38,25,97};
		int temp = 0;
		for(int i=1;i<a.length;i++){
			int j=i-1;
			temp=a[i];
			for(;j>=0&&temp<a[j];j--){
				a[j+1]=a[j];
			}
			a[j+1]=temp;
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
}
