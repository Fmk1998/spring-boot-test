package com.example.springboot.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//加载属性的前缀
@ConfigurationProperties(prefix="com.imooc.opensource")
//资源文件名
@PropertySource(value="classpath:resource.properties")
//绑定资源文件的各个属性
public class Resource {
    private String name;
    private String website;
    private String language;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
}