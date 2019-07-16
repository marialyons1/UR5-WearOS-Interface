//package com.journaldev.androidwearoshelloworld;
//
//
//import android.support.wearable.activity.WearableActivity;
//import android.util.Log;
//import android.view.View;
//import android.widget.EditText;
//
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.net.InetAddress;
//import java.net.Socket;
//import java.net.UnknownHostException;
//
//public class BackgroundThread extends WearableActivity {
//
//    private  final int SERVERPORT = 20602;
//    private  final String SERVER_IP = "169.254.152.52";
//    public Socket socket;
//
//
//    public void onClick1(View view) {
//        try {
//            Log.i("MainActivity", "'Try' loop started in onClick");
//
//
//            InetAddress serverAddr = InetAddress.getByName(SERVER_IP);
//
//            Log.i("MainActivity", "serverAddr: " + serverAddr);
//
//
//            socket = new Socket(serverAddr, SERVERPORT);
//
//
//            EditText et = (EditText) findViewById(R.id.EditText01);
//            String str = et.getText().toString();
//            PrintWriter out = new PrintWriter(new BufferedWriter(
//                    new OutputStreamWriter(socket.getOutputStream())),
//                    true);
//            out.println(str);
//        } catch (UnknownHostException e) {
//            Log.i("MainActivity", "caught UnknownHostException");
//            e.printStackTrace();
//        } catch (IOException e) {
//            Log.i("MainActivity", "caught IOException");
//            e.printStackTrace();
//        } catch (Exception e) {
//            Log.i("MainActivity", "caught Exception");
//            e.printStackTrace();
//
//        }
//
////        if (socket.isBound() == true) {
////            Log.i("MainActivity", "Socket Bound! (2)");
////        }
////
////        if (socket.isConnected() == true) {
////            Log.i("MainActivity", "Socket Connected!");
////
////        }
//
//    }
//
//
//
//
////    class ClientThread implements Runnable {
////
////        @Override
////        public void run() {
////
////            try {
////                InetAddress serverAddr = InetAddress.getByName(SERVER_IP);
////
////                socket = new Socket(serverAddr, SERVERPORT);
////
////            } catch (UnknownHostException e1) {
////                e1.printStackTrace();
////            } catch (IOException e1) {
////                e1.printStackTrace();
////            }
////
////        }
////
////    }
//}
//
