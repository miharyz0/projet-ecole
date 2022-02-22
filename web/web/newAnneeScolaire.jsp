<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

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
                                <h1 class="h4 text-gray-900 mb-4">Année scolaire</h1>
                            </div>
                            <form class="user">
                                <div class="form-group">
                                    <label for="debut">Début: </label><input type="date"
                                                                             class="form-control form-control-user"
                                                                             id="debut"
                                                                             required>
                                </div>
                                <div class="form-group">
                                    <label for="fin">Fin: </label><input type="date"
                                                                       class="form-control form-control-user"
                                                                       id="fin"
                                                                       required>
                                </div>
                                <hr>
                                <div class="form-group">
                                    <input type="submit" class="btn-user btn-primary btn-block" value="Ajouter">
                                </div>

                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <!-- Outer Row -->
    <div class="row justify-content-center">

        <div class="col-xl-6 col-lg-6 col-md-9">

            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div style="text-align: center;">
                        <div class="p-5">
                            <div class="text-center">
                                <h1 class="h4 text-gray-900 mb-4">Trimèstre</h1>
                            </div>
                            <form class="user">
                                <div class="form-group">
                                    <select class="form-control form-control-user">
                                        <option value="" disabled selected>Année scolaire</option>
                                        <option value="2021-2022">2021-2022</option>

                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="debut">Début: </label><input type="date"
                                                                             class="form-control form-control-user"
                                                                             id="debutTrimestre"
                                                                             required>
                                </div>
                                <div class="form-group">
                                    <label for="fin">Fin: </label><input type="date"
                                                                         class="form-control form-control-user"
                                                                         id="finTrimestre"
                                                                         required>
                                </div>
                                <hr>
                                <div class="form-group">
                                    <input type="submit" class="btn-user btn-primary btn-block" value="Ajouter">
                                </div>

                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>



</div>
