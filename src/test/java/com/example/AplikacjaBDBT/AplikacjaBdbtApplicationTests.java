package com.example.AplikacjaBDBT;

import com.example.AplikacjaBDBT.baza.Samochod;
import com.example.AplikacjaBDBT.baza.SamochodyDAO;
import com.example.AplikacjaBDBT.baza.Sprzedaz;
import com.example.AplikacjaBDBT.baza.SprzedazeDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AplikacjaBdbtApplicationTests {
	private SprzedazeDAO dao;
	private SamochodyDAO daoSamochody;

	@BeforeEach
	void setUp() throws Exception {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
		dataSource.setUsername("BDBTGRB02");
		dataSource.setPassword("BDBTGRB02");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");

		dao = new SprzedazeDAO(new JdbcTemplate(dataSource));
		daoSamochody = new SamochodyDAO(new JdbcTemplate(dataSource));
	}

	@Test
	void testList() {
		List<Sprzedaz> listSprzedaz = dao.list();
		List<Samochod> listSamochod = daoSamochody.list();

		assertTrue(listSprzedaz.size() > 0); //w bazie na pewno są już jakieś sprzedaże
		assertTrue(listSamochod.size() > 0); //w bazie na pewno są już jakieś samochody
	}

}
