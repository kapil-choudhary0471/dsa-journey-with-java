package Topic_01_Learn_the_Basics.Day40_Palindrome_String;

public class PalindromeString {
    public boolean palindromeCheck(String s) {
        int j=s.length()-1;
        for(int i=0;i<=(s.length()-1)/2;i++){
            if(!(s.charAt(i)==s.charAt(j--))){
                return false;
            }
        }
        return true;
    }
}
