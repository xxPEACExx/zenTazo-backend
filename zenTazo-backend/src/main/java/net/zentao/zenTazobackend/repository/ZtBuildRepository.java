package net.zentao.zenTazobackend.repository;

import net.zentao.zenTazobackend.Zt_Built;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ZtBuildRepository extends JpaRepository<Zt_Built,Integer> {

    @Query("SELECT u from zt_build u")
    List<Zt_Built> getAll();


    List<Zt_Built> findById(int id);



}
