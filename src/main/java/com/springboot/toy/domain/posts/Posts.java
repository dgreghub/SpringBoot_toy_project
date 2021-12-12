package com.springboot.toy.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter //클래스 내 모든 필드의 Getter 메소드를 자동으로 생성
@NoArgsConstructor //기본생성자 자동 추가
@Entity //테이블과 링크될 클래스임을 나타냄 기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍으로 테이블 이름을 매칭함.
public class Posts {

    @Id // 해당 테이블의 PK 필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성 규칙을 나타냄
    private Long id;

    @Column(length = 500, nullable = false) //테이블의 칼럼을 나타내머 구지 선언하지 않낭도 모두 칼럼이 된다.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //해당 클래스의 빌더 패턴 클래스를 생성
    public Posts(String title, String contet, String author) {
        this.title= title;
        this.content=contet;
        this.author=author;
    }
}
