<%-- 
    Document   : tablaO
    Created on : 4 abr 2024, 12:00:53
    Author     : octavio.lozano
--%>

<%@page import="Combos.CargaCombosProcedimientos"%>
<%@page import="Modelo.ConectaBD"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.List"%>
<%@page import="Combos.CargaCombosO"%>
<%@page import="Combos.SQL_Generales"%>
<%@page import= "java.sql.ResultSet" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Órganos Jurisdiccionales</title>
        <link REL="stylesheet" href="css/estiloOrganoJ.css">
        <link REL="stylesheet" href="css/menu.css">
        <link REL="stylesheet" href="css/tabla_resumen.css">
        <link REL="stylesheet" href="css/postit.css">
        <script defer src="js/fecha.js"></script>
    </head>
    <body>
        
        <header id="main-header1">
    <a id="logo-header" href="index.jsp"><img src="IMAGENES/LOGO RALAB blanco.png" height="110"> &nbsp;&nbsp;&nbsp; ESTATAL</a>
    <nav> 
        <ul>
            <li><a href="index.jsp"><img src="IMAGENES/home.png" height="40"></a></li>
            <li><a href="index.jsp"><img src="IMAGENES/contacto.png" height="40">&nbsp;&nbsp; Contacto</a></li>
        </ul>
    </nav>
</header><!-- /#main-header -->

    <br>
    
  <div class="date-container">
        <p id="current-date"></p>
    </div>  

    <div style="margin-bottom: 30px;">
        <nav class="menu">
            <ul class="menu">
                <li class="menu-item" title="ÓRGANOS JURISDICCIONALES"  style="background: darkcyan;">
                    <a href="tablaO.jsp"><img src="IMAGENES/banco.png" height="30">ÓRGANOS JURISDICCIONALES</a>
                   
                </li>
                <li class="menu-item" title="EXPEDIENTES">
                    <a href="Interfaz_main.jsp"><img src="IMAGENES/expediente.png" height="30">EXPEDIENTES</a>
                    <div class="submenu">
                        <p>Agrega, edita, consulta o elimina los Órganos Jurisdiccionales almacenados en la base de datos.</p>
                    </div>
                </li>
                <li class="menu-item" title="EXPORTAR">
                    <a href="Exportar.jsp"><img src="IMAGENES/base_datos.png" height="30">BASE DE DATOS</a>
                    <div class="submenu">
                        <p>Descarga la información almacenada en la base de datos.</p>
                    </div>
                </li>
                <li class="menu-item" title="DASHBOARD">
                    <a href="Dashboard.jsp"><img src="IMAGENES/tendencia.png" height="30">ESTADÍSTICAS</a>
                    <div class="submenu">
                    <p>Gráficas e indicadores de interés.</p>
                    </div>
                </li>
            </ul>
        </nav>
    </div>
    <br>
    <%-----------------------------------------------------------------------------------------------------------------------------------------------------------------%>
        <div style="background: rgba(1, 49, 79,.7);margin-top:150px; padding: 20px 5px;">
            <center>
            <BR>
              <%CargaCombosProcedimientos obj2=new CargaCombosProcedimientos();
                  ConectaBD obj=new ConectaBD();
                  PreparedStatement ps;
                  ResultSet rs;
                  obj.conectar();
              %>
             
              <table>
                  <tr>
                      <td>
                           <form action="Interfaz_main.jsp" method='get'>
                           <input type='submit' value='+ Nuevo'/>
                           </form>
                      </td>
                      <td>
                           <form action="Expediente_8_editar.jsp" method='get'>
                               <select name="expEdit" id="expEdit" style="width: 300px" required>
                                   <option>---Seleccione un procedimiento---</option>
                                   <option value="1">Ordinario</option>
                                   <option value="2">Especial individual</option>
                                   <option value="3">Especial colectivo</option>
                                   <option value="4">Huelga</option>
                                   <option value="5">Colectivo de naturaleza económica</option>
                                   <option value="6">Paraprocesal</option>
                                   <option value="7">Tercerías</option>
                                   <option value="8">Preferencia de crédito</option>
                                   <option value="9">Ejecución</option>
                               </select>
                               <select name="valor" id="valor" style="width: 300px" required>
                                  <option value="">---Seleccione organo---</option>
                                 <%
                                   //SQL_Generales consulta = new SQL_Generales();
                                   List<String> resultadosOrg = obj2.listaExpedientes();
                                   for (String datos : resultadosOrg) {
                                       
                                   %>
                                  <option value="<%= datos%>"><%= datos%></option>
                                  <%
                                    }
                                  %>
                             </select> 
                 
                             <input type='submit' value='Editar'/>
                         </form>
                   </td>
                 </tr>
              </table>
       
             
       
            <BR>
             <%
             %>
              
             
        
            
        <table border="1" style="float: center;" width="30%" class="summary_table">
        <tr>
            <th>No. </th>
            <th>Tipo de procedimiento </th>
            <th>Clave del órgano jurisdiccional </th>
            <th>Clave del expediente </th>
            <th>Incompetencia </th>
            <th>Estatus del expediente</th> 
        </tr>     
        <tr>
         <%   
            ps=obj.con.prepareStatement("SELECT id_expediente, id_tipo_expediente, id_organoj, clave_expediente, preg_incompetencia, id_estatus_exped FROM TR_EXPEDIENTE");
            rs=ps.executeQuery();
            while (rs.next()) {
        %>
                  <td><center> <%= rs.getString("id_expediente")%></center></td>
                  <td><center> <%= rs.getString("id_tipo_expediente")%></center></td>
                  <td><center> <%= rs.getString("id_organoj")%></center> </td>
                  <td><center> <%= rs.getString("clave_expediente")%></center></td>
                  <td><center> <%= rs.getString("preg_incompetencia")%></center></td>
                  <td><center> <%= rs.getString("id_estatus_exped")%></center></td>       
        </tr>
          <% } %>
        </table>
             
            </center>
        </div>
         
        <div>
            
             
        </div>
        
    </body>
    <script>
        document.getElementById("comboBuscart").addEventListener("change", function() {
            var selectedValue = this.value;
            window.location.href = "muestraOrgano.jsp?valorSeleccionado=" + selectedValue;
        });
    </script>
</html>
