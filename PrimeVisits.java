package ArrayChallenges;
import java.util.*;
public class PrimeVisits {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int a=sc.nextInt();
			int n=sc.nextInt();
		
			int count=0;
			
			int s=n-a;
			boolean[] primes=new boolean[n+1];
			
			for(int j=0;j<primes.length;j++) {
				primes[j]=true;
			}
			primes[0]=false;
			primes[1]=false;
			int n2test=2; // why 2? because jo number hoga wo kissi ka divisible hoga 2 se sqrt of the last number tab pata chalega
			while(n2test*n2test<=n) {
				if(primes[n2test]) {
					for(int multiplier=2;multiplier*n2test<=n;multiplier++) {
						primes[multiplier*n2test]=false;
					}
				}
				n2test++;
			}
			
			for (int k=a;k<primes.length;k++) {
				if(primes[k]) {
					count++;
				}
				
			}
			System.out.println(count);
	}
}
    
    
    
}