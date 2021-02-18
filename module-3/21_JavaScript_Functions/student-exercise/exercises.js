/**
 * Write a function called isAdmitted. It will check entrance
 * scores and return true if the student is admitted and
 * false if rejected. It takes three parameters:
 *
 *     * gpa
 *     * satScore (optional)
 *     * recommendation (optional)
 *
 * Admit them--return true--if:
 * gpa is above 4.0 OR
 * SAT score is above 1300 OR
 * gpa is above 3.0 and they have a recommendation OR
 * SAT score is above 1200 and they have a recommendation
 * OTHERWISE reject it
 *
 * @param {number} gpa the GPA of the student, between 4.2 and 1.0
 * @param {number} [satScore=0] the student's SAT score
 * @param {boolean} [recommendation=false] does the student have a recommendation
 * @returns {boolean} true if they are admitted
 */
    function isAdmitted(gpa, satScore = 0, recommendation = false){
        if(gpa > 4.0 || satScore > 1300 || (gpa > 3.0 && recommendation == true) || (satScore > 1200 && recommendation == true))
        {
            return true;
        }
        return false;
    }


/**
 * Write a function called useParameterToFilterArray that takes an anonymous
 * function and uses that in the `unfilteredArray` filter function.
 * Return the result.
 *
 * @param {function} filterFunction the function to filter with
 * @returns {number[]} the filtered array
 */
    let unfilteredArray = [1, 2, 3, 4, 5, 6];
    function useParameterToFilterArray(filterFunction){
        return unfilteredArray.filter(
            (number) => {return filterFunction(number);}
        );
 }

/**
 * Write a function called makeNumber that takes two strings
 * of digits, concatenates them together, and returns
 * the value as a number.
 *
 * So if two strings are passed in "42293" and "443", then this function
 * returns the number 42293443.
 *
 * @param {string} first the first string of digits to concatenate
 * @param {string} [second=''] the second string of digits to concatenate
 * @returns {number} the resultant number
 */

 function makeNumber(first, second=''){
     return parseInt(first+second);
 }


/**
 * Write a function called addAll that takes an unknown number of parameters
 * and adds all of them together. Return the sum.
 *
 * @param {...number} num a series of numbers to add together
 * @returns {number} the sum of all the parameters (or arguments)
 */
 function addAll(){
    let sum = 0;
    for(let i = 0; i < arguments.length; i++){
        sum += arguments[i];
    }
    return sum;
 }


/*
 * Write and document a function called makeHappy that takes
 * an array and prepends 'Happy ' to the beginning of all the
 * words and returns them as a new array. Use the `map` function.
 */

 /**
  * Takes the word that is passed, prepends 'Happy ' to it,
  * returns the new string.
  * 
  * @param {string} words: word to which 'Happy ' will be prepended
  * @returns {string} the word with 'Happy ' prepended on
  */
    function makeHappy(words)
    {
        return words.map(word => 'Happy ' + word);
    }


/*
 * Write and document a function called getFullAddressesOfProperties
 * that takes an array of JavaScript objects containing the
 * following keys:
 *     * streetNumber
 *     * streetName
 *     * streetType
 *     * city
 *     * state
 *     * zip
 *
 * and returns an array of strings that turns the JavaScript objects
 * into a mailing address in the form of:
 *     streetNumber streetName streetType city state zip
 *
 * Use `map` and an anonymous function.
 */

 /**
  * Takes an array of objects and converts the keys within to useful strings
  * and then organizes them in a readable single-line format in the following order:
  *     -> streetNumber streetName streetType city state zip
  * 
  * 
  * @param {Object} addressesArray array of multiple JS objects containing keys
  * @returns {string} one single array that contains each element of an object separated into strings
  */
    function getFullAddressesOfProperties(addressesArray){

        let address = addressesArray.map((object) =>
        {
            return object.streetNumber + ' ' + object.streetName + ' ' + object.streetType + ' '
                 + object.city + ' ' + object.state + ' ' + object.zip;
        });

        return address;
    }



/*
 * Write and document a function called findLargest.
 *
 * Using `forEach`, find the largest element in an array.
 * It must work for strings and numbers.
 */
   
 /**
  * Uses a forEach loop to loop through an array of numbers or strings
  * in order to select the largest element, either a number or string respectively.
  * 
  * 
  * @param {number} array of numbers
  * - OR -
  * @param {string} array of strings
  * @returns {number} OR {string} the largest value of either type relative
  * to what is passed as the argument.
  */
    function findLargest(array){
       
        let largest = array[0];
        array.forEach((element) => 
        {
            if(element > largest)
            {
                largest = element;
            }
        });
        return largest;
    }


/*
 * CHALLENGE
 * Write and document a function called getSumOfSubArrayValues.
 *
 * Take an array of arrays, adds up all sub values, and returns
 * the sum. For example, if you got this array as a parameter:
 * [
 *   [1, 2, 3],
 *   [2, 4, 6],
 *   [5, 10, 15]
 * ];
 *
 * The function returns 48. To do this, you will use two nested `reduce`
 * calls with two anonymous functions.
 *
 * Read the tests to verify you have the correct behavior.
 */
