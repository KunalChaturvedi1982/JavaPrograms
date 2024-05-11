package javaProgramsPackage;

public class TestClass {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0]=112;
		arr[1]=87;
		arr[2]=57;
		arr[3]=90;
		arr[4]=61;
		
		long douarr=0;
		for(int i=0;i<arr.length;i++)
		{
			douarr = arr[i] *2;
			System.out.println(douarr);
		}
		
	}

}
