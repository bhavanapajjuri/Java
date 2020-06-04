import java.util.Scanner;

public class ArraysAndIteration {
	public static void main(String[] args) {
		String[] fruits = {"apple","bananna","mango"};
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		String s1;
		//variables should be initialized 
		int p=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = s.nextInt();
		
		int[] ar = new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i]= s.nextInt();
		}
		System.out.println("PRINTING THE ARRAY ELEMENTS");
		
		for(int i:ar) {
			System.out.println(i);
			System.out.println(p);
		}
		
		
		
//		
	}

}
