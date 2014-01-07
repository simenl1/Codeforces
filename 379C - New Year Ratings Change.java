import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class C {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = new StringTokenizer("");
	public static void main(String args[]) throws Exception{
		TreeSet<Integer> taken = new TreeSet<Integer>();
		StringBuilder ans = new StringBuilder();
		int n = readInt();
		int[] cur = new int[n];
		int[] sort = new int[n];
		for(int i = 0; i < n; i++){
			cur[i] = readInt();
			sort[i] = cur[i];
		}
		Arrays.sort(sort);
		int start = 1;
		for(int i = 0; i < n; i++){
			taken.add(Math.max(start, sort[i]));
			start = Math.max(start, sort[i]) + 1;
		}
		for(int i = 0; i < n; i++){
			if(i != 0){
				ans.append(' ');
			}
			int temp = taken.ceiling(cur[i]);
			taken.remove(temp);
			ans.append(temp);
		}
		
		System.out.println(ans);
	}
	
	static String readString() throws Exception {
		while(!st.hasMoreTokens())
			st = new StringTokenizer(stdin.readLine());
		return st.nextToken();
	}

	static int readInt() throws Exception {
		return Integer.parseInt(readString());
	}

	static double readDouble() throws Exception {
		return Double.parseDouble(readString());
	}
}
