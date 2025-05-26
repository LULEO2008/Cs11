
public class PrimeNumbe  {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        
        int number = 2; 
        
        while (number <= 100) {
            boolean isPrime = true;
            
          
            int divisor = 2;
            while (divisor <= Math.sqrt(number)) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }
            
            if (isPrime) {
                System.out.print(number + " ");
            }
            
            number++;
        }
    }
}