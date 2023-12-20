package persistentie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domein.Speler;

public class SpelerMapper {
	private static final String INSERT_SPELER = "INSERT INTO ID399796_g050.Speler (gebruikersnaam, geboortejaar)"
            + "VALUES (?, ?)";
	
	public Speler geefSpeler(String gn,int gj) {
		Speler speler = null;
		try(Connection conn = DriverManager.getConnection(Connectie.JDBC_URL)){
			
	 		PreparedStatement query = conn.prepareStatement("SELECT * FROM ID399796_g050.Speler WHERE gebruikersnaam = ? AND geboortejaar = ?");
	 		query.setString(1, gn);
			query.setInt(2,gj);
			try (ResultSet rs = query.executeQuery()) {
				if (rs.next()) {
					String gebruikersnaam = rs.getString("gebruikersnaam");
		            int geboortejaar = rs.getInt("geboortejaar");
		            speler = new Speler(gebruikersnaam,geboortejaar);
		        }
			}
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
		return speler;
	}
	
	public void voegToe(Speler speler) {
        try (
                Connection conn = DriverManager.getConnection(Connectie.JDBC_URL);
                PreparedStatement query = conn.prepareStatement(INSERT_SPELER)) {
	            query.setString(1, speler.getGebruikersnaam());
	            query.setInt(2, speler.getGeboortejaar());
	            query.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}