package com.idat.EC2EmilyHeidy.Service;

import java.util.List;

import com.idat.EC2EmilyHeidy.DTO.UsuariosDTORequest;
import com.idat.EC2EmilyHeidy.DTO.UsuariosDTOResponse;


public interface UsuariosService {

    void guardarUsuario(UsuariosDTORequest usuario);
    void actualizarUsuario(UsuariosDTORequest usuario);
    void eliminarUsuario(Integer id);
    List<UsuariosDTOResponse> listarUsuarios();
    UsuariosDTOResponse obtenerUsuarioId(Integer id);
}
