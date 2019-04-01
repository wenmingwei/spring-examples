package wenmingwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;

import java.util.Map;

@SpringBootApplication(
        exclude = {
                SecurityAutoConfiguration.class
        }
)
public class Bootstrap {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Bootstrap.class);

        Map<String, Example> examples = context.getBeansOfType(Example.class);

        examples.forEach((name, bean) -> {
            try {
                System.out.println("Running Bean name: " + name);
                bean.run();
                System.out.println("Bean is done: " + name);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }
}
