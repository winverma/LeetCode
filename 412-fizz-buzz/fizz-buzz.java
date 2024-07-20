class Solution 
{
    public List<String> fizzBuzz(int n) 
    {
        ArrayList<String> fizzbuzz = new ArrayList<>();

        for(int i = 1; i <= n; i++)
        {
            if(i%3 == 0 && i%5 == 0) fizzbuzz.add("FizzBuzz");
            else if(i%3 == 0) fizzbuzz.add("Fizz");
            else if(i%5 == 0) fizzbuzz.add("Buzz");
            else fizzbuzz.add(Integer.toString(i));
        }
        return fizzbuzz;
    }
}