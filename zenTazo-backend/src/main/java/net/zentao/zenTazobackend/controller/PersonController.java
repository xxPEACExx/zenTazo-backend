package net.zentao.zenTazobackend.controller;


import net.zentao.zenTazobackend.Persons;
import net.zentao.zenTazobackend.Zt_Built;
import net.zentao.zenTazobackend.repository.PersonsRepository;
import net.zentao.zenTazobackend.repository.ZtBuildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonsRepository personsRepository;

    @GetMapping("/all")
    public List<Persons> getAllBuilds(){

        return personsRepository.getAllNames();

    }
}
