package aula06;

public class Test {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Aluno al = new Aluno ("Andreia Melo", 9855678,
							   new Data(18, 7, 1990), new Data (1, 9, 2018));
		Bolseiro bls = new Bolseiro ("Igor Santos", 8976543, new Data(11, 5, 1985));
										bls.setBolsa(1050);
		System.out.println("Bolseiro: "+al.getName());
		System.out.println(al);
		System.out.println("Bolseiro: "+ bls.getName() + ", NMec: "
							+ bls.getNMec() + ", Bolsa:" + bls.getBolsa());
		System.out.println(bls);
		Pessoa p1 = new Aluno("Andreia Melo", 9855678,
							   new Data(18, 7, 1990), new Data (1, 9, 2018));
		Pessoa p2 = new Bolseiro("Igor Santos", 8976543, new Data(11, 5, 1985));bls.setBolsa(1050);
		p2=p1;
		
	}
}
