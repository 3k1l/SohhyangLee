import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x;
		Scanner sc= new Scanner(System.in);
		x = sc.nextInt();

        System.out.println(sugarDelivery(x));
	}

	public static int sugarDelivery(int n) {
        int answer = 0;
        int cnt = 0;

        while(true){
            if(n%5 == 0){
                answer = n/5 + cnt;
                break;
            }
            else if(n<0){
                answer = -1;
                break;
            }
            n = n-3;
            cnt++;
        }

        return answer;
	}

}
