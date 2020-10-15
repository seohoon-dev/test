package com.example.demo.design_pattern.singleton_pattern;

public class Client {
    public static void main(String[] args) {
        // private 생성자이므로 new를 통해 객체를 생성할 수 없다.
        // Singleton s = new Singleton();

        Singleton s1 = Singleton.getInstance(); // 최초 생성
        Singleton s2 = Singleton.getInstance(); // 재사용
        Singleton s3 = Singleton.getInstance(); // 재사용

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        s1 = null;
        s2 = null;
        s3 = null;
    }
}
