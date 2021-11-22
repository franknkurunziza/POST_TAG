package com.frank.postApi.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {

    /*      "author": "Zackery Turner",
      "authorId": 12,
      "id": 2,
      "likes": 469,
      "popularity": 0.68,
      "reads": 90406,
    */
    private String author;
    private Long authorId;
    private Long id;
    private int likes;
    private double popularity;
    private int reads;
    private List<String> tags ;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public int getReads() {
        return reads;
    }

    public void setReads(int reads) {
        this.reads = reads;
    }

    @Override
    public String toString() {
        return "Post{" +
                "author='" + author + '\'' +
                ", authorId=" + authorId +
                ", id=" + id +
                ", likes=" + likes +
                ", popularity=" + popularity +
                ", reads=" + reads +
                ", tags=" + tags +
                '}';
    }
}
