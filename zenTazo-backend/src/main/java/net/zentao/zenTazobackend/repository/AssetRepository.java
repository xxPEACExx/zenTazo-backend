package net.zentao.zenTazobackend.repository;

import net.zentao.zenTazobackend.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AssetRepository extends JpaRepository<Asset,Integer> {



    List<Asset> findById(int id);

    @Query("SELECT zt FROM zt_assett zt")
    List<Asset> findAllById();

    @Query("select zt FROM zt_assett zt where zt.createdby='karkaletsis'")
    List<Asset> getAllKarkaletsi(String name);

    @Query("select zt FROM zt_assett zt where zt.createdby='nuredini'")
    List<Asset> getAllNuredini(String name);

    ResponseEntity<Integer> deleteAssetById(int id);


}
