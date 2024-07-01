import java.util.Scanner;
public class Sorting {
    public static int[] sorting(int [] arr){
        for(int p=0;p<arr.length;p++){
			for(int i=0;i<(arr.length-1-p);i++){
				if(arr[i]>arr[i+1]){
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;

				}
			}
		}
		return arr;
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n=sc.nextInt();
		int[]arr=new int[n];
		
		System.out.println("Enter the value of the array :");
		for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
			
		}
		int[] sarr=sorting(arr);
		for(int i=0;i<sarr.length;i++) {
			System.out.print(sarr[i]+" ");
		}
    }
}
