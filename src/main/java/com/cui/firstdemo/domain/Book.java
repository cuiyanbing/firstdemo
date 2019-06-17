package com.cui.firstdemo.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author cui
 * @since 创建时间：2019/6/17 18:49
 */
@Component
@Data
@ConfigurationProperties(prefix = "book")
public class Book {
    private Integer id;
    private String name;
    private String author;
    private Float price;
}
