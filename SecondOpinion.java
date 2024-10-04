public class SecondOpinion {
    public static void main (String [] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        System.out.printf("%d : %d : %d\n", (n / 3600), (n / 60) % 60, n % 60);
        input.close();
    }
}