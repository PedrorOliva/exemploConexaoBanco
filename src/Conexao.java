import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
  private String URL;
  private String USUARIO;
  private String SENHA;
  private Connection CONEXAO;

  Conexao(){
    URL = "jdbc:postgresql://localhost:5432/Exemplo";
    USUARIO = "usuarioBanco"; // usuarioBanco e senhaBanco são apenas exemplos do que tem que ser colocado
    SENHA = "senhaBanco";     // nesses dois campos.

    try {
      Class.forName("org.postgresql.Driver");
      CONEXAO = DriverManager.getConnection(URL, USUARIO, SENHA);
      System.out.println("Banco de dados conectado!");
    } catch (SQLException | ClassNotFoundException e){
      e.printStackTrace();
    }
  }
}

