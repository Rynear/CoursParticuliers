/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import Entity.Eleve;
import Entity.Prof;
import dao.EleveFacadeLocal;
import dao.ProfFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author Felix
 */
@Named(value = "Vue")
@SessionScoped

public class Vue implements Serializable {

    @EJB
    EleveFacadeLocal eleveDAO;
    @EJB
    ProfFacadeLocal profDAO;
    private Eleve student;
    private Prof teacher;
    /**
     * Constructor  */
    public Vue() {
        student = new Eleve();
        teacher = new Prof();
    }

    public Eleve getStudent() {
        return student;
    }

    public void setStudent(Eleve student) {
        this.student = student;
    }

    public Prof getTeacher() {
        return teacher;
    }

    public void setTeacher(Prof teacher) {
        this.teacher = teacher;
    }
    
}
