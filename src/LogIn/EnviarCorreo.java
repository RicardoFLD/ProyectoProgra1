package LogIn;


import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;


public class EnviarCorreo {
    
    static final String FROM = "Inventario de libros";
    static final String FROMNAME = "BilyBily";
    
    static final String SMTP_USERNAME = "ricardo.fallas.l@gmail.com";
    
    //aqui va el codigo con la verificacion de 2 pasos
    static final String SMTP_PASSWORD = "lnueeivozogdlimh";
    
    static final String CONFISET = "Configset";
    
    static final String HOST = "smtp.gmail.com";
    static final int PORT = 587;
    
    public void enviarMensaje(String Destinatario, String Asunto, String Cuerpo) throws MessagingException, UnsupportedEncodingException{
        
        Properties props = System.getProperties();
        props.put("mail.transport.protocol" , "smtp");
        props.put("mail.smtp.port" , PORT);
        props.put("mail.smtp.starttls.enable" , "true");
        props.put("mail.smtp.auth" , "true");
        
        Session sesion = Session.getDefaultInstance(props);
        
        
        MimeMessage mg = new MimeMessage(sesion); 
        mg.setFrom(new InternetAddress (FROM , FROMNAME));
        mg.setRecipient(Message.RecipientType.TO, new InternetAddress(Destinatario));
        mg.setSubject(Asunto);
        mg.setContent(Cuerpo , "text/html");
        mg.setHeader("X-SES-CONFIGURATION_SET", CONFISET);
        
        Transport transporte = sesion.getTransport();
        transporte.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
        transporte.sendMessage(mg , mg.getAllRecipients());
    }

    void enviarMensaje(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
