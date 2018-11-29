
package marketshop;

public class Cliente {

    private String codfisc;      //codice fiscale cliente, identificativo del login
    private String nome;      //nome cliente
    private String cognome;   //congome cliente
    private String resid;     //residenza cliente
    private String pwd;       //password per un eventuale accesso
    
    public Cliente(String codfisc, String nome, String cognome, String resid,String pwd){
        
        this.codfisc = codfisc;
        this.nome = nome;
        this.cognome = cognome;
        this.resid = resid;
        this.pwd = pwd;

    
    }
    
    public String getCodiceFisc(){
        
        return codfisc; //associa cliente al carrello
        
    }
}
