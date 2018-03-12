import java.io.IOException;
import java.util.*;

////////////////////////////////////////////////////////////////
public class TreeApp {
    public static void main(String[] args) throws IOException {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        String word = "rrtreeee";
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i=0;i<word.length();i++)
        {
            if(hashMap.containsKey(word.charAt(i)))
            {
                int x = hashMap.get(word.charAt(i));
                x=x+1;
                hashMap.put(word.charAt(i),x);
            }
            else {
                hashMap.put(word.charAt(i), 1);
            }
        }


        TreeMap<Integer, Character> treeMap = new TreeMap<>(Collections.reverseOrder());
        for(Map.Entry m:hashMap.entrySet()){
            treeMap.put((Integer)m.getValue(),(Character) m.getKey());
        }
        for(Map.Entry m:treeMap.entrySet()){
            for(int i=0;i<(int)m.getKey();i++)
            {
                System.out.print(m.getValue());
            }
        }
    } // end main()
}
