package net.zentao.zenTazobackend.controller;

import net.zentao.zenTazobackend.Asset;
import net.zentao.zenTazobackend.Demo;
import net.zentao.zenTazobackend.Exception.ResourceNotFoundException;
import net.zentao.zenTazobackend.repository.AssetRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/asset/v1")
public class AssetController {


    @Autowired
    private AssetRepository assetRepository;

    @GetMapping("/all")
    public ArrayList<Asset> getAllTheData(){

        return (ArrayList<Asset>) assetRepository.findAllById();

    }

    @GetMapping("/id/{id}")
    public List<Asset> getById(@PathVariable int id){

        return assetRepository.findById(id);

    }

    @GetMapping("/create-by/{name}")
    public List<Asset> getCreatedBy(@PathVariable String name){

        if(name.equals("karkaletsis"))
            return assetRepository.getAllKarkaletsi(name);
        else if (name.equals("nuredini"))
            return assetRepository.getAllNuredini(name);

        return  null;
    }


}
