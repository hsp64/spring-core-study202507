package com.spring.core.chap02_3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 해당 패키지 범위안에서 @Component가 붙은 클래스들을 전부 잡아와서 빈으로 등록시킴
@ComponentScan(basePackages = "com.spring.core.chap02_3")
public class MyModelConfig {

    // 빈등록 (빈 정의)
   /* @Bean
    public MyRepository repository(){
        return new MyRepository();
    }
    @Bean
    public MyService myService(){
        return new MyService(repository());
    }
    @Bean
    public MyController controller() {
        return new MyController(myService());
    }*/
}
