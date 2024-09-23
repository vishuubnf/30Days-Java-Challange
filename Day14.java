// Syntax errors

// public class Day14 {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!") 
//     }
// }

// //Corrected code is 

// public class Day14 {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!"); // Corrected with semicolon
//     }
// }

// Runtime Errors

// public class Day14 {
//     public static void main(String[] args) {
//         int num1 = 10;
//         int num2 = 0;

//         int result = num1 / num2; // This will cause an ArithmeticException
//         System.out.println("Result: " + result);
//     }
// }

// Corretcted Code

// public class Day14 {
//     public static void main(String[] args) {
//         int num1 = 10;
//         int num2 = 0;

//         // Checking for division by zero to avoid the runtime error
//         if (num2 != 0) {
//             int result = num1 / num2;
//             System.out.println("Result: " + result);
//         } else {
//             System.out.println("Cannot divide by zero.");
//         }
//     }
// }

//Logical Error

// public class Day14{
//     public static void main(String[] args) {
//         int num = 10;
//         int square = num + num; // Incorrect logic for squaring a number
//         System.out.println("Square of " + num + " is: " + square); 
//     }
// }

// Corrected code

// public class DAy14{
//     public static void main(String[] args) {
//         int num = 10;
//         // Correcting the logic to calculate the square of a number
//         int square = num * num;
//         System.out.println("Square of " + num + " is: " + square); // Output will be 100
//     }
// }

// Try And Catch with exception handling

// public class Day14 {
//     public static void main(String[] args) {
//         try {
//             int[] numbers = {1, 2, 3};
//             int result = 10 / 0;
//             System.out.println("Element at index 3: " + numbers[3]);
//         } catch (ArithmeticException e) {
//             System.out.println("ArithmeticException caught: " + e);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
//         }

//         System.out.println("Program continues after handling multiple exceptions...");
//     }
// }

// Nested Try And Catch with exception handling

// public class Day14 {
//     public static void main(String[] args) {
//         try {
//             int[] numbers = { 1, 2, 3 };
//             System.out.println("Outer try block");

//             try {
//                 int result = 10 / 0;
//                 System.out.println("Result: " + result);
//             } catch (ArithmeticException e) {
//                 System.out.println("Inner catch: ArithmeticException caught: " + e);
//             }

//             System.out.println("Element at index 3: " + numbers[3]);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Outer catch: ArrayIndexOutOfBoundsException caught: " + e);
//         }

//         System.out.println("Program continues after nested exception handling...");
//     }
// }


//Custom Exception in Java


class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Day14 {
    public static void main(String[] args) {
        try {
            validateNumber(0);  // This will trigger the custom exception
        } catch (CustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method to validate a number, throws CustomException
    public static void validateNumber(int number) throws CustomException {
        if (number <= 0) {
            throw new CustomException("Number must be greater than zero");
        } else {
            System.out.println("Valid number: " + number);
        }
    }
}
