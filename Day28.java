//CHAPTER 10  PRACTICE SET
//QUESTION 1
// class Circle {
//     protected double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     public double getRadius() {
//         return radius;
//     }

//     public double getArea() {
//         return Math.PI * radius * radius;
//     }
// }

// class Cylinder extends Circle {
//     private double height;

//     public Cylinder(double radius, double height) {
//         super(radius);
//         this.height = height;
//     }

//     public double getHeight() {
//         return height;
//     }

//     public double getVolume() {
//         return getArea() * height;
//     }
// }

// public class Day28 {
//     public static void main(String[] args) {
//         Cylinder cylinder = new Cylinder(7, 10);
//         System.out.println("Radius: " + cylinder.getRadius());
//         System.out.println("Height: " + cylinder.getHeight());
//         System.out.println("Area of Circle: " + cylinder.getArea());
//         System.out.println("Volume of Cylinder: " + cylinder.getVolume());
//     }
// }

//QUESTION 2
// class Rectangle {
//     protected double length;
//     protected double breadth;

//     public Rectangle(double length, double breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }

//     public double getLength() {
//         return length;
//     }

//     public double getBreadth() {
//         return breadth;
//     }

//     public double getArea() {
//         return length * breadth;
//     }

//     public double getPerimeter() {
//         return 2 * (length + breadth);
//     }
// }

// class Cuboid extends Rectangle {
//     private double height;

//     public Cuboid(double length, double breadth, double height) {
//         super(length, breadth);
//         this.height = height;
//     }

//     public double getHeight() {
//         return height;
//     }

//     public double getVolume() {
//         return length * breadth * height;
//     }

//     public double getSurfaceArea() {
//         return 2 * ((length * breadth) + (breadth * height) + (length * height));
//     }
// }

// public class Day28 {
//     public static void main(String[] args) {
//         Cuboid cuboid = new Cuboid(4, 5, 6);
//         System.out.println("Length: " + cuboid.getLength());
//         System.out.println("Breadth: " + cuboid.getBreadth());
//         System.out.println("Height: " + cuboid.getHeight());
//         System.out.println("Area of Rectangle: " + cuboid.getArea());
//         System.out.println("Perimeter of Rectangle: " + cuboid.getPerimeter());
//         System.out.println("Volume of Cuboid: " + cuboid.getVolume());
//         System.out.println("Surface Area of Cuboid: " + cuboid.getSurfaceArea());
//     }
// }


//QUESTION 3
// class Circle {
//     protected double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     public double getRadius() {
//         return radius;
//     }

//     public double getArea() {
//         return Math.PI * radius * radius;
//     }
// }

// class Cylinder extends Circle {
//     private double height;

//     public Cylinder(double radius, double height) {
//         super(radius);
//         this.height = height;
//     }

//     public double getHeight() {
//         return height;
//     }

//     public double getVolume() {
//         return getArea() * height;
//     }

//     public double getSurfaceArea() {
//         return 2 * Math.PI * radius * (radius + height);
//     }
// }

// public class Day28 {
//     public static void main(String[] args) {
//         Cylinder cylinder = new Cylinder(7, 10);
//         System.out.println("Radius: " + cylinder.getRadius());
//         System.out.println("Height: " + cylinder.getHeight());
//         System.out.println("Area of Circle: " + cylinder.getArea());
//         System.out.println("Volume of Cylinder: " + cylinder.getVolume());
//         System.out.println("Surface Area of Cylinder: " + cylinder.getSurfaceArea());
//     }
// }


//QUESTION 4
// class Rectangle {
//     protected double length;
//     protected double breadth;

//     public Rectangle(double length, double breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }

//     public double getLength() {
//         return length;
//     }

//     public void setLength(double length) {
//         this.length = length;
//     }

//     public double getBreadth() {
//         return breadth;
//     }

//     public void setBreadth(double breadth) {
//         this.breadth = breadth;
//     }

//     public double getArea() {
//         return length * breadth;
//     }
// }

// class Cuboid extends Rectangle {
//     private double height;

