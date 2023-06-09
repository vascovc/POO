package aula99_A;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class POO_P_S2 {
	public static void main(String[] args) {
		POO_P_S2 ap = new POO_P_S2();
		ap.alinea1();
		ap.alinea2();
		}
		public void alinea1() {
			Cruzeiro cruz = criarCruzeiro();
			// imprime os produtos ordenados por data
			System.out.println(cruz);
		}
		public void alinea2(){
			Cruzeiro cruz = criarCruzeiro();
			//1
			int vazio=0,count=0;
			for(Cabine c:cruz.getLista()) {
				String[] pess = c.getPassageiros();
				if(pess == null)
					vazio+=1;
				count+=1;
			}
			double val = vazio/count*100;
			System.out.printf("Cabines disponiveis para venda: %2.1f%%", val);
			//2
			
			try {
				PrintWriter writ = new PrintWriter(new File("SeaPrincess-2017.txt"));
				writ.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		public Cruzeiro criarCruzeiro() {
			String[] aux={"Lisboa","Barcelona","Rodes","Southampton"};
			Cruzeiro cr2 = new Cruzeiro("Sea Princess", aux , "22/01/2017");
			cr2.setDuracao(11);
			CabineComJanela ccj = new CabineComJanela(17, 2, TipoDeJanela.INTERIOR);
			ccj.setPassageiros(new String("Maria Luz;Manuel Luz").split(";"));
			ccj.pacoteExtra(Extra.Spa); cr2.add(ccj);
			cr2.add(new CabineComJanela(15, 4, TipoDeJanela.INTERIOR,new String("Ant�nio Campos;Maria Campos;Marina Mota").split(";")));
			cr2.add(new CabineComJanela(25, 2, TipoDeJanela.INTERIOR,"Anonymous1;Anonymous2".split(";")));
			cr2.add(new CabineComJanela(4, 4, TipoDeJanela.MAR, new String("Ursula Magnusson and Matts Magnusson and Miki Rosberg and Charles Sean").split(" and ")));
			Suite suite1=new Suite(100, 2); suite1.setNumQuartos(3);
			suite1.setMaxOcupantes(2*3); cr2.add(suite1);
			Suite s=new Suite(102, 6); s.setNumQuartos(3); cr2.add(s);
			s.setPassageiros(new String("A. Jolie:B. Pitt:Shiloh:Knox Leon").split(":"));
			CabineComVaranda cab=new CabineComVaranda(21, 1, TipoDeVaranda.VISTA_LIVRE);
			cab.setTipoVaranda(TipoDeVaranda.OBSTR_PARCIAL);
			cab.pacoteExtra(Extra.Desporto);
			try {
				cab.setPassageiros(new String("Paulo Portas;J�lia Portas").split(";"));
				cr2.add(cab);
			} catch (IllegalArgumentException e){
				System.out.println("N�o adicionado devido a excesso de ocupantes !!");
			}
			Cabine eo = new CabineComJanela(1,4,TipoDeJanela.MAR,"Marcelo R. de Sousa".split(";"));
			cr2.add(eo);
			cr2.add(new CabineComJanela(130,4,TipoDeJanela.MAR));
			cr2.add(new CabineComJanela(131,4,TipoDeJanela.INTERIOR));
			return cr2;

		}
}
