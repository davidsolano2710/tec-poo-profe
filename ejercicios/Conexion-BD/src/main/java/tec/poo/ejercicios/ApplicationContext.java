package tec.poo.ejercicios;

public class ApplicationContext {
    private ConexionBD connection;
    private GestorUsuarios userManager;

    public ApplicationContext(){
        this.connection = ConexionBDSingleton.getInstance();
        this.connection = new FileSystemStrategy();
        this.userManager = new GestorUsuarios(connection);
    }

    public ConexionBD getConnection() {
        return connection;
    }

    public GestorUsuarios getUserManager(){
        return userManager;
    }
}
