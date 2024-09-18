package threads;

public class Main {

public static void main(String[]args)
{
compte A = new compte(1000);

Thread_compte t1 = new Thread_compte(A);
Thread_compte t2 = new Thread_compte(A);
Thread_compte t3 = new Thread_compte(A);

t1.start();
t2.start();
t3.start();






}	

}
