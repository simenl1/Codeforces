import java.util.Scanner;


public class B {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] table = new long[n];
		for(int i = 0; i < n; i++){
			table[i] = sc.nextLong();
		}
		if(n == 1){
			System.out.println(1);
		}
		else if(n == 2){
			System.out.println(2);
		}
		else{
			int start = 0;
			int index = 2;
			int count = 2;
			int best = 2;
			while(index < n){
				if(table[index-1] + table[index-2] == table[index]){
					count++;
				}
				else{
					count = 2;
				}
				if(count > best){
					best = count;
				}
				index++;
			}
			System.out.println(best);
		}
	}
}
