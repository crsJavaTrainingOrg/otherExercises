package com.company;

import java.util.ArrayList;
import java.util.List;

public class AritmetikaiOsszeadas {

    public String sum(String a, String b) {
        List<Integer> numbersOfA = new ArrayList<>();
        List<Integer> numbersOfB = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        int maradek = 0;
        int helyiertek = 0;
        //Ket lista megtoltese a Stringek szamaival
        for (int j = 0; j < a.length(); j++) {
            numbersOfA.add(j, Character.getNumericValue(a.charAt(j)));
        }
        for (int k = 0; k < b.length(); k++) {
            numbersOfB.add(k, Character.getNumericValue(b.charAt(k)));
        }
        // Megnezi melyik String a rovidebb es a rovidebbhez hozzaad annyi nullat hogy ugyanakkora legyen a ketto List hossza
        if (numbersOfA.size() > numbersOfB.size()) {
            for (int i = 0; i < a.length() - b.length(); i++) {
                numbersOfB.add(0, 0);
            }

        }
        else if (numbersOfB.size() > numbersOfA.size()) {
            for (int l = 0; l <b.length() - a.length(); l++) {
                numbersOfA.add(0, 0);
            }
        }
        //Osszeadja az ertekeket
        for(int m = numbersOfA.size()-1; m >= 0; m--){
            helyiertek = numbersOfA.get(m) + numbersOfB.get(m) + maradek;
            if(helyiertek >=10 && m != 0){//Itt csak akkor von le 10-et ha az nem az utolso szamjegy mert azt ki kell irni
                helyiertek = helyiertek - 10;
                maradek = 1;
            }
            else{
                maradek = 0;
            }
            result.insert(0,helyiertek);


        }
        System.out.println(result);
        return result.toString();

    }
}