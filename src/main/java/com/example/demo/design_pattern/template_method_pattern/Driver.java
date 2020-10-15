package com.example.demo.design_pattern.template_method_pattern;

/**
 * 템플릿 메서드 패턴
 * 상위 클래스에서 공통 로직을 수행하는 템플릿 메서드와 하위 클래스에 오버라이딩을
 * 강제하는 추상 메서드 또는 선택적으로 오버라이딩하는 훅 메서드를 두는 패턴을 말함
 */
public class Driver {
    public static void main(String[] args) {
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        bolt.playWithOwner();

        System.out.println();
        System.out.println();

        kitty.playWithOwner();
    }
}
