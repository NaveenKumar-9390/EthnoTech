//Write a Java program to perform the Right Rotation of an Array by K positions.

public class RightRotation {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n =arr.length;
        for(int i = 0; i < k; i++){
            int last = arr[n - 1];
            for(int j = n - 1; j > 0; j--){
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        System.out.println("Output: [");
        for(int i = 0;i < n;i++){
            System.out.print(arr[i]);
            if(i < n - 1){
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }
    
}
