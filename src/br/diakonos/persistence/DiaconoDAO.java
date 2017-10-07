package br.diakonos.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import br.diakonos.domain.Diacono;

public class DiaconoDAO extends JDBCController {
	private final String INSERT = "select d.id,d.nome,d.nascimento,d.identidade from diacono d";

	// FIXME FAZER O CRUD BASICO DE CADA OBJETO
	public Map<String, Object> findAll() throws ClassNotFoundException, SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(INSERT);
		Map<String, Object> result = getDataSource(sql.toString());
		return result;
	}

	@Override
	protected Object classulaToGet(ResultSet rs, String colName) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


}
