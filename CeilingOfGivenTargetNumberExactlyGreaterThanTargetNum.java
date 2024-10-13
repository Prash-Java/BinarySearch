package binary_search_problems;

// To find ceiling of given target number: finding the smallest number > and != given target;
// In case no number found, then return the 0th index of array,
public class CeilingOfGivenTargetNumberExactlyGreaterThanTargetNum {
    public static void main(String[] args) {
        int[] array = {10,15,20,25,30};
        int target1 = 21;
        int target2 = 31;
        int target3 = 25;
        int target4 = 5;
        System.out.println(ceilingGreaterThanTargetNumber(array, target1));
        System.out.println(ceilingGreaterThanTargetNumber(array, target2));
        System.out.println(ceilingGreaterThanTargetNumber(array, target3));
        System.out.println(ceilingGreaterThanTargetNumber(array, target4));
    }

    public static int ceilingGreaterThanTargetNumber(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target == array[mid]){
                return array[mid+1];
            }
            if(target > array[mid]){
                start = mid + 1;
            }
            if(target < array[mid]){
                end = mid - 1;
            }
        }
        return array[start % array.length];
    }
}
