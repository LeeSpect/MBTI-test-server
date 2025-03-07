package mbtitest.mbtitestserver.global;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "MBTI Test API",
                version = "1.0",
                description = "API documentation for MBTI Test Server"
        )
)
public class SwaggerConfig {

}
