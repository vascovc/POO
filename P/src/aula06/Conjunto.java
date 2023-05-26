package aula06;

import java.util.Arrays;

public class Conjunto {
	private int[] v;

	public Conjunto() {
		int[] bas = new int[0];
		v = bas;
	}
	public Conjunto(int[] n) {
		v = n;
	}
	public void insert(int n) { // ver se o conjunto tem o numero
		if(contains(n)) {
			return;
		}
		else {// nao tem entao o conjunto recria-se como sendo um com mais um elemento
			int[] copy = new int[v.length+1];
			System.arraycopy(v, 0, copy, 0, v.length);//copia-se o array para o copy
			copy[v.length] = n;
			v = copy;			
		}
	}
	public boolean contains(int n) {
		for(int i = 0;i<v.length;i++) {
			if (v[i] == n)
				return true;
		}
		return false;
	}
	public void remove(int n) {
		int[] fin = new int[v.length-1];//menos o elemento a ser removido
		int count = 0;
		if(contains(n)) {
			for(int i = 0;i<v.length;i++) {
				if (v[i] != n) {
					fin[count]=v[i];//vamos acrescentando os que nao sao o para remover
					count++;
				}
			}
			v = fin;
		}
		else
			return;
			
	}
	void empty() {
		int[] fin = new int[v.length];//cria-se o vetor das mesmas dimensões
		v = fin;
	}
	
	@Override
	public String toString() {
		String ab = "";
		for(int i=0;i<v.length;i++) {
			if(v[i]!=0)
				ab += v[i]+" ";
		}
		return ab;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(v);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conjunto other = (Conjunto) obj;
		if (!Arrays.equals(v, other.v))
			return false;
		return true;
	}
	public int size() {
		int count = 0;
		for(int i=0;i<v.length;i++) {
			if(v[i]!=0)
				count++;
		}
		return count;
	}
	public int[] getConjunto() {
		return v;
	}
	public void setConjunto(int[] c) {
		v = c;
	}
	public Conjunto unir(Conjunto add) {
		Conjunto uniao = new Conjunto(v);// cria-se uma copia para nao alterar o original
		int[] ad = add.getConjunto();// fica se com o array
		for(int i = 0;i<ad.length;i++) {
			uniao.insert(ad[i]);// mete se tudo o que vier porque o insert ja ve se o elemento ja la esta
		}
		return uniao;	
	}
	public Conjunto subtrair(Conjunto dif) {
		int[] d = dif.getConjunto();// obtem se o array
		Conjunto d2 = new Conjunto(v);// cria se o novo conjunto com os objetos do proprio
		for(int i=0;i<d.length;i++) {// percorre-se o array
			if(this.contains(d[i]))// se o proprio contem o elemento entao 
				d2.remove(d[i]);//tira se
		}
		return d2;
	}
	public Conjunto interset(Conjunto inter) {
		int[] i1 = inter.getConjunto();//obtem se o array
		Conjunto i2 = new Conjunto();// criamos um novo conjunto
		for(int i = 0;i<i1.length;i++) {// percorre se array
			if(this.contains(i1[i]))// se o proprio contiver o objeto do array
				i2.insert(i1[i]);// mete-se no novo conjunto
		}
		return i2;
	}
	
	public static void main(String[] args) {
		Conjunto c1 = new Conjunto();
		c1.insert(4); 
		c1.insert(7); 
		c1.insert(6); 
		c1.insert(5);
		Conjunto c2 = new Conjunto();
		int[] test = { 7, 3, 2, 5, 4, 6, 7};
		for (int el : test) c2.insert(el);
		c2.remove(3); c2.remove(5); c2.remove(6);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("Número de elementos em c1: " + c1.size());
		System.out.println("Número de elementos em c2: " + c2.size());
		System.out.println("c1 contém 6?: " + ((c1.contains(6) ? "sim" : "não")));
		System.out.println("c2 contém 6?: " + ((c2.contains(6) ? "sim" : "não")));
		//System.out.println(c1);
		//System.out.println(c2);
		System.out.println("União:" + c1.unir(c2));
		//System.out.println(c1);
		//System.out.println(c2);
		System.out.println("Interseção:" + c1.interset(c2));
		//System.out.println(c1);
		//System.out.println(c2);
		System.out.println("Diferença:" + c1.subtrair(c2));
		//System.out.println(c1);
		//System.out.println(c2);
		c1.empty();
		System.out.println("c1:" + c1);
		}
}
