public class LongestPeak {
    public static void main(String[] args) {

        int[] arr = {1,2,3,3,4,0,10,6,5,-1,-3,2,3};
        int ans = longestPeak(arr);
        System.out.println(ans);
    }
    private static int longestPeak(int[] arr) {
        int longestPeakLength = 0;
        int i = 1;
        while(i<arr.length-1){
            boolean isPeak = arr[i-1]<arr[i] && arr[i] > arr[i+1];
            if(!isPeak){
                i++;
                continue;
            }
            int leftIdx = i - 2;
            while (leftIdx >=0 && arr[leftIdx] < arr[leftIdx + 1]){
                leftIdx --;
            }
            int righIdx = i+2;
            while (righIdx < arr.length && arr[righIdx] < arr[righIdx - 1]){
                righIdx++;
            }
            int currentPeakLength = righIdx - leftIdx - 1;
            longestPeakLength = Math.max(longestPeakLength,currentPeakLength);
            i = righIdx;
        }
        return longestPeakLength;
    }
}
