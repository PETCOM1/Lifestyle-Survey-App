Lifestyle Survey Application
Overview

This is a Java EE-based web application that collects and analyzes lifestyle survey data. Users can fill out a survey indicating their age, favorite foods, and ratings for movies, radio, eating out, and watching TV. The application stores survey responses in a database, computes statistics such as average age and food preferences percentages, and displays accurate survey results.
Features

    User-friendly survey form for collecting data

    Persistent storage using JPA and an EntityManager

    Statistical analysis including:

        Average age of respondents

        Percentage of respondents liking specific foods (Pizza, Pasta, Pap and Wors)

        Average ratings for entertainment preferences

    Accurate percentage calculations rounded to 1 decimal place

    Dynamic survey results page showing summary statistics

Technologies Used

    Java EE (EJB, JPA)

    JSP for dynamic web pages

    Servlet API

    Relational Database (configured via persistence.xml)

    CSS for styling the results page

Setup and Deployment

    Import the project into your preferred IDE (e.g., Eclipse, IntelliJ).

    Configure your application server (e.g., WildFly, GlassFish) with the appropriate datasource and database.

    Adjust persistence.xml for your database connection.

    Build and deploy the application to your server.

    Access the survey form at the root URL (e.g., http://localhost:8080/SurveyApp/index.html).

    Submit survey data and view results via the results page.

Usage

    Fill out the survey form and submit.

    View survey results by navigating to the results page via the navigation links.

    The results page will display:

        Total surveys collected

        Average age, oldest and youngest respondents

        Percentages of people liking Pizza, Pasta, and Pap and Wors

        Average ratings for movies, radio, eating out, and watching TV

Code Highlights

    SurveyFacade EJB handles all data queries and computations.

    Percentages are computed by dividing the count of people liking a food by total surveys and rounding to 1 decimal place.

    JSP pages use request attributes to display dynamic, formatted results.

Known Issues

    Make sure the database contains survey data for meaningful statistics.

    Food names in surveys should be consistent for accurate counts.

Author

Munzhedzi Munyadziwa Petrus
