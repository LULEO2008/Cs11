package unit3project;

public class Maxarray {
    public static void main(String[] args) {
        int[] arr1 = new int []{ 7,8,9,5,11,85,78};
        int max = arr1[0];
        int min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
