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
public class InstitutionData {
    
    private String Nombre;
    private Integer RUC;
    private Integer Telefono;
    private String email;
    private Integer ID_expedient;
    private Integer priority;
    private String issue;
    private String date_start;
    private String date_finish;
    private String Estado_exp = "No iniciado";

    public InstitutionData(String Nombre, Integer RUC, Integer Telefono, String email, Integer priority, String issue) {
        this.Nombre = Nombre;
        this.RUC = RUC;
        this.Telefono = Telefono;
        this.email = email;
        this.priority = priority;
        this.issue = issue;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getRUC() {
        return RUC;
    }

    public void setRUC(Integer RUC) {
        this.RUC = RUC;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer Telefono) {
        this.Telefono = Telefono;
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
        return Estado_exp;
    }

    public void setEstado_exp(String Estado_exp) {
        this.Estado_exp = Estado_exp;
    }
    
    
    }
