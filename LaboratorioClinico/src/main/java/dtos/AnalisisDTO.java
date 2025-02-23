/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.time.LocalDateTime;

/**
 *
 * @author ReneEzequiel23
 */
public class AnalisisDTO {
    private int id;
    private LocalDateTime fechaHora;
    private int idCliente;
    private boolean estaBorrado;

    public AnalisisDTO() {
    }

    public AnalisisDTO(int id, LocalDateTime fechaHora, int idCliente, boolean estaBorrado) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.idCliente = idCliente;
        this.estaBorrado = estaBorrado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isEstaBorrado() {
        return estaBorrado;
    }

    public void setEstaBorrado(boolean estaBorrado) {
        this.estaBorrado = estaBorrado;
    }

    @Override
    public String toString() {
        return "AnalisisDTO{" + "id=" + id + ", fechaHora=" + fechaHora + ", idCliente=" + idCliente + ", estaBorrado=" + estaBorrado + '}';
    }
    
    
}
