function twoSum(numbers: number[], target: number): number[] {

    const numberMap = new Map()
    
    for (let i = 0; i < numbers.length; i++) {
        const number = numbers[i]
        
        const difference = target - number
        
        if (numberMap.has(difference)) return [numberMap.get(difference), i]

        numberMap.set(number, i)
    }
};