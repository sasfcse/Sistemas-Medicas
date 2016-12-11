package repositorios;

import clases.ciudades;
import clases.pacientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyecto.conexion;

/**
 *
 * @author usuario
 */
public class repositoriopacientes {
    conexion con=new conexion();
     Connection conex=con.conexion();
     
     ciudades ciud=new ciudades();
    
    public void guardar(pacientes pact){
        PreparedStatement pstm = null;
   try{
       
       pstm = conex.prepareStatement("INSERT INTO clientes(cedula,nombre,fecha,sexo,altura,peso,tipo_sangre,alergias,telefono,domicilio,e_mail,id_ciudad)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
       pstm.setString(1,pact.getCedula());
       pstm.setString(2,pact.getNombres());
       pstm.setDate(3,pact.getFechanacimineto());
       pstm.setString(4,pact.getSexo() );
       pstm.setString(5,pact.getAltura() );
       pstm.setString(6,pact.getPeso() );
       pstm.setString(7,pact.getTiposangre() );       
       pstm.setString(8,pact.getAlergias() ); 
       pstm.setString(9,pact.getTelefono() );
       pstm.setString(10,pact.getDomicilio() );
       pstm.setString(11,pact.getE_mail() );
       pstm.setInt(12,pact.getCiudad().getId_ciudad() );

       pstm.executeUpdate();
       JOptionPane.showMessageDialog(null,"Registro grabado exitosamente");
       
      
    }catch (SQLException exc){
      System.out.println("Error: " + exc.getMessage() );  
    }
    }
    
    public pacientes getPaciente(String cedula){
         String sql="";
         sql="SELECT * FROM clientes where cedula like?";
         try{
          PreparedStatement pst=conex.prepareStatement(sql);
          pst.setString(1, "%"+cedula+"%");
          
          pst.execute();
          ResultSet rs = pst.executeQuery();
          while (rs.next()){
              pacientes pac=new pacientes(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),ciud.getCiudad(rs.getInt(13)));
          }
         }catch(SQLException ex){
        System.out.println(ex.getMessage());
    }
         

   
}