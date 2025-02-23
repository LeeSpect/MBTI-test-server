package mbtitest.mbtitestserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MbtiTestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbtiTestServerApplication.class, args);
	}

}
