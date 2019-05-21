package mohannad.springframework.didemo.config;

import mohannad.springframework.didemo.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties") //to use that properties and solve @value
public class PropertyConfig {

    @Value("${mohannad.username}")
    String user ;

    @Value("${mohannad.password}")
    String pass;

    @Value("${mohannad.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource= new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(pass);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        //what is going to reading the file for properties
        PropertySourcesPlaceholderConfigurer p =new PropertySourcesPlaceholderConfigurer();
        return p;
    }
}
