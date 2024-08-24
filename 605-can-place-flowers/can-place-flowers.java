class Solution 
{
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        int count = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) 
        {
            if (flowerbed[i] == 0) 
            {
                // Check if the previous and next spots are empty or out of bounds
                boolean prevEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean nextEmpty = (i == length - 1) || (flowerbed[i + 1] == 0);

                if (prevEmpty && nextEmpty) 
                {
                    flowerbed[i] = 1; // Plant a flower here
                    count++;
                }
            }
        }

        return count >= n;
    }
}