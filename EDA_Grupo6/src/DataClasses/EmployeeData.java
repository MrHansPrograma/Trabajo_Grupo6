/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClasses;

import java.time.*;

/**
 *
 * @author user
 */
public class EmployeeData {
    
    private Integer ID_employee;
    private String Nombre;
    private String Apellidos;
    private Integer Telefono;
    private String email;
    private Integer ID_expedient;
    private Integer priority;
    private String issue;
    private String date_start;
    private String date_finish;
    private String estado_exp = "No iniciado";

    public EmployeeData(Integer ID_employee, String Nombre, String Apellidos, Integer Telefono, String email, Integer priority, String issue) {
        this.ID_employee = ID_employee;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.email = email;
        this.priority = priority;
        this.issue = issue;
    }


    public Integer getID_employee() {
        return ID_employee;
    }

    public void setID_employee(Integer ID_employee) {
        this.ID_employee = ID_employee;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer Teléfono) {
        this.Telefono = Teléfono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getDate_finish() {
        return date_finish;
    }

    public void setDate_finish(String date_finish) {
        this.date_finish = date_finish;
    }

    public Integer getID_expedient() {
        return ID_expedient;
    }

    public void setID_expedient(Integer ID_expedient) {
        this.ID_expedient = ID_expedient;
    }

    public String getEstado_exp() {
        return estado_exp;
    }

    public void setEstado_exp(String estado_exp) {
        this.estado_exp = estado_exp;
    }
    
}
