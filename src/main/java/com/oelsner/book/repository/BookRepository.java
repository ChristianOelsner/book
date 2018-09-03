/*
Created by:
  User: oelsner
  Date: 9/3/18
  Time: 8:09 PM
*/


package com.oelsner.book.repository;

import com.oelsner.book.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "books", path = "books")
public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByTitle(@Param("title")String title);
}
