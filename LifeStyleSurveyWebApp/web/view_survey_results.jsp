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
                Double avarageAge = (Double)request.getAttribute("avarageAge");
                Integer oldest = (Integer)request.getAttribute("oldest");
                Integer youngest = (Integer)request.getAttribute("youngest");
                
                
                Double percPizza = (Double)request.getAttribute("percPizza");
                Double perPasta = (Double)request.getAttribute("perPasta");
                Double percPapNWors = (Double)request.getAttribute("percPapNWors");
                
                
                Double perLikeMovies = (Double)request.getAttribute("perLikeMovies");
                Double perLikeRadio = (Double)request.getAttribute("perLikeRadio");
                Double perLikeEatOut = (Double)request.getAttribute("perLikeEatOut");
                Double perLikeWatchTv = (Double)request.getAttribute("perLikeWatchTv");
                

        %>

        <table>
            <tbody>
                <tr>
                    <td>Total number of survey:</td>
                    <td><%=totalNumberOfSurvays%></td>
                </tr>
                <tr>
                    <td>Average Age:</td>
                    <td><%=avarageAge%></td>
                </tr>
                <tr>
                    <td>Oldest person who participated in survey</td>
                    <td><%=oldest%></td>
                </tr>
                <tr>
                    <td>Youngest person who participated in survey</td>
                    <td><%=youngest%></td>
                </tr>
            </tbody>
        </table>

        <table>
            <tbody>
                <tr>
                    <td>Percentage of people who like Pizza:</td>
                    <td><%=percPizza%>%</td>
                </tr>
                <tr>
                    <td>Percentage of people who like Pasta:</td>
                    <td><%=perPasta%>%</td>
                </tr>
                <tr>
                    <td>Percentage of people who like Pap and Wors:</td>
                    <td><%=percPapNWors%>%</td>
                </tr>
            </tbody>
        </table>

        <table>
            <tbody>
                <tr>
                    <td>People who like to watch movies</td>
                    <td><%=perLikeMovies%></td>
                </tr>
                <tr>
                    <td>People who like to listen to radio:</td>
                    <td><%=perLikeRadio%></td>
                </tr>
                <tr>
                    <td>People who like to eat out:</td>
                    <td><%=perLikeEatOut%></td>
                </tr>
                <tr>
                    <td>People who like to watch TV:</td>
                    <td><%=perLikeWatchTv%></td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
