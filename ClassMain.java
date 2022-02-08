
import excecao.MyExcecao;
import leitura.Leitura;


/**
 *
 * Autor: Rogério dos Santos
 */
public class ClassMain {
    
    public static void testaNumero(int numero ) throws MyExcecao{
        
        if(numero > 0){
            System.out.println("Número positivo");
        }
        else
            throw new MyExcecao();
    }
    
    public static void main(String[] args){
        
        Leitura l = new Leitura();
        int numero = Integer.parseInt(l.entDados("Informe um número"));
        try{
            testaNumero(numero);
        }
        catch(MyExcecao msg){
            System.out.println("Mensagem " + msg.getMsg());
        }
        
    }
    
    
    
}
