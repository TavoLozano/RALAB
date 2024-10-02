
<%@page import="Combos.CargaCombosO"%>
<%@page import="Modelo.ConectaBD"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.*"%>
<%@page import="Combos.CargaCombosProcedimientos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%ConectaBD conexion=new ConectaBD();
    CargaCombosProcedimientos obj = new CargaCombosProcedimientos();
    CargaCombosO cco = new CargaCombosO();
    PreparedStatement ps;
                  ResultSet rs;
                  conexion.conectar();
                  
                  String procedimientoSeleccionado = request.getPrameter("expEdit");
                  String expedienteSeleccionado = request.getParameter("valor");
                  
                ps=conexion.con.prepareStatement("SELECT TR_EXPEDIENTE.ID_EXPEDIENTE, TR_EXPEDIENTE.CLAVE_EXPEDIENTE, TR_EXPEDIENTE.FECHA_APERTURA_EXPED, TR_EXPEDIENTE.FECHA_PRESENT_PROMO, TR_EXPEDIENTE.FECHA_ADMISION_PROMO, TC_PROMOVENTE.DESCRIPCION AS PROMOVENTE, TC_ESTATUS_EXPEDIENTE.DESCRIPCION AS ESTATUS_EXPEDIENTE, TR_EXPEDIENTE.FECHA_DICTO_SOLUCION FROM TR_ORGANOJ inner join tc_entidad_mpio on tc_entidad_mpio.id_ent_mpio=TR_ORGANOJ.id_ent_mpio inner join tc_circunscripcion on tc_circunscripcion.id_circunscripcion=TR_ORGANOJ.id_circunscripcion inner join tc_jurisdiccion on tc_jurisdiccion.id_jurisdiccion=TR_ORGANOJ.id_jurisdiccion where tr_expediente.id_tipo_expediente=? AND tr_expediente.clave_expediente=?" );
                ps.setString(1, procedimientoSeleccionado);
                ps.setString(2, expedienteSeleccionado);
                   rs=ps.executeQuery();
          
                if (rs.next()) {
                String id_tipo_expediente = rs.getString("id_tipo_expediente");
                String clave_expediente = rs.getString("clave_expediente");
                String fecha_apertura_exped = rs.getString("fecha_apertura_exped");
                String fecha_present_promo = rs.getString("fecha_present_promo");
                String fecha_admision_promo = rs.getString("fecha_admision_promo");
                String id_promovente = rs.getString("id_promovente");
                String id_estatus_exped = rs.getString("id_estatus_exped");
                String fecha_dicto_solucion = rs.getString("fecha_dicto_solucion");
                String comentarios = rs.getString("comentarios");
                String hr_atencion = rs.getString("hr_atencion");

                // Guardar en el request
                request.setAttribute("id_tipo_expediente", id_tipo_expediente);
                request.setAttribute("clave_expediente", clave_expediente);
                request.setAttribute("fecha_apertura_exped", fecha_apertura_exped);
                request.setAttribute("fecha_present_promo", fecha_present_promo);
                request.setAttribute("fecha_admision_promo", fecha_admision_promo);
                request.setAttribute("id_promovente", id_promovente);
                request.setAttribute("id_estatus_exped", id_estatus_exped);
                request.setAttribute("fecha_dicto_solucion", fecha_dicto_solucion);
                request.setAttribute("comentarios", comentarios);
            
                
            }
