package Builder;

// Director
public class Constructor {
    
    private Protocolo builder;
    
    public void setBuilder(Protocolo builder)
    {
        this.builder = builder;
    }
    
    public void buildMail()
    {
        builder.crearMail();
        builder.setProtocolo();
        builder.setProperties();
    }
    
    public Mail getMail()
    {
        return builder.getMail();
    }
}