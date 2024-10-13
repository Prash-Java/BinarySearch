package binary_search_problems;

// To find ceiling of given target number: finding the smallest number >= given target;
public class CeilingOfGivenTargetNumber {
    public static void main(String[] args) {
        int[] array = {2,3,5,6,9,11,14,15,17,18};
        int target1 = 16;
        int target2 = 19;
        int target3 = 15;
        System.out.println(ceiling(array, target1));
        System.out.println(ceiling(array, target2));
        System.out.println(ceiling(array, target3));
    }

    public static int ceiling(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        if(target > array[array.length-1]){
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
        return array[start];
    }
}
