class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
       int m = nums1.length;
       int n = nums2.length;

       int x = m+n;
       int [] array = new int [x];

       int k = 0;
       for(int i=0; i<m; i++)
       {
            array[k++] = nums1[i];
       }
       for(int i=0; i<n; i++)
       {
            array[k++] = nums2[i];
       }

       Arrays.sort(array);

       if(x%2 == 0)
       {
            int mid1 = (x/2)-1;
            int mid2 = (x/2);

            float res = (float) ((double) array[mid1] + (double) array[mid2])/2.0f;
            return res;
       }
       else
       {
            int mid = x/2;

            float res = array[mid];
            return res;
       }
    }
}