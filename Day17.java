// Java Calender Class

// import java.util.Calendar;

// public class Day17 {
//     public static void main(String[] args) {
//         Calendar calendar = Calendar.getInstance();
//         int year = calendar.get(Calendar.YEAR);
//         int month = calendar.get(Calendar.MONTH) + 1;
//         int day = calendar.get(Calendar.DAY_OF_MONTH);
//         int hour = calendar.get(Calendar.HOUR_OF_DAY);
//         int minute = calendar.get(Calendar.MINUTE);
//         int second = calendar.get(Calendar.SECOND);

//         System.out.println("Current Date and Time:");
//         System.out.println("Year: " + year);
//         System.out.println("Month: " + month);
//         System.out.println("Day: " + day);
//         System.out.println("Hour: " + hour);
//         System.out.println("Minute: " + minute);
//         System.out.println("Second: " + second);
//     }
// }

// import java.util.Calendar;

// public class Day17 {
//     public static void main(String[] args) {
//         Calendar calendar = Calendar.getInstance();
//         calendar.set(2025, Calendar.JANUARY, 1, 10, 30, 45);

//         int year = calendar.get(Calendar.YEAR);
//         int month = calendar.get(Calendar.MONTH) + 1;
//         int day = calendar.get(Calendar.DAY_OF_MONTH);
//         int hour = calendar.get(Calendar.HOUR_OF_DAY);
//         int minute = calendar.get(Calendar.MINUTE);
//         int second = calendar.get(Calendar.SECOND);

//         System.out.println("Set Date and Time:");
//         System.out.println("Year: " + year);
//         System.out.println("Month: " + month);
//         System.out.println("Day: " + day);
//         System.out.println("Hour: " + hour);
//         System.out.println("Minute: " + minute);
//         System.out.println("Second: " + second);
//     }
// }

// Gregorian Calender

// import java.util.GregorianCalendar;

// public class Day17 {
//     public static void main(String[] args) {
//         GregorianCalendar calendar = new GregorianCalendar();

//         int year = calendar.get(GregorianCalendar.YEAR);
//         int month = calendar.get(GregorianCalendar.MONTH) + 1;
//         int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
//         int hour = calendar.get(GregorianCalendar.HOUR_OF_DAY);
//         int minute = calendar.get(GregorianCalendar.MINUTE);
//         int second = calendar.get(GregorianCalendar.SECOND);

//         System.out.println("Current Date and Time (Gregorian Calendar):");
//         System.out.println("Year: " + year);
//         System.out.println("Month: " + month);
//         System.out.println("Day: " + day);
//         System.out.println("Hour: " + hour);
//         System.out.println("Minute: " + minute);
//         System.out.println("Second: " + second);

//         boolean isLeapYear = calendar.isLeapYear(year);
//         System.out.println("Is " + year + " a leap year? " + isLeapYear);
//     }
// }


// Timezone

// import java.util.GregorianCalendar;
// import java.util.TimeZone;

// public class Day17 {
//     public static void main(String[] args) {
//         TimeZone timeZone = TimeZone.getTimeZone("Asia/Kolkata");
//         GregorianCalendar calendar = new GregorianCalendar(timeZone);

//         int year = calendar.get(GregorianCalendar.YEAR);
//         int month = calendar.get(GregorianCalendar.MONTH) + 1;
//         int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
//         int hour = calendar.get(GregorianCalendar.HOUR_OF_DAY);
//         int minute = calendar.get(GregorianCalendar.MINUTE);
//         int second = calendar.get(GregorianCalendar.SECOND);

//         System.out.println("Current Date and Time in India:");
//         System.out.println("Year: " + year);
//         System.out.println("Month: " + month);
//         System.out.println("Day: " + day);
//         System.out.println("Hour: " + hour);
//         System.out.println("Minute: " + minute);
//         System.out.println("Second: " + second);

//         String timeZoneName = timeZone.getDisplayName();
//         System.out.println("Time Zone: " + timeZoneName);
//     }
// }


// import java.time.ZonedDateTime;
// import java.time.ZoneId;
// import java.time.format.DateTimeFormatter;

// public class Day17 {
//     public static void main(String[] args) {
//         ZonedDateTime dateTimeInIndia = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

//         System.out.println("Current Date and Time in India:");
//         System.out.println(dateTimeInIndia.format(formatter));
//     }
// }


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Day17 {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        System.out.println("Formatted Date and Time (Pattern 1): " + currentDateTime.format(format1));
        System.out.println("Formatted Date and Time (Pattern 2): " + currentDateTime.format(format2));
        System.out.println("Formatted Date and Time (Pattern 3): " + currentDateTime.format(format3));
    }
}
