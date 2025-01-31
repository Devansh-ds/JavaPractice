import java.io.*;

class buffinputtest {
    public static void main (String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter q to exit.");
        do {
            int d = br.read();
            System.out.println(d);
        } while (c != 'q');
    }
}