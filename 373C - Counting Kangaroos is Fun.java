import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C {
	public static void main(String args[]) throws Exception{
		int n = readInt();
		int[] kanga = new int[n];
		for(int i = 0; i < n; i++){
			kanga[i] = readInt();
		}
		Arrays.sort(kanga);
		int high = n;
		int low = (int)Math.ceil(n/2.0);
		while(low < high){
			int mid = (high+low)/2;
			if(kangaFill(kanga, mid)){
				high = mid;
			}
			else{
				low = mid+1;
			}
		}
		
		System.out.println(high); 
	}
	
	private static boolean kangaFill(int[] kanga, int mid) {
		int n = kanga.length;
		int hidden = n - mid;
		for(int i = 0; i < hidden; i++){
			if(2*kanga[i] > kanga[n-hidden+i]){
				return false;
			}
		}
		return true;
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
