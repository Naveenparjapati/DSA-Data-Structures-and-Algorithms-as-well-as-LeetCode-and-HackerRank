package task1;
public class singltonelocking {
     private static volatile singltonelocking instance;
      private singltonelocking() {
            System.out.println("Singleton instance created!");
        }

        public static singltonelocking getInstance() {
            if (instance == null) {
                synchronized (singltonelocking.class) {
                    if (instance == null) {
                        instance = new singltonelocking();
                    }
                }
            }
            return instance;
        }

        public void showMessage() {
            System.out.println("Hello from Singleton!");
        }

        public static void main(String[] args) {
            Runnable task = () -> {
                singltonelocking singleton = singltonelocking.getInstance();
                singleton.showMessage();
            };

            Thread thread1 = new Thread(task);
            Thread thread2 = new Thread(task);
            Thread thread3 = new Thread(task);
            Thread thread4 = new Thread(task);
            Thread thread5 = new Thread(task);

            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
        }
    }