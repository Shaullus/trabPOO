import java.util.*;
class Jogador extends Pessoa{
  
  Scanner sc = new Scanner(System.in);
  
  private int numEsc;  //numero escolhido
  private int pontosVida;

  public Jogador(){
    this.numEsc = -1;
    this.pontosVida= 3;
  }

  public Jogador(String nome,int numEsc){
    super(nome);
    
    while(numEsc<0 || numEsc>20){
      System.out.println("número invalido,só aceita numeros entre 0 e 20");
      numEsc = sc.nextInt();
    }
    this.numEsc = numEsc;
    this.pontosVida = 3 ;
  }


  
  public void setNumEsc(int numEsc){
    while(numEsc<0 || numEsc>20){
      System.out.println("número invalido,só aceita numeros entre 0 e 20");
      numEsc = sc.nextInt();
    }
    this.numEsc = numEsc;
  }

  public int getNumEsc(){
    return numEsc;
  }

  public int getPontosVida(){
    return pontosVida;
  }

  void perderVida(){
    this.pontosVida = pontosVida -1;
  }
  
}