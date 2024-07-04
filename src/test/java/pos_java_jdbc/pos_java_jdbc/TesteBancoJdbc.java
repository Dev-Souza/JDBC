package pos_java_jdbc.pos_java_jdbc;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.UserPosJava;

public class TesteBancoJdbc {

	@Test
	public void initBanco() throws SQLException {
		UserPosDAO userPosDAO = new UserPosDAO();
		UserPosJava userPosJava = new UserPosJava();

		userPosJava.setId(5L);
		userPosJava.setNome("Paulo Nunes");
		userPosJava.setEmail("paulo.nunes@gmail.com");

		userPosDAO.salvar(userPosJava);
	}

	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();
		try {
			List<UserPosJava> list = dao.listar();

			for (UserPosJava userPosJava : list) {
				System.out.println(userPosJava);
				System.out.println("-----------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void initBuscar() {

		UserPosDAO dao = new UserPosDAO();

		try {
			UserPosJava userPosJava = dao.buscar(5L);
			
			System.out.println(userPosJava);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
