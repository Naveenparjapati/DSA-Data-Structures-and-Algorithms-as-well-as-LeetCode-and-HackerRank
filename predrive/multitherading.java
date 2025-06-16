package predrive;





class Demo{
    synchronized public static void m1() {
        for(int i=1;i<11;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    synchronized public static void m2() {
        for(int i=101;i<111;i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
class Tester1 extends Thread{
    public void run() {
        Demo.m1();
    }
}
class Tester2 extends Thread{
    public void run() {
        Demo.m2();
    }
}
public class multitherading {

    public static void main(String[] args) {

        Tester1 t1=new Tester1();
        Thread r1=new Thread(t1);
        r1.start();
        Tester2 t2=new Tester2();
        Thread r2=new Thread(t2);
        r2.start();

    }

}
