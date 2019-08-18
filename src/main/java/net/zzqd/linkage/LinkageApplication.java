package net.zzqd.linkage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.zzqd.linkage.dao")
public class LinkageApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkageApplication.class, args);
	}

}
