package net.zentao.zenTazobackend.repository;

import net.zentao.zenTazobackend.Persons;
import net.zentao.zenTazobackend.Zt_Built;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonsRepository extends JpaRepository<Persons,Integer> {

    @Query("SELECT u from persons u")
    List<Persons> getAllNames();

}
