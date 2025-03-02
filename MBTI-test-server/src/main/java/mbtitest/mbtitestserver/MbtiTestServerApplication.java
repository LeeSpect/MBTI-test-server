package mbtitest.mbtitestserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MbtiTestServerApplication {

	public static void main(String[] args) {
		// 환경 변수 출력 (로그 확인용)
		System.out.println("MYSQL_USER: " + System.getenv("MYSQL_USER"));
		System.out.println("MYSQL_PASSWORD: " + System.getenv("MYSQL_PASSWORD"));
		System.out.println("DOMAIN: " + System.getenv("DOMAIN"));

		SpringApplication.run(MbtiTestServerApplication.class, args);
	}

}
