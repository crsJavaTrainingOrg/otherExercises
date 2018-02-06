import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.HashSet;

public class Lottery{
    public static void lottery(int n1, int n2, int n3, int n4, int n5){
        
        String result = "";
        HashSet<Integer> usedNumbers = new HashSet<Integer>();
        HashSet<Integer> playedNumbers = new HashSet<Integer>();
        playedNumbers.add(n1);
        playedNumbers.add(n2);
        playedNumbers.add(n3);
        playedNumbers.add(n4);
        playedNumbers.add(n5);
        int random;

        while(usedNumbers.size() < 5){
            random = ThreadLocalRandom.current().nextInt(1,21);
            usedNumbers.add(random);
        }
        playedNumbers.retainAll(usedNumbers);
        System.out.println(playedNumbers.size());
        for(Integer element : playedNumbers){
            System.out.print(element);
        }
    }
}
        

            
        
        

            

