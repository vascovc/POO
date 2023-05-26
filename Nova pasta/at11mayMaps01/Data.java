package at11mayMaps01;

public class Data implements Comparable<Data>{
	private int d,m,a;
	
	public Data(int d, int m, int a){
		this.d=d;
		this.m=m;
		this.a=a;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return String.format("%02d/%02d/%04d",d , m , a );
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + d;
		result = prime * result + m;
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
		Data other = (Data) obj;
		if (a != other.a)
			return false;
		if (d != other.d)
			return false;
		if (m != other.m)
			return false;
		return true;
	}

	@Override
	public int compareTo(Data other) {
		// TODO Auto-generated method stub
		
		return ((a>other.a) || (a==other.a && m>other.m) ||
				(a==other.a && m==other.m && d> other.d) ? 1:-1);
		
	}
	
	
}
