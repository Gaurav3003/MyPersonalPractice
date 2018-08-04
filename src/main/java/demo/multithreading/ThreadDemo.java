package demo.multithreading;


class Hi extends Thread {
    @Override
    public void run() {
        System.out.println("Starts hi");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        System.out.println("Starts hello");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ThreadDemo {

    public static void main(String args[]) {
        /*Runnable obj1 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i <5 ; i++){
                    System.out.println("Hi");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable obj2 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i <5 ; i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };*/

        /*Runnable obj1 = () -> {

                for(int i = 0; i <5 ; i++){
                    System.out.println("Hi");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        };

        Runnable obj2 = ()-> {

                for(int i = 0; i <5 ; i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);*/


        Thread t1 = new Thread(() ->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        },"Hi_THREAD");
        Thread t2 = new Thread(() -> {

            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        },"HELLO_THREAD");

        t1.start();
        t1.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main Thread");

    }

}
