public class SelectionSort ByTalha {
    public static void main(String[] args) {
        int nums[] = { 5, 2, 4, 7, 9, 6, 1 };
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // concept
        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }

                temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
                
                System.out.println();
                for (int num : nums) {
                    System.out.print(num + " ");
                }

            }
        }

        System.out.println();
        System.out.println("After Shorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
