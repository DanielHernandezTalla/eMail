package Builder;

//Clase concreta 

import java.util.Properties;


public class ProtocoloGmail extends Protocolo{

    @Override
    public void setProtocolo() {
        this.mail.setProtocolo("smtp");
    }
    
    @Override
    public void setProperties(){
        
        /*• Servidor IMAP: imap.gmail.com
            Usar SSL: Sí
            Puerto: 993
            •Servidor POP: pop.gmail.com
            Usar SSL: Sí
            Puerto: 995
            •Servidor SMTP: smtp.gmail.com
            Usar autenticación: Sí
            Usar SSL: Sí
            Puerto: 465 o 587
            •Nombre de cuenta: usuario@gmail.com
            Dirección de correo electrónico: usuario@gmail.com
            Contraseña: Su contraseña*/
        
        Properties propiedades = new Properties();
        
        propiedades.setProperty("mail.smtp.host","smtp.gmail.com" );
        propiedades.setProperty("mail.smtp.starttls.enable","true" );
        propiedades.setProperty("mail.smtp.port","587" );
        propiedades.setProperty("mail.smtp.auth","true" );
        
        this.mail.setProperties(propiedades);
    }
}
