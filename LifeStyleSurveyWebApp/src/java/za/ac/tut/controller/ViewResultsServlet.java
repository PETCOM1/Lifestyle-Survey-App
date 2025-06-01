package za.ac.tut.controller;

import java.io.IOException;
import java.util.Map;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entities.SurveyFacadeLocal;

public class ViewResultsServlet extends HttpServlet {

    @EJB
    private SurveyFacadeLocal surveyFacadeLocal;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Integer totalNumberOfSurvays = surveyFacadeLocal.count();
        Double avarageAge = surveyFacadeLocal.avarageAge();
        Integer oldest = surveyFacadeLocal.oldestPeron();
        Integer youngest = surveyFacadeLocal.youngestPerson();

        Double percPizza = surveyFacadeLocal.pizzaLikersPerc();
        Double perPasta = surveyFacadeLocal.pastaLikersPerc();
        Double percPapNWors = surveyFacadeLocal.papAndWorsLikersPerc();

        Double perLikeMovies = surveyFacadeLocal.avgLikeMovie();
        Double perLikeRadio = surveyFacadeLocal.avgLikeRadio();
        Double perLikeEatOut = surveyFacadeLocal.avgLikeEatOut();
        Double perLikeWatchTv = surveyFacadeLocal.avgLikeWatchTV();

        // New: get unique food counts
        Map<String, Integer> foodCounts = surveyFacadeLocal.countEachFavourateFood();

        request.setAttribute("totalNumberOfSurvays", totalNumberOfSurvays);
        request.setAttribute("avarageAge", avarageAge);
        request.setAttribute("oldest", oldest);
        request.setAttribute("youngest", youngest);
        request.setAttribute("percPizza", percPizza);
        request.setAttribute("perPasta", perPasta);
        request.setAttribute("percPapNWors", percPapNWors);
        request.setAttribute("perLikeMovies", perLikeMovies);
        request.setAttribute("perLikeRadio", perLikeRadio);
        request.setAttribute("perLikeEatOut", perLikeEatOut);
        request.setAttribute("perLikeWatchTv", perLikeWatchTv);

        request.setAttribute("foodCounts", foodCounts);

        RequestDispatcher rd = request.getRequestDispatcher("view_survey_results.jsp");
        rd.forward(request, response);
    }
}
