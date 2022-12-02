package hello.hellospring;

<<<<<<< HEAD
import hello.hellospring.aop.TimeTraceAOP;
import hello.hellospring.repository.JdbcTemplateMemberRepository;
import hello.hellospring.repository.JpaMemberRepository;
=======
import hello.hellospring.repository.JdbcTemplateMemberRepository;
>>>>>>> be23a65b7146bb6899a8fc8e13422a554b2d4d17
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

<<<<<<< HEAD
import javax.persistence.EntityManager;
=======
>>>>>>> be23a65b7146bb6899a8fc8e13422a554b2d4d17
import javax.sql.DataSource;

@Configuration
public class SpringConfig {


<<<<<<< HEAD
//    @Autowired
//    private DataSource dataSource;
//
//    @Autowired
//    public SpringConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

//    @Autowired
//    private EntityManager em;
//
//    @Autowired
//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }

    private MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
//    public MemberService memberService() {
//        return new MemberService(memberRepository());
//    }
    public MemberService memberService() {
        return new MemberService(memberRepository);
=======
    @Autowired
    private DataSource dataSource;

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
        return new JdbcTemplateMemberRepository(dataSource);
>>>>>>> be23a65b7146bb6899a8fc8e13422a554b2d4d17
    }

//    @Bean
//    public MemberRepository memberRepository() {
////        return new MemoryMemberRepository();
////        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }

//    @Bean
//    public TimeTraceAOP timeTraceAOP() {
//        return new TimeTraceAOP();
//    }


}
