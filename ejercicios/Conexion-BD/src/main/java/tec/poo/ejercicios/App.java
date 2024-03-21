package tec.poo.ejercicios;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ApplicationContext();

        var gestorUsuarios = applicationContext.getUserManager();
        gestorUsuarios.obtenerUsuarios();

        
    }
}
