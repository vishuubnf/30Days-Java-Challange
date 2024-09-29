// CHAPTER 6 PRACTICE SET

//QUESTION 1

// public class Day24 {
//     public static void main(String[] args) {
//         float[] numbers = {1.5f, 2.3f, 4.7f, 3.1f, 5.6f};
//         float sum = 0;
        
//         for (float number : numbers) {
//             sum += number;
//         }
        
//         System.out.println("Sum of the array: " + sum);
//     }
// }


//QUESTION 2

// import java.util.Scanner;

// public class Day24 {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number to search: ");
//         int num = sc.nextInt();
//         boolean found = false;

//         for (int element : arr) {
//             if (element == num) {
//                 found = true;
//                 break;
//             }
//         }

//         if (found) {
//             System.out.println(num + " is present in the array.");
//         } else {
//             System.out.println(num + " is not present in the array.");
//         }
//     }
// }


//QUESTION 3


// public class Day24 {
//     public static void main(String[] args) {
//         int[] physicsMarks = {85, 78, 92, 67, 88};
//         int total = 0;

//         for (int marks : physicsMarks) {
//             total += marks;
//         }

//         float average = (float) total / physicsMarks.length;

//         System.out.println("The average marks in Physics: " + average);
//     }
// }



//QUESTION 4


// public class Day24 {
//     public static void main(String[] args) {
//         int[][] matrix1 = {
//             {1, 2, 3},
//             {4, 5, 6}
//         };
        
//         int[][] matrix2 = {
//             {7, 8, 9},
//             {10, 11, 12}
//         };
        
//         int[][] sumMatrix = new int[2][3];

//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 3; j++) {
//                 sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
//             }
//         }

//         System.out.println("Sum of the two matrices:");
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(sumMatrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


//QUESTION 5


// public class Day24 {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         int length = arr.length;

//         System.out.println("Original Array:");
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }

//         for (int i = 0; i < length / 2; i++) {
//             int temp = arr[i];
//             arr[i] = arr[length - 1 - i];
//             arr[length - 1 - i] = temp;
//         }

//         System.out.println("\nReversed Array:");
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }
// }



//QUESTION 6


// import java.util.Scanner;

// public class Day24 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the number of elements in the array: ");
//         int n = sc.nextInt();
        
//         int[] arr = new int[n];
        
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         int max = arr[0];
        
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
        
//         System.out.println("The maximum element in the array is: " + max);
//     }
// }


//QUESTION 7


// import java.util.Scanner;

// public class Day24 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the number of elements in the array: ");
//         int n = sc.nextInt();
        
//         int[] arr = new int[n];
        
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         int min = arr[0];
        
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
        
//         System.out.println("The minimum element in the array is: " + min);
//     }
// }



//QUESTION 8


// import java.util.Scanner;

// public class Day24 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the number of elements in the array: ");
//         int n = sc.nextInt();
        
//         int[] arr = new int[n];
        
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         boolean isSorted = true;
        
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < arr[i - 1]) {
//                 isSorted = false;
//                 break;
//             }
//         }
        
//         if (isSorted) {
//             System.out.println("The array is sorted in ascending order.");
//         } else {
//             System.out.println("The array is not sorted.");
//         }
//     }
// }


// PROJECT ON SHOPPING LIST

import java.util.ArrayList;
import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\nShopping List Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Display list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String itemToAdd = sc.nextLine();
                    shoppingList.add(itemToAdd);
                    System.out.println(itemToAdd + " has been added to the shopping list.");
                    break;
                case 2:
                    System.out.print("Enter the item to remove: ");
                    String itemToRemove = sc.nextLine();
                    if (shoppingList.remove(itemToRemove)) {
                        System.out.println(itemToRemove + " has been removed from the shopping list.");
                    } else {
                        System.out.println(itemToRemove + " is not in the shopping list.");
                    }
                    break;
                case 3:
                    System.out.println("Shopping List:");
                    if (shoppingList.isEmpty()) {
                        System.out.println("The shopping list is empty.");
                    } else {
                        for (String item : shoppingList) {
                            System.out.println("- " + item);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
