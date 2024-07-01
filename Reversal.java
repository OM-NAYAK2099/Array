import java.util.Scanner;
public class Reversal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n=sc.nextInt();
		int[]arr=new int[n];
		
		System.out.println("Enter the value of the array :");
		for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
			
		}
        System.out.println("Original Array :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		int j=arr.length-1;
		for (int i=0;i<j;i++) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		}
		System.out.println("\nReversal Array :");
		for (int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		
		}
    }
}
