import java.util.Scanner;

public class A {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.nextLine();
		int[] t = new int[9];
		String s;
		for(int i = 0; i < 4; i++){
			s = sc.nextLine(); 
			for(int j = 0; j < 4; j++){
				if(s.charAt(j) == '.'){
					continue;
				}
				else{
					t[s.charAt(j)-'1']++;
				}
			}
		}
		boolean sol = true;
		for(int i = 0; i < 9; i++){
			if(t[i]>2*k){
				sol = false;
			}
		}
		if(sol){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
