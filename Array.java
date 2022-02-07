import java.util.*;
public class MyArray{
	public static void main(String[] args){
		int[] arr=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter values");
		for(int i=0;i<5;i++){
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		for(int j=0;j<5;j++){
			System.out.println(arr[j]);
		}
		System.out.println(arr[arr.length-1]);
	}
}