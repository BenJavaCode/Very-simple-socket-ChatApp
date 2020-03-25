import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.xml.crypto.KeySelectorException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), 7777);
            System.out.println("connection established");
            Scanner scanner = new Scanner(System.in);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while (true) {
               String x = scanner.nextLine();
               printWriter.println(x);
               String msg = bufferedReader.readLine();
               System.out.println(msg);
            }

            //String incoming = bufferedReader.readLine();

            //JSONParser jsonParser = new JSONParser();

            //Object object = jsonParser.parse(incoming);

            //JSONObject jsonObject = (JSONObject)object;

            //String msg = (String)jsonObject.get("msg");
            //System.out.println(msg);
        }
            catch(Exception e){
            e.printStackTrace();
            }





        }
    }
