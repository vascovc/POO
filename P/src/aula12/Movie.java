package aula12;

public class Movie implements Comparable<Movie>{
	private String name, rating,genre;
	private double score;
	private int runningTime;
	
	public Movie(String name, double score, String rating, String genre, int runningTime) {
		this.name = name;this.score=score;this.rating=rating;this.genre=genre;this.runningTime=runningTime;
	}

	public String getName() {
		return name;
	}

	public String getRating() {
		return rating;
	}

	public String getGenre() {
		return genre;
	}

	public double getScore() {
		return score;
	}

	public int getRunningTime() {
		return runningTime;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + runningTime;
		long temp;
		temp = Double.doubleToLongBits(score);
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
		Movie other = (Movie) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (runningTime != other.runningTime)
			return false;
		if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("%-37s %-6s %-7s %-12s %-3d\n",name,score,rating,genre,runningTime);
	}
	
	@Override
	public int compareTo(Movie o) {//o to lower case e pela situa�ao que o enunciado me induz a ver que e por ordem alfabetica, ou seja minusculas e maisculas sao equivalentes
		return name.toLowerCase().compareTo(o.getName().toLowerCase());//usar o compare de strings
	}	
}
