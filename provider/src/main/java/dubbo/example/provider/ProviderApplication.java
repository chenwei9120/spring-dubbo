package dubbo.example.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ImportResource("classpath:transaction.xml")
@MapperScan("dao")
@SpringBootApplication(scanBasePackages = {"dubbo.example.provider.service.impl"} )
//@EnableTransactionManagement
public class ProviderApplication {

    public static void main(String[] args) {
        ApplicationContext context = new SpringApplicationBuilder()
                .sources(ProviderApplication.class)
                .web(WebApplicationType.NONE) // 没错，把项目设置成非web环境
                .run(args);
        SpringManager.setApplicationContext(context);
        Object obj = SpringManager.getBean("dataSource");
    }
}
