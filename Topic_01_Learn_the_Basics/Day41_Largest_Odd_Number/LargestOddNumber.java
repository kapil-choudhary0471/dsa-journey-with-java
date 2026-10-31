package Topic_01_Learn_the_Basics.Day41_Largest_Odd_Number;

public class LargestOddNumber {
    public String largeOddNum(String s) {

        int i = s.length() - 1;

        while (i >= 0) {
            int digit = s.charAt(i) - '0';

            if (digit % 2 != 0) {
                break;
            }

            i--;
        }

        if (i < 0) {
            return "";
        }

        int j = 0;

        while (j <= i && s.charAt(j) == '0') {
            j++;
        }

        return s.substring(j, i + 1);
    }
}
