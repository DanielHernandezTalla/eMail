package Builder;

//Clase builder
public abstract class Protocolo {
    
    protected Mail mail;
    
    public Mail getMail(){
        return this.mail;
    }
    
    public void crearMail(){
        this.mail = new Mail();
    }

    public abstract void setProtocolo();
    public abstract void setProperties();
}
