package mybatisreading;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ="mybatisreading.mapper")
public class MybatisReadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisReadingApplication.class, args);
	}

}
