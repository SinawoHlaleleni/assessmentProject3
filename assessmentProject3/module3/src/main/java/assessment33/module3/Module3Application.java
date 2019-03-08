package assessment33.module3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module3Application {

    public static void main(String[] args)
    {
        SpringApplication.run(Module3Application.class, args);

        Book b2 = new Book();
        b2.toString();
    }

}
