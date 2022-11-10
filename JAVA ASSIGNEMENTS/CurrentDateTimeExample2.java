import java.text.SimpleDateFormat;  
import java.util.Date;  
public class CurrentDateTimeExample2 {  
public static void main(String[] args) {  
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    System.out.println(formatter.format(date));  
}  
}  
