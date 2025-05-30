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
                <a href="view_survey_results.jsp">VIEW SURVEY RESULTS</a>
            </div>
        </div>

        <h2>Survey Results</h2>

        <table>
            <tbody>
                <tr>
                    <td>Total number of survey:</td>
                    <td><%=0%></td>
                </tr>
                <tr>
                    <td>Average Age:</td>
                    <td><%=0%></td>
                </tr>
                <tr>
                    <td>Oldest person who participated in survey</td>
                    <td><%=0%></td>
                </tr>
                <tr>
                    <td>Youngest person who participated in survey</td>
                    <td><%=0%></td>
                </tr>
            </tbody>
        </table>

        <table>
            <tbody>
                <tr>
                    <td>Percentage of people who like Pizza:</td>
                    <td><%=0%></td>
                </tr>
                <tr>
                    <td>Percentage of people who like Pasta:</td>
                    <td><%=0%></td>
                </tr>
                <tr>
                    <td>Percentage of people who like Pap and Wors:</td>
                    <td><%=0%></td>
                </tr>
            </tbody>
        </table>

        <table>
            <tbody>
                <tr>
                    <td>People who like to watch movies</td>
                    <td><%=0%></td>
                </tr>
                <tr>
                    <td>People who like to listen to radio:</td>
                    <td><%=0%></td>
                </tr>
                <tr>
                    <td>People who like to eat out:</td>
                    <td><%=0%></td>
                </tr>
                <tr>
                    <td>People who like to watch TV:</td>
                    <td><%=0%></td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
