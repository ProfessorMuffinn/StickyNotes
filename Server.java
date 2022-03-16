import java.io.*;  
import java.net.*;  
public class Server {
    public static void main(String[] args){ 
        try{
            ServerSocket ss = new ServerSocket(6666); //Define socket port
            Socket s = ss.accept();
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
