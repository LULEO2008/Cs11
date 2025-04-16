package unit3project;

public class Reverse {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5,6,7,8,9};
        int[]reversed = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            reversed[i]=arr1[arr1.length-1-i];
        }
        
        System.out.println("Original Array: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nReversed Array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}
