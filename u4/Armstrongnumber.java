package u4;

public class Armstrongnumber {
    public static void main(String[] args) {
        System.out.println(" Armstrong numbers between 1 and 500:");
        for (int i = 1; i <= 500; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                int num2 = num % 10;
                sum += num2 * num2 * num2;
                num /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
