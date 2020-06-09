package org.ajigile.resttest.repository;


import org.ajigile.resttest.entity.Vaccine;
import org.ajigile.resttest.entity.Virus;
import org.ajigile.resttest.projection.VaccineProjection;
import org.ajigile.resttest.projection.VirusProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@Repository
@RepositoryRestResource(excerptProjection = VaccineProjection.class)
public interface VaccineRepository extends CrudRepository<Vaccine, Integer> {

    //Page<Vaccine> findAll(Pageable page);
}
