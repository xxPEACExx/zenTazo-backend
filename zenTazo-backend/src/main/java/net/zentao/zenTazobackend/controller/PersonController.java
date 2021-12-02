package net.zentao.zenTazobackend.controller;


import net.zentao.zenTazobackend.Persons;
import net.zentao.zenTazobackend.Zt_Built;
import net.zentao.zenTazobackend.repository.PersonsRepository;
import net.zentao.zenTazobackend.repository.ZtBuildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonsRepository personsRepository;

    @GetMapping("/all")
    public List<Persons> getAllBuilds(){

        return personsRepository.getAll();

    }
    @GetMapping("/id/{id}")
    public List<Persons> getAnId(@PathVariable int id){

        return personsRepository.findById(id);

    }

    @GetMapping("/find/{id}")
    public List<Persons> find(@PathVariable int id){

        return personsRepository.findTopById(id);

    }

    @GetMapping("/nationality/greek")
    public List<Persons> findGreek(){

        return  personsRepository.greekNationality();
    }

    @GetMapping("/nationality/english")
    public List<Persons> findEnglish(){

        return personsRepository.englishNationality();

    }

    @GetMapping("/vaccination/{id}")
    public List<Persons> countVaccine(@PathVariable int id){

        if(id == 1)
            return personsRepository.getAllWithVaccination1(id);
        else if (id == 2)
            return personsRepository.getAllWithVaccination2(id);

        else return null;


    }
}
