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
	private SprzedazeDAO SprzedazeDAO;
	private SamochodyDAO SamochodyDAO;

	@BeforeEach
	void setUp() throws Exception {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
		dataSource.setUsername("BDBTGRB02");
		dataSource.setPassword("BDBTGRB02");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");

		SprzedazeDAO = new SprzedazeDAO(new JdbcTemplate(dataSource));
		SamochodyDAO = new SamochodyDAO(new JdbcTemplate(dataSource));
	}

	@Test
	void testList() {
		List<Sprzedaz> listSprzedaz = SprzedazeDAO.list();
		List<Samochod> listSamochod = SamochodyDAO.list();

		assertTrue(listSprzedaz.size() > 0); //w bazie na pewno są już jakieś sprzedaże
		assertTrue(listSamochod.size() > 0); //w bazie na pewno są już jakieś samochody
	}

	@Test
	void testSprzedazSave() {
		Sprzedaz sprzedaz = new Sprzedaz();

		sprzedaz.setDATA_SPRZEDAZY("2023-01-03");
		sprzedaz.setNR_PRACOWNIKA(44);
		sprzedaz.setNR_SAMOCHODU(8);
		sprzedaz.setNR_KLIENTA(3);

		SprzedazeDAO.save(sprzedaz);
	}

	@Test
	void testGet() {
		String data_sprzedazy = "2023-01-03";
		Sprzedaz sprzedaz = SprzedazeDAO.get(data_sprzedazy);

		assertNotNull(sprzedaz);
	}

	@Test
	void testUpdate() {
		Sprzedaz sprzedaz = new Sprzedaz();

		sprzedaz.setDATA_SPRZEDAZY("2023-01-03");
		sprzedaz.setNR_PRACOWNIKA(44);
		sprzedaz.setNR_SAMOCHODU(13);
		sprzedaz.setNR_KLIENTA(3);

		SprzedazeDAO.update(sprzedaz);
	}

}
