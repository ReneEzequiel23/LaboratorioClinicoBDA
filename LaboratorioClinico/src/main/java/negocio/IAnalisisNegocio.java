/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.AnalisisDTO;
import dtos.AnalisisTablaDTO;
import dtos.EditarAnalisisDTO;
import dtos.GuardarAnalisisDTO;
import java.util.List;

/**
 *
 * @author ReneEzequiel23
 */
public interface IAnalisisNegocio {
    List<AnalisisTablaDTO> buscarAnalisis() throws NegocioException;

    AnalisisDTO guardar(GuardarAnalisisDTO analisis) throws NegocioException;

    AnalisisDTO editar(EditarAnalisisDTO analisis) throws NegocioException;

    AnalisisDTO eliminar(int id) throws NegocioException;

    AnalisisDTO buscarPorId(int id) throws NegocioException;
}
