import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class C {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int beatenBy[] = new int[n+1];
		for(int i = 1; i <= n; i++){
			ts.add(i);
		}
		for(int i = 0; i < m; i++){
			int l = sc.nextInt();
			int r = sc.nextInt();
			int win = sc.nextInt();
			ArrayList<Integer> taken = new ArrayList<Integer>();
			for(int j : ts.subSet(l, true, r, true)){
				beatenBy[j] = win;
				taken.add(j);
			}
			for(int j = 0; j < taken.size(); j++){
				ts.remove(taken.get(j));
			}
			ts.add(win);
			beatenBy[win] = 0;
		}
		for(int i = 1; i <= n; i++){
			System.out.print(beatenBy[i]);
			if(i != n){
				System.out.print(" ");
			}
		}
	}
}
