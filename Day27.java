//CHAPTER 9  PRACTICE SET

//QUESTION 1

// class Cylinder {
//     private double radius;
//     private double height;

//     public void setRadius(double radius) {
//         this.radius = radius;
//     }

//     public double getRadius() {
//         return radius;
//     }

//     public void setHeight(double height) {
//         this.height = height;
//     }

//     public double getHeight() {
//         return height;
//     }
// }

// public class Day27 {
//     public static void main(String[] args) {
//         Cylinder cylinder = new Cylinder();
//         cylinder.setRadius(7);
//         cylinder.setHeight(10);
        
//         System.out.println("Radius: " + cylinder.getRadius());   // Output: Radius: 7.0
//         System.out.println("Height: " + cylinder.getHeight());   // Output: Height: 10.0
//     }
// }


//QUESTION 2


// class Cylinder {
//     private double radius;
//     private double height;

//     public void setRadius(double radius) {
//         this.radius = radius;
//     }

//     public double getRadius() {
//         return radius;
//     }

//     public void setHeight(double height) {
//         this.height = height;
//     }

//     public double getHeight() {
//         return height;
//     }

//     public double getVolume() {
//         return Math.PI * radius * radius * height;
//     }

//     public double getSurfaceArea() {
//         return 2 * Math.PI * radius * (radius + height);
//     }
// }

// public class Day27 {
//     public static void main(String[] args) {
//         Cylinder cylinder = new Cylinder();
//         cylinder.setRadius(7);
//         cylinder.setHeight(10);

//         System.out.println("Radius: " + cylinder.getRadius());       
//         System.out.println("Height: " + cylinder.getHeight());    
//         System.out.println("Volume: " + cylinder.getVolume());     
//         System.out.println("Surface Area: " + cylinder.getSurfaceArea());
//     }
// }



//QUESTION 3


// class Cylinder {
//     private double radius;
//     private double height;

//     public Cylinder(double radius, double height) {
//         this.radius = radius;
//         this.height = height;
//     }

//     public double getRadius() {
//         return radius;
//     }

//     public void setRadius(double radius) {
//         this.radius = radius;
//     }

//     public double getHeight() {
//         return height;
//     }

//     public void setHeight(double height) {
//         this.height = height;
//     }

//     public double getVolume() {
//         return Math.PI * radius * radius * height;
//     }

//     public double getSurfaceArea() {
//         return 2 * Math.PI * radius * (radius + height);
//     }
// }

// public class Day27 {
//     public static void main(String[] args) {
//         Cylinder cylinder = new Cylinder(7, 10);
//         cylinder.setRadius(8);
//         cylinder.setHeight(12);
        
//         System.out.println("Radius: " + cylinder.getRadius());
//         System.out.println("Height: " + cylinder.getHeight());
//         System.out.println("Volume: " + cylinder.getVolume());
//         System.out.println("Surface Area: " + cylinder.getSurfaceArea());
//     }
// }


//QUESTION 4


// class Rectangle {
//     private int length;
//     private int breadth;

//     public Rectangle() {
//         this.length = 4;
//         this.breadth = 5;
//     }

//     public Rectangle(int length, int breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }

//     public int getLength() {
//         return length;
//     }

//     public int getBreadth() {
//         return breadth;
//     }

//     public int getArea() {
//         return length * breadth;
//     }

//     public int getPerimeter() {
//         return 2 * (length + breadth);
//     }
// }

// public class Day27 {
//     public static void main(String[] args) {
//         // Using default constructor
//         Rectangle defaultRectangle = new Rectangle();
//         System.out.println("Default Rectangle:");
//         System.out.println("Length: " + defaultRectangle.getLength());
//         System.out.println("Breadth: " + defaultRectangle.getBreadth());
//         System.out.println("Area: " + defaultRectangle.getArea());
//         System.out.println("Perimeter: " + defaultRectangle.getPerimeter());

//         // Using overloaded constructor with custom parameters
//         Rectangle customRectangle = new Rectangle(8, 10);
//         System.out.println("\nCustom Rectangle:");
//         System.out.println("Length: " + customRectangle.getLength());
//         System.out.println("Breadth: " + customRectangle.getBreadth());
//         System.out.println("Area: " + customRectangle.getArea());
//         System.out.println("Perimeter: " + customRectangle.getPerimeter());
//     }
// }


//QUESTION 5

class Sphere {
    private double radius;
    private double diameter;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getVolume() {
        return (4/3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

public class Day27 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere();
        sphere.setRadius(5);
        sphere.setDiameter(10);  

        System.out.println("Radius: " + sphere.getRadius());
        System.out.println("Diameter: " + sphere.getDiameter());
        System.out.println("Volume: " + sphere.getVolume());
        System.out.println("Surface Area: " + sphere.getSurfaceArea());
    }
}
