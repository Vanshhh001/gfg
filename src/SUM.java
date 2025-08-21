import java.util.Arrays;

class sum {
    static boolean twoSum(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 5;
        boolean result = twoSum(arr, target);
        System.out.print(result);
    }
}
