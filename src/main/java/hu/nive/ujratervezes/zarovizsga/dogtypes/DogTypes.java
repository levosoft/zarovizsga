package hu.nive.ujratervezes.zarovizsga.dogtypes;

import org.flywaydb.core.Flyway;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DogTypes {

    private DataSource dataSource;

    public DogTypes(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public List<String> getDogsByCountry(String country){
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pst = conn.prepareStatement("SELECT name FROM dog_types WHERE country = ?"))
        {
            pst.setString(1, country.toUpperCase());

            return selectByPreparedStatement(pst);

        }catch (SQLException se){
            throw new IllegalStateException("Cannot select", se);
        }
    }

    private List<String> selectByPreparedStatement(PreparedStatement pst) {

        List<String> names = new ArrayList<>();
        try (ResultSet rs = pst.executeQuery())
        {
            while (rs.next()){
                String name = rs.getString("name");
                names.add(name.toLowerCase());
            }

            Collections.sort(names, Collator.getInstance());
            return names;

        }catch (SQLException sqle){
            throw new IllegalStateException("Cannot query", sqle);
        }
    }

}
