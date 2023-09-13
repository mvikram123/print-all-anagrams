import java.util.*;

class Anagram{

    public static void allAnagrams(String str[]){

        HashMap<String,List<String>> map=new HashMap<>();


        for(int i=0; i<str.length; i++){
            String word=str[i];
            char charArray[]=word.toCharArray();

            Arrays.sort(charArray);
            //System.out.println(charArray);
            String newWord=new String(charArray);

            if(map.containsKey(newWord)){
                //System.out.print(map);
                map.get(newWord).add(word);


            }
            else{
                List<String> words=new ArrayList<>();
                words.add(word);
                // System.out.println(words);
                map.put(newWord,words);
                // System.out.println(map);
            }
        }
        // System.out.println(map);
        for(String s:map.keySet()){
            List<String> values=map.get(s);
            //System.out.println(values);
            if(values.size()>1){
                System.out.println(values);
            }
        }

    }
}
public class Main
{
    public static void main(String[] args) {
        String arr[]
                = { "cat", "dog", "tac", "god", "act" };
        Anagram.allAnagrams(arr);
    }
}
//output = [cat, tac, act]
 //       [dog, god]
