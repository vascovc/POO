package aula07;

public class Robot extends MovableObject{
	private String id, type;
	private int goal_score = 0;
	
	public Robot(String id,String type,int x, int y) {
		super(x,y);
		this.id = id;
		this.type = type;
	}
	
	public void scoreGoal() {
		goal_score++;
	}
	//apesar de ele poder mudar de posição durante o jogo julgo que não faz sentido
	public String getType() {
		return type;
	}
	public String getId() {
		return id;
	}
	public int getGoal_score() {
		return goal_score;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + goal_score;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robot other = (Robot) obj;
		if (goal_score != other.goal_score)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ID: " + id + ", Tipo: " + type + ", Golos Marcados: " + goal_score+", Distância percorrida: " + getDist();
	}
	
	
}
