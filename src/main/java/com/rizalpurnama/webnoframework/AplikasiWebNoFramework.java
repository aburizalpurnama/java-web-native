package com.rizalpurnama.webnoframework;

import com.rizalpurnama.webnoframework.dao.PerusahaanDao;
import com.rizalpurnama.webnoframework.domain.Perusahaan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AplikasiWebNoFramework {
    public static void main(String[] args) {
        Perusahaan p = new Perusahaan();
        p.setKode("P-001");
        p.setNama("PT.Catur Mitra Sejati Sentosa");

        String url = "jdbc:mysql://localhost/dbwebnoframework";
        String username = "dbwebnoframework";
        String password = "admin";

        try(Connection conn = DriverManager.getConnection(url, username, password)) {
            PerusahaanDao pd = new PerusahaanDao(conn);
            pd.simpan(p);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
