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
                                <h1 class="h4 text-gray-900 mb-4">Note</h1>
                            </div>
                            <form class="user">
                                <div class="form-group">
                                    <input type="number" class="form-control form-control-user"
                                           id="matricule"
                                           placeholder="matricule" required>
                                </div>
                                <div class="form-group">
                                    <select class="form-control form-control-user">
                                        <option value="" disabled selected>Matières</option>


                                    </select>
                                </div>
                                <div class="form-group">
                                    <input type="number" class="form-control form-control-user"
                                           id="note"
                                           placeholder="Note" required>
                                </div>
                                <div class="form-group">
                                    <select class="form-control form-control-user">
                                        <option value="" disabled selected>Test</option>


                                    </select>
                                </div>
                                <div class="form-group">
                                    <select class="form-control form-control-user">
                                        <option value="" disabled selected>Trimèstre</option>


                                    </select>
                                </div>
                                <div class="form-group">
                                    <input type="number" class="form-control form-control-user"
                                           id="coef"
                                           placeholder="Coefficient" required>
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
                                <h1 class="h4 text-gray-900 mb-4">Coefficent</h1>
                            </div>
                            <form class="user">
                                <div class="form-group">
                                    <select class="form-control form-control-user">
                                        <option value="" disabled selected>Matières</option>


                                    </select>
                                </div>
                                <div class="form-group">
                                    <select  class="form-control form-control-user">
                                        <option value="" disabled selected>Niveau</option>
                                        <option>terminale</option>
                                        <option>premiere</option>
                                        <option>seconde</option>
                                        <option>troisième</option>
                                        <option>quatrième</option>
                                        <option>troisième</option>
                                        <option>sixième</option>
                                    </select>
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
