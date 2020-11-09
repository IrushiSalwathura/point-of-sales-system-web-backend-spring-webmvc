package lk.ijse.dep;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@ComponentScan("lk.ijse.dep")
@Import(JPAConfig.class)
public class WebRootConfig {
}
