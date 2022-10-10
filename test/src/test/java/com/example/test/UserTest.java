package com.example.test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class UserTest {

    @DisplayName("패스 워드를 초기화 한다.")
    @Test
    void passwordTest() {
        // 테스트 목적 : user 객체를 이용해 password 를 초기화 했을때 not null 일 것이다
        // given
        User user = new User();
        // when
        user.initPassword(new CorrectFixedPasswordGenerator());
        // then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스 워드가 조건에 위배되어 초기화 되지 않는다.")
    @Test
    void passwordTest2() {
        // 테스트 목적 : user 객체를 이용해 password 를 초기화 했을때 not null 일 것이다
        // given
        User user = new User();
        // when
        user.initPassword(new WrongFixedPasswordGenerator());
        // then
        assertThat(user.getPassword()).isNull();
    }

}