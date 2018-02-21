package com.company;

import java.util.ArrayList;
import java.util.List;

public class AritmetikaiOsszeadas {
   private List<Integer> numbersOfA;
    private List<Integer> numbersOfB;

    public String sum(String a, String b) {

        StringBuilder result = new StringBuilder();

        //Ket lista megtoltese a Stringek szamaival
        numbersOfA = new ArrayList<>();
        numbersOfB = new ArrayList<>();

        for (int j = 0; j < a.length(); j++) {
            numbersOfA.add(Character.getNumericValue(a.charAt(j)));
        }
        for (int k = 0; k < b.length(); k++) {
            numbersOfB.add(Character.getNumericValue(b.charAt(k)));
        }
        // Megnezi melyik String a rovidebb es a rovidebbhez hozzaad annyi nullat hogy ugyanakkora legyen a ketto List hossza

        fillWithZeros(a,b);

        //Osszeadja  ertekeket
        int maradek = 0;
        int reszosszeg = 0;
        for(int m = numbersOfA.size()-1; m >= 0; m--){
            reszosszeg = numbersOfA.get(m) + numbersOfB.get(m) + maradek;
            if(reszosszeg >=10 && m != 0){//Itt csak akkor von le 10-et ha az nem az utolso szamjegy mert azt ki kell irni
                reszosszeg = reszosszeg - 10;
                maradek = 1;
            }
            else{
                maradek = 0;
            }

            result.insert(0,reszosszeg);


        }
        System.out.println(result);
        return result.toString();

    }
    private void fillWithZeros(String a, String b){

        if (a.length() > b.length()) {
            for (int i = 0; i < a.length() - b.length(); i++) {
                numbersOfB.add(0, 0);
            }

        }
        else if (b.length() > a.length()) {
            for (int l = 0; l <b.length() - a.length(); l++) {
                numbersOfA.add(0, 0);
            }
        }

    }
}