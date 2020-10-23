package ArrayChallenges;

import java.util.Scanner;

public class KthRoots {

	public static int pow(int a,int b) {
		if(b==0) {
			return 1;
		}else {
		
		return a*pow(a,b-1);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int count=0;
			
			long n=sc.nextLong();
			int k=sc.nextInt();
			
			while(n!=0) {
				 n=n/10;
				 count++;
			 }
			
			int pr=count-1/k;
			int ans=pow(10,pr);
			System.out.println(ans);
		}
		
		
	}

}
