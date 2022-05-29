import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Main {

    public static void main(String[] args) throws Exception {

        int port = 8080;
        String name = "ClientName";
        Socket socket = new Socket("127.0.0.1", port);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("New connection accepted");
        out.println(name);
        String message = in.readLine();
        System.out.println(message);

        socket.shutdownInput();
        socket.shutdownOutput();
    }
}
