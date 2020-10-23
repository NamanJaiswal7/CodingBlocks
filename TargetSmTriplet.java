package ArrayChallenges;

import java.util.Scanner;

public class TargetSmTriplet {
	public static void swap(int[] arr, int min, int j) {
		int temp = arr[min];
		arr[min] = arr[j];
		arr[j] = temp;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		
		
for(int pass=1;pass<arr.length;pass++) {
			
			for(int j=0;j<arr.length-pass;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
			
		}
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = i + 2; k < arr.length; k++) {
					if ((arr[i] + arr[j] + arr[k]) == target) {
						int a = arr[i];
						int b = arr[j];
						int c = arr[k];
						
						System.out.println(a + "," + b + "," + c);
					}

				}
			}

		}

	}

}
