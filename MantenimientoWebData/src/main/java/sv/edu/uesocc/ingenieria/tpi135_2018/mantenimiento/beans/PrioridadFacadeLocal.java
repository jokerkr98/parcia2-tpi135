/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.beans;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades.Prioridad;

/**
 *
 * @author joker
 */
@Local
public interface PrioridadFacadeLocal {

    void create(Prioridad prioridad);

    void edit(Prioridad prioridad);

    void remove(Prioridad prioridad);

    Prioridad find(Object id);

    List<Prioridad> findAll();

    List<Prioridad> findRange(int[] range);

    int count();
    
}
