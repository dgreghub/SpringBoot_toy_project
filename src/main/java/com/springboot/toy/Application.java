package com.springboot.toy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //JPA Auditing 활성화
// 스프링부트 자동설정 해당 위치의 설정 읽어옴
@SpringBootApplication
//Main class
public class Application {
    public static void main (String []args){
        //내장 WAS를 수행할 수 있는 부분
        //항상 서버에 톰캣을 설치할 필요가 없고 스프링 부트로 만들어진 jar파일로 수행됨
        //언제 어디서나 같은 환경에서 스프링 부트를 배포하기위해 사용함.
        SpringApplication.run(Application.class, args);
    }
}
