package binary_search_problems;

public class CeilingOfGivenCharacter {
    public static void main(String[] args) {
        char[] array = {'a','c','e','h','k'};
        char target1 = 'l';
        char target2 = 'b';
        char target3 = 'e';
        System.out.println(ceiling(array, target1));
        System.out.println(ceiling(array, target2));
        System.out.println(ceiling(array, target3));
    }
    public static char ceiling(char[] array, char ch){
        int start = 0;
        int end = array.length-1;
        if(ch > array[array.length-1]){
            return array[0];
        }
        while(start<=end){
            int mid = start + (end - start)/2;
            if(ch == array[mid]){
                return array[mid+1];
            }
            if(ch < array[mid]){
                end = mid - 1;
            }
            if(ch > array[mid]){
                start = mid + 1;
            }
        }
        return array[start % array.length];
    }
}
