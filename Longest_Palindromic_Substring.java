import java.io.*;
public class Longest_Palindromic_Substring{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        pw.println(Solution.longestPalindrome(br.readLine().trim()));
        pw.flush();
        br.close();
        pw.close();
    }
}

class Solution{
    public static String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse().toString();        
        if(!sb.toString().equals(s)){
            return longestPalindrome(sb.toString().substring(0, sb.toString().length()-1));
        }
        return sb.toString();
    }
}
