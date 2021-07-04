import java.io.*;
import java.net.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        System.out.println("Listening...");

        while (true) {
            try (ServerSocket serverSocket = new ServerSocket(1080);
                 Socket socket = serverSocket.accept();
                 BufferedReader bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream())) {

                int int1 = bis.read();
                int int2 = bis.read();

                int zbir = int1 + int2;

                bos.write(("Ziber ova dva broja je : " + zbir).getBytes());


            } catch (IOException exc) {
                System.out.println(exc.getMessage());
            }

        }


    }
}
