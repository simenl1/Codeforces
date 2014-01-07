import java.util.Scanner;


public class A {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		boolean atEdge = false;
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				int a = sc.nextInt();
				if(a == 1){
					if(i == 0){
						atEdge = true;
					}
					if(i == h-1){
						atEdge = true;
					}
					if(j == 0){
						atEdge = true;
					}
					if(j == w-1){
						atEdge = true;
					}
				}
			}
		}
		if(atEdge){
			System.out.println(2);
		}
		else{
			System.out.println(4);
		}
	}
}
