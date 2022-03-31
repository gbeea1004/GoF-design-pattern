package geon.hee.gofdesignpattern._06_adapter._03_java;

import java.io.*;
import java.util.*;

public class AdapterInJava {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c");

        // strings : Adaptee
        // enumeration : Adapter
        // Enumeration<String> : Target 인터페이스
        Enumeration<String> enumeration = Collections.enumeration(strings);

        ArrayList<String> list = Collections.list(enumeration);

        // io
        try (InputStream is = new FileInputStream("input.txt");
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader br = new BufferedReader(isr)) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
