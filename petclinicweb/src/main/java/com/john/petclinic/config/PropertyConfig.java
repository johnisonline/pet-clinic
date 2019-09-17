package com.john.petclinic.config;

import com.john.petclinic.samplebeans.FakeDataSource;
import com.john.petclinic.samplebeans.JmsDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

//@PropertySource("classpath:datasource.properties")
/*@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})*/
@Configuration
public class PropertyConfig  {

    @Value("${john.username}")
    private String userName;

    @Value("${john.password}")
    private String password;

    @Value("${john.jms.username}")
    private String jmsUserName;

    /*@Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
*/
    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(password);
        fakeDataSource.setUserName(userName);
        return fakeDataSource;
    }

    @Bean
    public JmsDataSource jmsDataSource(){
        JmsDataSource jmsDataSource = new JmsDataSource();
        jmsDataSource.setUserName(jmsUserName);
        return jmsDataSource;
    }

}
