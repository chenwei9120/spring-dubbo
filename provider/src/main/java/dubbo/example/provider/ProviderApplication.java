package dubbo.example.provider;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

//@ComponentScan(basePackages = "dubbo.example.provider2.service.impl")
//@ImportResource("classpath:dubbo-provider.xml")
@SpringBootApplication//(scanBasePackages = "dubbo.example.provider2.service.impl")
public class ProviderApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder()
                .sources(ProviderApplication.class)
                .web(WebApplicationType.NONE) // 没错，把项目设置成非web环境
                .run(args);
    }


}
