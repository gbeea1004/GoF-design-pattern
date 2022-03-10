package geon.hee.gofdesignpattern._01_singleton.step3;

public class RuntimeExample {

    /**
     * Runtime 은 싱글톤으로 구현되어 있다.
     */
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("runtime.maxMemory() = " + runtime.maxMemory());
        System.out.println("runtime.freeMemory() = " + runtime.freeMemory());
    }
}
