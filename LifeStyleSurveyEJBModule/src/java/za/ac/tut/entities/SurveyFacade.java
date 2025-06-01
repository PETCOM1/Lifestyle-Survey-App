package za.ac.tut.entities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Query query = em.createQuery("SELECT MIN(s.age) FROM Survey s");
        Integer age = (Integer) query.getSingleResult();
        return (age != null) ? age : 0;
    }

    @Override
public double pizzaLikersPerc() {
    List<Survey> surveys = em.createQuery("SELECT s FROM Survey s", Survey.class).getResultList();
    int total = surveys.size();
    int pizzaCount = 0;

    for (Survey s : surveys) {
        String foodStr = s.getFavourateFood();
        if (foodStr != null) {
            String[] foods = foodStr.split(",");
            for (String food : foods) {
                if (food.trim().equalsIgnoreCase("Pizza")) {
                    pizzaCount++;
                    break; // Count only once per person
                }
            }
        }
    }

    return (total == 0) ? 0.0 : Math.round((pizzaCount * 1000.0) / total) / 10.0;
}

@Override
public double pastaLikersPerc() {
    List<Survey> surveys = em.createQuery("SELECT s FROM Survey s", Survey.class).getResultList();
    int total = surveys.size();
    int pastaCount = 0;

    for (Survey s : surveys) {
        String foodStr = s.getFavourateFood();
        if (foodStr != null) {
            String[] foods = foodStr.split(",");
            for (String food : foods) {
                if (food.trim().equalsIgnoreCase("Pasta")) {
                    pastaCount++;
                    break;
                }
            }
        }
    }

    return (total == 0) ? 0.0 : Math.round((pastaCount * 1000.0) / total) / 10.0;
}

@Override
public double papAndWorsLikersPerc() {
    List<Survey> surveys = em.createQuery("SELECT s FROM Survey s", Survey.class).getResultList();
    int total = surveys.size();
    int papWorsCount = 0;

    for (Survey s : surveys) {
        String foodStr = s.getFavourateFood();
        if (foodStr != null) {
            String[] foods = foodStr.split(",");
            for (String food : foods) {
                if (food.trim().equalsIgnoreCase("PapNWors")) {
                    papWorsCount++;
                    break;
                }
            }
        }
    }

    return (total == 0) ? 0.0 : Math.round((papWorsCount * 1000.0) / total) / 10.0;
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
    public Map<String, Integer> countEachFavourateFood() {
        Query query = em.createQuery("SELECT s.favourateFood FROM Survey s");
        List<String> allFoods = query.getResultList();

        Map<String, Integer> foodCountMap = new HashMap<>();

        for (String foodListStr : allFoods) {
            if (foodListStr != null && !foodListStr.trim().isEmpty()) {
                String[] foods = foodListStr.split(",");
                for (String food : foods) {
                    String trimmedFood = food.trim();
                    if (!trimmedFood.isEmpty()) {
                        foodCountMap.put(trimmedFood, foodCountMap.getOrDefault(trimmedFood, 0) + 1);
                    }
                }
            }
        }

        return foodCountMap;
    }
}
