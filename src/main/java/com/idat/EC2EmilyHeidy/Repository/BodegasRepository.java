package com.idat.EC2EmilyHeidy.Repository;

import com.idat.EC2EmilyHeidy.Modelo.Bodegas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodegasRepository extends JpaRepository<Bodegas,Integer> {
}
