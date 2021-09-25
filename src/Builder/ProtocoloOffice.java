package Builder;

//Clase concreta 

import java.util.Properties;

public class ProtocoloOffice extends Protocolo{
    
    @Override
    public void setProtocolo() {
        this.mail.setProtocolo("smtp");
    }
    
    @Override
    public void setProperties(){
        
        /*
            Servidor IMAP: No tiene
            •Servidor POP: pop3.live.com
            Usar SSL: Sí
            Puerto: 995
            •Servidor SMTP: smtp.live.com
            Usar autenticación: Sí
            Usar SSL: Sí
            Puerto: 25
            •Nombre de cuenta: usuario@hotmail.com
            Dirección de correo electrónico: usuario@hotmail.com
            Contraseña: Su contraseña
        */
        
        Properties propiedades = new Properties();
        
        propiedades.put("mail.smtp.host","smtp.office365.com" );
        propiedades.put("mail.smtp.port","587");
        propiedades.put("mail.smtp.auth","true");
        propiedades.put("mail.smtp.starttls.enable","true");
        
        this.mail.setProperties(propiedades);
    }
}
