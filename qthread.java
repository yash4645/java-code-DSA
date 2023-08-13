// import java.io.*;
// import java.lang.*;

public class qthread {  

    public static class Odd extends Thread{
        public void run(){
            for(int i=1;i<50;i+=2){
                System.out.print(i+" ");
            }
        }
    } 

    public static class Even extends Thread{
        public void run(){
            for(int i=0;i<50;i+=2){
                System.out.print(i+" ");
            }
        }
    }
    
    public static void main(String[] args){
        Even e=new Even();
        Odd o=new Odd();
        e.start();
        o.start();
        e.run();
        o.run();
       
    }
}
