<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!-- Bootstrap -->
    <link rel="stylesheet" href="../css/bootstrap.min.css" />
    <link rel="stylesheet" href="../css/index.css" />
    <title>SpingBootDemo</title>
    <meta charset="utf-8">
    <script src="../js/jquery-3.3.1.min.js"></script>
    <script src="../js/popper.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container div-border-main">
        <!-- title -->
        <div class="row">
            <div class="col text-center">
                <h1>
                    <strong>SpingBootDemo</strong>
                    <strong>SpingBootDemo11111</strong>
                </h1>
            </div>
        </div>
        <hr/>
        <div class="row">
            <!-- menu -->
            <div class="col-2 div-border-left" id="menu">
                <div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                    <a class="nav-link active" id="v-pills-home-tab" data-toggle="pill" href="#v-pills-home" role="tab" aria-controls="v-pills-home"
                        aria-selected="true">Home</a>
                    <a class="nav-link" id="v-pills-profile-tab" data-toggle="pill" href="#v-pills-profile" role="tab" aria-controls="v-pills-profile"
                        aria-selected="false">Profile</a>
                </div>
            </div>
            <!-- content -->
            <div class="col  10 div-border-right" id="content">
                <!-- select box -->
                <div class="tab-content" id="v-pills-tabContent">
                    <div class="tab-pane fade show active" id="v-pills-home" role="tabpanel" aria-labelledby="v-pills-home-tab">
                        <div class="row">
                            <div class="col">
                                <div class="input-group">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text" id="">First and last name</span>
                                    </div>
                                    <input type="text" class="form-control">
                                </div>
                            </div>
                            <div class="w-100"></div>
                            <div class="col text-center padding-top">
                                <button type="button" class="btn btn-outline-primary">Primary</button>
                            </div>
                            <div class="col text-center padding-top">
                                <button type="button" class="btn btn-outline-danger">Danger</button>
                            </div>
                        </div>
                        <hr/>
                        <!-- table box -->
                        <div class="row">
                            <div class="col-12">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th scope="col">#</th>
                                            <th scope="col">First</th>
                                            <th scope="col">Last</th>
                                            <th scope="col">Handle</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <th scope="row">1</th>
                                            <td>Mark</td>
                                            <td>Otto</td>
                                            <td>@mdo</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">2</th>
                                            <td>Jacob</td>
                                            <td>Thornton</td>
                                            <td>@fat</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">3</th>
                                            <td>Larry</td>
                                            <td>the Bird</td>
                                            <td>@twitter</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="v-pills-profile" role="tabpanel" aria-labelledby="v-pills-profile-tab">...</div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>