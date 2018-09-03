/*
Created by:
  User: oelsner
  Date: 9/3/18
  Time: 8:22 PM
*/


package com.oelsner.book.repository;

import com.oelsner.book.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "authors", path = "authors")
public interface AuthorRepository extends CrudRepository<Author, Long> {
    Author findByFirstName(@Param("firstName")String firstName);
}
