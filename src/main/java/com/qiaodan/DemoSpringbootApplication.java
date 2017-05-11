package com.qiaodan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})// 阻止spring boot自动注入dataSource bean
// 因为spring boot默认会加载org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration类，
// DataSourceAutoConfiguration类使用了@Configuration注解向入spring注入了dataSource bean。
// 因为工程中没有关于dataSource相关的配置信息，当spring创建dataSource bean因缺少相关的信息就会报错。
// 如何添加dataSource相关的配置信息
// 在applicatoin.properties中配置数据库的url，name，password之后，就可以打开在EnableAutoConfiguration中不用exclude

@SpringBootApplication
@MapperScan("com.qiaodan.*")
public class DemoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootApplication.class, args);
	}
}
