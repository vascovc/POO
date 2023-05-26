package at11mayMaps01;

import static java.lang.System.out;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

/**
 * usa HashMap e TreeMap
 *
 * tb usa subMap
 */
public class Exemplo5TstAgenda {
	public static void main(String[] args) {
	    Map<String, String> agendaH = new HashMap<String, String>();
	    
	    agendaH.put("Carlos Efe", "901232098");
	    agendaH.put("Ana R.", "903134981");
	    agendaH.put("Ana H.", "901223209");
	    agendaH.put("Julio Efe", "901226326");
	    agendaH.put("Maria K.", "908123925");
	    agendaH.put("Luis D.", "903123298");
	    agendaH.put("Luisa M.", "909152320");
	    agendaH.put("Rita M.", "907127973");
	    agendaH.put("Pedro Ene", "901342329");
	    agendaH.put("David T.", "907812432");
	    
	    // criar TreeMap com mapa agendaH
	    TreeMap<String, String> agendaT = 
	              new TreeMap<String, String>(agendaH);
	    
	    out.println("------- NOMES AGENDA HASHMAP -------");
	    int l = 0;
	    for(String n : agendaH.keySet()) {
	        out.print(" " + n); l++;
	        if( l == 6) { l = 0; out.println(); }
	    }
	    if (l != 6) { l= 0; out.println(); }
	    out.println("------- NOMES AGENDA TREEMAP --------");
	    for(String n : agendaT.keySet()) {
	      out.print(" " + n); l++;
           if( l == 6) { l = 0; out.println(); }
	    }
	    out.println(); l = 0;
	    
	    // subMap
	    SortedMap<String, String> nms = agendaT.subMap("C","M"+"\0");
	    out.println("------- NOMES [C ..M] --------");
	    for(String n : nms.keySet()) {
	      out.print(" " + n); l++;
           if( l == 6) { l = 0; out.println(); }
	    }
	    l = 0; out.println();
	    nms.clear(); 
	    
	    //SortedMap<String, String> 
	    nms = agendaT.subMap("L","M");
	    out.println("------- NOMES [L] --------");
	    for(String n : nms.keySet()) {
	      out.print(" " + n); l++;
           if( l == 6) { l = 0; out.println(); }
	    }
	    l = 0;
	    out.println("------- NOMES AGENDA TREEMAP --------");
	    for(String n : agendaT.keySet()) {
	      out.print(" " + n); l++;
           if( l == 6) { l = 0; out.println(); }
	    }
	    
    }
}