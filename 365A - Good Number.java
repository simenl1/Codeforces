import java.util.Scanner;


public class A {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		int count = 0;
		for(int i = 0; i < n; i++){
			String s = sc.nextLine();
			boolean[] table = new boolean[10];
			for(int j = 0; j<s.length(); j++){
				table[s.charAt(j) - '0'] = true;
			}
			boolean ok = true;
			for(int j = 0; j< k+1; j++){
				if(!table[j]){
					ok = false;
				}
			}
			if(ok){
				count++;
			}
		}
		System.out.println(count);
	}
}
