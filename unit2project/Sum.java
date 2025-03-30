package unit2project;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a nember :");
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {//循环从2开始，每次增加2，直到超过n。
            sum += i;
        }
        System.out.println("the sum of even nember is = " + sum);
        scan.close();   

    }
    
}
