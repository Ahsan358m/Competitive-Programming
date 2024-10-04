import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.Integer;
import java.io.IOException;
class MoscowDream{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        String [] inputs = br.readLine().trim().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);
        int n = Integer.parseInt(inputs[3]);

            if( (a < 1 || b < 1 || c < 1 || n < 3) || (a + b + c < n)){
                pw.println("NO");
            }else{
                pw.println("YES");
            }
                
        pw.flush();
        br.close();
        pw.close();
    }
}