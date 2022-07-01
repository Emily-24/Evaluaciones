package com.idat.EC2EmilyHeidy.Service;

import java.util.List;

import com.idat.EC2EmilyHeidy.DTO.ClientesDTORequest;
import com.idat.EC2EmilyHeidy.DTO.ClientesDTOResponse;



public interface ClientesService {

    void guardarCliente(ClientesDTORequest cliente);
    void actualizarCliente(ClientesDTORequest cliente);
    void eliminarCliente(Integer id);
    List<ClientesDTOResponse> listarClientes();
    ClientesDTOResponse obtenerClienteId(Integer id);
    
}