import java.io.*;

public class FileRead {
    public static void main(String[] args) throws IOException {
        // byte[] b = new byte[1014]; //set the number of elements
        // FileInputStream input = new FileInputStream("out.txt"); //where
        // input.read(b); //what & add
        // System.out.println(new String(b));
        // input.close();

        BufferedReader br = new BufferedReader(new FileReader("out.txt"));
        while (true) {
            String line = br.readLine();
            if(line == null) break;
            System.out.println(line);
        }
        br.close(); //if you open file, you must always close it (remember for all filewriter/printwriter..etc)

    }
}
