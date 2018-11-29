
package marketshop;

public class Prodotto {
    
    private int codprod;    //codice prodotto
    private String nomepr;  //nome prodotto
    private int quant;      //quantità disponibile
    private int categoria;  //codice categoria appartenenza prodotto
    private float price;    //prezzo prodotto
    private String descr;   //descrizione prodotto
    
    public Prodotto(){
        
                   
    }
    
    public void setCodicePro(int codprod){
        this.codprod = codprod;
    }
    public int getCodicePro(){
       return codprod;                      
    }
    
    public void setQnt(int quant){
        this.quant = quant; 
    }
    public int getQnt(){
        return quant;
    }
    
    public void setPre(float price){
        this.price = price;
    }
    public float getPre(){
        return price;    
    }
    
    public int getCatego(){
        return categoria;
    } 
    public void setCatego(int categoria){
        this.categoria = categoria;
    }
    
    public String getDescri(){
        return descr;
    }
    public void setDescri(String descr){
        this.descr = descr;
    }
    
    public String getNomePr(){
        return nomepr;
    }    
    public void setNomePr(String nomepr){
        this.nomepr = nomepr;
    }
}
