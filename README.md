## Spring Study

---
#### 학습 순서 
1. start.spring.io 에서 프로젝트 생성 및 실행
2. 회원 가입 및 회원 조회 서비스 기능 구현
   - Member - MemberRepository - MemberService로 구성
   - 메모리에 저장하는 방식으로 MemoryMemberRepository 생성(HashMap 사용)
3. 회원 주문(Order) 서비스 기능 구현 
   - 회원 등급(Grade)이 VIP일 경우 고정된 금액 1000원 할인 정책 적용
   - FixDiscountPolicy 클래스를 통해 구현
4. 신규 할인 정책 생성 - VIP일 경우 구매 금액의 10% 할인
   - Test
     - VIP일 경우 10% 할인이 정상적으로 되는지 확인
     - BASIC일 경우 0원 할인이 적용되는지 확인
5. AppConfig를 통한 관심사 분리
     - MembrerServiceImpl, OrderServiceImpl은 해당 Interface만 의존하도록 수정
     - AppConfig에서 해당 객체 생성