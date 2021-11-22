package com.frank.postApi.Controller;

import com.frank.postApi.Models.ParsePost;
import com.frank.postApi.Models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
    @Autowired
    RestTemplate rest;

    @GetMapping("/api/ping")
    public ResponseEntity<String> index(@RequestParam(name="tag")String name){
        final String baseUrl="https://api.hatchways.io/assessment/blog/posts";
        ParsePost posts=rest.getForObject(baseUrl+"?tag="+name, ParsePost.class);
        if(name == null){
            return new ResponseEntity<>("tags paramer is required", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(posts,HttpStatus.OK);
    }
}
