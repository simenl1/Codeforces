import java.util.Arrays;
import java.util.Scanner;


public class D {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		int[] boys = new int[n];
		int[] bikeCost = new int[m];
		for(int i = 0; i < n; i++){
			boys[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++){
			bikeCost[i] = sc.nextInt();
		}
		Arrays.sort(bikeCost); //Lowest first.
		Arrays.sort(boys);
		int high = Math.min(m, n);
		int low = 0;
		int mid = 0;
		long cost = 0;
		long temp;
		while(low < high){
			mid = (high+low+1)/2;
			if((temp = possible(mid, boys, bikeCost, a))>=0){
				low = mid;
				cost = temp;
			}
			else{
				high = mid-1;
			}
		}
		if((temp = possible(low, boys, bikeCost, a))>0){
			cost = temp;
		}
		System.out.println(low + " " + cost);
	}

	private static long possible(int mid, int[] boys, int[] bikeCost, int a) {
		long rest = a;
		long personal = 0;
		for(int i = 0; i < mid; i++){
			if(bikeCost[mid-i-1] - boys[boys.length-i-1] > 0){
				personal += boys[boys.length-i-1];
				rest -= bikeCost[mid-i-1] - boys[boys.length-i-1];
			}
			else{
				personal += bikeCost[mid-i-1];
			}
		}
		if(rest < 0){
			return -1;
		}
		personal = Math.max(personal-rest, 0);
		return personal;
	}
}
