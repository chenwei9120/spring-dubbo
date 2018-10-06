package dubbo.example.provider;

import dubbo.example.provider.util.SpringManager;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:transaction.xml")
@MapperScan("dao")
@SpringBootApplication(scanBasePackages = {"dubbo.example.provider.service.impl"} )
//@EnableTransactionManagement
public class ProviderApplication implements CommandLineRunner {

    public static void main(String[] args) {
        ApplicationContext context = new SpringApplicationBuilder()
                .sources(ProviderApplication.class)
                .web(WebApplicationType.NONE) // 没错，把项目设置成非web环境
                .run(args);
        SpringManager.setApplicationContext(context);
        Object obj = SpringManager.getBean("dataSource");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("程序启动完成.");
    }
}
