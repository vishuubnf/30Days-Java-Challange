// CHAPTER 7 PRACTICE SET
//QUESTION 1

// import java.util.Scanner;

// public class Day25 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         printMultiplicationTable(n);
//     }

//     public static void printMultiplicationTable(int n) {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n + " x " + i + " = " + (n * i));
//         }
//     }
// }


//QUESTION 2

// import java.util.Scanner;

// public class Day25 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int n = sc.nextInt();
//         printPattern(n);
//     }

//     public static void printPattern(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


//QUESTION 3

// import java.util.Scanner;

// public class Day25 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int sum = sumOfNaturalNumbers(n);
//         System.out.println("Sum of first " + n + " natural numbers is: " + sum);
//     }

//     public static int sumOfNaturalNumbers(int n) {
//         if (n == 1) {
//             return 1;
//         }
//         return n + sumOfNaturalNumbers(n - 1);
//     }
// }


//QUESTION 4

// import java.util.Scanner;

// public class Day25 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int n = sc.nextInt();
//         printOppositePattern(n);
//     }

//     public static void printOppositePattern(int n) {
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



//QUESTION 5

// import java.util.Scanner;

// public class Day25 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the position of the Fibonacci term (n): ");
//         int n = sc.nextInt();
//         System.out.println("The " + n + "th term in the Fibonacci series is: " + fibonacci(n));
//     }

//     public static int fibonacci(int n) {
//         if (n == 1) {
//             return 0; 
//         } else if (n == 2) {
//             return 1; 
//         } else {
//             return fibonacci(n - 1) + fibonacci(n - 2); 
//         }
//     }
// }


//QUESTION 6


// import java.util.Scanner;

// public class Day25 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();
//         double[] numbers = new double[n];
        
//         System.out.println("Enter the numbers:");
//         for (int i = 0; i < n; i++) {
//             numbers[i] = sc.nextDouble();
//         }
        
//         double average = findAverage(numbers);
//         System.out.println("The average is: " + average);
//     }

//     public static double findAverage(double[] numbers) {
//         double sum = 0;
//         for (double num : numbers) {
//             sum += num;
//         }
//         return sum / numbers.length;
//     }
// }


//QUESTION 7


// import java.util.Scanner;

// public class Day25 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int n = sc.nextInt();
//         printOppositePattern(n);
//     }

//     public static void printOppositePattern(int n) {
//         if (n == 0) {
//             return; 
//         }
//         printStars(n); 
//         System.out.println();
//         printOppositePattern(n - 1); 
//     }

//     public static void printStars(int n) {
//         if (n == 0) {
//             return; 
//         }
//         System.out.print("* ");
//         printStars(n - 1); 
//     }
// }


// SIMPLE CALCULATOR APP USING METHODS


import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Simple Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                running = false;
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + divide(num1, num2));
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
            System.out.println();
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
