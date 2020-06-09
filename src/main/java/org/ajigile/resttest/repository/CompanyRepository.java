package org.ajigile.resttest.repository;

import org.ajigile.resttest.entity.Company;
import org.ajigile.resttest.entity.Virus;
import org.ajigile.resttest.projection.CompanyProjection;
import org.ajigile.resttest.projection.VaccineProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@Repository
@RepositoryRestResource(excerptProjection = CompanyProjection.class)
public interface CompanyRepository extends CrudRepository<Company, Integer> {

    //Page<Company> findAll(Pageable page);
}
