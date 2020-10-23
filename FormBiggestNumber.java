package ArrayChallenges;

import java.util.Scanner;

public class FormBiggestNumber {
	public static void swap(int[] arr, int min, int j) {
		int temp = arr[min];
		arr[min] = arr[j];
		arr[j] = temp;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			
			
			int m=sc.nextInt();
			int [] arr=new int[m];
			
			for(int j=0;j<arr.length;j++) {
				arr[j]=sc.nextInt();
			}
			
			int jc=1;
			
			while(jc<=arr.length-1) {
				//String s1="";String s2="";
				for(int j=0;j<arr.length-jc;j++) {
					 String s1 = Integer.toString(arr[j]);
	                    String s2 = Integer.toString(arr[j+1]);
					s1=""+arr[j];
					s2=""+arr[j+1];	
					String x=s1+s2;
					String y=s2+s1;
					 long x1 = Long.parseLong(x);
	                    long y1 = Long.parseLong(y);
					
					if(x1<y1) {
						swap(arr,j,j+1);
					}
					
				}
				jc++;
			}
			for(int k=0;k<arr.length;k++) {
				System.out.print(arr[k]);
			}
			System.out.println();
			
			
		}
		
		

	}

	

}
