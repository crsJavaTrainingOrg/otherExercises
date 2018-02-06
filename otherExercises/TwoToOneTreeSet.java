import java.util.TreeSet;
import java.util.Set;
public class TwoToOneTreeSet{
    
    public static String longest(String s1, String s2){
        Set<Character> characters = new TreeSet<Character>();
        String charactersOfSoneStwo = s1 + s2;
        for(int i = 0; i < charactersOfSoneStwo.length(); i++){
            characters.add(charactersOfSoneStwo.charAt(i));
        }
        System.out.println(characters.toString());
        return characters.toString();
    }
}
