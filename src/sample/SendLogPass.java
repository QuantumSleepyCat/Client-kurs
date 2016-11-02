package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by QuantumCat on 26.10.2016.
 */
public class SendLogPass {
    private String sendMsg;
    SendLogPass(String msg)
    {
        sendMsg=msg;
    }

    public void sendMsg()
    {
        Socket socket = null;
        BufferedReader br = null;
        try {
            // установка соединения с сервером
            socket = new Socket(InetAddress.getLocalHost(), 8071);
            PrintStream ps = new PrintStream(socket.getOutputStream());
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
           // for (int i = 1; i <= 10; i++) {
               // ps.println("PING");
           // }
            ps.println(sendMsg);
            System.out.println(br.readLine());
            Thread.sleep(1_000);
        }
        catch (UnknownHostException e)
        { // если не удалось соединиться с сервером
            System.err.println("адрес недоступен" + e); }
        catch (IOException e)
        {
            System.err.println("ошибка I/О потока" + e); }
        catch (InterruptedException e)
        {
            System.err.println("ошибка потока выполнения" + e); }
        finally {
            if (br != null)
            {
                try { br.close(); }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if (socket!= null)
            {
                try { socket.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
