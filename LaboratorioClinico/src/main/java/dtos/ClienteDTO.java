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
public class ClienteDTO {
    private int id;
    private String nombres;
    private String apeliidoPaterno;
    private String apeliidoMaterno;
    private LocalDateTime fechaNacimiento;
    private boolean estaBorrado;
    
    public ClienteDTO() {
    }

    public ClienteDTO(int id, String nombres, String apeliidoPaterno, String apeliidoMaterno, LocalDateTime fechaNacimiento) {
        this.id = id;
        this.nombres = nombres;
        this.apeliidoPaterno = apeliidoPaterno;
        this.apeliidoMaterno = apeliidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
    }

    public ClienteDTO(int id, String nombres, String apeliidoPaterno, String apeliidoMaterno, LocalDateTime fechaNacimiento, boolean estaBorrado) {
        this.id = id;
        this.nombres = nombres;
        this.apeliidoPaterno = apeliidoPaterno;
        this.apeliidoMaterno = apeliidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.estaBorrado = estaBorrado;
    }

    public boolean isEstaBorrado() {
        return estaBorrado;
    }

    public void setEstaBorrado(boolean estaBorrado) {
        this.estaBorrado = estaBorrado;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApeliidoPaterno() {
        return apeliidoPaterno;
    }

    public void setApeliidoPaterno(String apeliidoPaterno) {
        this.apeliidoPaterno = apeliidoPaterno;
    }

    public String getApeliidoMaterno() {
        return apeliidoMaterno;
    }

    public void setApeliidoMaterno(String apeliidoMaterno) {
        this.apeliidoMaterno = apeliidoMaterno;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" + "id=" + id + ", nombres=" + nombres + ", apeliidoPaterno=" + apeliidoPaterno + ", apeliidoMaterno=" + apeliidoMaterno + ", fechaNacimiento=" + fechaNacimiento + ", estaBorrado=" + estaBorrado + '}';
    }

    
    
}
