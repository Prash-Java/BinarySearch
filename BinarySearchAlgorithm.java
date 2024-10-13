package binary_search_problems;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};
        int target1 = 8;
        int target2 = 9;
        System.out.println(performBinarySearch(array, target1));
        System.out.println(performBinarySearch(array, target2));
    }

    public static int performBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                end = mid - 1;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
}
