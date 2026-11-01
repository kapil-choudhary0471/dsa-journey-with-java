package Topic_01_Learn_the_Basics.Day42_Rotate_String;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        String str="";
        if(s.equals(goal)){
            return true;
        }
        for(int i=s.length()-1;i>0;i--){
            str=s.substring(i,s.length())+s.substring(0,i);
            if(str.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
