class TwoSum {
    static int[] function(int nums[], int target) {
        int arr[] = { 0, 1 };
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    System.out.println("matched");
                    break;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        int target = 9;
        System.out.println(nums.length);
        int arr[] = function(nums, target);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

// return new int[] {i , j};