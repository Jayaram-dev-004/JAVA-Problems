package Recursion;

public class IsStringPalindrome {
    public boolean isStringPalindrome(String s, int start, int end){
        if(start > end) return true;
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        return isStringPalindrome(s, start+1, end-1);
    }
    public void output(String str, int s, int e){
        System.out.println(isStringPalindrome(str, s, e));
    }
}
