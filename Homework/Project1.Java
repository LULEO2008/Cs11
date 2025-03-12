package Homework;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("hours: ");
        int hours = scanner.nextInt();
        
        System.out.print("minutes: ");
        int minutes = scanner.nextInt();
        
        System.out.print("Seconds: ");
        int seconds = scanner.nextInt();
        
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        
        
        System.out.println("\n" + hours + " hours " + minutes + " minutes " + seconds +" seconds = "+ totalSeconds + " Seconds");
    }
}