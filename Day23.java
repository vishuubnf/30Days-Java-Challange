// Rock Paper Scissor Game

import java.util.Scanner;
import java.util.Random;

public class Day23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter 0 for Rock, 1 for Paper, or 2 for Scissors:");
        int userChoice = scanner.nextInt();
        int computerChoice = random.nextInt(3);

        
        System.out.println("You chose: " + choiceName(userChoice));
        System.out.println("Computer chose: " + choiceName(computerChoice));

       
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                   (userChoice == 1 && computerChoice == 0) ||
                   (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }

    public static String choiceName(int choice) {
        if (choice == 0) return "Rock";
        if (choice == 1) return "Paper";
        return "Scissors";
    }
}


//Question 1


// public class Day23 {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// Question 3


// import java.util.Scanner;

// public class Day23 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int n = scanner.nextInt();
//         int sum = 0;
//         int count = 0;
//         int num = 0;

//         while (count < n) {
//             sum += num;
//             num += 2;
//             count++;
//         }

//         System.out.println("Sum of first " + n + " even numbers is: " + sum);
//     }
// }


//Question 4

// import java.util.Scanner;

// public class Day23 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n + " x " + i + " = " + (n * i));
//         }
//     }
// }




//Question 5


// import java.util.Scanner;

// public class Day23 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();
//         int factorial = 1;

//         for (int i = 1; i <= n; i++) {
//             factorial *= i;
//         }

//         System.out.println("Factorial of " + n + " is: " + factorial);
//     }
// }


//Question 6


// import java.util.Scanner;

// public class Day23 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();
//         int factorial = 1;
//         int i = 1;

//         while (i <= n) {
//             factorial *= i;
//             i++;
//         }

//         System.out.println("Factorial of " + n + " is: " + factorial);
//     }
// }


//Question 7


// public class Day23 {
//     public static void main(String[] args) {
//         int n = 5;
//         int i = n;

//         while (i >= 1) {
//             int j = 1;
//             while (j <= i) {
//                 System.out.print("* ");
//                 j++;
//             }
//             System.out.println();
//             i--;
//         }
//     }
// }


//Question 8


/*What can be done using one type of loop an also be done ing the other 
 * two types of loops -> True or False
 */


 // So the answer of given Question is True we can use any for or while to
 // to do the same work


 //Question 9


//  public class Day23 {
//     public static void main(String[] args) {
//         int n = 8;
//         int sum = 0;

//         for (int i = 1; i <= 10; i++) {
//             int product = n * i;
//             sum += product;
//         }

//         System.out.println("Sum of numbers occurring in the multiplication table of " + n + " is: " + sum);
//     }
// }
