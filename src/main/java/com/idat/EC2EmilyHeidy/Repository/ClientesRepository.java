package com.idat.EC2EmilyHeidy.Repository;

import com.idat.EC2EmilyHeidy.Modelo.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes,Integer> {
}
