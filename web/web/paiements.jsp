<%@ page import="java.time.Month" %>
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
                                <h1 class="h4 text-gray-900 mb-4">Paiement écolage</h1>
                            </div>
                            <form class="user">
                                <div class="form-group">
                                    <input type="number" class="form-control form-control-user"
                                           id="matricule"
                                           placeholder="matricule" required>
                                </div>
                                <div class="form-group">
                                    <input type="number" class="form-control form-control-user"
                                           id="montant"
                                           placeholder="montant" required>
                                </div>
                                <div class="form-group">
                                    <select class="form-control form-control-user">
                                        <option value="" disabled selected>Mois</option>


                                    </select>
                                </div>
                                <div class="form-group">
                                    <select class="form-control form-control-user">
                                        <option value="" disabled selected>Année</option>


                                    </select>
                                </div>
                                <hr>
                                <div class="form-group">
                                    <input type="submit" class="btn-user btn-primary btn-block" value="Payer">
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
                                <h1 class="h4 text-gray-900 mb-4">Payement multiple</h1>
                            </div>
                            <form class="user">
                                <div class="form-group">
                                    <input type="number" class="form-control form-control-user"
                                           id="matriculeTrimestre"
                                           placeholder="matricule" required>
                                </div>
                                <hr>
                                <div class="form-group">
                                    <select class="form-control form-control-user">
                                        <option value="" disabled selected>Mois</option>


                                    </select>
                                </div>
                                <div class="form-group">
                                    <select class="form-control form-control-user">
                                        <option value="" disabled selected>Année</option>


                                    </select>
                                </div>
                                <div class="form-group">
                                    <h3>jusqu'au</h3>
                                    <select class="form-control form-control-user">
                                        <option value="" disabled selected>Mois</option>


                                    </select>
                                </div>
                                <div class="form-group">
                                    <select class="form-control form-control-user">
                                        <option value="" disabled selected>Année</option>


                                    </select>
                                </div>
                                <hr>
                                <div class="form-group">
                                    <input type="submit" class="btn-user btn-primary btn-block" value="Payer">
                                </div>

                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


</div>
