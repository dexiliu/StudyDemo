package sort;

public class Sort {

	public static void main(String[] args) {
		int[] sort={4,8,10,2,56,85,14,30,1,60};
		insertSort(sort);
		for(int i=0;i<sort.length-1;i++){
			System.out.println(sort[i]);
		}
	}
	
	/**
	 * 冒泡排序
	 * @param arr
	 */
	public static void bubbleSort(int[] arr){
		if(arr==null || arr.length==0){
			return;
		}
		for(int i=0;i<arr.length-1;i++){
			for(int j=arr.length-1;j>i;j--){
				if(arr[j]<arr[j-1]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	/**
	 * 选择排序
	 * @param arr
	 */
	public static void selectSort(int[] arr){
		if(arr==null || arr.length==0){
			return;
		}
		int minIndex=0;
		for(int i=0;i<arr.length-1;i++){
			minIndex=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[minIndex]){
					minIndex=j;
				}
			}
			if(minIndex!=i){
				int temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
			}
		}
	}
	
	/**
	 * 插入排序
	 * @param arr  4,8,10,2,56,85,14,30,1,60
	 */
	public static void insertSort(int[] arr){
		if(arr==null || arr.length==0){
			return;
		}
		for(int i=1;i<arr.length;i++){
			int j=i;
			int target=arr[i];//待插入
			
			while(j>0 && target<arr[j-1]){
				arr[j]=arr[j-1];
				j--;
			}
			
			//插入
			arr[j]=target;
		}
	}
	
	public static int partition(int[] arr,int left,int right){
		int pivotKey=arr[left];
		
		while(left<right){
			while(left<right && arr[right]>=pivotKey)
				right--;
			arr[left]=arr[right];//把小的移动到左边
			while(left<right && arr[left]<=pivotKey)
				left++;
			arr[right]=arr[left];//把大的移动到右边
		}
		arr[left]=pivotKey;//最后把pivot赋值到中间
		return left;
	}
	
	public static void quickSort(int[] arr,int left,int right){
		if(left>=right)
			return;
		int pivotPos=partition(arr,left,right);
		quickSort(arr,left,pivotPos-1);
		quickSort(arr,pivotPos+1,right);
	}
	
	/**
	 * 快速排序
	 * @param arr
	 */
	public static void sort(int[] arr){
		if(arr==null || arr.length==0)
			return;
		quickSort(arr,0,arr.length-1);
	}
}
