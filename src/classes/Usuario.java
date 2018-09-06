package classes;

/**
 *
 * @author José Flávio
 */
public class Usuario {
    
    private String nome;
    private String matricula;
    private String senha;

    public Usuario() {
        this.nome = "Admin";
        this.matricula = "AC2018";
        this.senha = "s1234";
    }

      
    public boolean validarSenha(String senha){
        if (senha.length()== 5 && !senha.isEmpty())
            return true;
        else
            return false;
    }
    
    public boolean validarMatricula(String matricula){
        if (matricula.length()== 6)
            return true;
        else
            return false;
    }
    
    public boolean efetuarlogin(String matricula, String senha){
        if (this.matricula.equals(matricula) && this.senha.equals(senha))
            return true;
        else
            return false;
        }
    }
    

