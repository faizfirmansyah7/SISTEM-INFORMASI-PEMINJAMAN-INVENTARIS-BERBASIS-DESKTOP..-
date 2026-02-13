import java.sql.Connection;
import java.sql.PreparedStatement;

public class BarangDAO {
    public void insertBarang(String nama, int jumlah, String kondisi) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "INSERT INTO barang (nama_barang, jumlah, kondisi) VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nama);
            ps.setInt(2, jumlah);
            ps.setString(3, kondisi);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
