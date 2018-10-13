package livelock;

public class Bandido {
    
    private boolean hostageReleased = false;
 
    public void releaseHostage(Policial policial) {
        
        while (!policial.isMoneySent()) {
 
            System.out.println("Bandido: esperando o policial para entregar o refém\n");
 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
 
        System.out.println("Bandido: soltou o refém");
 
        this.hostageReleased = true;
    }
 
    public boolean isHostageReleased() {
        return this.hostageReleased;
    }
}