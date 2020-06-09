package org.ajigile.resttest.repository;


import org.ajigile.resttest.entity.Virus;
import org.ajigile.resttest.projection.VirusProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


//@Repository
@RepositoryRestResource(excerptProjection = VirusProjection.class)
public interface VirusRepository extends CrudRepository<Virus, Integer> {

   // Page<Virus> findAll(Pageable page);
}
