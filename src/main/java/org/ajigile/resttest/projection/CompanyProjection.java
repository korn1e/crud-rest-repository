package org.ajigile.resttest.projection;

import org.ajigile.resttest.entity.Company;
import org.ajigile.resttest.entity.Vaccine;
import org.ajigile.resttest.entity.Virus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "companyProjection" , types = {Company.class})
public interface CompanyProjection {

    @Value("#{target.id}")
    int getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.mainAddress}")
    String getMainAddress();

    @Value("#{target.vaccines}")
    List<Vaccine> getVaccines();
}
