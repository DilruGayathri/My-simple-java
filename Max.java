import java.util.*;
public class Max{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("Enter numbers");
		
		list.add(input.nextInt());
		
		for(Integer i:list){
			System.out.println(i+" ");
		}
	}
}