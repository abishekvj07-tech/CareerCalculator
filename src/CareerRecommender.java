import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CareerRecommender {

    public List<Career> getCareerSuggestions(String skill, String interest) {
        List<Career> suggestions = new ArrayList<>();
        String query = "SELECT * FROM careers WHERE skill LIKE ? or interest LIKE ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, "%" + skill + "%");
            ps.setString(2, "%" + interest + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                suggestions.add(new Career(
                        rs.getString("skill"),
                        rs.getString("interest"),
                        rs.getString("career")));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return suggestions;
    }
}
