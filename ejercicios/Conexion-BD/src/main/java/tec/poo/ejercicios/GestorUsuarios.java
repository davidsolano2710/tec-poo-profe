package tec.poo.ejercicios;

public class GestorUsuarios {

    private ConexionBD connection ;

    public GestorUsuarios(ConexionBD conexionBD){
        this.connection = conexionBD;
    }
    public void obtenerUsuarios(){
        connection.ejecutarConsulta(null);
    }


}
