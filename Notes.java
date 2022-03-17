import java.io.*;  
import java.net.*;
import java.util.*;    
public class Notes {
    public int id;
    public int x;
    public int y;
    public String message;
    

    public Notes(int cid, int cx, int cy, String cmessage){
        id = cid;
        x = cx;
        y = cy;    
        message = cmessage;                
    }

    public int get_x(){
        return x;
    }

    public int get_y(){
        return y;
    }

    public int get_id(){
        return id;
    }

    public void set_x(int new_x){
        x = new_x;
    }
    
    public void set_y(int new_y){
        y = new_y;
    }

    public void set_message(String new_message){
        message = new_message;
    }

    public boolean isEqual(Notes a, Notes b){
        if(a.id == b.id){
            return true;
        }
        return false;
    }

    public boolean corridatesEqual(Notes a, Notes b){
        if(a.x == b.x && a.y == b.y){
            return true;
        }
        return false;

    }

}
