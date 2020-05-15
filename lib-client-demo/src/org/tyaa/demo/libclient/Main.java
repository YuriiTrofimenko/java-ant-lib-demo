package org.tyaa.demo.libclient;

import org.tyaa.demo.mylib.MyLib;

public class Main {

    public static void main(String[] args) {
        MyLib myLib = new MyLib();
        System.out.println(myLib.fib(47));
    }
}
