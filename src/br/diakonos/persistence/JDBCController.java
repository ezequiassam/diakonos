package br.diakonos.persistence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import br.diakonos.security.Log;

public abstract class JDBCController extends AbstractDAO {

	protected Map<String, Object> getDataSource(String sql) throws SQLException, ClassNotFoundException {
		Log.setLog(sql);
		ResultSet rs = null;
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		try (PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {
			rs = preparedStatement.executeQuery();
			List<String> colNames = getColNames(rs);
			map.putAll(convertResultSetToObject(rs, colNames));
		}

		return map;

	}

	private Map<String, Object> convertResultSetToObject(ResultSet rs, List<String> colNames)
			throws SQLException {
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		while (rs.next()) {
			// HashMap<String, Object> map = new HashMap<String, Object>();
			Object value = null;
			for (String colName : colNames) {
				value = classulaToGet(rs, colName);
				map.put(colName, value);
			}
		}
		return map;
	}

	private List<String> getColNames(ResultSet rs) throws SQLException {
		ResultSetMetaData rsmd = rs.getMetaData();
		List<String> colNames = new ArrayList<String>();

		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			colNames.add(rsmd.getColumnName(i));
		}
		return colNames;
	}

	// Condições para pegar ResultSet fazer
	abstract protected Object classulaToGet(ResultSet rs, String colName) throws SQLException;
}
