package aula07;

public class Alojamento {
	//codigo, nome, local, preco, disponibilidade, avaliacao
	private String code,nome,local;
	private double price;
	private boolean disponibilidade;
	private double rating;
	
	private int count = 0; //numero de visitantes
	private double total_points_rating=0; //numero de ratings para fazer media
		
	public Alojamento(String code, String nome, String local, double price, boolean disponibilidade) {//ao criar nao faz sentido dar rating
		this.code = code;
		this.nome = nome;
		this.local = local;
		this.price = price;
		this.disponibilidade = disponibilidade;
	}
	public Alojamento(String code, String nome, String local, double price) {
		this(code,nome,local,price,true);
	}
	
	public void setPrice(double valor) {
		price=valor;
	}
	public void setDisponibilidade(boolean availability) {
		disponibilidade = availability;
	}
	public void setRating(double rating) {
		if(rating>5 || rating <1) {
			this.rating = rating;
			total_points_rating+=rating;
			rating = total_points_rating/++count;
		}
		else
			System.out.println("Rating inválida, introduza um valor entre 1.0 e 5.0");
	}	
	public void setNome(String nome) {//se mudar de nome
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCode() {
		return code;
	}
	public String getLocal() {
		return local;
	}
	public double getPrice() {
		return price;
	}
	public boolean getDisponibilidade() {
		return disponibilidade;
	}
	public double getRating() {
		return rating;
	}
	
	@Override
	public String toString() {
		return "Alojamento: " + code + ", Nome: " + nome + ", Local: " + local + ", Price: " + price
				+ ", Disponibilidade: " + disponibilidade + ", Rating: " + rating;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + count;
		result = prime * result + (disponibilidade ? 1231 : 1237);
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(total_points_rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Alojamento other = (Alojamento) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (count != other.count)
			return false;
		if (disponibilidade != other.disponibilidade)
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
			return false;
		if (Double.doubleToLongBits(total_points_rating) != Double.doubleToLongBits(other.total_points_rating))
			return false;
		return true;
	}

}
