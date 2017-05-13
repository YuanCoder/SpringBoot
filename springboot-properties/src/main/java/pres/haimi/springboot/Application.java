package pres.haimi.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pres.haimi.springboot.property.HomeProperties;

/**
 * Created by HaimiZhou on 2017/5/9.
 */

//对于那种只需要在应用程序启动时执行一次的任务，非常适合利用CommandLineRunner来完成
@SpringBootApplication
public class Application implements CommandLineRunner{
    @Autowired
    private HomeProperties homeProperties;

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("\n" + homeProperties.toString());
        System.out.println();
    }
}
