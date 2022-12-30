package com.example.AplikacjaBDBT.baza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SprzedazeDAO {
    private final JdbcTemplate jdbcTemplate;

    public List<Sprzedaz> list(){
        String sql = "SELECT * FROM SPRZEDAZE";

        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Sprzedaz.class));
    }
    public void save(Sprzedaz sale) {
    }
    public Sprzedaz get(int id) {
        return null;
    }
    public void update(Sprzedaz sale) {
    }
    public void delete(int id) {
    }

    public SprzedazeDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
}
