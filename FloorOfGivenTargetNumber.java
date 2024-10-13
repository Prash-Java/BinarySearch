package binary_search_problems;

// To find floor of given target number: finding the largest number <= given target;
public class FloorOfGivenTargetNumber {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,9,11,15,18};
        int target1 = 7;
        int target2 = 1;
        int target3 = 11;
        System.out.println(floor(array, target1));
        System.out.println(floor(array, target2));
        System.out.println(floor(array, target3));
    }

    public static int floor(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        if(target < array[0]){
            return -1;
        }
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target == array[mid]){
                return array[mid];
            }
            if(target < array[mid]){
                end = mid - 1;
            }
            if(target > array[mid]){
                start = mid + 1;
            }
        }
        return array[end];
    }
}
