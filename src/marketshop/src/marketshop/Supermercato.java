
package marketshop;

public class Supermercato {
    
    private int ID;          //identificativo del supermercato
    private String nome;     //nome del supermercato 
    private String luogo;    //dove è situato il supermercato
    private String numtel;   // numero telefono supermercato
    private String openh;    //orario apertura supermercato
    private String closeh;   //orario chiusura supermercato
    
    public Supermercato(int ID,String nome,String luogo,String numtel,String openh,String closeh){
    
        this.ID = ID;
        this.nome = nome;
        this.luogo = luogo;
        this.numtel = numtel;
        this.openh = openh;
        this.closeh = closeh;
    
    }
}
