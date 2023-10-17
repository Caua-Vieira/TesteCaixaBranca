package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Cauã Vieira
 * Esta classe representa uma tentativa de conexão ao banco de dados
 */
public class Teste {

    /**
     * Método para estabelecer uma conexão com o banco de dados.
     *
     * @return A conexão com o banco de dados ou null se ocorrer um erro.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Carrega o driver do MySQL
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Mostra a StackTrace na tela ou poderia haver uma tratativa de exceções
            e.printStackTrace();
        }
        /**
         * @return A conexão com o banco de dados ou null se ocorrer um erro
         */
        return conn;
    }

    // Variáveis 
    public String nome = "";
    public boolean result = false;

    /**
     * Método para verificar um usuário no banco de dados.
     *
     * @param login O nome de usuário a ser verificado.
     * @param senha A senha do usuário a ser verificado.
     * @return true se o usuário existe no banco de dados, caso contrário, false.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();

        // Instrução SQL para consultar o banco de dados
        sql += "select nome from usuario ";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';";

        try {
        	// Cria um objeto Statement para executar consultas SQL
            Statement st = conn.createStatement();
            // Executa a consulta SQL e armazena o resultado em um objeto ResultSet
            ResultSet rs = st.executeQuery(sql);
            // Verifica se há algum resultado para definir o resultado
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
        	// Mostra a StackTrace na tela ou poderia haver uma tratativa de exceções
            e.printStackTrace();
        }
        /**
         * @return o resultado se há algum registro C
         */
        return result;
    }
}
