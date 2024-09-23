// Use of threads

// class MyThread extends Thread {
//     @Override
//     public void run() {
//         System.out.println("Thread is running: " + Thread.currentThread().getName());
//     }
// }

// public class Day13 {
//     public static void main(String[] args) {
//         MyThread thread1 = new MyThread();
//         thread1.start();
//     }
// }

//Java program to create a thread using the Runnable interface:

// class MyRunnable implements Runnable {
//     @Override
//     public void run() {
//         System.out.println("Thread is running: " + Thread.currentThread().getName());
//     }
// }

// public class Day13 {
//     public static void main(String[] args) {
//         MyRunnable myRunnable = new MyRunnable();
//         Thread thread = new Thread(myRunnable);
//         thread.start();
//     }
// }

//Java thread life cycle

// class MyRunnable implements Runnable {
//     @Override
//     public void run() {
//         System.out.println("Thread is running: " + Thread.currentThread().getName());
//     }
// }

// public class Day13 {
//     public static void main(String[] args) {
//         MyRunnable myRunnable = new MyRunnable();
//         Thread thread = new Thread(myRunnable);

//         System.out.println("Thread state: " + thread.getState());

//         thread.start();
//         System.out.println("Thread state after start: " + thread.getState());

//         try {
//             thread.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         System.out.println("Thread state after completion: " + thread.getState());
//     }
// }



//Example Program Demonstrating Different Constructors

// class MyRunnable implements Runnable {
//     @Override
//     public void run() {
//         System.out.println("Thread is running: " + Thread.currentThread().getName());
//     }
// }

// public class Day13 {
//     public static void main(String[] args) {
//         Thread thread1 = new Thread();
//         thread1.start();
        
//         Runnable task = new MyRunnable();
//         Thread thread2 = new Thread(task);
//         thread2.start();
        
//         Thread thread3 = new Thread("NamedThread");
//         thread3.start();
        
//         Thread thread4 = new Thread(task, "TaskThread");
//         thread4.start();
        
//         ThreadGroup group = new ThreadGroup("Group1");
//         Thread thread5 = new Thread(group, task, "GroupTaskThread");
//         thread5.start();
//     }
// }

// Java Thread priorities

// class PriorityRunnable implements Runnable {
//     private String threadName;
    
//     public PriorityRunnable(String name) {
//         this.threadName = name;
//     }
    
//     @Override
//     public void run() {
//         System.out.println(threadName + " running with priority: " + Thread.currentThread().getPriority());
//     }
// }

// public class Day13 {
//     public static void main(String[] args) {
//         Thread thread1 = new Thread(new PriorityRunnable("LowPriorityThread"));
//         Thread thread2 = new Thread(new PriorityRunnable("NormalPriorityThread"));
//         Thread thread3 = new Thread(new PriorityRunnable("HighPriorityThread"));
        
//         thread1.setPriority(Thread.MIN_PRIORITY);
//         thread2.setPriority(Thread.NORM_PRIORITY);
//         thread3.setPriority(Thread.MAX_PRIORITY);
        
//         thread1.start();
//         thread2.start();
//         thread3.start();
//     }
// }


// Java Thread methods

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running");
            Thread.sleep(2000);
            System.out.println("Thread " + Thread.currentThread().getName() + " has finished sleeping");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}

public class Day13 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(), "MyThread");
        thread.setPriority(Thread.MAX_PRIORITY);
        
        System.out.println("Thread name: " + thread.getName());
        System.out.println("Thread priority: " + thread.getPriority());
        
        thread.start();
        
        System.out.println("Is thread alive? " + thread.isAlive());
        
        thread.join(); // Wait for the thread to complete
        
        System.out.println("Is thread alive after join? " + thread.isAlive());
    }
}


