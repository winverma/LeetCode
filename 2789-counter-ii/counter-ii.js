/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) 
{
    let state = init

    const increment = () => { 
        state += 1
        return state
    }
    
    const reset = () => {
        state = init
        return state
    }

    const decrement = () => {

        state -= 1
        return state
    }
    return {increment, reset, decrement}
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */