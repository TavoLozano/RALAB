
package Combos;
import Modelo.ConectaBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class CargaCombosProcedimientos {
       ConectaBD conexion=new ConectaBD();
 //**********************************************************************      
        public ResultSet claveOrgano(String nombre)
     {
       
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String consulta;
        try
        {
            conn=conexion.conectar();
            consulta="SELECT id_organoj FROM TR_ORGANOJ where nombre_organoj = '"+nombre+"' ";
            stmt = conn.prepareStatement(consulta);
            rs = stmt.executeQuery();
   
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar las conexiones y recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         return rs;
     }
     //**************************************************************  
        public List<String> listaOrganos()
     {
        List<String> resultados=new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String consulta;
        try
        {
            conn=conexion.conectar();
            consulta="SELECT nombre_organoj FROM TR_ORGANOJ ";
            stmt = conn.prepareStatement(consulta);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String dato = rs.getString("nombre_organoj"); 
                resultados.add(dato);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar las conexiones y recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         return resultados;
     }
   //********************************************************     
         public List<String> listaProcedimientos()
     {
        List<String> resultados=new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String consulta;
        try
        {
            conn=conexion.conectar();
            consulta="SELECT descripcion FROM TC_PROCEDIMIENTO ";
            stmt = conn.prepareStatement(consulta);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String dato = rs.getString("descripcion"); 
                resultados.add(dato);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar las conexiones y recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         return resultados;
     }
//*************************************************************         
      public List<String> sector()
     {
        List<String> resultados=new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String consulta;
        try
        {
            conn=conexion.conectar();
            consulta="SELECT distinct sector FROM TC_SECTOR_SBSTOR order by sector";
            stmt = conn.prepareStatement(consulta);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String dato = rs.getString("sector"); 
                resultados.add(dato);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar las conexiones y recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         return resultados;
     }  
   //***********************************************************
      public List<String> subsector(String sector)
     {
        List<String> resultados=new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String consulta;
       
        try
        {
            conn=conexion.conectar();
            consulta="SELECT distinct subsector FROM TC_SECTOR_SBSTOR where sector = '"+sector+"' ORDER BY subsector ";
            stmt = conn.prepareStatement(consulta);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String dato = rs.getString("subsector"); // Cambia "columna" al nombre de tu columna en la tabla
                resultados.add(dato);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar las conexiones y recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         return resultados;
     }
 //***********************************************************
   public List<String> listaMotivosPromocion()
     {
        List<String> resultados=new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String consulta;
        try
        {
            conn=conexion.conectar();
            consulta="SELECT descripcion FROM TC_MOTIVO_SOLIC_PROM WHERE id_motivo_sol_promo in (12,13) ";
            stmt = conn.prepareStatement(consulta);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String dato = rs.getString("descripcion"); 
                resultados.add(dato);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar las conexiones y recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         return resultados;
     }   
   //******************************************************
    public List<String> listaPromoventes()
     {
        List<String> resultados=new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String consulta;
        try
        {
            conn=conexion.conectar();
            consulta="SELECT descripcion FROM TC_PROMOVENTE WHERE id_promovente in (1,2,5) ";
            stmt = conn.prepareStatement(consulta);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String dato = rs.getString("descripcion"); 
                resultados.add(dato);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar las conexiones y recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         return resultados;
     }   
    
     public List<String> listaMotivosPromocionE()
     {
        List<String> resultados=new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String consulta;
        try
        {
            conn=conexion.conectar();
            consulta="SELECT descripcion FROM TC_MOTIVO_SOLIC_PROM WHERE id_motivo_sol_promo in (15,16,17,18,19) ";
            stmt = conn.prepareStatement(consulta);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String dato = rs.getString("descripcion"); 
                resultados.add(dato);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar las conexiones y recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         return resultados;
     }   
     //---------------------------------------------------------------------ORDINARIO------------------------------------------------------------------
            
         public int indiceAsunto(String asunto) throws SQLException
     {
         ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_tipo_asunto FROM TC_ASUNTO where descripcion= '"+asunto+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
     }
         
         public int indiceNatConflicto(String conflicto) throws SQLException
     {
         ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_nat_conflicto FROM TC_NAT_CONFLICTO where descripcion= '"+conflicto+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
     }
         
          public int indiceContrato(String contrato) throws SQLException
     {
         ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_tipo_contrato FROM TC_CONTRATO where descripcion= '"+contrato+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
     }
          
            public int indiceSectorSubsector(String sector, String subsector) throws SQLException
     {
         ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_sector_sbstor FROM TC_SECTOR_SBSTOR where sector = '"+sector+"' AND subsector = '"+subsector+"' ";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
     }
            
            public int idEntidadMunicipio(String entidad, String municipio) throws SQLException
      {
          int entmun=0;
          ConectaBD c=new ConectaBD();
        c.conectar();
        
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_ent_mpio FROM TC_ENTIDAD_MPIO where entidad = '"+entidad+"' and municipio = '"+municipio+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                entmun=rs.getInt(1);
            }
          return entmun;
      }
            
      public int idSectorSubsector(String sector, String subsector) throws SQLException
      {
          int secsub=0;
          ConectaBD c=new ConectaBD();
        c.conectar();
        
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_sector_sbstor FROM TC_SECTOR_SBSTOR where sector = '"+sector+"' and subsector = '"+subsector+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                secsub=rs.getInt(1);
            }
          return secsub;
      }
            
     public int indiceIncompetencia(String incompetencia) throws SQLException
     {
         ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_tipo_incompetencia FROM TC_INCOMPETENCIA where descripcion= '"+incompetencia+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
     }
              
              public int indiceEstatusDemanda(String estatusDemanda) throws SQLException
         {
           ConectaBD c=new ConectaBD();
            c.conectar();
            int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_estatus_demanda FROM TC_ESTATUS_DEMANDA where descripcion= '"+estatusDemanda+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
     }
              
          public int indiceCausaImpDem(String causa) throws SQLException
         {
           ConectaBD c=new ConectaBD();
            c.conectar();
            int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_estatus_demanda FROM TC_CAUSAS_IMPEDIM_DEMANDA where descripcion= '"+causa+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
         }
          
           public int indiceFaseSolExp(String fase) throws SQLException
         {
           ConectaBD c=new ConectaBD();
            c.conectar();
            int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_fase_solucion FROM TC_FASE_SOLUCION_EXP where descripcion= '"+fase+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
         }
           
            public int indiceFormaSolExp(String forma) throws SQLException
         {
           ConectaBD c=new ConectaBD();
            c.conectar();
            int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_forma_solucion FROM TC_FORMA_SOLUCION where descripcion= '"+forma+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
         }
          
            public int indiceSentencia(String sentencia) throws SQLException
         {
           ConectaBD c=new ConectaBD();
            c.conectar();
            int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_tipo_sentencia FROM TC_SENTENCIA where descripcion= '"+sentencia+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
         }
            
            public int indiceEfectoSentencia(String sentencia) throws SQLException
         {
           ConectaBD c=new ConectaBD();
            c.conectar();
            int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_efecto_sentencia FROM TC_SENTENCIA_EFECTO where descripcion= '"+sentencia+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
         }
            
             public int indiceMotivoConflicot(String motivo) throws SQLException
            {
                 ConectaBD c=new ConectaBD();
                 c.conectar();
                 int valor = 0;
                 // Consulta SQL para obtener los datos
                 String sql = "SELECT id_motivo_conflicto FROM TC_MOTIVO_CONFLICTO where descripcion= '"+motivo+"'";
                 Statement stmt = c.con.createStatement();
                 ResultSet rs = stmt.executeQuery(sql);
                 if(rs.next())
                {
                    valor=rs.getInt(1);
                 }
                 return valor;        
            }
             
              public int indiceCircunstancias(String circunstancia) throws SQLException
            {
                 ConectaBD c=new ConectaBD();
                 c.conectar();
                 int valor = 0;
                 // Consulta SQL para obtener los datos
                 String sql = "SELECT id_circuns_mot_conf FROM TC_MOTIVO_CONFLICTO_CIRCUNST where descripcion= '"+circunstancia+"'";
                 Statement stmt = c.con.createStatement();
                 ResultSet rs = stmt.executeQuery(sql);
                 if(rs.next())
                {
                    valor=rs.getInt(1);
                 }
                 return valor;        
            }
            
                public int indiceConceptos(String concepto) throws SQLException
            {
                 ConectaBD c=new ConectaBD();
                 c.conectar();
                 int valor = 0;
                 // Consulta SQL para obtener los datos
                 String sql = "SELECT id_concepto_reclam FROM TC_CONCEPTO_RECLAMADO where descripcion= '"+concepto+"'";
                 Statement stmt = c.con.createStatement();
                 ResultSet rs = stmt.executeQuery(sql);
                 if(rs.next())
                {
                    valor=rs.getInt(1);
                 }
                 return valor;        
            }
                
                public int indicePrestaciones(String prestacion) throws SQLException
            {
                 ConectaBD c=new ConectaBD();
                 c.conectar();
                 int valor = 0;
                 // Consulta SQL para obtener los datos
                 String sql = "SELECT id_prestacion FROM TC_PRESTACION where descripcion= '"+prestacion+"'";
                 Statement stmt = c.con.createStatement();
                 ResultSet rs = stmt.executeQuery(sql);
                 if(rs.next())
                {
                    valor=rs.getInt(1);
                 }
                 return valor;        
            }
     
                  public int indiceSuspensiones(String suspencion) throws SQLException
            {
                 ConectaBD c=new ConectaBD();
                 c.conectar();
                 int valor = 0;
                 // Consulta SQL para obtener los datos
                 String sql = "SELECT id_tipo_suspension FROM TC_SUSP_TEMP where descripcion= '"+suspencion+"'";
                 Statement stmt = c.con.createStatement();
                 ResultSet rs = stmt.executeQuery(sql);
                 if(rs.next())
                {
                    valor=rs.getInt(1);
                 }
                 return valor;        
            }
       public int consecutivoMotivos() throws SQLException
      {
          int consecutivo=0;
          
          ConectaBD c=new ConectaBD();
           c.conectar();
        
            // Consulta SQL para obtener los datos
            String sql = "SELECT COUNT(*) FROM TC_MOTIVO_CONFLICTO";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                consecutivo=rs.getInt(1);
            }
          return consecutivo;
      }
       
        public int consecutivoCircunstancias() throws SQLException
      {
          int consecutivo=0;
          
          ConectaBD c=new ConectaBD();
           c.conectar();
        
            // Consulta SQL para obtener los datos
            String sql = "SELECT COUNT(*) FROM TC_MOTIVO_CONFLICTO_CIRCUNST";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                consecutivo=rs.getInt(1);
            }
          return consecutivo;
      }
         
        public int consecutivoConceptos() throws SQLException
      {
          int consecutivo=0;
          
          ConectaBD c=new ConectaBD();
           c.conectar();
        
            // Consulta SQL para obtener los datos
            String sql = "SELECT COUNT(*) FROM TC_CONCEPTO_RECLAMADO";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                consecutivo=rs.getInt(1);
            }
          return consecutivo;
      }
        
         public int consecutivoPrestaciones() throws SQLException
      {
          int consecutivo=0;
          
          ConectaBD c=new ConectaBD();
           c.conectar();
        
            // Consulta SQL para obtener los datos
            String sql = "SELECT COUNT(*) FROM TC_PRESTACION";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                consecutivo=rs.getInt(1);
            }
           return consecutivo;
      }
         
          public int consecutivoIncompetencia() throws SQLException
      {
          int consecutivo=0;
          
          ConectaBD c=new ConectaBD();
           c.conectar();
        
            // Consulta SQL para obtener los datos
            String sql = "SELECT COUNT(*) FROM TC_INCOMPETENCIA";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                consecutivo=rs.getInt(1);
            }
           return consecutivo;
      }
           public int consecutivoSolucion() throws SQLException
      {
          int consecutivo=0;
          
          ConectaBD c=new ConectaBD();
           c.conectar();
        
            // Consulta SQL para obtener los datos
            String sql = "SELECT COUNT(*) FROM TC_FORMA_SOLUCION";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                consecutivo=rs.getInt(1);
            }
           return consecutivo;
      }
     //-----------------------------------------------------------------------HUELGA---------------------------------------------------------------------------
          
            public int indiceLicitud(String licitud) throws SQLException
            {
                 ConectaBD c=new ConectaBD();
                 c.conectar();
                 int valor = 0;
                 // Consulta SQL para obtener los datos
                 String sql = "SELECT id_huelga_licitud FROM TC_HUELGA_LICITUD where descripcion= '"+licitud+"'";
                 Statement stmt = c.con.createStatement();
                 ResultSet rs = stmt.executeQuery(sql);
                 if(rs.next())
                {
                    valor=rs.getInt(1);
                 }
                 return valor;        
            }
            
            public int indiceExistencia(String existencia) throws SQLException
            {
                 ConectaBD c=new ConectaBD();
                 c.conectar();
                 int valor = 0;
                 // Consulta SQL para obtener los datos
                 String sql = "SELECT id_huelga_exist FROM TC_HUELGA_EXISTENCIA where descripcion= '"+existencia+"'";
                 Statement stmt = c.con.createStatement();
                 ResultSet rs = stmt.executeQuery(sql);
                 if(rs.next())
                {
                    valor=rs.getInt(1);
                 }
                 return valor;        
            }
     //      ----------------------------------------------------------------TERCERIAS----------------------------------------------------------------------------------
            
             public int indiceIncidente(String incidente) throws SQLException
     {
            ConectaBD c=new ConectaBD();
            c.conectar();
            int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_tipo_incidente_ FROM TC_INCIDENTE where descripcion= '"+incidente+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
      }
            
     //----------------------------------------------------------PREFRENCIA DE CREDITO----------------------------------------------------
     
      public int indicePromovente(String promovente) throws SQLException
     {
            ConectaBD c=new ConectaBD();
            c.conectar();
            int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_promovente FROM TC_PROMOVENTE where descripcion= '"+promovente+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
      }
     
     //-----------------------------------------------------------------EJECUCION----------------------------------------------------------------------------------
     public int consecutivoExpediente() throws SQLException
      {
          int consecutivo=0;
          
          ConectaBD c=new ConectaBD();
        c.conectar();
        
            // Consulta SQL para obtener los datos
          
           String sql = "SELECT MAX(id_expediente) FROM TR_EXPEDIENTE";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                consecutivo=rs.getInt(1);
            }
          return consecutivo;
      }
     
     public int indiceEstatus(String estatus) throws SQLException
     {
         ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_estatus_expediente FROM TC_ESTATUS_EXPEDIENTE where descripcion= '"+estatus+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
     }
     
      public int indiceFaseConcluyo(String fase) throws SQLException
     {
         ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_fase_concl_ejec FROM TC_FASE_CONCLUSION_EJECU where descripcion= '"+fase+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
     }
      
      
      //METODO PARA OBTENER EL INDICE DEL MOTIVO SELECCIONADO EN EL COMBOBOX--------------------
      public int indiceMotivoPromo(String motivo) throws SQLException
     {
         ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_motivo_sol_promo FROM TC_MOTIVO_SOLIC_PROM where descripcion= '"+motivo+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
     }

}


 
