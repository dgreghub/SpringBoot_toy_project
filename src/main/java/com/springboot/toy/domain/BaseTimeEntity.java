package com.springboot.toy.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass //JPA Entity 클래스들이 BaseTimeEntity을 상속할 경우 필드들도 컬럼으로 인식하게 한다.
@EntityListeners(AuditingEntityListener.class)//BaseTimeEntity클래스에  Auditing기능을 포함시킨다.
public abstract class BaseTimeEntity {
    @CreatedDate //Entity가 생성되어 저장될때 시간이 자동으로 저장됨.
    private LocalDateTime createDate;

    @LastModifiedDate //Entity의 값이 변동될때 시간이 자동으로 저장됨.
    private LocalDateTime modifiedDate;
}
