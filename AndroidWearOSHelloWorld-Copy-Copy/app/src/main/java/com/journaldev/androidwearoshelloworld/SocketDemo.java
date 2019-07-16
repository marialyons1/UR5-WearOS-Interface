//package com.journaldev.androidwearoshelloworld;
//
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.net.InetAddress;
//import java.net.Socket;
//import java.net.UnknownHostException;
//import android.app.Activity;
//import android.os.Bundle;
//import android.support.wearable.activity.WearableActivity;
//import android.util.Log;
//import android.view.View;
//import android.widget.EditText;
//
//public class SocketDemo extends WearableActivity implements View.OnClickListener{
//
//    private Socket socket;
//
//    private static final int SERVERPORT = 5000;
//    private static final String SERVER_IP = "169.254.152.57";
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        new Thread(new ClientThread()).start();
//    }
//
//    @Override
//    public void onClick(View view) {
//        try {
//            Log.i("SocketDemo- client", "'Try' loop started in onClick");
//
//            EditText et = (EditText) findViewById(R.id.EditText01);
//            String str = et.getText().toString();
//            PrintWriter out = new PrintWriter(new BufferedWriter(
//                    new OutputStreamWriter(socket.getOutputStream())),
//                    true);
//            out.println(str);
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    class ClientThread implements Runnable {
//
//        @Override
//        public void run() {
//
//            try {
//                InetAddress serverAddr = InetAddress.getByName(SERVER_IP);
//
//                socket = new Socket(serverAddr, SERVERPORT);
//
//            } catch (UnknownHostException e1) {
//                e1.printStackTrace();
//            } catch (IOException e1) {
//                e1.printStackTrace();
//            }
//
//        }
//
//    }
//}