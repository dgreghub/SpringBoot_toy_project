package com.springboot.toy.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
//테스트를 진행할때 JUnit에 내장된 실행자외에 다른 실행자를 실행시킨다.
// 여기서는 SpringRunner라는 실행자를 사용한다.
// 즉 스프링 부트 테스트와 JUnit 사이에 연결자 역할을 한다.
@WebMvcTest(controllers = HelloController.class)
// 여러 스프링 어노테이션 중 Web(Spring MVC)에 집중할 수 있는 어노테이션
// 선언할 경우 @Contoller와 @ControllerAdvice를 사용할 수 있다.
// @Service @Component, @Repository 등은 사용할 수 없다.
// 컨트롤러만 사용하기때문에 선언한다.
public class HelloControllerTest {

        @Autowired // 스프링이 관리하는 Bean을 주입 받는다.
        private MockMvc mvc; // 웹 API를 테스트 할때 사용합니다.
                             // 스프링 MVC 테스트의 시작입니다. 이 클래스를 통해 HTTP GET, POST 등에 대한 API 테스트를 할 수 있다.

        @Test
        public void hello가_리턴된다() throws Exception{
            String hello ="hello";

            mvc.perform(get("/hello"))  //MockMVC를 통해 /hello주소로 GET요청을 한다. 체이닝이 지원되어 아래와 같이 여러 검증기능을 이어서 선언 가능
                    .andExpect(status().isOk())   // mvePerform 결과를 검증한다.200,404,500 등의 상태를 점검 한다.
                    .andExpect(content().string(hello)); //mvc.perform의 결과를 검증한다 Controller에서 Hello가 리턴되기 때문에 이 값이 맞는지 검증함.
        }

}
