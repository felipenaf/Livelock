package livelock;

public class Livelock {
    
    static final Policial policial = new Policial();
 
    static final Bandido bandido = new Bandido();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                policial.giveRansom(bandido);
            }
        });
        t1.start();
 
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                bandido.releaseHostage(policial);
            }
        });
        t2.start();
    }
    
}
