package com.cui.firstdemo.controller;

import com.cui.firstdemo.domain.Author;
import com.cui.firstdemo.domain.Book;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author cui
 * @since 创建时间：2019/6/15 14:16
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public void hello(Model model) {
        Map<String, Object> map = model.asMap();
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        if (iterator.hasNext()) {
            String key = iterator.next();
            Object value = map.get(key);
            System.out.println(key + ">>>>>>" + value);
        }
    }

    @RequestMapping("bing")
    public String book(@ModelAttribute("b") Book book, @ModelAttribute("a") Author author) {
        return book.toString() + "------" + author.toString();
    }

    @RequestMapping("cc")
    public String error() {
        int i = 1 / 0;
        return "hi";
    }
}
