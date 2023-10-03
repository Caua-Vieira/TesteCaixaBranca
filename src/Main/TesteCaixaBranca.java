package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Teste {

	public static void main(String[] args) {
		//1 início
		public Connection conectarBD() {
			// 2 Entrada da função
			Connection conn = null;
			try {
				//3 Tentativa de conexão com o banco de dados
				Class.forName("com.mysql.Driver.Manager").newInstance();
				String url = "jdbc:mysql://157.0.0.1/test?user=lopes&password=123";
				conn = DriverManager.getConnection(url);
			} catch (Exception e) { }
			return conn; }
		//4 Saída da função retornando a variável 
		public String nome="";
		public boolean result = false;
		//5 Declaração de  variáveis
		public boolean verificarUsuario(String login, String senha) {
			//6 Entrada da função com  parâmetros do usuário
			String sql = "";
			public Connection conectarBD();
			//7 Construção da instrução SQL
			sql += "select nome from usuario ";
			sql += "where login = " + "'" + login + "'";
			sql += " and senha = " + "'" + senha + "';";
			try {
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				//8 Execução da instrução SQL
				if(rs.next()) {
					result = true;
					nome = rs.getString("nome");}
				} catch (Exception e) { }
			return result;
			//9 Ponto de saída da função retornando a variável 
			} //10 Saída do programa
		}

	}

