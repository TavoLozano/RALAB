package Modelo;


import Combos.CargaCombosProcedimientos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Sentencia_actualiza_prefCred 
{  

     public boolean registrarProcedimiento(Integer id_expediente, Integer id_tipo_expediente, String id_organoj, String clave_expediente, String fecha_apertura_exped, String fecha_present_promo, String fecha_admision_promo, Integer id_promovente, Integer id_estatus_exped,  String fecha_dicto_solucion, String comentarios)
    {
         Connection conn;
         Statement stm;
         ConectaBD obj=new ConectaBD();
         CargaCombosProcedimientos combosPro=new CargaCombosProcedimientos();
         int resultUpdate = 0;
                
         try
        {
             conn = obj.conectar();
             stm = conn.createStatement(); 
        
             resultUpdate = stm.executeUpdate("INSERT INTO TR_EXPEDIENTE  (id_expediente, id_tipo_expediente, id_organoj, clave_expediente, fecha_apertura_exped, fecha_present_promo, fecha_admision_promo, id_promovente, id_estatus_exped, fecha_dicto_solucion, comentarios) "
                                                                                              + "VALUES ("+id_expediente+","+id_tipo_expediente+",'"+id_organoj+"','"+clave_expediente+"', '"+fecha_apertura_exped+"', '"+fecha_present_promo+"','"+fecha_admision_promo+"',"+id_promovente+", "+id_estatus_exped+", '"+fecha_dicto_solucion+"', '"+comentarios+"')");
         
            if(resultUpdate != 0)
           {
                obj.cerrar();
                return true;
           }
           else
          {
               obj.cerrar();
               return false;
          }
      }
      catch (Exception e) 
      {
          System.out.println("Error en la base de datos.");
          e.printStackTrace();
          return false;
      }
  }
     
     //----------------------------------------------------------------------------------pref credito y ejecucion-----------------------------
     public boolean registraMotivoEje(Integer id_motivo_sol_promo, Integer id_expediente)
     {
          Connection conn;
          Statement stm;
          ConectaBD obj=new ConectaBD();
          int resultUpdate = 0;                
          try
         {
               conn = obj.conectar();
               stm = conn.createStatement(); 
               resultUpdate = stm.executeUpdate("INSERT INTO TR_EXP_MOTIVO_SOLIC  (id_motivo_sol_promo, id_expediente) "
                                                                                                             + "VALUES ("+id_motivo_sol_promo+","+id_expediente+")");        
               if(resultUpdate != 0)
              {
                   obj.cerrar();
                   return true;
              }
              else
             {
                  obj.cerrar();
                  return false;
              }
          }
          catch (Exception e) 
          {
                 System.out.println("Error en la base de datos.");
                 e.printStackTrace();
                 return false;
          }    
     }
     
      
     
     
     //**************************************************ORDINARIO**************************************************
     
     // -                         motivos del conflicto
     
      
     
      public boolean registraMotivosOrd(Integer id_motivo_conflicto, Integer id_expediente)
     {
          Connection conn;
          Statement stm;

          ConectaBD obj=new ConectaBD();
          int resultUpdate = 0;
                
           try
          {
               conn = obj.conectar();
               stm = conn.createStatement();          
             
               resultUpdate = stm.executeUpdate("INSERT INTO TR_EXP_MOTIVO_CONF  (id_motivo_conflicto, id_expediente) "
                                                                                                         + "VALUES ("+id_motivo_conflicto+","+id_expediente+")");
         
              if(resultUpdate != 0)
             {
                  obj.cerrar();
                  return true;
             }
             else
            {
                  obj.cerrar();
                  return false;
            }
    }
    catch (Exception e) 
    {
        System.out.println("Error en la base de datos.");
        e.printStackTrace();
        return false;
    }
    
     }
      
    
      
      
      
      //                         circunstancias vinculadas
         public boolean registraCircunstancias(Integer id_circuns_mot_conf, Integer id_expediente)
     {
          Connection conn;
          Statement stm;

          ConectaBD obj=new ConectaBD();
          int resultUpdate = 0;
                
           try
          {
               conn = obj.conectar();
               stm = conn.createStatement();                
                           
               resultUpdate = stm.executeUpdate("INSERT INTO TR_EXP_CIRCUNST  (id_circuns_mot_conf, id_expediente) "
                                                                                                         + "VALUES ("+id_circuns_mot_conf+","+id_expediente+")");
         
              if(resultUpdate != 0)
             {
                  obj.cerrar();
                  return true;
             }
             else
            {
                  obj.cerrar();
                  return false;
            }
    }
    catch (Exception e) 
    {
        System.out.println("Error en la base de datos.");
        e.printStackTrace();
        return false;
    }
    
     }
     
         //               conceptos reclamados
         public boolean registraConceptos(Integer id_concepto_reclam, Integer id_expediente)
     {
          Connection conn;
          Statement stm;

          ConectaBD obj=new ConectaBD();
          int resultUpdate = 0;
                
           try
          {
               conn = obj.conectar();
               stm = conn.createStatement();                
                            
               resultUpdate = stm.executeUpdate("INSERT INTO TR_EXP_CONCEPTO_RECLAM  (id_concepto_reclam, id_expediente) "
                                                                                                         + "VALUES ("+id_concepto_reclam+","+id_expediente+")");
         
              if(resultUpdate != 0)
             {
                  obj.cerrar();
                  return true;
             }
             else
            {
                  obj.cerrar();
                  return false;
            }
    }
    catch (Exception e) 
    {
        System.out.println("Error en la base de datos.");
        e.printStackTrace();
        return false;
    }
    
     }
         
         //                        prestaciones
           public boolean registraPrestacion(Integer id_prestacion, Integer id_expediente)
     {
          Connection conn;
          Statement stm;

          ConectaBD obj=new ConectaBD();
          int resultUpdate = 0;
                
           try
          {
               conn = obj.conectar();
               stm = conn.createStatement(); 
               
         
               
               resultUpdate = stm.executeUpdate("INSERT INTO TR_EXP_PRESTACION  (id_prestacion, id_expediente) "
                                                                                                         + "VALUES ("+id_prestacion+","+id_expediente+")");
         
              if(resultUpdate != 0)
             {
                  obj.cerrar();
                  return true;
             }
             else
            {
                  obj.cerrar();
                  return false;
            }
    }
    catch (Exception e) 
    {
        System.out.println("Error en la base de datos.");
        e.printStackTrace();
        return false;
    }
    
     }
           public boolean registraSuspension(Integer id_suspension, Integer id_expediente)
     {
          Connection conn;
          Statement stm;

          ConectaBD obj=new ConectaBD();
          int resultUpdate = 0;
                
           try
          {
               conn = obj.conectar();
               stm = conn.createStatement(); 
               
             
               
               resultUpdate = stm.executeUpdate("INSERT INTO TR_EXP_PRESTACION  (id_suspension, id_expediente) "
                                                                                                         + "VALUES ("+id_suspension+","+id_expediente+")");
         
              if(resultUpdate != 0)
             {
                  obj.cerrar();
                  return true;
             }
             else
            {
                  obj.cerrar();
                  return false;
            }
    }
    catch (Exception e) 
    {
        System.out.println("Error en la base de datos.");
        e.printStackTrace();
        return false;
    }
    
     }
           
           /////////////////////////////////////////GUARDAR ESPECIFIQUES///////////////////////////////
           public int indiceMotivosC() throws SQLException
     {
        ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT MAX (id_motivo_conflicto) FROM TC_MOTIVO_CONFLICTO";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }          
            return valor;        
     } 
           public int indiceCircunstancias() throws SQLException
     {
        ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT MAX (id_circuns_mot_conf) FROM TC_MOTIVO_CONFLICTO_CIRCUNST";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }          
            return valor;        
     } 
            public int indiceConceptosR() throws SQLException
     {
        ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT MAX (id_concepto_reclam) FROM TC_CONCEPTO_RECLAMADO";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }          
            return valor;        
     } 
             public int indicePrestaciones() throws SQLException
     {
        ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT MAX (id_prestacion) FROM TC_PRESTACION";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }          
            return valor;        
     } 
             public int indiceIncompetencia() throws SQLException
     {
        ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT MAX (id_tipo_incompetencia) FROM TC_INCOMPETENCIA";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }          
            return valor;        
     } 
             public int indiceSolucion() throws SQLException
     {
        ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT MAX (id_forma_solucion) FROM TC_FORMA_SOLUCION";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }          
            return valor;        
     } 
              public int indiceViol() throws SQLException
     {
        ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT MAX (id_tipo_viol_dh) FROM TC_VIOLACION_DH";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }          
            return valor;        
     } 
           
      public boolean registrarEspecifiqueMotivosC(Integer id, String sindicato)
    {
        Connection conn;
        Statement stm;
        ConectaBD obj=new ConectaBD();
        int resultUpdate = 0;               
        try
        {
            conn = obj.conectar();
            stm = conn.createStatement();
            resultUpdate = stm.executeUpdate("insert into TC_MOTIVO_CONFLICTO (id_motivo_conflicto, descripcion) VALUES ("+id+", '"+sindicato+"')");
            if(resultUpdate != 0)
            {
                obj.cerrar();
                return true;
            }
            else
            {
                obj.cerrar();
                return false;
            }
        }
        catch (Exception e) 
        {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }
      public boolean registrarEspecifiqueCircunstancias(Integer id, String circunstancia)
    {
        Connection conn;
        Statement stm;
        ConectaBD obj=new ConectaBD();
        int resultUpdate = 0;               
        try
        {
            conn = obj.conectar();
            stm = conn.createStatement();
            resultUpdate = stm.executeUpdate("insert into TC_MOTIVO_CONFLICTO_CIRCUNST (id_circuns_mot_conf, descripcion) VALUES ("+id+", '"+circunstancia+"')");
            if(resultUpdate != 0)
            {
                obj.cerrar();
                return true;
            }
            else
            {
                obj.cerrar();
                return false;
            }
        }
        catch (Exception e) 
        {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }
      public boolean registrarEspecifiqueConceptosR(Integer id, String concepto)
    {
        Connection conn;
        Statement stm;
        ConectaBD obj=new ConectaBD();
        int resultUpdate = 0;               
        try
        {
            conn = obj.conectar();
            stm = conn.createStatement();
            resultUpdate = stm.executeUpdate("insert into TC_CONCEPTO_RECLAMADO(id_concepto_reclam, descripcion) VALUES ("+id+", '"+concepto+"')");
            if(resultUpdate != 0)
            {
                obj.cerrar();
                return true;
            }
            else
            {
                obj.cerrar();
                return false;
            }
        }
        catch (Exception e) 
        {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }
      public boolean registrarEspecifiquePrestacion(Integer id, String prestacion)
    {
        Connection conn;
        Statement stm;
        ConectaBD obj=new ConectaBD();
        int resultUpdate = 0;               
        try
        {
            conn = obj.conectar();
            stm = conn.createStatement();
            resultUpdate = stm.executeUpdate("insert into TC_PRESTACION (id_prestacion, descripcion) VALUES ("+id+", '"+prestacion+"')");
            if(resultUpdate != 0)
            {
                obj.cerrar();
                return true;
            }
            else
            {
                obj.cerrar();
                return false;
            }
        }
        catch (Exception e) 
        {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }
      
      public boolean registrarEspecifiqueIncompetencia(Integer id, String incompetencia)
    {
        Connection conn;
        Statement stm;
        ConectaBD obj=new ConectaBD();
        int resultUpdate = 0;               
        try
        {
            conn = obj.conectar();
            stm = conn.createStatement();
            resultUpdate = stm.executeUpdate("insert into TC_INCOMPETENCIA (id_tipo_incompetencia, descripcion) VALUES ("+id+", '"+incompetencia+"')");
            if(resultUpdate != 0)
            {
                obj.cerrar();
                return true;
            }
            else
            {
                obj.cerrar();
                return false;
            }
        }
        catch (Exception e) 
        {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }
      
      public boolean registrarEspecifiqueSolucion(Integer id, String solucion)
    {
        Connection conn;
        Statement stm;
        ConectaBD obj=new ConectaBD();
        int resultUpdate = 0;               
        try
        {
            conn = obj.conectar();
            stm = conn.createStatement();
            resultUpdate = stm.executeUpdate("insert into TC_FORMA_SOLUCION (id_forma_solucion, descripcion) VALUES ("+id+", '"+solucion+"')");
            if(resultUpdate != 0)
            {
                obj.cerrar();
                return true;
            }
            else
            {
                obj.cerrar();
                return false;
            }
        }
        catch (Exception e) 
        {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }
         public boolean registrarEspecifiqueViol(Integer id, String violacion)
    {
        Connection conn;
        Statement stm;
        ConectaBD obj=new ConectaBD();
        int resultUpdate = 0;               
        try
        {
            conn = obj.conectar();
            stm = conn.createStatement();
            resultUpdate = stm.executeUpdate("insert into TC_VIOLACION_DH (id_tipo_viol_dh, descripcion) VALUES ("+id+", '"+violacion+"')");
            if(resultUpdate != 0)
            {
                obj.cerrar();
                return true;
            }
            else
            {
                obj.cerrar();
                return false;
            }
        }
        catch (Exception e) 
        {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }
}

   
