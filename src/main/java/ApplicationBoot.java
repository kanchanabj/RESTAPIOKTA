import com.okta.config.DataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.okta.*")
@SpringBootApplication
public class ApplicationBoot implements CommandLineRunner {
    @Autowired
    public DataSourceConfig dataSourceConfig;
    public static void main(String[] args){

        SpringApplication.run(ApplicationBoot.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.print("Base URL" + dataSourceConfig.getBaseUrl());
    }
}
