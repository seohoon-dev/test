package com.example.demo.design_pattern.singleton_pattern;

public class Singleton {
    static Singleton singletonObject;   // 정적 참조 변수

    // 생성자에 private 접근제한자를 걸어서 new로 객체를 생성하지 못하도록 제한한다.
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singletonObject == null) {
            singletonObject = new Singleton();
        }

        return singletonObject;
    }

}
