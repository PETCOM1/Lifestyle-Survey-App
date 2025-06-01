<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Survey Results Page</title>
    <link rel="stylesheet" href="result_style.css">
</head>
<body>
    <div class="nav-container">
        <h1>_Surveys</h1>
        <div class="nav-links">
            <a href="index.html">FILL OUT SURVEY</a>
            <a href="ViewResultsServlet">VIEW SURVEY RESULTS</a>
        </div>
    </div>

    <h2>Survey Results</h2>

    <%
        Integer totalNumberOfSurvays  = (Integer) request.getAttribute("totalNumberOfSurvays");
        Double avarageAge = (Double) request.getAttribute("avarageAge");
        Integer oldest = (Integer) request.getAttribute("oldest");
        Integer youngest = (Integer) request.getAttribute("youngest");

        Double percPizza = (Double) request.getAttribute("percPizza");
        Double perPasta = (Double) request.getAttribute("perPasta");
        Double percPapNWors = (Double) request.getAttribute("percPapNWors");

        Double perLikeMovies = (Double) request.getAttribute("perLikeMovies");
        Double perLikeRadio = (Double) request.getAttribute("perLikeRadio");
        Double perLikeEatOut = (Double) request.getAttribute("perLikeEatOut");
        Double perLikeWatchTv = (Double) request.getAttribute("perLikeWatchTv");
    %>

    <table>
        <tbody>
            <tr>
                <td>Total number of survey:</td>
                <td><%= (totalNumberOfSurvays != null) ? totalNumberOfSurvays : 0 %></td>
            </tr>
            <tr>
                <td>Average Age:</td>
                <td><%= (avarageAge != null) ? String.format("%.1f", avarageAge) : "0.0" %></td>
            </tr>
            <tr>
                <td>Oldest person who participated in survey:</td>
                <td><%= (oldest != null) ? oldest : 0 %></td>
            </tr>
            <tr>
                <td>Youngest person who participated in survey:</td>
                <td><%= (youngest != null) ? youngest : 0 %></td>
            </tr>
        </tbody>
    </table>

    <table>
        <tbody>
            <tr>
                <td>Percentage of people who like Pizza:</td>
                <td><%= (percPizza != null) ? String.format("%.1f%%", percPizza) : "0.0%" %></td>
            </tr>
            <tr>
                <td>Percentage of people who like Pasta:</td>
                <td><%= (perPasta != null) ? String.format("%.1f%%", perPasta) : "0.0%" %></td>
            </tr>
            <tr>
                <td>Percentage of people who like Pap and Wors:</td>
                <td><%= (percPapNWors != null) ? String.format("%.1f%%", percPapNWors) : "0.0%" %></td>
            </tr>
        </tbody>
    </table>

    <table>
        <tbody>
            <tr>
                <td>People who like to watch movies:</td>
                <td><%= (perLikeMovies != null) ? String.format("%.1f", perLikeMovies) : "0.0" %></td>
            </tr>
            <tr>
                <td>People who like to listen to radio:</td>
                <td><%= (perLikeRadio != null) ? String.format("%.1f", perLikeRadio) : "0.0" %></td>
            </tr>
            <tr>
                <td>People who like to eat out:</td>
                <td><%= (perLikeEatOut != null) ? String.format("%.1f", perLikeEatOut) : "0.0" %></td>
            </tr>
            <tr>
                <td>People who like to watch TV:</td>
                <td><%= (perLikeWatchTv != null) ? String.format("%.1f", perLikeWatchTv) : "0.0" %></td>
            </tr>
        </tbody>
    </table>
</body>
</html>
