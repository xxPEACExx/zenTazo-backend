package net.zentao.zenTazobackend.controller;

import net.zentao.zenTazobackend.Exception.ResourceNotFoundException;
import net.zentao.zenTazobackend.Persons;
import net.zentao.zenTazobackend.Zt_Built;
import net.zentao.zenTazobackend.repository.ZtBuildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/ztbuilds")
public class ZtBuildController {

    @Autowired
    private ZtBuildRepository ztBuildRepository;

    @GetMapping("/all")
    public List<Zt_Built> getAllBuilds(){

        return ztBuildRepository.getAll();

    }
    @GetMapping("/{id}")
    public List<Zt_Built> getId(@PathVariable("id") int id){

      return ztBuildRepository.getAll();
    }


//    @PostMapping("/create")
//    public Zt_Built createZtBuild(Zt_Built zt_built){
//        return ztBuildRepository.save(zt_built);
//    }




}