//     public Cuboid(double length, double breadth, double height) {
//         super(length, breadth);
//         this.height = height;
//     }

//     public double getHeight() {
//         return height;
//     }

//     public void setHeight(double height) {
//         this.height = height;
//     }

//     public double getVolume() {
//         return length * breadth * height;
//     }

//     public double getSurfaceArea() {
//         return 2 * (length * breadth + length * height + breadth * height);
//     }
// }

// public class Day28 {
//     public static void main(String[] args) {
//         Cuboid cuboid = new Cuboid(4, 5, 6);

//         System.out.println("Length: " + cuboid.getLength());
//         System.out.println("Breadth: " + cuboid.getBreadth());
//         System.out.println("Height: " + cuboid.getHeight());

//         System.out.println("Area of Rectangle: " + cuboid.getArea());
//         System.out.println("Volume of Cuboid: " + cuboid.getVolume());
//         System.out.println("Surface Area of Cuboid: " + cuboid.getSurfaceArea());

//         cuboid.setLength(7);
//         cuboid.setBreadth(8);
//         cuboid.setHeight(9);

//         System.out.println("\nUpdated Dimensions:");
//         System.out.println("Length: " + cuboid.getLength());
//         System.out.println("Breadth: " + cuboid.getBreadth());
//         System.out.println("Height: " + cuboid.getHeight());

//         System.out.println("Updated Area of Rectangle: " + cuboid.getArea());
//         System.out.println("Updated Volume of Cuboid: " + cuboid.getVolume());
//         System.out.println("Updated Surface Area of Cuboid: " + cuboid.getSurfaceArea());
//     }
// }


//QUESTION 5
//BASE->DERIVED1->DERIVED2


// PROJECT ON LIBRARY

class Day28 {
    private String[] availableBooks;
    private String[] issuedBooks;
    private int availableBookCount;
    private int issuedBookCount;

    public Day28(int totalBooks) {
        availableBooks = new String[totalBooks];
        issuedBooks = new String[totalBooks];
        availableBookCount = 0;
        issuedBookCount = 0;
    }

    public void addBook(String book) {
        if (availableBookCount < availableBooks.length) {
            availableBooks[availableBookCount] = book;
            availableBookCount++;
            System.out.println(book + " has been added to the library.");
        } else {
            System.out.println("No space available to add more books.");
        }
    }

    public void issueBook(String book) {
        boolean found = false;
        for (int i = 0; i < availableBookCount; i++) {
            if (availableBooks[i].equals(book)) {
                issuedBooks[issuedBookCount] = book;
                issuedBookCount++;
                availableBooks[i] = availableBooks[availableBookCount - 1];
                availableBooks[availableBookCount - 1] = null;
                availableBookCount--;
                found = true;
                System.out.println(book + " has been issued.");
                break;
            }
        }
        if (!found) {
            System.out.println("The book " + book + " is not available.");
        }
    }

    public void returnBook(String book) {
        boolean found = false;
        for (int i = 0; i < issuedBookCount; i++) {
            if (issuedBooks[i].equals(book)) {
                availableBooks[availableBookCount] = book;
                availableBookCount++;
                issuedBooks[i] = issuedBooks[issuedBookCount - 1];
                issuedBooks[issuedBookCount - 1] = null;
                issuedBookCount--;
                found = true;
                System.out.println(book + " has been returned.");
                break;
            }
        }
        if (!found) {
            System.out.println("The book " + book + " was not issued from this library.");
        }
    }

    public void showAvailableBooks() {
        if (availableBookCount == 0) {
            System.out.println("No books are currently available.");
        } else {
            System.out.println("Available books:");
            for (int i = 0; i < availableBookCount; i++) {
                System.out.println(availableBooks[i]);
            }
        }
    }

    public static void main(String[] args) {
        Day28 library = new Day28(5);
        library.addBook("The Alchemist");
        library.addBook("1984");
        library.addBook("To Kill a Mockingbird");

        library.showAvailableBooks();

        library.issueBook("1984");
        library.showAvailableBooks();

        library.returnBook("1984");
        library.showAvailableBooks();
    }
}
