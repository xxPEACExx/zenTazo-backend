package net.zentao.zenTazobackend.repository;

import net.zentao.zenTazobackend.Demo;
import net.zentao.zenTazobackend.Persons;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface DemoRepository extends JpaRepository<Demo,Integer> {



    @Query("SELECT u from demo u")
    List<Demo> findAll();

    List<Demo> findById(int id);

    List<Demo>  findByName(String name);

    ArrayList<Demo> findBySname(String sname);








}