%>
<link REL="stylesheet" href="css/notas.css">

 <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<div class="tabWrap">
   
    <article class="tabContent">
        <h1>VÍA DE TRAMITACIÓN</h1>
     
        <!--form principal-->
        <form action="GuardaProcedimiento" method="post" id="principal" >
           
            <br><br>
            <table cellspacing="3" cellpadding="3" border="0" >               
                <tr>
                    <td>
                        <label data-title="">Órgano Jurisdiccional</label></td>
                    <td><input type="text" name="nombre" id="nombre" value="${sessionScope.nomOrg}" style="width: 500px" readonly required></td>
                    <td><label data-title="Esta variable es para la codificación que realizará INEGI, no debe ser llenado por el informante. Su codificación contiene la clave geoestadística del estado, municipio + materia del OJ + número de OJ">Clave del organo jurisdiccional: </label></td>
                    <td><input  type="text" id="clave" name="clave" value="${sessionScope.clveOrg}" style="width: 150px" readonly required></td>
                </tr>
                <tr>        
                    <td><label>Número / clave del expediente </label></td>   
                    <td><input type="text" id="claveExp" name="claveExp" style="width: 500px" required></td>

                    <!-- FECHA DE APERTURA -->
                    <td><label >Fecha de apertura del expediente: </label> </td>     
                    <td><input type="date" id="fecha"  name="fecha" style="width: 150px" onfocus="fechaMax(this)" onkeypress="fechaMax(this)" required></td></tr>
            </table>
            
        
            
            <!-- *****************************************FORMULARIO PARA PROCESO PREFERENCIA DE CREDITO***************************************** --> 
            <BR><BR>
            <!--form preferencia-->
            <!--<form action="GuardaProcedimiento" method="post" id="preferencia">-->
                 <div id="divPrefCred">
                     <fieldset class="secuencial">
                         <legend>Motivo de la solicitud o promoción</legend>
                                    
                 <div class="ch"><input type="checkbox" id="motivos_PC" name="motivos_PC" class="opcion14" onchange="" value="Aviso a un órgano jurisdiccional para que notifique el derecho preferente de los trabajadores frente al remate o adjudicación de los bienes embargados al patrón" />Aviso a un órgano jurisdiccional para que notifique el derecho preferente de los trabajadores frente al remate o adjudicación de los bienes embargados al patrón</div>
                 <div class="ch"><input type="checkbox" id="motivos_PC" name="motivos_PC" class="opcion14" onchange="" value="Aviso a una autoridad administrativa para que notifique el derecho preferente de los trabajadores frente al remate o adjudicación de los bienes embargados al patrón" />Aviso a una autoridad administrativa para que notifique el derecho preferente de los trabajadores frente al remate o adjudicación de los bienes embargados al patrón</div>
                                
                     </fieldset>
               
                <fieldset class="secuencial">
                    <legend>Solicitud o promoción</legend>
                    <p>
                <label>Fecha de presentación de la solicitud o promoción </label>      
                <input type="date" id="fechaPresProm"  name="fechaPresProm" style="width: 950px" onfocus="fechaMax(this)" onkeypress="fechaMax(this)"> 
                    </p>

               
                <p>
                <label>Fecha de admisión de la solicitud o promoción </label>      
                <input type="date" id="fechaAdmProm" name="fechaAdmProm" style="width: 950px" onfocus="fechaMax(this)" onkeypress="fechaMax(this)">
                </p>
                </fieldset>

                
                <fieldset class="secuencial">
                    <legend>Parte registrada en el expediente</legend>
                    <p>
                <label>Promovente </label>
                <select id="promovente" name="promovente" style="width: 950px" onchange="mostrarPromoventeEspecifique()" >
                    <option value="">---Seleccione promovente---</option>
                    <%
                        List<String> resultadosPromovente = obj.listaPromoventes();
                        for (String dato : resultadosPromovente) {
                    %>
                    <option value="<%= dato%>"><%= dato%></option>
                    <% } %>
                </select>
                    </p>
                <div id="divPromoventeEspecifiquePC" style="display: none">
                    <p>
                    <label>Especifique (otro tipo de promovente)</label>
                    <input type="text" id="promoventeEspecifique" name="promoventeEspecifique" oninput="this.value = this.value.toUpperCase()" style="width: 950px" >
                    </p>
                </div>
                

                </fieldset>
                
                <fieldset class="secuencial">
                    <legend>Datos procesales</legend>
                    <p>
                <label>Estatus del expediente </label>
                <select id="estExp" name="estExp" style="width: 950px" onchange = "mostrarEstatusFecha()">
                    <option value="">--- Seleccione estatus ---</option>
                    <option value="Solucionado">Solucionado</option>
                    <option value="En proceso de resolución">En proceso de resolución</option>
                </select>
                    </p>
                    
                <div id="divFechaDicResPC" style="display: none">
                    <p>
                    <label>Fecha en la que se dictó la resolución </label>      
                    <input type="date" id="fechaDictRes" name="fechaDictRes" style="width: 950px" onfocus="fechaMax(this)" onkeypress="fechaMax(this)">
                    </p>
                </div>
                
               </fieldset>

               
            </div><!-- #################################################### -->
           
           
             <fieldset class="secuencial" style="line-break: loose"> 
                 <p>
                    <label>Comentarios</label>
                    <input  type="text" id="comentarios" name="comentarios" oninput="this.value = this.value.toUpperCase()" style="width: 950px">
                 </p>
             </fieldset>

            <!--</form>-->
             <!--termina ejecucion-->
            
            
            <center>
                <input type="submit" value="Actualizar" id="guardaPro" >
                <input type="reset" value="Limpiar">
            </center>
            </form>
            
    </article>
</div>
