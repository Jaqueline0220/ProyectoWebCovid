
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Covid</title>
<!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>


<!-- jQuery CDN - Slim version (=without AJAX) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
<script type="text/javascript">
$(document).ready(function () {
    $('#sidebarCollapse').on('click', function () {
        $('#sidebar').toggleClass('active');
    });
});
</script>

<script type="text/javascript" src="js/jquery.min.js"></script>

<link rel="stylesheet" type="text/css" href="css/jquery.dataTables.css"/>
 
<script type="text/javascript" src="js/jquery.dataTables.js"></script>

<script type="text/javascript" src="js/bootstrapValidator.js"></script>

<link rel="stylesheet" href="css/bootstrapValidator.css"/>
<style type="text/css">
/*/Covid-1/src/main/resources/static/js/jquery.dataTables.min.js
    DEMO STYLE
*/

@import "https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700";
body {
    font-family: 'Poppins', sans-serif;
    background: #fafafa;
    font-size: 14px;
}

p {
    font-family: 'Poppins', sans-serif;
    font-size: 1.1em;
    font-weight: 300;
    line-height: 1.7em;
    color: #999;
}

a,
a:hover,
a:focus {
    color: inherit;
    text-decoration: none;
    transition: all 0.3s;
}

.navbar {
    padding: 15px 10px;
    background: #fff;
    border: none;
    border-radius: 0;
    margin-bottom: 40px;
    box-shadow: 1px 1px 3px rgba(0, 0, 0, 0.1);
}

.navbar-btn {
    box-shadow: none;
    outline: none !important;
    border: none;
}

.line {
    width: 100%;
    height: 1px;
    border-bottom: 1px dashed #ddd;
    margin: 40px 0;
}

/* ---------------------------------------------------
    SIDEBAR STYLE
----------------------------------------------------- */

.wrapper {
    display: flex;
    width: 100%;
    align-items: stretch;
}

#sidebar {
    min-width: 250px;
    max-width: 250px;
    background: #379088;
    color: #fff;
    transition: all 0.3s;
}

#sidebar.active {
    margin-left: -250px;
}

#sidebar .sidebar-header {
    padding: 20px;
    background: #5e83b1;
}

#sidebar ul.components {
    padding: 20px 0;
    border-bottom: 1px solid #47748b;
}

#sidebar ul p {
    color: #fff;
    padding: 10px;
}

#sidebar ul li a {
    padding: 10px;
    font-size: 1.1em;
    display: block;
}

#sidebar ul li a:hover {
    color: #5e83b1;
    background: #fff;
}

#sidebar ul li.active>a,
a[aria-expanded="true"] {
    color: #fff;
    background: #5e83b1;
}

a[data-toggle="collapse"] {
    position: relative;
}

.dropdown-toggle::after {
    display: block;
    position: absolute;
    top: 50%;
    right: 20px;
    transform: translateY(-50%);
}

ul ul a {
    font-size: 0.9em !important;
    padding-left: 30px !important;
    background: #5e83b1;
}

ul.CTAs {
    padding: 20px;
}

ul.CTAs a {
    text-align: center;
    font-size: 0.9em !important;
    display: block;
    border-radius: 5px;
    margin-bottom: 5px;
}

a.download {
    background: #fff;
    color: #7386D5;
}

a.article,
a.article:hover {
    background: #6d7fcc !important;
    color: #fff !important;
}

/* ---------------------------------------------------
    CONTENT STYLE
----------------------------------------------------- */

#content {
    width: 100%;
    padding: 20px;
    min-height: 100vh;
    transition: all 0.3s;
}

/* ---------------------------------------------------
    MEDIAQUERIES
----------------------------------------------------- */

@media (max-width: 768px) {
    #sidebar {
        margin-left: -250px;
    }
    #sidebar.active {
        margin-left: 0;
    }
    #sidebarCollapse span {
        display: none;
    }
    #imgCentral{
    	width: 50%;
    }
}

