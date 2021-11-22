package com.frank.postApi.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ParsePost {
    List<Post> posts;

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "ParsePost{" +
                "posts=" + posts +
                '}';
    }
}
