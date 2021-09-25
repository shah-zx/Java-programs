public class Ifelse {
    public static void main(String[] args) {

        // int x = 11;
        // int p1 = 14;
        // int p2 = 13;
        // if (x % 2 == 0) {
        // System.out.println("The number is even");
        // } else {
        // System.out.println("The number is odd");
        // }
        // System.out.println("We are out of the loop");

        // if (p1 == p2)

        // {
        // System.out.println("Both the numbers are equal");
        // } else if (p1 > p2) {
        // System.out.println("number one is greater than number two");
        // } else {
        // System.out.println("number two is greater than number one");
        // }

        // 1. You are given as input marks of a student.
        // 2. Display an appropriate message based on the following rules:
        // 2.1 for marks above 90, print excellent.
        // 2.2 for marks above 80 and less than equal to 90, print good.
        // 2.3 for marks above 70 and less than equal to 80, print fair.
        // 2.4 for marks above 60 and less than equal to 70, print meets expectations.
        // 2.5 for marks less than equal to 60, print below par.

        int marks = 75;

        if (marks > 90) {
            System.out.println("excellent");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("good");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("fair");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("meets expectations");
        } else {
            System.out.println("below par");
        }
        System.out.println("We are now out of the if else statement.");
    }

}

// Hello there. We'll quickly summarize the video, learn a couple new tricks and
// move on.
// RECAP:
// 1. if-else statements are used to execute statements based on conditions. if
// the condition is true, if block gets executed otherwise else block gets
// executed
// 2. For more than two conditions, we can use nested if-else or "if, else-if,
// else" stack.
// 3. In the "if, else-if, else" stack, block following the first truth is
// executed and rest is ignored. If all conditions are false, else block is
// executed

// FACTS:
// 1.'=' is used to assign a value to a variable whereas '==' is used to check
// the value of a variable.
// 2. To combine more than one condition in an if clause we can use logical
// operators - AND (&&), OR (||) and Not(!)
// e.g. to check if a number is a multiple of both 2 and 3 we can use && (true
// only if both
// conditions are true)
// if((num % 2 == 0) && (num % 3 == 0))

// to check if a number is multiple of either 2 or 3 or both we can use ||
// (false only if both
// conditions are false)
// if((num % 2 == 0) || (num % 3 == 0))

// to negate a condition, we can use !
// if(!(num > 10)) is same as saying if (num <= 10)

// 3. If "ONLY ONE STATEMENT" is to be executed after the condition is true,
// there is no need create a block for the single line. The following two yield
// same results.
// // Part1
// if(n%2==0)
// System.out.println("Number is even")

// // Part2
// if(n%2==0){
// System.out.println("Number is even")
// }

// EXERCISE:
// 1. Meditate whether an if clause containing multiple conditions combined by
// && operator need to evaluate rest of the conditions if first conditions is
// false.
// 2. Meditate whether an if clause containing multiple conditions combined by
// || operator need to evaluate rest of the conditions if first conditions is
// true.

// ADVICE:
// 1. Love yourself.
// 2. In case if you fail to focus and stay in the study, accept the past
// failure and forgive yourself. CLEAN THE SLATE.
// 3. Cleaning the slate is the starting point for potential future progress.
