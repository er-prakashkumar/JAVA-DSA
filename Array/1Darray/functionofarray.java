import java.util.Scanner;

public class functionofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array : ");
        int n = sc.nextInt();
        if(n<= 0){
             System.out.println("Array length must be greater than 0.");
            return;
        }
        int [] arr = new int[n];
        inputArray(arr, sc);
        System.out.print("Array = ");
        printArray(arr);
        int sum = sumArray(arr);
        System.out.println("Summation of Array elements = "+sum);
        int max = Max(arr);
        System.out.println("Greatest element in Array = "+max);
        int min = Min(arr);
        System.out.println("Smallest element in Array = "+min);
        System.out.print("Enter target number : ");
        int target = sc.nextInt();
        int t = linearSearch(arr, target);
        if(t>=0){
            System.out.println("Target ia at index = "+ t);
        }else{
            System.out.println("Target is not found.");
        }
        rev(arr);
        System.out.print("After reversing Array : ");
        printArray(arr);
    }
    // Function to take input from user
    static void inputArray(int arr[], Scanner sc) {        
        for(int i = 1; i <=arr.length; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i-1] = sc.nextInt();
        }
    }
    // Function to print array
    static void printArray(int arr[]){
        System.out.print("[ "+arr[0]);
        for(int i = 1; i<arr.length; i++){
            System.out.print(" ,"+arr[i]);
        }
        System.out.println(" ]");
    }
    // Function to add element of array
    static int sumArray (int arr[]){
        int sum=arr[0];
        for(int i = 1; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    // Function to find maximum in an array
    static int Max(int arr[]){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    // Function to find minimum in array
    static int Min(int arr[]){
        int min = arr[0];
        for(int i = 1; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    // Funtion to Search target in Array linearly --> Linea Search
    static int linearSearch(int arr[], int target){
        for (int i=0; i<arr.length; i++) {
            if(target==arr[i]){
                return i;
            }
        }
        return -1;        
    }
    // Reverse Array (inplace)
    static void rev(int arr[]){
        int n = arr.length-1;
        for(int i = 0; i< arr.length/2; i++,n--){
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
        }
    }
}
