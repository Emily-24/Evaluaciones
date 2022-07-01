package com.idat.EC2EmilyHeidy.Repository;

import com.idat.EC2EmilyHeidy.Modelo.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios,Integer> {

}
