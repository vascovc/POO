package aula08;

public class Exer1 {
	@SuppressWarnings("unused")
	public static void main(String[]args) {
		Veiculo v1 = new Motociclo("88-00-BB","Susuki","Ade",350,"desportivo");
		Veiculo v2 = new Automovel_Ligeiro("43-56-AB","Opel","Corsa",1500,33456,50);
		Veiculo v3 = new Taxi("AB-11-98","Mercedes","Classe E",1900,8900,80,789);
		Veiculo v4 = new Pesado_Mercadorias("FF-45-12","Volvo","tipo3",6000,456,4000,3000);
		Veiculo v5 = new Pesado_Passageiro("45-GH-67","Renault","tipoA",4000,345,2900,34);
		Veiculo v6 = new Motociclo("ED-89-96","Honda","50cc",50,"estrada");
		Veiculo v7 = new Automovel_Ligeiro("FG-56-59","Honda","Type-R",2000,69000,30);
		Veiculo[] v = {v1,v2,v3,v4,v5,v6,v7};
		Empresa emp = new Empresa("Aluguer Barato","3000-234","aluguerbarato@ua.pt",v);
		
		String classe = v5.getModelo();
		double cilindrada = v3.getCilindrada();
		String codigo_postal = emp.getCodigo_postal();
		emp.setCodigo_postal("5005-298");
		v1.trajeto(20);
		v3.trajeto(60);
		v5.trajeto(120);
		v6.trajeto(15);
		v1.trajeto(60);
		System.out.println("O ultimo trajeto da viatura "+v1+"foi de"+v1.ultimoTrajeto());
		System.out.println("A viatura com mais quilometros: "+emp.maisQuilometros());
		
		String new_email = "asfas@ua.pt";
		if(checkEmail(new_email)) emp.setEmail(new_email);
		System.out.println(emp.getEmail());
		
		Veiculo a = new Pesado_Passageiro("FG-55-89","Mercedes","Servant",3500,650,5000,46);
		if(checkMatricula("FG-55-89"))
			emp.addVeiculo(a);
		
		System.out.println(emp);
		emp.sortCilindrada();
		emp.removeVeiculo(v4);
		emp.sortCilindrada();
	}
	public static boolean checkEmail(String s) {
		if(s.contains("@") && (s.endsWith(".com") || s.endsWith(".pt")))
			return true;
		else
			return false;
	}
	public static boolean checkMatricula(String s) {
		char[] a = s.toCharArray();
		int numbers=0,letter=0;
		for(int i=0;i<a.length;i++) {
			if (Character.isDigit(a[i]))
				numbers++;
			else if(a[i]>='A'&& a[i]<='Z')
				letter++;
		}
		if(numbers==4 && letter==2)
			return true;
		else return false;
	}
}
