import java.util.Scanner;
public class Occurence {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
		int n=sc.nextInt();
        int count =0;
		int[]arr=new int[n];
		System.out.println("Enter the value of the array :");
		for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
			
		}
        int temp=sc.nextInt();

        for(int i=0;i<arr.length;i++) {    
            if(temp==arr[i]){
                    count++;
            }
        }
        if(count==0){
            System.out.println(temp+" is occurred "+0+" time(s)");
        }
        else{
            System.out.println(temp+" is occurred "+count+" time(s)");
        }

    }
}
