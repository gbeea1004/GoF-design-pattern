package geon.hee.gofdesignpattern._04_builder._03_java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {

    public static void main(String[] args) {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                                                          .scheme("http")
                                                          .host("www.geonhee.com")
                                                          .path("java playlist")
                                                          .build()
                                                          .encode(); // encode : 공백이 있는 등의 경우에 uri 로 쓰기 안전한 형태로 변환해줌

        System.out.println("uriComponents = " + uriComponents);
    }
}
