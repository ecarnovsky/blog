package com.blog.blog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.blog.blog.model.BlogPost;

public interface BlogRepository extends MongoRepository<BlogPost, String> {

    @Query("{title:'?0'}")
    BlogPost findItembyTitle(String title);


}