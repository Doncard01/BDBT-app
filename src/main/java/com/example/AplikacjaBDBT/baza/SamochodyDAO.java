package com.example.AplikacjaBDBT.baza;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SamochodyDAO {
    private final JdbcTemplate jdbcTemplate;

    public SamochodyDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Samochod> list(){
        String sql = "SELECT * FROM SAMOCHODY";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Samochod.class));
    }
    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Samochod samochod) {
    }
    /* Read – odczytywanie danych z bazy */
    public Samochod get(int nr_samochodu) {
        return null;
    }
    /* Update – aktualizacja danych */
    public void update(Samochod samochod) {
    }

    /* Delete – wybrany rekord z danym id */
    public void delete(int nr_samochodu) {
    }
}
