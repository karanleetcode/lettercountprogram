import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MysqlConnect {

    public static void main(String[] args){
  
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(32);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(1);
        int k=0;
        for(int i=0;i<linkedList.size();i++){
            if(linkedList.get(i)==linkedList.get(linkedList.size()-1-i))
            {
            k=1;
            }
            else{
                k=0;
                break;
            }
        }
        if(k==1)System.out.println("it is palidron");
        else System.out.println("it is not palidrone");
    }

}
