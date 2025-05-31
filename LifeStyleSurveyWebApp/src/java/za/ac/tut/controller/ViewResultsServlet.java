/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entities.SurveyFacadeLocal;

/**
 *
 * @author Munzhedzi Munyadziwa Petrus
 */
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
        
        
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("view_survey_results.jsp");
        rd.forward(request, response);
    }

    

}
