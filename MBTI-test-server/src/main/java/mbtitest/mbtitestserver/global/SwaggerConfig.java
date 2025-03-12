package mbtitest.mbtitestserver.global;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .addServersItem(new Server().url("https://fallin-mbti.site"))
                .info(apiInfo());
    }

    private Info apiInfo() {
        return new Info()
                .title("MBTI test Server API")
                .description("MBTI test Server API")
                .version("1.0");
    }

}
