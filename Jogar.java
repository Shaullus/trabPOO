import java.util.*;

class Jogar implements Jogo{

  Jogador p1 = new Jogador();
  Jogador p2 = new Jogador();
  
  ArrayList <Integer> num   = new ArrayList();
  
  Scanner sc = new Scanner(System.in);

  
private int numeroAleatorioSorteado(int min, int max){
  
  Random numAleatorio = new Random();
  int randomNum = numAleatorio.nextInt((max - min) + 1) + min;
  return randomNum;
  
}

public void jogar(){
  
    int numeroSorteado = numeroAleatorioSorteado(0,10);
    System.out.printf("player 1: ");
    p1.setNome(sc.nextLine());
    System.out.printf("player 2: ");
    p2.setNome(sc.nextLine());

    
    
    
  }
  
  
}