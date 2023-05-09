package coffeemachine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB implements Logger{

    private PreparedStatement statement;
    private final Connection conn;

    public DB() throws SQLException {
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost/MachineCoffe", "root", "");
    }
    /**
     *
     * @param coffeename
     * @param coffeetype
     * @param water
     * @param coffe
     * @param grind
     * @param caffeine
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Override
    public void log(String coffeename, String coffeetype, int water, int coffe, int grind, float caffeine) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String sql = "INSERT INTO coffee(coffeename,coffeetype,waterafter,coffeeafter,grind,caffeine) VALUES (?, ?, ?,?,?,?);";
        this.statement = conn.prepareStatement(sql);
        statement.setString(1, coffeename);
        statement.setString(2, coffeetype);
        statement.setInt(3, water);
        statement.setInt(4, coffe);
        statement.setInt(5, grind);
        statement.setFloat(6, caffeine * 100);
        statement.executeUpdate();
        if (statement != null) {
            statement.close();
        }
        
    }

    /**
     *
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public int CountEspresso() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT count(coffeename) AS espresso FROM coffee where coffeename ='Espresso';";
        statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);
        int count = 0;
        while (resultSet.next()) {
            count = resultSet.getInt("espresso");
        }
        return count;
    }

    public int CountEspressoDouble() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT count(coffeename) AS espressodouble FROM coffee where coffeename ='Espresso Double';";
        statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);
        int count = 0;
        while (resultSet.next()) {
            count = resultSet.getInt("espressodouble");
        }
        return count;
    }

    public int CountAmricano() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT count(coffeename) AS Amricano FROM coffee where coffeename ='Amricano';";
        statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);
        int count = 0;
        while (resultSet.next()) {
            count = resultSet.getInt("Amricano");
        }
        return count;
    }

    public int CountAmricanoDouble() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT count(coffeename) AS AmricanoDouble FROM coffee where coffeename ='Amricano Double';";
        statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);
        int count = 0;
        while (resultSet.next()) {
            count = resultSet.getInt("AmricanoDouble");
        }
        return count;
    }

    public int Water() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT waterafter AS maxx FROM coffee where id =(SELECT MAX(id) from coffee);";
        statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);
        int count = 0;
        while (resultSet.next()) {
            count = resultSet.getInt("maxx");
        }
        return count;
    }

    public int Beans() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT coffeeafter AS maxx FROM coffee where id =(SELECT MAX(id) from coffee);";
        statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);
        int count = 0;
        while (resultSet.next()) {
            count = resultSet.getInt("maxx");
        }
        return count;
    }
    public void DesConnection() throws ClassNotFoundException, SQLException{
    
    Class.forName("com.mysql.jdbc.Driver");
    conn.close();
}
    
}
