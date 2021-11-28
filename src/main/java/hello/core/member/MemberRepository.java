package hello.core.member;

public interface MemberRepository {
    /* Member 저장 함수 */
    void save(Member member);
    /* ID를 통한 Member 검색 함수  */
    Member findById(Long memberID);
}
