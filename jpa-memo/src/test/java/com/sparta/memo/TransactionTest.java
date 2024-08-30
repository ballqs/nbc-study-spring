package com.sparta.memo;

import com.sparta.memo.entity.Memo;
import com.sparta.memo.repository.MemoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class TransactionTest {

    @PersistenceContext
    EntityManager em;

    @Autowired
    MemoRepository memoRepository;

    @Test
    @Transactional
    // 테스트 코드에서 @Transactional 를 사용하면 테스트가 완료된 후 롤백하기 때문에 false 옵션 추가
    @Rollback(value = false)
    @DisplayName("메모 생성 성공")
    void test1() {
        Memo memo = new Memo();
        memo.setUsername("Robbert");
        memo.setContents("@Transactional 테스트 중!");

        em.persist(memo);  // 영속성 컨텍스트에 메모 Entity 객체를 저장합니다.
    }

    @Test
    @Disabled
    @DisplayName("메모 생성 실패")
    void test2() {
        //No EntityManager with actual transaction available for current thread
        //insert , update , delete 의 경우 트랜잭션이 걸려 있어야 한다는 의미
        //스프링 컨테이너 환경에서는 영속성 컨텍스트와 트랜잭션의 생명주기가 일치
        //쉽게 설명하면 트랜잭션이 유지되는 동안 영속성 컨텍스트도 계속 유지가 되기에 영속성 컨텍스트 기능 이용 가능
        Memo memo = new Memo();
        memo.setUsername("Robbie");
        memo.setContents("@Transactional 테스트 중!");

        em.persist(memo);  // 영속성 컨텍스트에 메모 Entity 객체를 저장합니다.
    }

    @Test
    @Transactional(propagation = Propagation.REQUIRED)
    @Rollback(value = false)
    @DisplayName("트랜잭션 전파 테스트")
    void test3() {
//        memoRepository.createMemo(em);
        System.out.println("테스트 test3 메서드 종료");
    }
}

