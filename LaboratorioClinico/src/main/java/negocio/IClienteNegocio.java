/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.ClienteDTO;
import dtos.ClienteTablaDTO;
import dtos.EditarClienteDTO;
import dtos.GuardarClienteDTO;
import java.util.List;

/**
 * 
 * @author ReneEzequiel23
 */
public interface IClienteNegocio {
    List<ClienteTablaDTO> buscarAlumnos() throws NegocioException;

    ClienteDTO guardar(GuardarClienteDTO cliente) throws NegocioException;

    ClienteDTO editar(EditarClienteDTO cliente) throws NegocioException;

    ClienteDTO eliminar(int id) throws NegocioException;

    ClienteDTO buscarPorId(int id) throws NegocioException;
}
