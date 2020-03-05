import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao extends Config implements Ads {
    private Connection connection;

    public MySQLAdsDao() throws SQLException {
        Config config = new Config();
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
        );
        System.out.println("Database connection successful.");
    }

    @Override
    public List<Ad> all() throws SQLException {
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM ads";
        ResultSet rs = statement.executeQuery(query);
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(new Ad(
                    rs.getLong(1),
                    rs.getLong(2),
                    rs.getString(3),
                    rs.getString(4)

            ));
        }
        return ads;
    }

    @Override
    public List<Ad> getAllByUser(long userId) throws SQLException {
        return null;
    }

    @Override
    public List<Ad> getAdsByCategory(String category) throws SQLException {
        return null;
    }

    @Override
    public Ad retrieve(long id) throws SQLException {
        String query = "SELECT * FROM ads";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        rs.absolute((int) id);
        return null;
    }

    @Override
    public boolean update(Ad ad) {
        return false;
    }

    @Override
    public boolean delete(long id) throws SQLException {
        return false;
    }

//    @Override
//    public boolean delete(long id) {
//        int val = 0;
//        try {
//            Statement statement = connection.createStatement();
//            String query = "DELETE FROM ads WHERE id = " + id;
//            val = statement.executeUpdate(query);
//            return val > 0;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return val;
//    }

//    @Override
//    public boolean refresh(Ad ad) {
//        return false;
//    }
//
//    @Override
//    public boolean update(Ad ad) {
//        return false;
//    }

    @Override
    public Long insert(Ad ad) {
        try {
            String insertQuery = String.format("INSERT INTO ads (user_id, title, description) VALUES ('%d', '%s', '%s')",
                    ad.getUserId(),
                    ad.getTitle(),
                    ad.getDescription()
            );
            Statement statement = connection.createStatement();
            return (long) statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ad could not be created (SQL exception).");
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
        MySQLAdsDao dao = new MySQLAdsDao();
//        Ad newAd = new Ad(3, "Lawn care", "Lawn care needed.");
//        dao.insert(newAd);
        List<Ad> ads = dao.all();
        for (Ad ad:ads){
            System.out.println(ad.getTitle());
        }
    }


}
