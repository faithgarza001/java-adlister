import java.sql.SQLException;
import java.util.List;
//this is a collection of things that you do to an ad or a group of ads better appropriately named ads manager
public interface Ads {
    // get a list of all the ads
    List<Ad> all() throws SQLException;

    Long insert(Ad ad);

//    List<Ad> allSortedByTitle();
//
    List<Ad> getAllByUser(long userId) throws SQLException;
//
    List<Ad> getAdsByCategory(String category) throws SQLException;
//







    //Below here you will create your crud functionality


    Ad retrieve(long id) throws SQLException;

    boolean update(Ad ad);

//    boolean refresh(Ad ad);

    boolean delete(long id) throws SQLException;


}
