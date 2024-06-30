

import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num :");
		int num=sc.nextInt();
		int []ar=new int[num];
		for(int i=0;i<num;i++) {
			ar[i]=sc.nextInt();
		}System.out.print("Enter the elements of the array: ");
		for(int i=0;i<num;i++) {
			System.out.print(ar[i]+ " ");
		}int max=ar[0];
		for(int i=0;i<num;i++) {
			if(ar[i]>max) {
				max=ar[i];		
			}
		}
        int min=ar[0];
		for(int i=0;i<num;i++) {
			if(ar[i]<min) {
				min=ar[i];
			}
		}
        System.out.println("\nMaximum element of array is : "+max+" and occurs ");
		System.out.println("Minimum element of array is : "+min+" and occurs ");
    }    
}
