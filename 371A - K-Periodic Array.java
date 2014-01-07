import java.util.Scanner;


public class A {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int[] table = new int[n];
		int[] test = new int[k];
		for(int i = 0; i < n; i++){
			table[i] = sc.nextInt();
		}
		for(int i = 0; i < k; i++){
			int a = 0;
			int b = 0;
			for(int j = i; j < n; j+=k){
				if(table[j] == 1){
					a++;
				}
				else{
					b++;
				}
			}
			count+= Math.min(a,b);
		}
		System.out.println(count);

	}
}	
