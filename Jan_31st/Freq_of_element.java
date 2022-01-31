public class Freq_of_element {
    static public int count(int[] arr, int target) {
        int left = bs(arr, target, true);
        if (left < 0)
            return 0;
        int right = bs(arr, target, false);
        return right - left + 1;
    }

    //Binary search on steroids
    static int bs(int[] arr, int target, boolean leftmost) {
        int lo = 0;
        int hi = arr.length - 1;
        int idx = -1;
        while (lo <= hi) {
            int mid = lo +(hi-lo)/2;

            if (target > arr[mid]) {
                lo = mid + 1;
            } else if (target < arr[mid]) {
                hi = mid - 1;
            } else {
                idx = mid;
                if (leftmost) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int [] arr = {4, 4, 8, 8, 8, 15, 16, 23, 23, 42};
        int target = 8;
        System.out.println("Occurance of Target: "+count(arr,target));

    }
}
