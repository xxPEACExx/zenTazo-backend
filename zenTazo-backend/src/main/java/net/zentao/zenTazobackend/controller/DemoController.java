package net.zentao.zenTazobackend.controller;


import net.zentao.zenTazobackend.Demo;
import net.zentao.zenTazobackend.Persons;
import net.zentao.zenTazobackend.repository.DemoRepository;
import net.zentao.zenTazobackend.repository.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo/v1")
public class DemoController {

    @Autowired
    private DemoRepository demoRepository;

    @GetMapping("/all")
    public List<Demo> getAllBuilds(){

        return demoRepository.findAll();

    }

    @GetMapping("/id/{id}")
    public List<Demo> getById(@PathVariable int id){


        return demoRepository.findById(id);

    }
//
//    @GetMapping("/{id}")
//    public List<Demo> getAllId(@PathVariable int id){
//
//        return demoRepository.findAllById(id);
//
//    }


}
