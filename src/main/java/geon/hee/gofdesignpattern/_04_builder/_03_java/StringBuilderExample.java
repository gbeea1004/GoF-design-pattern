package geon.hee.gofdesignpattern._04_builder._03_java;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String name = sb.append("성").append("건희").toString();
        System.out.println("name = " + name);
    }
}
