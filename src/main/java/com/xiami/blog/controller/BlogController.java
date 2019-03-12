package com.xiami.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 博客Controller。
 */
@Controller
@RequestMapping("/blogs")
public class BlogController {

    @GetMapping
    public String listBlogs(@RequestParam(value = "order", required = false, defaultValue = "new") String order,
                            @RequestParam(value = "keyWord", required = false, defaultValue = "") String keyWord) {
        System.out.println("order=" + order + "; keyWord=" + keyWord);
        return "redirect:/index?order=" + order + "&keyWord=" + keyWord;
    }
}

