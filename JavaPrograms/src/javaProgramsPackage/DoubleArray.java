package javaProgramsPackage;

public class DoubleArray {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0]=5;
		arr[1]=7;
		arr[2]=6;
		arr[3]=3;
		arr[4]=9;
		for(int i=0;i<=arr.length;i++)
		{
			int doubleArray=arr[i]*2;
			System.out.println(doubleArray);
		}

	}

}
