////CHAPTER 13 PRACTICE SET
//QUESTION 1

// class GoodMorningThread extends Thread {
//     public void run() {
//         while (true) {
//             System.out.println("Good Morning");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class WelcomeThread extends Thread {
//     public void run() {
//         while (true) {
//             System.out.println("Welcome");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class Day30 {
//     public static void main(String[] args) {
//         GoodMorningThread gmThread = new GoodMorningThread();
//         WelcomeThread welcomeThread = new WelcomeThread();

//         gmThread.start();
//         welcomeThread.start();
//     }
// }


//QUESTION 2

// class GoodMorningThread extends Thread {
//     public void run() {
//         while (true) {
//             System.out.println("Good Morning");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class WelcomeThread extends Thread {
//     public void run() {
//         while (true) {
//             System.out.println("Welcome");
//             try {
//                 Thread.sleep(1200); 
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class Day30 {
//     public static void main(String[] args) {
//         GoodMorningThread gmThread = new GoodMorningThread();
//         WelcomeThread welcomeThread = new WelcomeThread();

//         gmThread.start();
//         welcomeThread.start();
//     }
// }

//QUESTION 3

// class MyThread extends Thread {
//     public MyThread(String name) {
//         super(name);
//     }

//     public void run() {
//         System.out.println(Thread.currentThread().getName() + " has priority " + Thread.currentThread().getPriority());
//     }
// }

// public class Day30 {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread("Thread 1");
//         MyThread t2 = new MyThread("Thread 2");
//         MyThread t3 = new MyThread("Thread 3");

//         t1.setPriority(Thread.MIN_PRIORITY); 
//         t2.setPriority(Thread.NORM_PRIORITY); 
//         t3.setPriority(Thread.MAX_PRIORITY);

//         t1.start();
//         t2.start();
//         t3.start();

//         System.out.println(t1.getName() + " Priority: " + t1.getPriority());
//         System.out.println(t2.getName() + " Priority: " + t2.getPriority());
//         System.out.println(t3.getName() + " Priority: " + t3.getPriority());
//     }
// }


//QUESTION 4

// class MyThread extends Thread {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println(Thread.currentThread().getName() + " is running");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class Day30 {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();

//         System.out.println("State of t1 before starting: " + t1.getState());

//         t1.start();
//         System.out.println("State of t1 after starting: " + t1.getState());

//         while (t1.isAlive()) {
//             Thread currentThread = Thread.currentThread();
//             System.out.println(currentThread.getName() + " is checking t1's state.");
//             System.out.println("State of t1 while running: " + t1.getState());
//             try {
//                 Thread.sleep(500); 
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }

//         System.out.println("State of t1 after completion: " + t1.getState());
//     }
// }


//QUESTION 5


public class Day30 {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        
        System.out.println("Current thread: " + currentThread.getName());
        System.out.println("Current thread's ID: " + currentThread.getId());
        System.out.println("Current thread's Priority: " + currentThread.getPriority());
        System.out.println("Current thread's State: " + currentThread.getState());
    }
}
