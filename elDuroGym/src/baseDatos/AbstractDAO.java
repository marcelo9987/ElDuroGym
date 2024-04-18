/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import aplicacion.FachadaAplicacion;

import java.sql.Connection;


/**
 *
 * @author alumnogreibd
 */
public abstract class AbstractDAO {
   private FachadaAplicacion fa;
   private Connection conexion;

   
    protected Connection getConexion(){
        return this.conexion;
    }
    
    protected void setConexion(Connection conexion){
        this.conexion=conexion;
    }
   
   protected void setFachadaAplicacion(FachadaAplicacion fa){
       this.fa=fa;
   }
   
   protected FachadaAplicacion getFachadaAplicacion(){
       return fa;
   }
   
   
}