.help-block {
    color: red;
}
</style>
</head>
<body>
<div class="wrapper">
       <jsp:include page="Sidebar.jsp" />

        <!-- Page Content  -->
        <div id="content">
			<jsp:include page="Nav.jsp" />
            <div class="container">
					<c:if test="${sessionScope.MENSAJE != null}">
						<div class="alert alert-success fade in" id="success-alert">
						 <a href="#" class="close" data-dismiss="alert">&times;</a>
						 <strong>${sessionScope.MENSAJE}</strong>
						</div>
					</c:if>
					<c:remove var="MENSAJE" />
					<br>
					<button type="button" class="btn btn-success" data-toggle="modal" data-target="#idModalSave" >Registrar</button>
					<br>
				<div id="divDocente">
				<br>
					<table id="id_table_cifras">
						<thead>
							<tr>
								<th style="width: 20%">Fecha</th>
								<th style="width: 20%">Nuevos Infectados</th>
								<th style="width: 30%">Infectados Totales</th>
								<th style="width: 20%">Infectados Fallecidos</th>
								<th style="width: 30%">Infectados Recuperados</th>
								<th style="width: 20%">Departamento</th>
								<th></th>
							</tr>
						</thead>
						<tbody>

						</tbody>
					</table>
				</div>
				<div class="modal fade" tabindex="-1" role="dialog"  aria-hidden="true" id="idModalSave">
			        <div class="modal-dialog" style="width: 60%" role="document">
			            <!-- Modal content-->
			            <div class="modal-content">
			            <div class="modal-body">
			                    <form id="id_form_save" action="saveCifras" class="form-horizontal">
			                            <!-- Step 1 -->
												<div class="card">
													<div class="card-header">
														<h4 class="panel-title">
															Datos
															<button type="button" class="close" data-dismiss="modal">&times;</button>
														</h4>
													</div>
													<div class="card-body">
														<div class="form-group">
															<label class="control-label" for="id_nuevos">Nuevos Casos</label>
															<input class="form-control" id="id_nuevos" type="number" name="nuevos" placeholder="Ingrese el n�mero de casos nuevos">
														</div>
			
														<div class="form-group">
															<label class="control-label" for="id_totales">Casos Totales</label>
															<input class="form-control" id="id_totales" type="number" name="totales" placeholder="Ingrese el n�mero de casos totales">
														</div>
			
														<div class="form-group">
															<label class="control-label" for="id_fallecidos">Fallecidos</label>
															<input class="form-control" id="id_fallecidos" type="number" name="fallecidos" placeholder="Ingrese el n�mero de fallecidos">
														</div>
														<div class="form-group">
															<label class="control-label" for="id_recuperados">Recuperados</label>
															<input class="form-control" id="id_recuperados" type="number" name="recuperados" placeholder="Ingrese el n�mero de recuperados">
														</div>
														<div class="form-group">
															<label class="control-label" for="id_fecha">Fecha</label>
															<input class="form-control" type="date" id="id_fecha" name="fecha" placeholder="Ingrese la fecha">
														</div>
														<div class="form-group">
				                                            <label class="control-label" for="id_departamento">Departamento</label>
				                                           
				                                                <select id="id_departamento" name="iddepartamento"
				                                                    class='form-control'>
				                                                    <option value=" ">[Seleccione]</option>
				                                                </select>
				                                        </div>
														<div class="form-group">
															<div class="col-lg-12" style="text-align: center;">
																<button type="submit" class="btn btn-success">Guardar</button>
															</div>
														</div>
													</div>
												</div>
											</form>   
			            
			            </div>
			        </div>
			    </div>
        
    </div>
    
    <div class="modal fade" tabindex="-1" role="dialog"  aria-hidden="true" id="idModalActualiza">
			        <div class="modal-dialog" style="width: 60%" role="document">
			            <!-- Modal content-->
			            <div class="modal-content">
			            <div class="modal-body">
			                    <form id="id_form_actualiza" action="updateCifras" class="form-horizontal">
			                            <!-- Step 1 -->
												<div class="card">
													<div class="card-header">
														<h4 class="panel-title">
															Datos
															<button type="button" class="close" data-dismiss="modal">&times;</button>
														</h4>
													</div>
													<div class="card-body">
														<div class="form-group">
															<label class="control-label" for="id_act_nuevos">Nuevos Casos</label>
															<input class="form-control" type="number" id="id_act_nuevos" name="nuevos">
														</div>
			
														<div class="form-group">
															<label class="control-label" for="id_act_totales">Casos Totales</label>
															<input class="form-control" type="number" id="id_act_totales" name="totales">
														</div>
			
														<div class="form-group">
															<label class="control-label" for="id_act_fallecidos">Fallecidos</label>
															<input class="form-control" type="number" id="id_act_fallecidos" name="fallecidos">
														</div>
														<div class="form-group">
															<label class="control-label" for="id_act_recuperados">Recuperados</label>
															<input class="form-control" type="number" id="id_act_recuperados" name="recuperados">
														</div>
														<div class="form-group">
															<label class="control-label" for="id_act_fecha">Fecha</label>
															<input class="form-control" type="date" id="id_act_fecha" name="fecha">
														</div>
														 <div class="form-group">
				                                            <label class="control-label" for="id_act_departamento">Departamento</label>
				                                            
				                                                <select id="id_act_departamento" name="iddepartamento"
				                                                    class='form-control'>
				                                                    <option value=" ">[Seleccione]</option>
				                                                </select>
				      
				                                        </div>
				                                          <input id="id_ID" name="idCifras" type="hidden"/>
														<div class="form-group">
															<div class="col-lg-12" style="text-align: center;">
																<button type="submit" class="btn btn-primary">Guardar</button>
															</div>
														</div>
													</div>
												</div>
											</form>   
			            
			            </div>
			        </div>
			    </div>
        
    </div>
	</div>

     </div>
  </div>
