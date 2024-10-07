import java.io.*;
public class A_Shortcut_To_What{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        int output = ((n + 5) * 3)-10;
        pw.println(output);

        pw.flush();
        br.close();
        pw.close();
    }
}