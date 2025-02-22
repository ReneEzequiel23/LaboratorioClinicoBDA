/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorioclinico;

import dtos.EditarAnalisisDTO;
import dtos.EditarClienteDTO;
import dtos.GuardarAnalisisDTO;
import dtos.GuardarClienteDTO;
import entidades.ClienteEntidad;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.AnalisisNegocio;
import negocio.ClienteNegocio;
import negocio.IAnalisisNegocio;
import negocio.IClienteNegocio;
import negocio.NegocioException;
import persistencia.AnalisisDAO;
import persistencia.ClienteDAO;
import persistencia.ConexionBD;
import persistencia.IAnalisisDAO;
import persistencia.IClienteDAO;
import persistencia.IConexionBD;
import persistencia.PersistenciaException;

/**
 *
 * @author filor
 */
public class LaboratorioClinico {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        IConexionBD conexion = new ConexionBD();
        
        IClienteDAO cliente = new ClienteDAO(conexion);
        GuardarClienteDTO guardarCliente = new GuardarClienteDTO("Rene","Figueroa","López", LocalDateTime.of(2002, Month.MARCH, 23, 3, 34));
        EditarClienteDTO editarCliente = new EditarClienteDTO(2,"Rene2","Figueroa2","López2", LocalDateTime.of(2002, Month.MARCH, 23, 3, 34));
        
        
        IClienteNegocio clienteNegocio = new ClienteNegocio(cliente);
        
        IAnalisisDAO analisisDAO = new AnalisisDAO(conexion);
        GuardarAnalisisDTO gAnalisis = new GuardarAnalisisDTO(LocalDateTime.of(2024, Month.MAY, 12, 4, 24), 1);
        EditarAnalisisDTO eAnalisis = new EditarAnalisisDTO(2,LocalDateTime.of(2014, Month.MAY, 11, 7, 34), 1, false);
        
        IAnalisisNegocio analisisNegocio = new AnalisisNegocio(analisisDAO);
        
        try {
            analisisNegocio.guardar(gAnalisis);
        } catch (NegocioException ex) {
            Logger.getLogger(LaboratorioClinico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
