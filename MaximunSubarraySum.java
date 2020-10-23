package ArrayChallenges;


import java.util.Scanner;

public class MaximunSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++) {
		
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int csum=arr[0];
		int osum=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(csum<0) {
				csum=arr[i];
			} else {
				
				csum+=arr[i];
			}
			if(csum>osum) {
				osum=csum;
			}
		}
		
		System.out.println(osum);
		
		}
	}

}