<script type="text/javascript">

$(function() {
	ListarCifras();
	ListarDepartamento();
});

function ListarDepartamento(){
	$.getJSON("cargaDepartamento", {}, function(data){
		$.each(data, function(index,item){
			$("#id_act_departamento").append("<option value="+item.idDepartamento +">"+ item.descripcion +"</option>");
			$("#id_departamento").append("<option value="+item.idDepartamento +">"+ item.descripcion +"</option>");
		});
	});
}

function editar(idCifras,fecha,nuevos,totales,fallecidos,recuperados, idDepartamento){
	$('input[id=id_ID]').val(idCifras);
	$('input[id=id_act_nuevos]').val(nuevos);
	$('input[id=id_act_totales]').val(totales);
	$('input[id=id_act_fallecidos]').val(fallecidos);
	$('input[id=id_act_recuperados]').val(recuperados);
	$('input[id=id_act_fecha]').val(fecha);
	$('select[id=id_act_departamento]').val(idDepartamento);
}
function ListarCifras(){
	//$("#id_table_docente").DataTable().destroy();
	$("#id_table_cifras tbody").empty(); 

	var tablaDocente="",filaTabla="";
	$.getJSON("cargaCifras",{},
			  function(data){
		$.each(data,function(index,item){
				var editar='<button type="button" class="btn btn-info" data-toggle="modal" data-target="#idModalActualiza"  onclick="editar('
				+item.idCifras+','+"'"+item.fecha+"'"+','+"'"+item.nuevos+"'"+','+"'"+item.totales+"'"+
				','+"'"+item.fallecidos+"'"+','+"'"+item.recuperados+"'"+','+"'"+item.departamento.idDepartamento+"'"+
				')">Editar</button>';
			   filaTabla+="<tr><td>"+item.fecha+"</td>"+
					  						  "<td>"+item.nuevos.toString() +"</td>"+
					  						  "<td>"+item.totales.toString() +"</td>"+
					  						  "<td>"+item.fallecidos.toString() +"</td>"+
					  						  "<td>"+item.recuperados.toString() +"</td>"+
					  						  "<td>"+item.departamento.descripcion.toString() +"</td>"+
			  								  "<td>"+editar+"</td></tr>";		
				})
			$("#id_table_cifras tbody").append(filaTabla);
			$("#id_table_cifras").DataTable({
				"language": {
			        "lengthMenu": "_MENU_ registros por pagina",
			        "zeroRecords": "No existen registros",
			        "info": "Pagina _PAGE_ de _PAGES_",
			        "infoEmpty": "Sin registros",
			        "infoFiltered": "(Filtro de _MAX_ registros)",
			        "search": "Buscar:",
				    "paginate": {
				        "first":      "First",
				        "last":       "Last",
				        "next":       "Siguiente",
				        "previous":   "Anterior"
				    }
			    },
			    "pagingType": "simple"
			    
			});
	});
}

