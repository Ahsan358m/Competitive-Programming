import java.io.*;

public class Ovissa{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        String input = br.readLine().trim();

        pw.println(input.length());

        pw.flush();
        br.close();
        pw.close();
    }
}