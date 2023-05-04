public class binarySearch {
    public static int search(int[] arr, int target) {
        // set left pointer to 0
        int left = 0;
        // set right pointer to last element
        int right = arr.length;

        // while left is less than right
        while(left < right) {
            // mid equals floor average of left and right
            int mid = Math.floorDiv(left + right, 2);
            // get mid value of index at arr
            int midValue = arr[mid];

            // if midValue is equal to target return mid
            if(midValue == target) {
                return mid;
            } 
            // if midValue is less than target move left to mid plus 1
            else if (midValue < target) {
                left = mid + 1;
            } 
            // else right is equal to mid
            else {
                right = mid;
            }
        }

        // if no matches return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] searchable = {1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94};
        int target = 41;

        System.out.println(search(searchable, target));
    }
}