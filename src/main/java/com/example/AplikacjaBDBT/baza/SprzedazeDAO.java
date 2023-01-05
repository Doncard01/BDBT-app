package com.example.AplikacjaBDBT.baza;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SprzedazeDAO {
    private final JdbcTemplate jdbcTemplate;

    public List<Sprzedaz> list(){
        String sql = "SELECT * FROM SPRZEDAZE";
        List<Sprzedaz> listSprzedaze = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Sprzedaz.class));

        for (Sprzedaz sprzedaz : listSprzedaze) {
            String data = sprzedaz.getDATA_SPRZEDAZY();
            data = data.substring(0, 10);
            sprzedaz.setDATA_SPRZEDAZY(data);
        }

        return listSprzedaze;
    }
    public void save(Sprzedaz sprzedaz) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("SPRZEDAZE").usingColumns("DATA_SPRZEDAZY", "NR_PRACOWNIKA", "NR_SAMOCHODU", "NR_KLIENTA");

        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sprzedaz);
        insertActor.execute(param);
    }
    public Sprzedaz get(String data_sprzedazy) {
        String sql = "SELECT * FROM SPRZEDAZE WHERE DATA_SPRZEDAZY = ?";
        Object[] args = {data_sprzedazy};
        return jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(Sprzedaz.class));
    }

    public Sprzedaz get1(String data_sprzedazy) {
        Object[] args = {data_sprzedazy};
        String sql = "SELECT * FROM SPRZEDAZE WHERE DATA_SPRZEDAZY = " + args[0];
        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Sprzedaz.class));
    }
    public void update(Sprzedaz sprzedaz) {
        String sql = "UPDATE SPRZEDAZE SET NR_PRACOWNIKA=:NR_PRACOWNIKA, NR_SAMOCHODU=:NR_SAMOCHODU, NR_KLIENTA=:NR_KLIENTA WHERE DATA_SPRZEDAZY=:DATA_SPRZEDAZY";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sprzedaz);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);
    }
    public void delete(int id) {
    }

    public SprzedazeDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
}
