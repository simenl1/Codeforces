import java.util.Scanner;


public class B {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String[] words = new String[2*n+1];
		for(int i = 0; i< 2*n; i+=2){
			words[i] = "<3";
			words[i+1] = sc.nextLine();
		}
		words[2*n] = "<3";
		
		boolean ok = false;
		String msg = sc.nextLine();
		int point = 0;
		for(int i = 0; i <2*n+1; i++){
			int index = 0;
			while(point < msg.length() && index < words[i].length()){
				if(words[i].charAt(index) == msg.charAt(point)){
					point++;
					index++;
				}
				else{
					point++;
				}
			}
			if(index == words[i].length() && i == 2*n){
				ok = true;
				continue;
			}
		}
		if(ok){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}
