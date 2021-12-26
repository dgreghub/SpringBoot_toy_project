package com.springboot.toy.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum Role {
    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 사용자");
    //권한 코드에서는 항상 ROLE_ 이 앞에 있어야한다.
    private final String key;
    private final String title;
}
