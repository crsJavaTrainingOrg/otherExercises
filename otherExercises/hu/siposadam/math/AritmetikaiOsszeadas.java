package hu.siposadam.math;

import java.util.ArrayList;
import java.util.List;

public class AritmetikaiOsszeadas {


    public String sum(String a, String b) {
        //Ket lista megtoltese a Stringek szamaival
        List<Integer> numbersOfA = stringToIntegerList(a);
        List<Integer> numbersOfB = stringToIntegerList(b);

        int maxLength = numbersOfA.size() > numbersOfB.size() ? numbersOfA.size() : numbersOfB.size();

        // Megnezi melyik String a rovidebb es a rovidebbhez hozzaad annyi nullat hogy ugyanakkora legyen a ketto List hossza

        fillWithZeros(numbersOfA, maxLength);
        fillWithZeros(numbersOfB, maxLength);

        //Osszeadja  ertekeket
        int maradek = 0;
        int reszosszeg = 0;
        StringBuilder result = new StringBuilder();
        for (int m = numbersOfA.size() - 1; m >= 0; m--) {
            reszosszeg = numbersOfA.get(m) + numbersOfB.get(m) + maradek;
            if (reszosszeg >= 10 && m != 0) {//Itt csak akkor von le 10-et ha az nem az utolso szamjegy mert azt ki kell irni
                reszosszeg = reszosszeg - 10;
                maradek = 1;
            } else {
                maradek = 0;
            }
            result.insert(0, reszosszeg);
        }
        System.out.println(result);
        return result.toString();

    }

    private List<Integer> stringToIntegerList(String numberString) {
        List<Integer> integers = new ArrayList<>();
        for (int j = 0; j < numberString.length(); j++) {
            integers.add(Character.getNumericValue(numberString.charAt(j)));
        }
        return integers;
    }

    private void fillWithZeros(List<Integer> integers, int maxLength) {
        while (integers.size() < maxLength) {
            integers.add(0, 0);
        }
    }
}