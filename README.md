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