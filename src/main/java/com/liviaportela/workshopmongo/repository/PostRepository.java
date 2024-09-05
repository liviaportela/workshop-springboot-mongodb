package com.liviaportela.workshopmongo.repository;

import com.liviaportela.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}
