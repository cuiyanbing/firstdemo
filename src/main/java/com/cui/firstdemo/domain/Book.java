package com.cui.firstdemo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author cui
 * @since 创建时间：2019/6/17 18:49
 */
@Component
@Data
public class Book {
    private Date publicationDate;
    private String name;
    private String author;
    protected Float price;
}
