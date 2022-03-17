import java.io.*;  
import java.net.*; 
public class Client {
    public static void main(String[] args) {  
        try{      
            Socket s=new Socket("localhost",6666);  
            DataOutputStream stream=new DataOutputStream(s.getOutputStream());  
            stream.writeUTF("Hello Server");  
            stream.flush();  
            stream.close();  
            s.close();  
        }catch(Exception e){
            System.out.println(e);
        }  
    }  
}
