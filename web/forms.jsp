<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Formulaires</title>

    <!-- Custom fonts for this template-->
    <link href="./assets/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template-->
    <link href="./assets/css/sb-admin-2.min.css" rel="stylesheet">
    <link href="./assets/css/style.css" rel="stylesheet">

</head>

<body class="myGradient page-top">
<div id="wrapper">
    <%@include file="./web/inc/sidebar.jsp" %>


    <% if (request.getParameter("action").equals("newAnneeScolaire")) { %>
    <%@include file="./web/newAnneeScolaire.jsp" %>
    <% } else if (request.getParameter("action").equals("paiements")) { %>
    <%@include file="./web/paiements.jsp" %>
    <% } else if (request.getParameter("action").equals("note")) { %>
    <%@include file="./web/note.jsp" %>
    <% } else {%>
    <%@include file="./web/newEtudiant.jsp" %>
    <% }%>

</div>

<!-- Bootstrap core JavaScript-->
<script src="./assets/vendor/jquery/jquery.min.js"></script>
<script src="./assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="./assets/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="./assets/js/sb-admin-2.min.js"></script>

</body>
</html>