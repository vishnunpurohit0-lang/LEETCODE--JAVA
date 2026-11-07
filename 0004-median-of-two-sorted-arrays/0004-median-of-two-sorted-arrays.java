class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m+n];

        for(int i = 0 ; i < m ; i++){
            arr[i] = nums1[i];
        }

        for( int i = 0 ; i < n ; i++){
            arr[m + i] = nums2[i];
        }

        Arrays.sort(arr);

        int total = arr.length;

        if( total % 2 == 1 ){
            return arr[total / 2];
        }else{
            return (arr[total / 2 - 1] + arr[total / 2 ]) / 2.00;

        }   
    }
}