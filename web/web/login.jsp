<% 
    
DaoProf d = new DaoProf();
Prof p = d.login("rakoto@gmail.com", "1234profRakoto");
       out.println(prof.getnom());
%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Ecole</title>

        <!-- Custom fonts for this template-->
        <link href="../assets/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

        <!-- Custom styles for this template-->
        <link href="../assets/css/sb-admin-2.min.css" rel="stylesheet">
        <link href="../assets/css/style.css" rel="stylesheet">

    </head>

    <body class="myGradient">

        <div class="container">

            <!-- Outer Row -->
            <div class="row justify-content-center">

                <div class="col-xl-6 col-lg-6 col-md-9">

                    <div class="card o-hidden border-0 shadow-lg my-5">
                        <div class="card-body p-0">
                            <!-- Nested Row within Card Body -->
                            <div style="text-align: center;">
                                <div class="p-5">
                                    <div class="text-center">
                                        <h1 class="h4 text-gray-900 mb-4">Connexion</h1>
                                    </div>
                                    <form class="user" method="post" action="../page.jsp?action=liste">
                                        <div class="form-group">
                                            <input type="email" class="form-control form-control-user"
                                                   id="email" aria-describedby="emailHelp"
                                                   placeholder="Email"  name="email" required>
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control form-control-user"
                                                   id="password" placeholder="Mot de passe" name="mdp" required>
                                        </div>
                                        <hr>
                                        <div class="form-group">
                                            <input type="submit" class="btn-user btn-primary btn-block" value="Se connecter">
                                        </div>

                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

            </div>

        </div>

        <!-- Bootstrap core JavaScript-->
        <script src="../assets/vendor/jquery/jquery.min.js"></script>
        <script src="../assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="../assets/vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="../assets/js/sb-admin-2.min.js"></script>

    </body>
</html>