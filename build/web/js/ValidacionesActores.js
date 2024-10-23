 $(document).ready(function () {
 $('#procedimientosACT').change(function () {
        var expediente= $('#procedimientosACT').val();
        var cve_organo= $('#claveOrgACT').val();
        
        $.ajax({
            type: 'post',
            url: 'ObtenExpedientes',
            data: {
                expediente: expediente,
                cve_organo:cve_organo
            },
            success: function (response) {
                console.log("Respuesta del servidor al borrar: ", response);
                $('#comboExpedientes').html(response);
                console.log('response');
            },
            error: function (response) {
                console.log("Respuesta del servidor error al borrar: ", response);
                alert('Error al eliminar, vuelva a intentarlo o cunsulte al administrador');
            }
        });
    });
});
function funProcedimiento() {
    var seleccion = document.getElementById("procedimientosACT").value;
    var cajaTexto = document.getElementById("divOrdinarioACT");
    var cajaTexto2 = document.getElementById("divActOrd");
    if (seleccion === "Ordinario") { 
        cajaTexto.style.display = "block";
        cajaTexto2.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
        cajaTexto2.style.display = "none";
    }
}

function funMenuACT1() {
    var seleccion = document.getElementById("procedimientosACT").value;
    var cajaTexto = document.getElementById("divActOrd");

    if (seleccion === "Ordinario") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

function funTrabajador() {
    var seleccion = document.getElementById("comboActor").value;
    var cajaTexto = document.getElementById("divTrabajadorORD");

    if (seleccion === "Trabajador") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

function funSindicato() {
    var seleccion = document.getElementById("comboActor").value;
    var cajaTexto = document.getElementById("divSindicatoACT");

    if (seleccion === "Sindicato") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

function funTipoSindicato() {
    var seleccion = document.getElementById("tipoSindicato").value;
    var cajaTexto = document.getElementById("divEspSindicato");

    if (seleccion === "Otro tipo de sindicato (especifique)") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

function funOrgObr() {
    var seleccion = document.getElementById("sindictaOrgObr").value;
    var cajaTexto = document.getElementById("divOrgObr");

    if (seleccion === "Sí") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

function funEspOrgObr() {
    var seleccion = document.getElementById("nombreOrgObr").value;
    var cajaTexto = document.getElementById("divEspOrgObr");

    if (seleccion === "Otra organización obrera (especifique)") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

function funCantidadTrabajadores() {
    var seleccion = document.getElementById("comboActor").value;
    var cajaTexto = document.getElementById("divCantidadTrabajadores");

    if (seleccion === "Sindicato" || seleccion === "Coalición de trabajadores") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}
 //--------------------------------------------INDIVIDUAL-----------------------------------------------------------------------
 
function funProcedimiento2() {
    var seleccion = document.getElementById("procedimientosACT").value;
    var cajaTexto = document.getElementById("divIndividualACT");
    var cajaTexto2 = document.getElementById("divActInd");
    if (seleccion === "Especial individual") { 
        cajaTexto.style.display = "block";
        cajaTexto2.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
        cajaTexto2.style.display = "none";
    }
}

 function funTrabajador2() {
    var seleccion = document.getElementById("comboActor2").value;
    var cajaTexto = document.getElementById("divTrabajadorIND");

    if (seleccion === "Trabajador") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}
//--------------------------------------COLECTIVO-----------------------------------------------------------------
 function funProcedimiento3() {
    var seleccion = document.getElementById("procedimientosACT").value;
    var cajaTexto = document.getElementById("divColectivoACT");
    var cajaTexto2 = document.getElementById("divActCol");
    if (seleccion === "Especial colectivo") { 
        cajaTexto.style.display = "block";
        cajaTexto2.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
        cajaTexto2.style.display = "none";
    }
}

 function funSindicato2() {
    var seleccion = document.getElementById("comboActor3").value;
    var cajaTexto = document.getElementById("divSindicatoACT2");

    if (seleccion === "Sindicato" ) { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

 function funCantidadTrabajadores2() {
    var seleccion = document.getElementById("comboActor3").value;
    var cajaTexto = document.getElementById("divCantidadTrabajadores2");

    if (seleccion === "Coalición de trabajadores" || seleccion === "Sindicato") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

function funPatron() {
    var seleccion = document.getElementById("comboActor3").value;
    var cajaTexto = document.getElementById("divPatronCOL");

    if (seleccion === "Patrón" ) { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

function funTipo() {
    var seleccion = document.getElementById("comboTipo").value;
    var cajaTexto = document.getElementById("divMoralCOL");

    if (seleccion === "Persona moral" ) { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

function funOrgObr2() {
    var seleccion = document.getElementById("sindictaOrgObr2").value;
    var cajaTexto = document.getElementById("divOrgObr2");

    if (seleccion === "Sí") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}
function funEspOrgObr2() {
    var seleccion = document.getElementById("nombreOrgObr2").value;
    var cajaTexto = document.getElementById("divEspOrgObr2");

    if (seleccion === "Otra organización obrera (especifique)") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}
function funTipoSindicato2() {
    var seleccion = document.getElementById("tipoSindicato2").value;
    var cajaTexto = document.getElementById("divEspSindicato2");

    if (seleccion === "Otro tipo de sindicato (especifique)") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}
//----------------------------------HUELGA--------------------------------------------------------------------------
function funProcedimiento4() {
    var seleccion = document.getElementById("procedimientosACT").value;
    var cajaTexto = document.getElementById("divHuelgaACT");
    var cajaTexto2 = document.getElementById("divActHue");
    if (seleccion === "Huelga") { 
        cajaTexto.style.display = "block";
        cajaTexto2.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
        cajaTexto2.style.display = "none";
    }
}

function funSindicato3() {
    var seleccion = document.getElementById("comboActor4").value;
    var cajaTexto = document.getElementById("divSindicatoHue");
 
    if (seleccion === "Sindicato" ) { 
        cajaTexto.style.display = "block";
      
    }  
    
    else {
        cajaTexto.style.display = "none";
       
    }
}

function funTrabajadorHue() {
    var seleccion = document.getElementById("comboActor4").value;
    var cajaTexto = document.getElementById("divCantidadTrabajadoresHue");

    if (seleccion === "Sindicato" ) { 
        cajaTexto.style.display = "block";
    }  
    else if (seleccion === "Mayoría de trabajadores"){
        cajaTexto.style.display = "block";
    }
    else {
        cajaTexto.style.display = "none";
    }
}

function funOrgObrHUE() {
    var seleccion = document.getElementById("sindictaOrgObrHue").value;
    var cajaTexto = document.getElementById("divOrgObrHUE");

    if (seleccion === "Sí") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}
function funEspOrgObr2HUE() {
    var seleccion = document.getElementById("nombreOrgObrHue").value;
    var cajaTexto = document.getElementById("divEspOrgObrHUE");

    if (seleccion === "Otra organización obrera (especifique)") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

function funTipoSindicato3() {
    var seleccion = document.getElementById("tipoSindicato3").value;
    var cajaTexto = document.getElementById("divEspSindicato3");

    if (seleccion === "Otro tipo de sindicato (especifique)") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}
//------------------------------COLECTIVO NATURALEZA ECONOMICA-------------------
function funProcedimiento5() {
    var seleccion = document.getElementById("procedimientosACT").value;
    var cajaTexto = document.getElementById("divColNatEcoACT");
    var cajaTexto2 = document.getElementById("divActColNatEco");
    if (seleccion === "Colectivo de naturaleza económica") { 
        cajaTexto.style.display = "block";
        cajaTexto2.style.display = "block";
    }  
    else {
        cajaTexto2.style.display = "none";
        cajaTexto.style.display = "none";
    }
}

function funSindicatoCNE() {
    var seleccion = document.getElementById("comboActor5").value;
    var cajaTexto = document.getElementById("divSindicatoCNE");
    var cajaTexto2 = document.getElementById("divMayoriaTrabajadoresCNE");
    if (seleccion === "Sindicato" ) { 
        cajaTexto.style.display = "block";
        cajaTexto2.style.display = "block";
    } 
    else {
        cajaTexto.style.display = "none";
        cajaTexto2.style.display = "none";
    }
}

function funMayoriaTrabajadoresCNE() {
    var seleccion = document.getElementById("comboActor5").value;
    var cajaTexto = document.getElementById("divMayoriaTrabajadoresCNE");

    if (seleccion === "Mayoría de trabajadores") { 
        cajaTexto.style.display = "block";
    }  
    else if (seleccion === "Sindicato" ) { 
        cajaTexto.style.display = "block";   
    } 
    else {
        cajaTexto.style.display = "none";
    }
}

function funPatronCNE() {
    var seleccion = document.getElementById("comboActor5").value;
    var cajaTexto = document.getElementById("divPatronCNE");

    if (seleccion === "Patrón") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

function funOrgObrCNE() {
    var seleccion = document.getElementById("sindictaOrgObrCNE").value;
    var cajaTexto = document.getElementById("divOrgObrCNE");

    if (seleccion === "Sí") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

function funEspOrgObrCNE() {
    var seleccion = document.getElementById("nombreOrgObrCNE").value;
    var cajaTexto = document.getElementById("divEspOrgObrCNE");

    if (seleccion === "Otra organización obrera (especifique)") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

function funTipoSindicatoCNE() {
    var seleccion = document.getElementById("tipoSindicatoCNE").value;
    var cajaTexto = document.getElementById("divEspSindicatoCNE");

    if (seleccion === "Otro tipo de sindicato (especifique)") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

function funMoralCNE() {
    var seleccion = document.getElementById("comboTipoCNE").value;
    var cajaTexto = document.getElementById("divMoralCNE");

    if (seleccion === "Persona moral") { 
        cajaTexto.style.display = "block";
    }  
    else {
        cajaTexto.style.display = "none";
    }
}

function funcionLatitudACT()
{
    var  lat = parseFloat(document.getElementById("latitudActCOL").value);
    
    if ( lat < 11 || lat > 33)
    {
        alert("La latitud debe estart entre 11 y 33 con un máximo de 10 decimales");
        document.getElementById("latitudActCOL").value = "";
    }
}

function funcionLongitudACT()
{
    var  lon = parseFloat(document.getElementById("longitudActCOL").value);
    
    if ( lon < -123 || lon > -83)
    {
        alert("La longitud debe estar entre -123 a -83 con un máximo de 10 decimales ");
        document.getElementById("longitudActCOL").value = "";
    }
}

function funcionLatitud2ACT()
{
    var  lat = parseFloat(document.getElementById("latitudACTcne").value);
    
    if ( lat < 11 || lat > 33)
    {
        alert("La latitud debe estart entre 11 y 33 con un máximo de 10 decimales");
        document.getElementById("latitudACTcne").value = "";
    }
}

function funcionLongitud2ACT()
{
    var  lon = parseFloat(document.getElementById("longitudACTcne").value);
    
    if ( lon < -123 || lon > -83)
    {
        alert("La longitud debe estar entre -123 a -83 con un máximo de 10 decimales ");
        document.getElementById("longitudACTcne").value = "";
    }
}


function sumarNumeros() {
  // Obtener los elementos de los campos de texto por su ID (ajusta los ID según tu HTML)
  const numero1 = document.getElementById('hombresTra').value;
  const numero2 = document.getElementById('mujeresTra').value;
  const numero3 = document.getElementById('noInvalido').value;

 
  const suma = Number(numero1) + Number(numero2) + Number(numero3);

  // Obtener el elemento del campo de texto donde mostraremos el resultado
  const resultado = document.getElementById('totalTrabajadores');

  // Mostrar el resultado en el campo
  resultado.value = suma;
}

function sumarNumeros2() {
  // Obtener los elementos de los campos de texto por su ID (ajusta los ID según tu HTML)
  const numero1 = document.getElementById('hombresTra2').value;
  const numero2 = document.getElementById('mujeresTra2').value;
  const numero3 = document.getElementById('noInvalido2').value;

 
  const suma = Number(numero1) + Number(numero2) + Number(numero3);

  // Obtener el elemento del campo de texto donde mostraremos el resultado
  const resultado = document.getElementById('totalTrabajadores2');

  // Mostrar el resultado en el campo
  resultado.value = suma;
}

function sumarNumeros3() {
  // Obtener los elementos de los campos de texto por su ID (ajusta los ID según tu HTML)
  const numero1 = document.getElementById('hombresTra3').value;
  const numero2 = document.getElementById('mujeresTra3').value;
  const numero3 = document.getElementById('noInvalido3').value;

 
  const suma = Number(numero1) + Number(numero2) + Number(numero3);

  // Obtener el elemento del campo de texto donde mostraremos el resultado
  const resultado = document.getElementById('totalTrabajadores3');

  // Mostrar el resultado en el campo
  resultado.value = suma;
}

function sumarNumeros4() {
  // Obtener los elementos de los campos de texto por su ID (ajusta los ID según tu HTML)
  const numero1 = document.getElementById('hombresCNE').value;
  const numero2 = document.getElementById('mujeresCNE').value;
  const numero3 = document.getElementById('identificadosCNE').value;

 
  const suma = Number(numero1) + Number(numero2) + Number(numero3);

  // Obtener el elemento del campo de texto donde mostraremos el resultado
  const resultado = document.getElementById('totalCNE');

  // Mostrar el resultado en el campo
  resultado.value = suma;
}

function Obten_proc_exped(claveOrgano, procedimiento, claveExpediente) {
    var claveOrg = document.getElementById(claveOrgano).value;
    var proc = document.getElementById(procedimiento).value;
    var claveExp = document.getElementById(claveExpediente).value;
 
    $.ajax({
        type: 'POST',
        url: 'ObtenIDactor',
        data: {
            claveOrg: claveOrg,
            proc: proc,
            claveExp: claveExp
        },
        success: function(response) {
    // Inserta solo la tabla dentro del fieldset sin borrar la leyenda
    document.getElementById("tablaActores").innerHTML = `
<legend>Actores Registrados</legend> 
        ${response}
    `;
},
        error: function (response) {
            console.log("Error: ", response);
        }
    });
}

function entiMunicipio(entidad, municipio) {
    var enti = $('#' + entidad).val();

    $.ajax({
        type: 'post',
        url: 'ObtenMunicipios',
        data: {
            enti: enti
        },
        success: function (response) {
            console.log("Respuesta del servidor al borrar: ", response);
            $('#' + municipio).html(response);
            console.log('response');
        },
        error: function (response) {
            console.log("Respuesta del servidor error al borrar: ", response);
            alert('Error al eliminar, vuelva a intentarlo o cunsulte al administrador');
        }
    });
}

function validarYConvertir(input) {
  const regex = /^[a-zA-Z0-9]+$/; // Permite solo letras mayúsculas y espacios
  input.value = input.value.toUpperCase();
  if (!regex.test(input.value)) 
  {
     
        
      alert("Sólo se permiten letras y números");
        input.value = input.value.slice(0, -1);
  } 
  else 
  {    
      const textoMayusculas = input.toUpperCase();
      return regex.test(textoMayusculas) ? textoMayusculas : "Texto inválido";
  }
}

function validarYConvertirNSS(input) {
  const regex = /^[0-9]+$/; // Permite solo lnumeros
  if (!regex.test(input.value)) 
  {
      alert("Sólo se permiten  números");
        input.value = '';
  } 
  else 
  {    
      const textoMayusculas = input.toUpperCase();
      return regex.test(textoMayusculas) ? textoMayusculas : "Texto inválido";
  }
}