package net.zentao.zenTazobackend.repository;

import net.zentao.zenTazobackend.Persons;
import net.zentao.zenTazobackend.Zt_Built;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface PersonsRepository extends JpaRepository<Persons,Integer> {

    @Query("SELECT u from persons u ")
    List<Persons> getAll();

    List<Persons> findById(int id);

    ArrayList<Persons> findTopById(int id);

    @Query("SELECT u from persons u where u.nationality = 'Greek' ")
    List<Persons> greekNationality();

    @Query("SELECT u FROM persons u where u.nationality='English'")
    List<Persons> englishNationality();

    @Query("SELECT u FROM persons u where u.vaccination=2")
    List<Persons> getAllWithVaccination2(int id);

    @Query("SELECT u FROM persons u where u.vaccination=1")
    List<Persons> getAllWithVaccination1(int id);





}
