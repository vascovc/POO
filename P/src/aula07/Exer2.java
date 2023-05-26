package aula07;

public class Exer2 {
	public static void main(String[] args){
		Robot[] t1 = new Robot[3];
		t1[0] = new Robot("Antonio","GuardaRedes",2,3);
		t1[1] = new Robot("Manuel","Avancado",3,3);
		t1[2] = new Robot("Goncalo","Medio",5,4);
		Robot[] t2 = new Robot[3];
		t2[0] = new Robot("Filipe","GuardaRedes",10,16);
		t2[1] = new Robot("André","Defesa",10,1);
		t2[2] = new Robot("Joao","Avancado",9,15);
		
		Equipa equipa1 = new Equipa("Benfica","Pedro",t1);
		Equipa equipa2 = new Equipa("Porto","Miguel",t2);
		
		Bola bol = new Bola("Branca",10,10);
		
		Jogo jogo = new Jogo(equipa1,equipa2,bol);
		
		System.out.println(jogo);
		jogo.startGame();
		t1[2].move(5, 6);
		t1[2].move(10, 4);
		bol.move(3,9);
		t2[1].move(4,3);
		t2[2].move(8, 9);
		bol.move(8, 9);
		equipa1.scoreGoal(equipa2,t1[1]);
		bol.move(5,5);
		t1[0].move(7, 0);
		t2[0].move(2,3);
		equipa1.scoreGoal(equipa2, t1[2]);
		equipa2.scoreGoal(equipa1,t2[1]);
		System.out.println(jogo);
		jogo.endGame();
	}
}
