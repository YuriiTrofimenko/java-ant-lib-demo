package org.tyaa.demo.mylib;

public class MyLib {
    public long fib(long n){
        if (n == 0 || n == 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
