import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B {
	public static void main(String args[]) throws Exception{
		long w = readLong();
		long m = readLong();
		long k = readLong();
		w /= k;
		long ans = 0;
		while(true){
			int s = Long.toString(m).length();
			long numb = (long) Math.pow(10, s);
			long a = numb-m;
			if(a*s < w){
				w -= a*s;
				m = numb;
				ans += a;
			}
			else{
				ans+= (w/(s));
				break;
			}
		}
		System.out.println(ans);
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
	static long readLong() throws Exception {
		return Long.parseLong(readString());
	}
}
