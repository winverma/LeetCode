public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        (int num, int index)[] numbers = nums.Select((num, index) => (num, index)).ToArray();
        Array.Sort(numbers, (a, b) => a.num.CompareTo(b.num));
        int i = 0, j = nums.Length - 1;
        
        while (i < j) {
            int sum = numbers[i].num + numbers[j].num;
            if (sum == target) {
                return new int[] { numbers[i].index, numbers[j].index };
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        
        throw new ArgumentException("No two sum solution");
    }
}