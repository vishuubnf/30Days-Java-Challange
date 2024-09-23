// Basic table printing Question using method
// import java.util.Scanner;

// public class Day7 {

//     public static void printTable(int n) {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n + " x " + i + " = " + (n * i));
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number to print its multiplication table: ");
//         int n = scanner.nextInt();
//         printTable(n);
//     }
// }

// A simple pattern printing question using method

// import java.util.Scanner;

// public class Day7 {

//     public static void printPattern(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows for the pattern: ");
//         int n = scanner.nextInt();
//         printPattern(n);
//     }
// } 

// A simple opposite pattern printing question using method

// import java.util.Scanner;

// public class Day7 {

//     public static void printOppositePattern(int n) {
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows for the pattern: ");
//         int n = scanner.nextInt();
//         printOppositePattern(n);
//     }
// }

//Java program that uses a recursive function to calculate the sum of the first n numbers:

// import java.util.Scanner;

// public class Day7 {
//     public static int sum(int n) {
//         if (n == 1) {
//             return 1;
//         } else {
//             return n + sum(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();
//         int result = sum(n);
//         System.out.println("The sum of first " + n + " numbers is: " + result);
//     }
// }


//Java program that defines a function to find the average of a set of numbers
//passed as arguments

// import java.util.Scanner;

// public class Day7 {

//     // Function to calculate the average of numbers passed as arguments
//     public static double findAverage(int... numbers) {
//         int sum = 0;
//         for (int num : numbers) {
//             sum += num;
//         }
//         return (double) sum / numbers.length;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter how many numbers you want to average: ");
//         int count = scanner.nextInt();
        
//         int[] numbers = new int[count];
//         System.out.println("Enter the numbers:");
//         for (int i = 0; i < count; i++) {
//             numbers[i] = scanner.nextInt();
//         }

//         double average = findAverage(numbers);
//         System.out.println("The average is: " + average);
//     }
// }

//Java program using varargs to add a variable number of integers:


// public class Day7 {

//     public static int addNumbers(int... numbers) {
//         int sum = 0;
//         for (int num : numbers) {
//             sum += num;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         System.out.println("Sum: " + addNumbers(1, 2, 3));
//         System.out.println("Sum: " + addNumbers(10, 20));
//         System.out.println("Sum: " + addNumbers(5, 6, 7, 8, 9));
//     }
// }

// Java program for method overloading

public class Day7 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of two integers: " + add(5, 10));
        System.out.println("Sum of two doubles: " + add(5.5, 3.5));
        System.out.println("Sum of three integers: " + add(1, 2, 3));
    }
}