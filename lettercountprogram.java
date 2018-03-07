import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class MysqlConnect {
    public static void main(String[] args){

        HashMap<Character,Integer> countingHashMap = new HashMap<>();
        String word = "anagrammr";
        int count=1;
        for(int i=0;i<word.length();i++){
            if(countingHashMap.containsKey(word.charAt(i)))
            {
                int x = countingHashMap.get(word.charAt(i));
                x=x+1;
                countingHashMap.put(word.charAt(i),x);
            }
            else {
                countingHashMap.put(word.charAt(i), count);
            }
        }
        for(Map.Entry m:countingHashMap.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }
    }

}
