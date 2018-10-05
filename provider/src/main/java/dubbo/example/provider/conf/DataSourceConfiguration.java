package dubbo.example.provider.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import javax.sql.DataSource;


@Configuration
public class DataSourceConfiguration {

//    @Bean(destroyMethod = "close", initMethod = "init")
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource(Environment environment) {
//        return DataSourceBuilder.create().build();
//    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

}