$(document).ready(function() {
    $('#id_form_actualiza').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
        	nuevos:{
                    selector: "#id_act_nuevos",
                    validators:{
                        notEmpty: {
                             message: 'Ingrese el n�mero de casos nuevos'
                        },
                        regexp: {
                            regexp: /^[0-9]+$/,
                            message: 'Ingrese un n�mero valido'
                        }
                    }
                },
                totales:{
                    selector: "#id_act_totales",
                    validators:{
                        notEmpty: {
                             message: 'Ingrese el total de contagiados'
                        },
                        regexp: {
                            regexp: /^[0-9]+$/,
                            message: 'Ingrese un n�mero valido'
                        }
                    }
                },
			fallecidos:{
                    selector: "#id_act_fallecidos",
                    validators:{
                        notEmpty: {
                             message: 'Ingrese el n�mero de fallecidos'
                        },
                        regexp: {
                            regexp: /^[0-9]+$/,
                            message: 'Ingrese un n�mero valido'
                        }
                    }
                },

                recuperados:{
                    selector: "#id_act_recuperados",
                    validators:{
                        notEmpty: {
                             message: 'Ingrese el n�mero de recuperados'
                        },
                        regexp: {
                            regexp: /^[0-9]+$/,
                            message: 'Ingrese un n�mero valido'
                        }
                    }
                },
                departamento:{
                    selector: "#id_act_departamento",
                    validators:{
                        notEmpty: {
                             message: 'Seleccione un departamento'
                        }
                    }
                },
                fecha:{
                    selector: "#id_act_fecha",
                    validators:{
                        notEmpty: {
                             message: 'Seleccione una fecha'
                        }
                    }
                },
        }   
    });

    // Validate the form manually
    $('#validateBtn').click(function() {
        $('#id_form_actualiza').bootstrapValidator('validate');
    });
});

$(document).ready(function() {
    $('#id_form_save').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
        	nuevos:{
                selector: "#id_nuevos",
                validators:{
                    notEmpty: {
                         message: 'Ingrese el n�mero de casos nuevos'
                    },
                    regexp: {
                        regexp: /^[0-9]+$/,
                        message: 'Ingrese un n�mero valido'
                    }
                }
            },
            totales:{
                selector: "#id_totales",
                validators:{
                    notEmpty: {
                         message: 'Ingrese el total de contagiados'
                    },
                    regexp: {
                        regexp: /^[0-9]+$/,
                        message: 'Ingrese un n�mero valido'
                    }
                }
            },
		fallecidos:{
                selector: "#id_fallecidos",
                validators:{
                    notEmpty: {
                         message: 'Ingrese el n�mero de fallecidos'
                    },
                    regexp: {
                        regexp: /^[0-9]+$/,
                        message: 'Ingrese un n�mero valido'
                    }
                }
            },

            recuperados:{
                selector: "#id_recuperados",
                validators:{
                    notEmpty: {
                         message: 'Ingrese el n�mero de recuperados'
                    },
                    regexp: {
                        regexp: /^[0-9]+$/,
                        message: 'Ingrese un n�mero valido'
                    }
                }
            },
            departamento:{
                selector: "#id_departamento",
                validators:{
                    notEmpty: {
                         message: 'Seleccione un departamento'
                    }
                }
            },
            fecha:{
                selector: "#id_act_fecha",
                validators:{
                    notEmpty: {
                         message: 'Seleccione una fecha'
                    }
                }
            },
        }   
    });

    // Validate the form manually
    $('#validateBtn').click(function() {
        $('#id_form_save').bootstrapValidator('validate');
    });
});
</script>
<script type="text/javascript">
$("#success-alert").fadeTo(1000, 500).slideUp(500, function(){
    $("#success-alert").slideUp(500);
});
</script>

</body>
</html>




