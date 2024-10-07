import java.io.*;
import java.lang.Integer;


public class Add_Two_Numbers{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        String [] input = br.readLine().trim().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        pw.println(a+b);

        pw.flush();
        br.close();
        pw.close();
    }
}