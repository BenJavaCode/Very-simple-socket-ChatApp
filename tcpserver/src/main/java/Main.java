import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    static int count = 0;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("listening..");
            ServerSocket serverSocket = new ServerSocket(7777);
            Socket socket = serverSocket.accept(); // listen
            System.out.println("connection established");

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));



            while (true){
                String msg = bufferedReader.readLine();
                System.out.println(msg);
                String x = scanner.nextLine();
                printWriter.println(x);
            }


            //printWriter.println("HTTP/1.0 200 OK");
            //printWriter.println("Content-Type: text/html; charset=utf-8");
            //printWriter.println("");
            //while (count<3){
                //printWriter.println("how are you doing <br/>");
                //printWriter.println("nice " + count + "<br/>");
                //count ++;
            //}
            //String x = "so";
            //String c = "ko";

            //JSONObject jsonObject =  new JSONObject();
            //jsonObject.put("msg", x);
            //jsonObject.put("msg2", c);
            //printWriter.println(jsonObject.toJSONString());


        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
