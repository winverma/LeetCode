class Solution 
{
    boolean isPossible(long a, long s1, long s2, long z1, long z2) 
    {
        long a1 = a - s1, a2 = a - s2;
        return a1 >= z1 && a2 >= z2;
    }
    public long minSum(int[] nums1, int[] nums2) {
      long s1 = 0;
      long s2 = 0;
      long z1 = 0;
      long z2 = 0;
      for(int i:nums1) {
         s1 += i;
         if(i==0) z1++;
      }
      for(int i:nums2) {
        s2 += i;
        if(i==0) z2++;
      }
      if(s1 + z1 > s2 && z2 == 0) return -1;
      else if(s2 + z2 > s1 && z1 == 0) return -1; 
      long s = Math.max(s1,s2);    
      long e = Long.MAX_VALUE/2;
      while(s<e) {
        long m = s + (e-s)/2;
        if(isPossible(m,s1,s2,z1,z2)) e = m;
        else s = m+1;
      } 
      return s;
    }
}