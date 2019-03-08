package assessmentp3.module2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module2Application {

    public static void main(String[] args) {
        SpringApplication.run(Module2Application.class, args);

        Book b1 = new Book();
        b1.getTitle();
    }

}
