package com.kevintam.Demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author kevintam
 * @version 1.0
 * @title
 * @description
 * @createDate 2022/8/15
 */
public class ServerSocketDemo {
    public static void main(String[] args) throws IOException {
        //创建一个服务器端去监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("正在监听9999端口.....");
        //客户端建立连接后，accept会返回一个socket对象
        Socket accept = serverSocket.accept();
        System.out.println(accept.getClass());
        byte[] bytes=new byte[1024];
        InputStream inputStream = accept.getInputStream();
        int flag=0;
        while((flag=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,flag));
        }
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("hello server".getBytes(StandardCharsets.UTF_8));
//        accept.shutdownOutput();
        accept.close();
        inputStream.close();
        serverSocket.close();
    }
}
