
package marketshop;


public class Ordine {
    
    private int codord; //codice ordine
    private int codcar; //codice carrello
    
    public Ordine(){
    
        
        
    }
    
    public void setCodiceCar(int codcar){
    
        this.codcar = codcar; //associa ordine al carrello
    
    }
    
    public int getCodiceOrd(){
    
        return codord; //serve per notificare l'ordine al dipendente
        
    }
}
