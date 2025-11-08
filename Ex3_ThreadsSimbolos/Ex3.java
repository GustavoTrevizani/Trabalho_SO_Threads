class ThreadNumeros extends Thread {

    public ThreadNumeros(){
        super("Numeros");
    }

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(getName()+" -> "+ i);
            try{ Thread.sleep(500); } catch(Exception e){}
        }
        System.out.println(getName()+" terminou!");
    }
}

class ThreadLetras extends Thread {

    public ThreadLetras(){
        super("Letras");
    }

    @Override
    public void run(){
        for(char c = 'A'; c <= 'E'; c++){
            System.out.println(getName()+" -> "+ c);
            try{ Thread.sleep(500); } catch(Exception e){}
        }
        System.out.println(getName()+" terminou!");
    }
}

class ThreadSimbolos extends Thread {

    public ThreadSimbolos(){
        super("Simbolos");
    }

    @Override
    public void run(){
        char[] simbolos = {'*', '#', '@', '$', '%'};
        for(char s : simbolos){
            System.out.println(getName()+" -> "+ s);
            try{ Thread.sleep(500); } catch(Exception e){}
        }
        System.out.println(getName()+" terminou!");
    }
}


public class Ex3 {

    public static void main(String[] args) {
        System.out.println("=== Inicio do Programa Principal ===");
        System.out.println("As threads foram iniciadas!");

        ThreadNumeros t1 = new ThreadNumeros();
        ThreadLetras  t2 = new ThreadLetras();
        ThreadSimbolos t3 = new ThreadSimbolos();

        t1.start();
        t2.start();
        t3.start();
    }
}
