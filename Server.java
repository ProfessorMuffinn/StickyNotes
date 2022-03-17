import java.io.*;  
import java.net.*;  
import java.util.*;    
public class Server {
    static List<Notes> board;
    static int id = 0;
    public static void main(String[] args){ 
        try{
            ServerSocket ss = new ServerSocket(6666); //Define socket port
            Socket s = ss.accept(); //Accept port com
            DataInputStream read = new DataInputStream(s.getInputStream()); 
            DataOutputStream write =new DataOutputStream(s.getOutputStream());  
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            while(true){
                String  str = (String)read.readUTF();  
                String[] message = str.split("/");
                if(message[0] == "1"){
                    boolean checker = addNote(message);
                    if(checker == true){

                    }
                    else{
                        
                    }
                }
                else if (message[1] == "2"){
                    boolean checker = removeNote(message);
                    if(checker == true){

                    }
                    else{
                        
                    }
                }
                else if (message[1] == "3"){
                    printBoard();
                }
                else{
                    ss.close();
                    write.close();
                    br.close();
                    read.close();
                }
            }   
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    private static boolean addNote(String[] message){
        int x = Integer.parseInt(message[1]);
        int y = Integer.parseInt(message[2]);
        String c_message = message[3];
        int new_id = id++;
        Notes new_note = new Notes(new_id,x,y,c_message);
        for (Notes i : board){
            if(i.x == new_note.x && i.y == new_note.y){
                System.out.println("Server cannot add note due to another note being here....");
                return false;
            }
        }
        board.add(new_note);
        return true;
    }

    private static boolean removeNote(String[] message){
        return false;
    }
    
    private static void printBoard(){

    }
}
