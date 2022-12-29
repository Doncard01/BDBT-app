package com.example.AplikacjaBDBT;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class SamochodyDAO {
    private JdbcTemplate jdbcTemplate;

    public SamochodyDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Samochod> list(){
        String sql = "SELECT * FROM SAMOCHODY";
        List<Samochod> listSamochod = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Samochod.class));
        return listSamochod;
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
