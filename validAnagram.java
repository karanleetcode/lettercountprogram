import java.util.*;

////////////////////////////////////////////////////////////////
public class TreeApp {
    public static void main(String[] args) {
        String s1 = "tac";
        String s2 = "cat";

        HashMap<Character,Integer> countingHashMap = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(countingHashMap.containsKey(s1.charAt(i)))
            {
                int x = countingHashMap.get(s1.charAt(i));
                x=x+1;
                countingHashMap.put(s1.charAt(i),x);
            }
            else {
                countingHashMap.put(s1.charAt(i), 1);
            }
        }
        //System.out.println(countingHashMap.get('a'));  //gets the value of that object key
        int key = 0;
       for(int j=0;j<s2.length();j++)
        {
            if(countingHashMap.containsKey(s2.charAt(j)))
            {
                if(countingHashMap.get(s2.charAt(j)) > 0){
                    int x = countingHashMap.get(s2.charAt(j));
                    x=x-1;
                    countingHashMap.put(s2.charAt(j),x);
                    key = 1;
                }
                else{
                    key = 0;break;
                }
            }
            else{
                key = 0;
                break;
            }
        }
        if(key == 1) System.out.println("Its a valid anagram..");
       else System.out.println("It is not a valid anagram..");
    } // end main()
}
