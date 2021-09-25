package Builder;

public class MailExtensions {
    
    private static final String[] gmail =  {"gmail.com"};
    
    private static final String[] office365 = {"outlook.com"};
    
    private static final String[] yahoo = {"yahoo.com"};
    
    public static int search(String extension){
        
        for (int i = 0; i < gmail.length; i++) 
            if(gmail[i].equals(extension)) return 1;
        
        for (int i = 0; i < office365.length; i++) 
            if(office365[i].equals(extension)) return 2;
        
        for (int i = 0; i < yahoo.length; i++) 
            if(yahoo[i].equals(extension)) return 3;
        
        return 0;
    }
    
}
