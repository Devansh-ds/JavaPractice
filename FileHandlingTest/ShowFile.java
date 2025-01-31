import java.io.*;

class ShowFile {
    public static void main (String args[]) {
        int i;
        FileInputStream fin;

        if (args.length != 1) {
            System.out.println("Usage : ShowFile FileName");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open file as not found");
            return;
        }   
        
        try {
            do {
                i = (int) fin.readAllBytes();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error Reading file.");
        }

        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Error closing file.");
        }
    }
}