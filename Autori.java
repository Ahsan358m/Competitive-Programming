import java.io.*;

public class Autori{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        String [] input = br.readLine().trim().split("-");
        String str = "";
        
        for (String strM: input){
            str += strM.charAt(0);
        }

        pw.println(str);
        pw.flush();
        br.close();
        pw.close();
    }
} 