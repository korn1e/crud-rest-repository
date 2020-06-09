package org.ajigile.resttest.projection;

import org.ajigile.resttest.entity.Vaccine;
import org.ajigile.resttest.entity.Virus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "virusProjection" , types = {Virus.class})
public interface VirusProjection {

    @Value("#{target.id}")
    int getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.label}")
    String getLabel();

    @Value("#{target.vaccines}")
    List<Vaccine> getVaccines();

    @Value("#{target.getVaccines().size()}")
    int getVaccineCount();
}
