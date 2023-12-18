package MultiThreading;

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);
        MyThread t3 = new MyThread(3);
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThread extends Thread{
    private int threadId;
    public MyThread(int thread){
        this.threadId = thread;
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("ThreadID "+threadId+" -Count : "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("Eror Occured");
            }
        }
    }
}