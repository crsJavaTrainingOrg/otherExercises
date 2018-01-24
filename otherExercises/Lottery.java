import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.HashSet;


public class Lottery{
    
    public static void lottery(int n1, int n2, int n3, int n4, int n5){
        int[] playedNumbers = new int[] {n1,n2,n3,n4,n5};
        int[] randomNumbers = new int[5];
        
        String result = "";
        HashSet<Integer> usedNumbers = new HashSet<Integer>();
        
        for(int i = 0; i < randomNumbers.length;i++){
            int random = ThreadLocalRandom.current().nextInt(1,91);
            while(usedNumbers.contains(random)){
                random = ThreadLocalRandom.current().nextInt(1,91);
            }
            usedNumbers.add(random);
            randomNumbers[i] = random;
        }
        
        for(int i = 0;i <randomNumbers.length;i++){
            for(int j = 0; j < playedNumbers.length; j++){
                if(randomNumbers[i] == playedNumbers[j]){
                    result = result + playedNumbers[j];
                }
            }

        }
        
        System.out.println(Arrays.toString(randomNumbers));
        if(result.length() == 0){
            System.out.println("You didn't win anything");
        }
        else{
            System.out.println(result);
        }
    }
}
