package aula10;

import java.util.HashMap;
import java.util.Map;

public class Exer1 {
	public static void main(String[] args) {
		Map<String, String> mapa = new HashMap<>();
		String a = "branco";
		String ad = "Que tem a cor da neve";
		mapa.put(a, ad);
		String b = "preto";
		String bd = "Escuro";
		mapa.put(b, bd);
		String c = "azul";
		String cd = "Cor do ceu";
		mapa.put(c, cd);
		String d = "amarelo";
		String dd = "Cor do sol";
		mapa.put(d, dd);
		String e = "verde";
		String ed = "cor da relva";
		mapa.put(e, ed);
		String f = "vermelho";
		String fd = "cor do sangue";
		mapa.put(f, fd);
		
		System.out.println(mapa);
		mapa.remove(f);
		mapa.remove(c);
		System.out.println(mapa);
		mapa.replace("branco", ad, "casca de ovo");
		mapa.replace("preto", "adb");
		System.out.println(mapa);
		
		for(Object ob:mapa.keySet()) {
			System.out.println(ob.toString() +" = " + mapa.get(ob));
		}
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
	}
}

