package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    @DisplayName("스프링 없는 순수한 DI 컨테이너")
    void pureContainer(){
        AppConfig appConfig = new AppConfig();
        MemberService  memberService1 = appConfig.memberService();
        MemberService  memberService2 = appConfig.memberService();

        System.out.println("memberService1 = "  + memberService1);
        System.out.println("memberService2 = "  + memberService2);

        // 요청의 개수만큼 객체가 생성되어 참조값이 다른 것을 확인할 수 있음.
        Assertions.assertThat(memberService1).isNotSameAs(memberService2);
    }

    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
    void singletonServiceTest(){
        SingletonService singletonService1 = SingletonService.getInstance();
        SingletonService singletonService2 = SingletonService.getInstance();

        // same ==
        // equal = equals
        Assertions.assertThat(singletonService1).isSameAs(singletonService2);
    }
}
