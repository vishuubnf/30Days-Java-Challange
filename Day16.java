// import java.util.LinkedList;

// public class Day16 {
//     public static void main(String[] args) {
//         LinkedList<Integer> linkedList = new LinkedList<>();

//         linkedList.add(10);
//         linkedList.add(20);
//         linkedList.addFirst(5);
//         linkedList.addLast(30);

//         System.out.println("Linked List after adding elements: " + linkedList);

//         linkedList.remove();
//         linkedList.remove(1);
//         linkedList.removeFirst();
//         linkedList.removeLast();

//         System.out.println("Linked List after removing elements: " + linkedList);

//         linkedList.add(40);
//         linkedList.add(50);
//         System.out.println("First element: " + linkedList.getFirst());
//         System.out.println("Last element: " + linkedList.getLast());
//         System.out.println("Element at index 1: " + linkedList.get(1));

//         System.out.println("Size of the Linked List: " + linkedList.size());
//         System.out.println("Does the list contain 50? " + linkedList.contains(50));

//         System.out.print("Iterating through the list: ");
//         for (int element : linkedList) {
//             System.out.print(element + " ");
//         }
//     }
// }



// Hasing in java


// import java.util.HashMap;

// public class Day16 {
//     public static void main(String[] args) {
//         HashMap<String, Integer> map = new HashMap<>();

//         map.put("Alice", 25);
//         map.put("Bob", 30);
//         map.put("Charlie", 22);
//         map.put("David", 35);

//         System.out.println("HashMap: " + map);

//         System.out.println("Age of Bob: " + map.get("Bob"));

//         map.remove("Alice");
//         System.out.println("After removing Alice: " + map);

//         System.out.println("Size of the HashMap: " + map.size());

//         System.out.println("Is Charlie present? " + map.containsKey("Charlie"));

//         System.out.println("Iterating through HashMap:");
//         for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
//             System.out.println(entry.getKey() + " -> " + entry.getValue());
//         }
//     }
// }

// Hash sets

// import java.util.HashSet;

// public class Day16 {
//     public static void main(String[] args) {
//         HashSet<String> set = new HashSet<>();

//         set.add("Apple");
//         set.add("Banana");
//         set.add("Cherry");
//         set.add("Apple"); // Duplicate, will not be added

//         System.out.println("HashSet: " + set);

//         set.remove("Banana");
//         System.out.println("After removing Banana: " + set);

//         System.out.println("Size of the HashSet: " + set.size());

//         System.out.println("Is Cherry present? " + set.contains("Cherry"));

//         System.out.println("Iterating through HashSet:");
//         for (String element : set) {
//             System.out.println(element);
//         }
//     }
// }


// Date and Time in java

// import java.time.LocalDate;
// import java.time.LocalTime;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// public class Day16 {
//     public static void main(String[] args) {
//         LocalDate date = LocalDate.now();
//         LocalTime time = LocalTime.now();
//         LocalDateTime dateTime = LocalDateTime.now();

//         System.out.println("Current Date: " + date);
//         System.out.println("Current Time: " + time);
//         System.out.println("Current Date and Time: " + dateTime);

//         DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//         String formattedDateTime = dateTime.format(format);
//         System.out.println("Formatted Date and Time: " + formattedDateTime);
//     }
// }


// Calender class in java

import java.util.Calendar;

public class Day16 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Months are 0-based
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("Current Date: " + day + "-" + month + "-" + year);
        System.out.println("Current Time: " + hour + ":" + minute + ":" + second);

        calendar.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Date after 5 days: " + calendar.get(Calendar.DAY_OF_MONTH) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-" + calendar.get(Calendar.YEAR));

        calendar.add(Calendar.MONTH, -2);
        System.out.println("Date 2 months ago: " + calendar.get(Calendar.DAY_OF_MONTH) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-" + calendar.get(Calendar.YEAR));
    }
}
