package com.chamas.luis.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Luis on 3/17/2015.
 */
public class Client extends Thread {
    @Override
    public void run(){
        try{
            Socket clientSocket = new Socket("localhost", 8000);
            InputStream
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
