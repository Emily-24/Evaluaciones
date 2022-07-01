package com.idat.EC2EmilyHeidy.Service;

import java.util.List;

import com.idat.EC2EmilyHeidy.DTO.BodegasDTORequest;
import com.idat.EC2EmilyHeidy.DTO.BodegasDTOResponse;



public interface BodegasService {
    void guardarBodega(BodegasDTORequest bodega);
    void actualizarBodega(BodegasDTORequest bodega);
    void eliminarBodega(Integer id);
    List<BodegasDTOResponse> listarBodegas();
    BodegasDTOResponse obtenerBodegaId(Integer id);

}

