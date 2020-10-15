package com.example.demo.design_pattern.template_method_pattern;

public class Cat extends Animal {
    @Override
    void play() {
        System.out.println("야옹~ 야옹~");
    }

    @Override
    void runSomething() {
        System.out.println("야옹~ 야옹~ 꼬리 살랑 살랑~");
    }
}
