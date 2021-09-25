package Builder;

//Clase concreta 

import java.util.Properties;

public class ProtocoloYahoo extends Protocolo{
    
    @Override
    public void setProtocolo() {
        this.mail.setProtocolo("smtp");
    }    
    
    @Override
    public void setProperties(){
    
        /*
        •Servidor IMAP: imap.mail.yahoo.com
        Usar SSL: Sí
        Puerto: 993
        •Servidor POP: pop.mail.yahoo.com
        Usar SSL: No
        Puerto: 110
        •Servidor SMTP: smtp.mail.yahoo.com
        Usar autenticación: Sí
        Usar SSL: Sí
        Puerto: 465
        •Nombre de cuenta: usuario@yahoo.com
        Dirección de correo electrónico: usuario@yahoo.com
        Contraseña: Su contraseña
        */
        
        Properties propiedades = new Properties();
        
        propiedades.setProperty("mail.smtp.host","smtp.mail.yahoo.com" );
        propiedades.setProperty("mail.smtp.starttls.enable","true" );
        propiedades.setProperty("mail.smtp.port","465" );
        propiedades.setProperty("mail.smtp.auth","true" );
    }    
}
