package com.blog.blog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("blogposts")
public class BlogPost {
    
    @Id
    private String id;
    private String photo;
    private String title;
    private String body;
    private String date;

    public BlogPost(String id, String photo, String title, String body, String date ){

        super();
        this.id = id;
        this.photo = photo;
        this.title = title;
        this.body = body;
        this.date = date;

    }

}
