class NovaThread extends Thread {

    public NovaThread(String nomeDaThread){
        super(nomeDaThread);
    }

    @Override
    public void run(){
        System.out.println(getName() + " esta executando...");
        try{
            Thread.sleep(500);
        } catch(Exception e){}
        System.out.println(getName() + " finalizou!");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Ola Mundo das Threads!");

        NovaThread t1 = new NovaThread("Thread A");
        NovaThread t2 = new NovaThread("Thread B");

        t1.start();
        t2.start();
    }
}
