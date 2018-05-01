package bitcamp.java106.pms;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 이 클래스가 스프링 IoC 관련해서 설정 작업을 수행함을 지정
@ComponentScan(basePackages="bitcamp.java106.pms")
public class AppConfig {
    // 스프링 IoC 컨테이너에서 자동 생성하지 않는 객체는 메서드를 통해 리턴해야 한다.
    
    @Bean
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream(
                "bitcamp/java106/pms/sql/mybatis-config.xml");
        return new SqlSessionFactoryBuilder().build(inputStream);
        
    }
}
