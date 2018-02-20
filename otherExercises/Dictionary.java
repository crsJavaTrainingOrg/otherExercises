import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.text.Collator;


public class Dictionary{
    
    public static void getWords(String text){
        text = text.replaceAll(",$","");
        text = text.replaceAll("\\.","");
        
        String[] words = text.split(" ");
        Collection<String> wordsOfText = new TreeSet<String>(Collator.getInstance());
        
        for(int i = 0; i < words.length; i++){
            wordsOfText.add(words[i]);
        }
         
        for(String s : wordsOfText){
            System.out.println(s);
        }
 
        
    }
}
        
       
    
    
