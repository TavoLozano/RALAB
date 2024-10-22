package Combos;

import Modelo.ConectaBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CargaCombosAudiencias {
    public int indiceAudiencia(String audiencia) throws SQLException
     {
         ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_tipo_audiencia FROM TC_TIPO_AUDIENCIA where descripcion= '"+audiencia+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
     }
    //*****************************************************************************************************
    public int indiceExpediente(String expediente) throws SQLException
     {
         ConectaBD c=new ConectaBD();
        c.conectar();
        int valor = 0;
            // Consulta SQL para obtener los datos
            String sql = "SELECT id_expediente FROM public.tr_expediente where clave_expediente = '"+expediente+"'";
            Statement stmt = c.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                valor=rs.getInt(1);
            }
            return valor;        
     }
    //******************************************************************************************************
}
