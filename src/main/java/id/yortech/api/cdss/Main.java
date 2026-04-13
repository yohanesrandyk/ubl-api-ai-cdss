package id.yortech.api.cdss;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@PropertySource({ "classpath:application.properties", "classpath:jdbc.properties" })
public class Main extends SpringBootServletInitializer {

	@Value("${primary.datasource.driverClassName}")
	private String driverClassName;
	@Value("${primary.datasource.username}")
	private String username;
	@Value("${primary.datasource.password}")
	private String password;
	@Value("${primary.datasource.url}")
	private String url;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Bean(name = "dataSource")
	@Primary
	public BasicDataSource DataSource() throws Exception {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(driverClassName);
		basicDataSource.setUrl(url);
		basicDataSource.setUsername(username);
		basicDataSource.setPassword(password);
		return basicDataSource;
	}
}
