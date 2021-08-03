import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class StreamTest {

    public static void main(String[] args) throws Exception { //예외처리; 에러/예외를 처리해주는 기능.
        // InputStream in = System.in;

        // int a;
        // int b;
        // int c;

        // a = in.read();
        // b = in.read();
        // c = in.read();

        // System.out.println(a); //97; a's serial number (asuki number); 뭔가 입력한걸 a 에 담아서 출력하는게 핵심이다 아스키 코드가 아니고
        // System.out.println(b);
        // System.out.println(c);



        // byte[] a = new byte[3]; //생성할 때 개수를 정해놔야 한다.
        // in.read(a);
        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);




        // InputStream in = System.in;
        // InputStreamReader reader = new InputStreamReader(in);

        //     char [] a = new char[3]; //set number of elements in the introducing object stage
        //     reader.read(a);
        //     System.out.println(a);





        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        
        String a = br.readLine();
        System.out.println(a);
    }


}
