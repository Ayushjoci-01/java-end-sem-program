/*public Multithreaded programming:
Write a program MultiThreads that creates two threads-one thread with the
name CSthread and the other thread named ITthread.
Each thread should
display its respective name and execute after a gap of 500 milliseconds. Each
thread should also display a number indicating the number of times it got a
chance to execute {
    
}*/
public class program19 {
    public static void main(String[] args) {
        Runnable csThread = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("CSthread: Executing " + i + " times");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable itThread = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("ITthread: Executing " + i + " times");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread csThreadObj = new Thread(csThread);
        Thread itThreadObj = new Thread(itThread);

        csThreadObj.start();
        itThreadObj.start();
    }
}

