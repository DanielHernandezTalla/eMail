package Builder;

//Clase Producto

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {

//  Lugar donde podemos guardar la instancia de un mail creado    
    public static Mail mail;
    public static javax.swing.JFrame form;
    public static javax.swing.JFrame formMail;
    
    // Atributos
    private String correo;
    private String contrasena;
    
    // Variables de cada correo
    private String Destinatario;
    private String Asunto;
    private String Mensaje;
    
    // Especificos dependiendo del protocolo
    private String Protocolo;
    private Properties Properties;
        
    protected String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    protected String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    protected String getProtocolo() {
        return Protocolo;
    }

    protected String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }
    
    protected Properties getProperties() {
        return Properties;
    }
    
    private String getContrasena(){
        return this.contrasena;
    }
    
    private String getCorreo(){
        return this.correo;
    }
    
    // Propiedades staticas asignadas con builder
    protected void setProtocolo(String Protocolo) {
        this.Protocolo = Protocolo;
    }
    
    protected void setProperties(Properties Properties) {
        this.Properties = Properties;
    }
    
    // Propiedades que se asignan a la hora de iniciar sesion y comprobar si el correo 
    // existe o no
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    } 
   
    public String comprobarCorreo(){
//        Creamos las propiedades del correo
        Properties propiedades = this.getProperties();
        
//        Creamos Sesion
        Session session = Session.getDefaultInstance(propiedades, null);
        
        try {
//            Transporte del Mail
            Transport transporte = session.getTransport(this.getProtocolo());
            transporte.connect(this.correo, this.contrasena);
            transporte.close();
            
            return "Ok";
            
        } catch (AddressException ex) {
            
            return ex.getMessage();
            
        } catch (MessagingException ex) {
            
            return "Correo o contraseña incorrecta!";
        }   
    }
    
    public String enviarMensaje(){    
//        Creamos las propiedades del correo
        Properties propiedades = this.getProperties();
        
//        Creamos Sesion
        Session session = Session.getDefaultInstance(propiedades, null);
                
//        Agragamos los datos del correo
        String destinatario = this.getDestinatario();
        String asunto = this.getAsunto();
        String mensaje = this.getMensaje();
                
//        Intancias y conecciones 
        MimeMessage mail = new MimeMessage(session);
        
        try {
            mail.setFrom(new InternetAddress(this.correo));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            
//            Transporte del Mail
            Transport transporte = session.getTransport(this.getProtocolo());
            transporte.connect(this.correo, this.contrasena);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
            return "Correo enviado correctamente!";
            
        } catch (AddressException ex) {
            
            return ex.getMessage();
            
        } catch (MessagingException ex) {
            
            return ex.getMessage();
        }   
    }
}