import java.util.Scanner;
public class Project7 {
   public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
       /*  System.out.println("Determine your birth month (January=1, February=2, and so on): ");
        int birthMonth = scan.nextInt();
        int A=(((birthMonth*5)+6)*4+9)*5;
       
        System.out.println("Add your birth day to the number (10 if born on the 10th day and so on): ");
        int birthDay = scan.nextInt();
        int finalNumber = A + birthDay;*/
        System.out.println("Welcome to the Birthday Game! \nFollow these steps to calculate your number: \n1. Determine your birth month (January=1, February=2, and so on). \n2. Multiply that number by 5. \n3. Add 6 to that number. \n4. Multiply the number by 4. \n5. Add 9 to the number. \n6. Multiply that number by 5. \n7. Add your birth day to the number (e.g., 10 if born on the 10th day). \nEnter the calculated number:");
        int finalNumber = scan.nextInt();

        int birthMonthCalculated = (finalNumber - 165) / 100;

        int birthDayCalculated = (finalNumber - 165) % 100;

        System.out.println("Your birth month is: " + birthMonthCalculated);
        System.out.println("Your birth day is: " + birthDayCalculated);

        scan.close();


        }
     }