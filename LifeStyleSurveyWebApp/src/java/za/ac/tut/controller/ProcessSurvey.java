/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entities.Survey;
import za.ac.tut.entities.SurveyFacadeLocal;

/**
 *
 * @author Munzhedzi Munyadziwa Petrus
 */
public class ProcessSurvey extends HttpServlet {

   
    

    @EJB
private SurveyFacadeLocal surveyFacadeLocal;

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    String fullNames = request.getParameter("fullNames");
    String personalEmail = request.getParameter("personalEmial");
    String dobStr = request.getParameter("dob");
    String contactNumber = request.getParameter("contactNumber");
    String favoriteFood = request.getParameter("favoriteFood");

    // Ratings
    Integer movies = Integer.parseInt(request.getParameter("movies"));
    Integer radio = Integer.parseInt(request.getParameter("radio"));
    Integer eatOut = Integer.parseInt(request.getParameter("eatOut"));
    Integer tv = Integer.parseInt(request.getParameter("tv"));

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    try {
      
        Date dob = sdf.parse(dobStr);

        LocalDate birthDate = dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate today = LocalDate.now();
        int age = Period.between(birthDate, today).getYears();

        Survey survey = new Survey(
                fullNames,
                personalEmail,
                dob,
                age,
                contactNumber,
                favoriteFood,
                movies,
                radio,
                eatOut,
                tv
        );

        surveyFacadeLocal.create(survey);

        response.sendRedirect("index.html?success=true");
;


    } catch (ParseException ex) {
        Logger.getLogger(ProcessSurvey.class.getName()).log(Level.SEVERE, null, ex);
        response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid date format.");
    }
}

    
}
