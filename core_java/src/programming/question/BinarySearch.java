package programming.question;

class BinarySearch {

    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int start, int end, int target) {

        if(start > end)
            return -1;

        int mid = (start + end) / 2;

        if(nums[mid] == target) {
            return mid;
        } else if(target < nums[mid]) {
            return search(nums, start, mid - 1, target);
        } else {
            return search(nums, mid + 1, end, target);
        }
    }

    public static void main(String[] args) {
        BinarySearch sol = new BinarySearch();
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(sol.search(nums, 2));
        System.out.println(sol.search(nums, 3));
    }
}
