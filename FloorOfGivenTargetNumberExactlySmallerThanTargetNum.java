package binary_search_problems;

// To find floor of given target number: finding the largest number < and != given target;
// In case no number found, then return the 0th index of array,
public class FloorOfGivenTargetNumberExactlySmallerThanTargetNum {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        int target1 = 20;
        int target2 = 5;
        int target3 = 32;
        int target4 = 60;
        System.out.println(floorSmallerThanTargetNumber(array, target1));
        System.out.println(floorSmallerThanTargetNumber(array, target2));
        System.out.println(floorSmallerThanTargetNumber(array, target3));
        System.out.println(floorSmallerThanTargetNumber(array, target4));
    }

    public static int floorSmallerThanTargetNumber(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        if(target < array[0]){
            return array[0];
        }
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target == array[mid]){
                return array[mid-1];
            }
            if(target < array[mid]){
                end = mid - 1;
            }
            if(target > array[mid]){
                start = mid + 1;
            }
        }
        return array[end % array.length];
    }
}
