package javaProgramsPackage;

public class ArrayMax {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0]=45;
		arr[1]=167;
		arr[2]=86;
		arr[3]=171;
		arr[4]=30;
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		System.out.println("Largest element in the array is:" + max);
	}
}
