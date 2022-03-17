import java.io.*;  
import java.net.*;  
import java.util.*;    
public class Server {
    List<Notes> board;
    public static void main(String[] args){ 
        try{
            ServerSocket ss = new ServerSocket(6666); //Define socket port
            Socket s = ss.accept(); //Accept port com
            DataInputStream message = new DataInputStream(s.getInputStream()); 
            String  str = (String)message.readUTF();  
            System.out.println("message= "+str);  
            ss.close();  
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
