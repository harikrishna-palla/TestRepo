package com.apple.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class TestClient {
    public static void main(String args [] ) {
        Products p1;
        RestTemplate rt = new RestTemplate();
        Products p2=new Products();
        p2.setProd_id(1);
        p2.setProd_name("HCLTest");
//        rt.getForEntity("http://localhost:8080/Apple/post/123/AppleProduct",Products.class).getBody();
        rt.postForEntity("http://localhost:8080/Apple/post",p2,Products.class);
        p1 = rt.getForEntity("http://localhost:8080/Apple/get",Products.class).getBody();
        System.out.println(p1.getProd_id());
        System.out.println(p1.getProd_name());
    }
}
