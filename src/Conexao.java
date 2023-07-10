import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
  private String URL;
  private String USUARIO;
  private String SENHA;
  private Connection CONEXAO;

  Conexao(){
    URL = "jdbc:postgresql://localhost:5432/Exemplo";
    USUARIO = "usuarioBanco";
    SENHA = "senhaBanco";

    try {
      Class.forName("org.postgresql.Driver");
      CONEXAO = DriverManager.getConnection(URL, USUARIO, SENHA);
      System.out.println("Banco de dados conectado!");
    } catch (Exception e){
      e.printStackTrace();
    }
  }
}

