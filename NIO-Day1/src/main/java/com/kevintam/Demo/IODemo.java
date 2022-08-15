package com.kevintam.Demo;

import java.io.InputStream;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author kevintam
 * @version 1.0
 * @title
 * @description
 * @createDate 2022/8/15
 */
public class IODemo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress localHost = Inet6Address.getLocalHost();
//        System.out.println(localHost);
        //获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);
        //获取本机的IP地址
        InetAddress localHost1 = InetAddress.getLocalHost();
        System.out.println(localHost1.getHostName());
        System.out.println(byName.getHostAddress());
    }
}
