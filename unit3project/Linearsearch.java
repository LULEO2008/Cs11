package unit3project;
import java.util.Scanner;
public class Linearsearch {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number of elements in the array :");
      int n = scan.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the elements of the array :");
      for (int i = 0; i < n; i++) {
         arr[i] = scan.nextInt();
      }
      System.out.println("Enter the element to be searched :"); 
      int num = scan.nextInt();
      boolean found = false;
      for(int num1 : arr){
        if(num1 == num){
            found = true;
            break;
        }
      }
      if(found){
        System.out.println("Element found");
      }
      else{
        System.out.println("Element not found");
      }
        }
      }

