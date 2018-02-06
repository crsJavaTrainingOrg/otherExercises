import java.util.concurrent.ThreadLocalRandom;

public class Array{
    
    public static void cycle(){
        
        int[] anArray = new int[10];
        int i = 0;
        int random = ThreadLocalRandom.current().nextInt(0,1001);
        
        while(random !=0){
            random = ThreadLocalRandom.current().nextInt(0,1001);
            if(random != 0){
                if(i <anArray.length){
                    anArray[i] = 1;
                }
                else{
                    int oldLength = anArray.length;
                    anArray = new int[anArray.length * 2];
                    for(int j = 0; j < oldLength + 1; j++){
                        anArray[j] = 1;
                    }
                }
                i++;
            }
            if(random == 0){
                break;
            }
        }
        int counter = 0;
        for(int k = 0; k < anArray.length; k++){
            if(anArray[k] == 1){
                counter++;
            }
        }
        
            
        System.out.println(counter);
    }
}
                        
            
        
        
