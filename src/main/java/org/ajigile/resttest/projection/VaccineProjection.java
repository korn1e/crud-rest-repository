package org.ajigile.resttest.projection;

import org.ajigile.resttest.entity.Company;
import org.ajigile.resttest.entity.Vaccine;
import org.ajigile.resttest.entity.Virus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "vaccineProjection" , types = {Vaccine.class})
public interface VaccineProjection {

    @Value("#{target.id}")
    int getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.virus}")
    Virus getVirus();

    @Value("#{target.company}")
    Company getCompany();
}
