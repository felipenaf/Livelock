package livelock;

public class Policial {
    
    private boolean moneySent = false;
 
    public void giveRansom(Bandido bandido) {
        
        while (bandido.isHostageReleased()){
//        while (!bandido.isHostageReleased()) {
 
            System.out.println("Policial: esperando o bandido soltar o refém\n");
 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
 
        System.out.println("Policial: entregou o dinheiro");
 
        this.moneySent = true;
    }
 
    public boolean isMoneySent() {
        return this.moneySent;
    }
}