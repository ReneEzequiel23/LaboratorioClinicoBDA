/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dtos.AnalisisDTO;
import dtos.AnalisisTablaDTO;
import dtos.EditarAnalisisDTO;
import dtos.GuardarAnalisisDTO;
import java.util.List;
import persistencia.IAnalisisDAO;

/**
 *
 * @author ReneEzequiel23
 */
public class AnalisisNegocio implements IAnalisisNegocio{
    private IAnalisisDAO analisisDAO;

    public AnalisisNegocio(IAnalisisDAO analisisDAO) {
        this.analisisDAO = analisisDAO;
    }

    @Override
    public List<AnalisisTablaDTO> buscarAnalisis() throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AnalisisDTO guardar(GuardarAnalisisDTO analisis) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AnalisisDTO editar(EditarAnalisisDTO analisis) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AnalisisDTO eliminar(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AnalisisDTO buscarPorId(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
