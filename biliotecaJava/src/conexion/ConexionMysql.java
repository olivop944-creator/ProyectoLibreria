package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMysql {
    
    public static Connection conectar(){
        Connection conn = null;
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca java","root","contraseña");
        } catch (SQLException e){
            e.printStackTrace();
        }
        return conn;

}
}

