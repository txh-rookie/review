package com.kevintam.Demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author kevintam
 * @version 1.0
 * @title
 * @description
 * @createDate 2022/8/15
 */
public class SocketDemo {
    public static void main(String[] args) throws IOException {
        //与服务器端9999端口建立连接
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        //通过使用socket拿到输出流
        OutputStream outputStream = socket.getOutputStream();
        //使用输出流，将信息进行输出
        outputStream.write("hello world".getBytes(StandardCharsets.UTF_8));
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes=new byte[1024];
        int readLine=0;
        while((readLine=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,readLine));
        }
        outputStream.close();
        socket.close();
    }
}
