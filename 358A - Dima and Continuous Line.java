import java.util.Scanner;


public class A {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int[] table1 = new int[n-1];
		int[] table2 = new int[n-1];
		boolean yes = false;
		for(int i = 0; i<n-1; i++){
			int a = b;
			b = sc.nextInt();
			table1[i] = a;
			table2[i] = b;
		}
		for(int i = 0; i < n-2;i++){
			for(int j = i+1; j<n-1; j++){
				int imin = Math.min(table1[i], table2[i]);
				int imax = Math.max(table1[i], table2[i]);
				int jmin = Math.min(table1[j], table2[j]);
				int jmax = Math.max(table1[j], table2[j]);
				if(imin > jmin && imax > jmax && jmax > imin){
					yes = true;
				}
				if(imin < jmin && imax < jmax && imax > jmin){
					yes = true;
				}
			}
		}
		if(yes){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}
