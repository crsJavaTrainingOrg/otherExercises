package hu.siposadam.math;
public class TestAritmetikaiOsszeadas{
    public static void main (String args[]){
        AritmetikaiOsszeadas s = new AritmetikaiOsszeadas();
        String a = "99999999999999999999999999999999";
        String b = "13213132131359891988799799466131312131";
        String sum = s.sum(a, b);
        String expectedResult = " 13 213 232 131 359 891 988 799 799 466 131 312 130".replaceAll(" ", "");
        if (sum.equals(expectedResult)) {
            System.out.println("Result ok!");
        } else {
            System.out.println(String.format("Result is incorrect: %s should be: %s", sum, expectedResult));
        }

    }

}