// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.FileWriter; // import java.io.* (everything above combined within this import; but be careful with use it contains "all" imports)
import java.io.*;

public class FileWrite {



    public static void main(String[] args) throws IOException {
        //FileOutputStream output = new FileOutputStream("out.txt");
        // for (int i = 1; i <11; i++) {
        //     String data = i + " Line. \r\n "; //역 슬래쉬
        //     output.write(data.getBytes());
        // }
        // output.close();
        
        // FileWriter fw = new FileWriter("out.txt");
        // for (int i = 1; i <11; i++) {
        // String data = i + " Line. \r\n "; //역 슬래쉬; line feed
        // fw.write(data);
        // }
        // fw.close();

        //         //기존거 놔두고 더 집어넣는 방법:

        //         FileWriter fw2 = new FileWriter("out.txt", true);
        //         for (int i = 11; i <21; i++) {
        //         String data = i + " Line. \r\n "; //역 슬래쉬; line feed
        //         fw2.write(data);
        //         }
        //         fw2.close();

        PrintWriter pw = new PrintWriter("out2.txt");
        for (int i = 1; i <11; i++) {
            String data = i + " 고다연. \r\n "; //역 슬래쉬; line feed
            pw.write(data);
        }
        pw.close();

        
        



    }
}
