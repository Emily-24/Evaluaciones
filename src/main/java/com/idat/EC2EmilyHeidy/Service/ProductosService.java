package com.idat.EC2EmilyHeidy.Service;

import java.util.List;

import com.idat.EC2EmilyHeidy.DTO.ProductosDTORequest;
import com.idat.EC2EmilyHeidy.DTO.ProductosDTOResponse;



public interface ProductosService {

    void guardarProducto(ProductosDTORequest producto);
    void actualizarProducto(ProductosDTORequest producto);
    void eliminarProducto(Integer id);
    List<ProductosDTOResponse> listarProductos();
    ProductosDTOResponse obtenerProductoId(Integer id);
}
