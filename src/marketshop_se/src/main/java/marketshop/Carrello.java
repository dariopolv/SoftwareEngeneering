
package marketshop;

public class Carrello {
    private int codcarr;       //codice carrello
    private float finalprice;  //prezzo finale da pagare
    private String codicefisc; //codice fiscale del cliente
    
    public Carrello(){
            
    }
    
    public void setCodiceF(String codicefisc){
    
        this.codicefisc = codicefisc; //associa il carrello al cliente
        
    }
    
    public int getCodiceC(){
    
        return codcarr; //associa il carrello all'ordine
    
    }
    
}
