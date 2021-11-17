package com.frank.postApi.Controller;

import com.frank.postApi.Models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
    @Autowired
    RestTemplate rest;

    @GetMapping("/api/ping")
    public String index() {
        final String baseUrl="https://api.hatchways.io/assessment/blog/posts?tag=history";
        Post posts=rest.getForObject(baseUrl,Post.class);
        return posts.toString();
    }
}
