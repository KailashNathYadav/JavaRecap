import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {
        // fill , equals , length , toString , compare , binarySearch , deepToString
        int[] arr = new int[5];
		Arrays.fill(arr,0 , 3, 5);
		arr[2] = arr[4] = 3;arr[3] = 1;
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.equals(new int[] {5,5,3,1,3}));
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.compare(arr,new int[] {2,3,4}));
		System.out.println(Arrays.compare(new int[] {5,5,3,1,3}, arr));
		System.out.println(Arrays.compare(new int[] {2,3,4}, arr));
		System.out.println(Arrays.binarySearch(arr, 3));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
