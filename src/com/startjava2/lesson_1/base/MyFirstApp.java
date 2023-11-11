package com.startjava2.lesson_1.base;

import java.nio.charset.Charset;

public class MyFirstApp {
    
    public static void main(String[] args) {
        System.out.println(Charset.defaultCharset().displayName());
    }
}
