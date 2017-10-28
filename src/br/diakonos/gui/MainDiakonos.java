package br.diakonos.gui;

import java.sql.SQLException;
import java.util.Map;

import br.diakonos.persistence.DiaconoDAO;

public class MainDiakonos {
	public static void main(String[] args) {
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
