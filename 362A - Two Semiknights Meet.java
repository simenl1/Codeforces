import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class A {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		for(int i  = 0; i < tests; i++){
			String s = sc.nextLine();
			boolean foundFirst = false;
			boolean possible = false;
			int[] knight1 = new int[2];
			int[] knight2 = new int[2];
			int[][] knightBoard1 = new int[8][8];
			int[][] knightBoard2 = new int[8][8];
			for(int j = 0; j < 8; j++){
				for(int k = 0; k < 8; k++){
					knightBoard1[j][k] = -1;
					knightBoard2[j][k] = -1;
				}
			}
			int[][] board = new int[8][8];
			for(int j = 0; j < 8; j++){
				s = sc.nextLine();
				for(int k = 0; k < 8; k++){
					if(s.charAt(k) == '#'){
						board[j][k] = -1;
					}
					if(s.charAt(k) == 'K'){
						if(foundFirst){
							knight2[0] = j;
							knight2[1] = k;
						}
						else{
							knight1[0] = j;
							knight1[1] = k;
							foundFirst = true;
						}
					}
				}
			}
			Queue<Pair> q = new LinkedList<Pair>();
			q.add(new Pair(knight1[0], knight1[1], 0));
			while(!q.isEmpty()){
				Pair p = q.poll();
				if(knightBoard1[p.x][p.y] > 0){
					continue;
				}
				knightBoard1[p.x][p.y] = p.color;
				int nextColor = (p.color+1)%2;
				if(p.x-2 >= 0){
					if(p.y - 2 >= 0){
						q.add(new Pair(p.x-2, p.y-2, nextColor));
					}
					if(p.y + 2 < 8){
						q.add(new Pair(p.x-2, p.y+2, nextColor));
					}
				}
				if(p.x+2 < 8){
					if(p.y - 2 >= 0){
						q.add(new Pair(p.x+2, p.y-2, nextColor));
					}
					if(p.y + 2 < 8){
						q.add(new Pair(p.x+2, p.y+2, nextColor));
					}
				}
			}
			q.add(new Pair(knight2[0], knight2[1], 0));
			while(!q.isEmpty()){
				Pair p = q.poll();
				if(knightBoard2[p.x][p.y] > 0){
					continue;
				}
				knightBoard2[p.x][p.y] = p.color;
				int nextColor = (p.color+1)%2;
				if(p.x-2 >= 0){
					if(p.y - 2 >= 0){
						q.add(new Pair(p.x-2, p.y-2, nextColor));
					}
					if(p.y + 2 < 8){
						q.add(new Pair(p.x-2, p.y+2, nextColor));
					}
				}
				if(p.x+2 < 8){
					if(p.y - 2 >= 0){
						q.add(new Pair(p.x+2, p.y-2, nextColor));
					}
					if(p.y + 2 < 8){
						q.add(new Pair(p.x+2, p.y+2, nextColor));
					}
				}
			}
			for(int j = 0; j < 8; j++){
				for(int k = 0; k < 8; k++){
					if(knightBoard1[j][k] > -1 && knightBoard1[j][k] == knightBoard2[j][k] && board[j][k] == 0){
						possible = true;
					}
				}
			}
			if(possible){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
	static class Pair{
		int x;
		int y;
		int color;
		Pair(int x, int y, int color){
			this.x = x;
			this.y = y;
			this.color = color;
		}
	}
}
