import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.io.*;
import java.net.*;

public class Klijent {
    public static void main(String[] args) {


        try (Socket socket = new Socket("localhost", 1080);
             BufferedReader bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream())) {

            Scanner broj1 = new Scanner(System.in);
            System.out.println("Upisi prvi broj");
            int br1 = broj1.nextInt();
            Scanner broj2 = new Scanner(System.in);
            System.out.println("Upisi drugi broj");
            int br2 = broj2.nextInt();
            bos.write(br1);
            bos.write(br2);
            bos.flush();

            String line = bis.readLine();
            System.out.println(line);


        } catch (IOException exc) {
            System.out.println(exc.getMessage());

        }


    }
}
