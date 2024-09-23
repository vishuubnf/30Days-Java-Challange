// Wap for creating an array of students for storing their marks

// public class Day6 {
//     public static void main(String[] args) {
//         int[] marks = new int[5];
        
//         marks[0] = 85;
//         marks[1] = 90;
//         marks[2] = 78;
//         marks[3] = 88;
//         marks[4] = 76;
        
//         for (int i = 0; i < marks.length; i++) {
//             System.out.println("Student " + (i + 1) + " marks: " + marks[i]);
//         }
//     }
// }


// Wap for traverse an array and reverse that array

// public class Day6 {
//     public static void main(String[] args) {
//         int[] marks = {85, 90, 78, 88, 76};

//         System.out.println("Original array:");
//         for (int i = 0; i < marks.length; i++) {
//             System.out.println("Student " + (i + 1) + " marks: " + marks[i]);
//         }

//         System.out.println("\nReversed array:");
//         for (int i = marks.length - 1; i >= 0; i--) {
//             System.out.println("Student " + (i + 1) + " marks: " + marks[i]);
//         }
//     }
// }


// Wap to check whether a given no is present or not

// import java.util.Scanner;

// public class Day6 {
//     public static void main(String[] args) {
//         int[] marks = {85, 90, 78, 88, 76};
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number to check: ");
//         int number = sc.nextInt();

//         boolean found = false;
//         for (int i = 0; i < marks.length; i++) {
//             if (marks[i] == number) {
//                 found = true;
//                 break;
//             }
//         }

//         if (found) {
//             System.out.println(number + " is present in the array.");
//         } else {
//             System.out.println(number + " is not present in the array.");
//         }
//     }
// }

// Use oF For Each loop

// public class Day6 {
//     public static void main(String[] args) {
//         int[] marks = {85, 90, 78, 88, 76};
//         int sum = 0;

//         for (int mark : marks) {
//             sum += mark;
//         }

//         double average = (double) sum / marks.length;
//         System.out.println("The average marks are: " + average);
//     }
// }

 // Wap of 2D matrix and print elements

//  public class Day6{
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         System.out.println("The elements of the matrix are:");
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// Wap to multiply two matrices and print the result

public class Day6 {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
