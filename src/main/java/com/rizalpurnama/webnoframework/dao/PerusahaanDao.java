package com.rizalpurnama.webnoframework.dao;

import com.rizalpurnama.webnoframework.domain.Perusahaan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class PerusahaanDao {

    private final static String SQL_INSERT = "insert into perusahaan (id, kode, nama) values (?,?,?)";
    private Connection connection;

    public PerusahaanDao(Connection connection) {
        this.connection = connection;
    }

    public void simpan(Perusahaan p){

        try (PreparedStatement ps = connection.prepareStatement(SQL_INSERT);) {
            ps.setString(1, UUID.randomUUID().toString());
            ps.setString(2, p.getKode());
            ps.setString(3, p.getNama());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
