public class Loops {
    public static void main(String[] args) {
        int p;
        // while(o <= 9)
        // {
        // System.out.println(o);
        // o++;
        // }
        for (p = 0; p <= 9; p++) {
            System.out.println(p);
        }
    }

}

// Hello there. We'll quickly revise the video and learn a few new tricks.

// RECAP:
// 1. Loops are used to perform block of statements repeatedly. They are
// executed till the condition
// holds true.
// 2. There are 4 types of loops out of which we discussed 2 in this video - for
// and while
// 3. While loop is executed only till the condition holds true. Separate
// statements are required to
// initialise the variable and increment the variable. In this loop, the
// conditions are verified
// before the statements are executed.

// Structure:
// int i = 1; // initialise variable
// while(i <= 10){
// System.out.println(i);
// i++; // increment variable
// }

// 4. In for loops, initiation, verification and increment are all done in the
// same statement.
// The order in which these operations takes places are: 1. Initiation -> 2.
// Evaluation -> 3.
// Execution -> 4. Increment ->234.
// The block of statements are executed only till the condition holds true.

// Structure:
// for(int i = 1; i <= 10; i++){
// System.out.println(i);
// }

// The first part of statement is known as Initialization. (int i = 1), the
// second part is known as
// Evaluation . (i <= 10), the last part is known as increment. (i++)

// FACTS:
// 1. "do while" loop
// A third loop which is seldom used is the "do while" loop. In this loop, the
// block of statements
// are first executed and then the while condition is checked, just the opposite
// of while loop. In
// this loop, the block is executed at-least once as opposed by the other two
// loops.

// Structure:
// int i = 1;
// do{
// System.out.println(i);
// i++;
// }while(i <= 10);

// 2. Post Increment and Pre Increment

// Frequently, you would be encountering statements such as i++, i--, ++i or
// --i.
// The former two statements are known as post increments/decrements while the
// latter two are
// known as pre increments/decrements.

// i++ and ++i is equivalent to i = i + 1.
// i-- and --i is equivalent to i = i - 1.
// i++ increments the value of 'i' by 1 but still uses the original value.
// ++i first increments the value of 'i' and then uses the value of the
// variable.

// For example
// int i = 10;
// y = i++; // (Post increment)
// In this case, the initial value of 'i' is 10. The variable y is then assigned
// the value of 'i' i.e. 10 and
// the increases the value of 10. The final values of 'i' and 'y' would be 11
// and 10 respectively.

// ----------------------------------------------------------------------------------------
// int i = 10;
// y = ++i; // (Pre Increment)
// The initial value of 'i' is 10. The value of 'i' is first incremented and
// then assigned to the variable y.
// The final values of 'i' and 'y' would be 11 and 11 respectively.

// EXERCISE:
// 1. Below is a code written with a for loop. Study the code and guess what
// would be the output or
// is it even a valid code. What do you deduce from this?

// int i = 10;
// for( ;i <= 10; ){
// System.out.println(i)
// i++;
// }

// 2. Try running this code, try to find what is wrong with it
// int i = 1;
// while(i <= 10);
// {
// System.out.println(i)
// i++;
// }

// ADVICE:
// 1. The most common mistakes which tend to happen are infinite loops when
// using a while loop.
// Students initialize a variable but forget to increment it. In this way, the
// condition for the loop is
// always true and becomes an infinite loop.
// 2. Dream, Direction and Discipline. These three put together can help you
// realise your best self.
// 3. Coding is not like eating sweets. Instead it is much like running, gyming,
// playing guitar, singing
// a song. You won't get fun out of it easily. You will need to earn the fun.
// Once you start finding it
// fun, you'll find that every effort you put was worth it.