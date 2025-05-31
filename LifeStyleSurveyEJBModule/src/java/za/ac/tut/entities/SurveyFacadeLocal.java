/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Munyadziwa Petrus
 */
@Local
public interface SurveyFacadeLocal {

    void create(Survey survey);

    void edit(Survey survey);

    void remove(Survey survey);

    Survey find(Object id);

    List<Survey> findAll();

    List<Survey> findRange(int[] range);

    int count();
    
}
