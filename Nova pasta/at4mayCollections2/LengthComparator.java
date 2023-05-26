package at4mayCollections2;

import java.util.Comparator;

  
class LengthComparator implements Comparator<String> {
	   
	@Override 
	public int compare(String a, String b) {       
	return (a.length() > b.length() ? 1: -1);	 
	}		
}
