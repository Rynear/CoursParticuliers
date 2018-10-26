/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;
import Entity.Prof;
import dao.ProfFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author Felix
 */
@Named(value = "VueProf")
@SessionScoped

public class VueProf implements Serializable {

    @EJB
    ProfFacadeLocal profDAO;
    private Prof teacher;
    /**
     * Constructor  */
    public VueProf() {
    }
}