/*
Created by:
  User: oelsner
  Date: 9/3/18
  Time: 8:32 PM
*/


package com.oelsner.book.repository;

import com.oelsner.book.domain.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "publisher", path = "publisher")
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

    Publisher findByName(@Param("name")String name);
}
