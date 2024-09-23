// interface Instrument {
//     void play();
// }

// class Guitar implements Instrument {
//     public void play() {
//         System.out.println("Playing Guitar");
//     }
// }

// class Piano implements Instrument {
//     public void play() {
//         System.out.println("Playing Piano");
//     }
// }

// class Violin implements Instrument {
//     public void play() {
//         System.out.println("Playing Violin");
//     }
// }


// public class Day12 {
//     public static void main(String[] args) {
//         Instrument instrument1 = new Guitar();
//         Instrument instrument2 = new Piano();
//         Instrument instrument3 = new Violin();

//         instrument1.play();
//         instrument2.play();
//         instrument3.play();
//     }
// }

// interface Printer {
//     void print();
// }

// class InkjetPrinter implements Printer {
//     public void print() {
//         System.out.println("Inkjet Printer: Printing with ink.");
//     }
// }

// class LaserPrinter implements Printer {
//     public void print() {
//         System.out.println("Laser Printer: Printing with toner.");
//     }
// }

// class DotMatrixPrinter implements Printer {
//     public void print() {
//         System.out.println("Dot Matrix Printer: Printing with ribbon.");
//     }
// }

// public class Day12 {
//     public static void main(String[] args) {
//         Printer printer1 = new InkjetPrinter();
//         Printer printer2 = new LaserPrinter();
//         Printer printer3 = new DotMatrixPrinter();

//         printer1.print();
//         printer2.print();
//         printer3.print();
//     }
// }



interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class Day12 {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        Shape shape3 = new Triangle();

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}

