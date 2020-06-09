package org.ajigile.resttest.controller;

import java.math.BigDecimal;
import java.util.List;

import org.ajigile.resttest.entity.Virus;
import org.ajigile.resttest.repository.CompanyRepository;
import org.ajigile.resttest.repository.VirusRepository;
import org.ajigile.resttest.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class MyRestController {

    @GetMapping("/hello")
    @ResponseBody
    public String index(){
        return "hello\n";
    }



}
