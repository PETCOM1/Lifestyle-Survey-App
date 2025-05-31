/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Munzhedzi Munyadziwa Petrus
 */
@Stateless
public class SurveyFacade extends AbstractFacade<Survey> implements SurveyFacadeLocal {

    @PersistenceContext(unitName = "LifeStyleSurveyEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SurveyFacade() {
        super(Survey.class);
    }

   @Override
    public double avarageAge() {
        Query query = em.createQuery("SELECT AVG(s.age) FROM Survey s");
        Double avg = (Double) query.getSingleResult();
    
        
        return (avg != null) ? avg : 0.0;
    }

    @Override
    public Integer oldestPeron() {
        Query query = em.createQuery("SELECT MAX(s.age) FROM Survey s");
        Integer age = (Integer) query.getSingleResult();

        
        return (age != null) ? age : 0;
    }

    @Override
    public Integer youngestPerson() {
        
        Query query = em.createQuery("SELECT MAX(s.age) FROM Survey s");
        Integer age = (Integer) query.getSingleResult();

        
        return (age != null) ? age : 0;
    }

    @Override
    public double pizzaLikersPerc() {
        Query totalQuery = em.createQuery("SELECT COUNT(s) FROM Survey s");
        Long total = (Long) totalQuery.getSingleResult();

       
        Query pizzaQuery = em.createQuery("SELECT COUNT(s) FROM Survey s WHERE s.favourateFood LIKE '%Pizza%'");
        Long pizzaCount = (Long) pizzaQuery.getSingleResult();

        if (total == 0) {
            return 0.0;
        }

        
        return (pizzaCount * 100.0) / total;
    }

    @Override
    public double pastaLikersPerc() {
        Query totalQuery = em.createQuery("SELECT COUNT(s) FROM Survey s");
        Long total = (Long) totalQuery.getSingleResult();

        Query pastaQuery = em.createQuery("SELECT COUNT(s) FROM Survey s WHERE s.favourateFood LIKE '%Pasta%'");
        Long pastaCount = (Long) pastaQuery.getSingleResult();

        if (total == 0) {
            return 0.0;
        }

        return (pastaCount * 100.0) / total;
    }

    @Override
    public double papAndWorsLikersPerc() {
   
        Query totalQuery = em.createQuery("SELECT COUNT(s) FROM Survey s");
        Long total = (Long) totalQuery.getSingleResult();

        
        Query papWorsQuery = em.createQuery("SELECT COUNT(s) FROM Survey s WHERE s.favourateFood LIKE '%PapNWors%'");
        Long papWorsCount = (Long) papWorsQuery.getSingleResult();

        if (total == 0) {
            return 0.0;
        }

        
        return (papWorsCount * 100.0) / total;
    }

    @Override
    public double avgLikeMovie() {
        Query query = em.createQuery("SELECT AVG(s.movieRating) FROM Survey s");
        Double avg = (Double) query.getSingleResult();

        
        return (avg != null) ? avg : 0.0;
}

    @Override
    public double avgLikeRadio() {
        Query query = em.createQuery("SELECT AVG(s.radioRating) FROM Survey s");
        Double avg = (Double) query.getSingleResult();

        return (avg != null) ? avg : 0.0;
    }

    @Override
    public double avgLikeEatOut() {
        Query query = em.createQuery("SELECT AVG(s.eatOutRating) FROM Survey s");
        Double avg = (Double) query.getSingleResult();

        return (avg != null) ? avg : 0.0;
    }

    @Override
    public double avgLikeWatchTV() {
        Query query = em.createQuery("SELECT AVG(s.watchTvRating) FROM Survey s");
        Double avg = (Double) query.getSingleResult();

        return (avg != null) ? avg : 0.0;
    }

    @Override
    public void avgLikeMovies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
