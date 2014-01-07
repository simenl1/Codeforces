import java.util.Scanner;


public class B {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		int c3 = sc.nextInt();
		int c4 = sc.nextInt();
		int n =  sc.nextInt(); //Number of buses
		int m = sc.nextInt(); // Number of trolleys;
		int[] bus = new int[n];
		int[] trolley = new int[m];
		for(int i = 0; i < n; i++){
			bus[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++){
			trolley[i] = sc.nextInt();
		}
		int busCost = 0;
		int trollCost = 0;
		int minCost = 0;
		for(int i = 0; i<n; i++){
			busCost += Math.min(c1*bus[i], c2);
		}
		busCost = Math.min(busCost, c3);
		for(int i = 0; i<m; i++){
			trollCost += Math.min(c1*trolley[i], c2);
		}
		trollCost = Math.min(trollCost, c3);
		minCost = Math.min(trollCost + busCost, c4);
		System.out.println(minCost);
	}
}
