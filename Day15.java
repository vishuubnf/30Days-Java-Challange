//Java program that demonstrates the use of the throw and throws keywords



// class Day15 {
//     static void checkAge(int age) throws ArithmeticException {
//         if (age < 18) {
//             throw new ArithmeticException("Age is not valid to vote.");
//         } else {
//             System.out.println("Welcome to vote!");
//         }
//     }

//     public static void main(String[] args) {
//         try {
//             checkAge(15);
//         } catch (ArithmeticException e) {
//             System.out.println("Exception caught: " + e);
//         }

//         System.out.println("Program continues...");
//     }
// }



// class Day15 {
//     static void divide(int a, int b) throws ArithmeticException {
//         int result = a / b;
//         System.out.println("Result: " + result);
//     }

//     public static void main(String[] args) {
//         try {
//             divide(10, 0);
//         } catch (ArithmeticException e) {
//             System.out.println("Exception caught: " + e);
//         }

//         System.out.println("Program continues...");
//     }
// }



// Use of finally keyword in java


// class Day15 {
//     static void divide(int a, int b) {
//         try {
//             int result = a / b;
//             System.out.println("Result: " + result);
//         } catch (ArithmeticException e) {
//             System.out.println("Exception caught: " + e);
//         } finally {
//             System.out.println("Finally block executed.");
//         }
//     }

//     public static void main(String[] args) {
//         divide(10, 0);
//         System.out.println("Program continues...");
//     }
// }


// class Day15 {
//     static void openResource() {
//         try {
//             System.out.println("Opening resource...");
//         } finally {
//             System.out.println("Closing resource in finally block.");
//         }
//     }

//     public static void main(String[] args) {
//         openResource();
//         System.out.println("Program continues...");
//     }
// }


//Java program that demonstrates the use of the Java Collection Framework

// import java.util.ArrayList;

// class Day15 {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();
//         try {
//             list.add("Apple");
//             list.add("Banana");
//             list.add("Orange");
//             System.out.println("Fruits List: " + list);
//         } finally {
//             System.out.println("Finally block executed after ArrayList operation.");
//         }

//         System.out.println("Program continues...");
//     }
// }


// import java.util.HashSet;
// import java.util.HashMap;

// class Day15 {
//     public static void main(String[] args) {
//         HashSet<String> set = new HashSet<>();
//         HashMap<Integer, String> map = new HashMap<>();

//         try {
//             // HashSet operations
//             set.add("Java");
//             set.add("Python");
//             set.add("C++");
//             System.out.println("Languages Set: " + set);

//             // HashMap operations
//             map.put(1, "New York");
//             map.put(2, "London");
//             map.put(3, "Tokyo");
//             System.out.println("City Map: " + map);
//         } finally {
//             System.out.println("Finally block executed after HashSet and HashMap operations.");
//         }

//         System.out.println("Program continues...");
//     }
// }


// Use of array list in java

import java.util.ArrayList;

class Day15 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();

        try {
            countries.add("India");
            countries.add("USA");
            countries.add("Germany");
            countries.add("Australia");

            System.out.println("Countries List: " + countries);

            System.out.println("First country: " + countries.get(0));
            System.out.println("Second country: " + countries.get(1));

          
            countries.remove("Germany");
            System.out.println("Countries List after removal: " + countries);

        } finally {
            System.out.println("Finally block executed after ArrayList operations.");
        }

        System.out.println("Program continues...");
    }
}
