package br.com.DGLab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ObterConexao {
	public static Connection conexao() {
		Connection conexao = null;
		
		//---------------URL------------------//
		String oracleDir = "jdbc:oracle:thin:@";
		String host = "192.168.20.57";
		String porta = "1521";
		String dataBase = "DESENV";
		String url = oracleDir + host + ":" + porta + ":" + dataBase;
		//---------------USUARIO--------------//
		String usuario = "leoferreira";
		//---------------SENHA----------------//
		String senha = "1234-leo";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conexao = DriverManager.getConnection(url, usuario, senha);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return conexao;
	}
}
