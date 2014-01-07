import java.util.Scanner;


public class A {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int com[] = new int[m+1];
		com[0] = 0;
		for(int i = 0; i < m; i++){
			com[i+1] = com[i] + sc.nextInt();
		}
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean ok = false;
		int ans = 0;
		for(int i = 0; i <= m; i++){
			if(com[i]>= x && com[i] <= y){
				if((com[m]-com[i]) >= x && com[m]-com[i] <= y){
					ok = true;
					ans = i+1;
					break;
				}
			}
		}
		if(ok){
			System.out.println(ans);
		}
		else{
			System.out.println(0);
		}
	}
}
