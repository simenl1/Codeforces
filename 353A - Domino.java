import java.util.Scanner;


public class A {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sumTop = 0;
		int sumBot = 0;
		int a = 0;
		int b = 0;
		int n = sc.nextInt();
		boolean changeDiff = false;
		for(int i = 0; i < n; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			sumTop += a;
			sumBot += b;
			if(Math.abs(a-b)%2 == 1){
				changeDiff = true;
			}
		}
		if(sumTop%2 == 0){
			if(sumBot%2 == 0){
				System.out.println("0");
			}
			else{
				System.out.println("-1");				
			}
		}
		else{
			if(sumBot%2 == 0){
				System.out.println("-1");
			}
			else{
				if(changeDiff){
					System.out.println("1");
				}
				else{
					System.out.println("-1");
				}
			}
		}
	}

}
