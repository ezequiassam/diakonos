package diakonos;

import java.sql.SQLException;
import java.util.Map;

import org.junit.Test;

import br.diakonos.persistence.DiaconoDAO;

public class DiaconoDaoTest {

	@Test
	public void selectTest() {
		DiaconoDAO diaconoDAO = new DiaconoDAO();
		Map<String, Object> map;
		try {
			map = diaconoDAO.findAll();
			for(Object s:map.values()) {
				System.out.println(s);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
