import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class D {
	public static void main(String args[]) throws Exception{
		int n = readInt();
		int[] pointTo = new int[n+1];
		int[] capacity = new int[n+1];
		int[] startCap = new int[n+1];
		for(int i = 1; i <= n; i++){
			pointTo[i] = i+1;
			capacity[i] = readInt();
			startCap[i] = capacity[i];
		}
		int m = readInt();;
		for(int i = 0; i < m; i++){
			int a = readInt();
			if(a == 1){
				int p = readInt();
				int x = readInt();
				fill(p, pointTo, capacity, x);
			}
			else if(a == 2){
				int k = readInt();
				System.out.println(startCap[k] - capacity[k]);

			}
		}
	}
	public static int fill(int index, int[] pointTo, int[] capacity, int x){
		if(x > capacity[index]){
			x -= capacity[index];
			capacity[index] = 0;
			if(index == pointTo.length-1){
				return index;
			}
			return (pointTo[index] = fill(pointTo[index], pointTo, capacity, x));
		}
		else{
			capacity[index] -= x;
			return index;
		}
	}
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = new StringTokenizer(" ");
	static String readString() throws Exception{
		while(!st.hasMoreTokens()){
			st = new StringTokenizer(stdin.readLine());
		}
		return st.nextToken();
	}
	static int readInt() throws Exception {
		return Integer.parseInt(readString());
	}

}
