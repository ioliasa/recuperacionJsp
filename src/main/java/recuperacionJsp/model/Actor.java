package recuperacionJsp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="actor")
public class Actor {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer actor_id;
	
	private String first_name;
	private String last_name;
	private LocalDate last_update;
	
	@OneToMany(mappedBy="actor")
	private List<Live> lives = new ArrayList<Live>();
	
	
	public Actor(Integer actorId, String firstName, String lastName, LocalDate lastUpdate) {
		super();
		this.actor_id = actorId;
		this.first_name = firstName;
		this.last_name = lastName;
		this.last_update = lastUpdate;
	}
	public Actor(String firstName, String lastName, LocalDate lastUpdate) {
		super();
		this.first_name = firstName;
		this.last_name = lastName;
		this.last_update = lastUpdate;
	}
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Integer getActor_id() {
		return actor_id;
	}
	public void setActor_id(Integer actor_id) {
		this.actor_id = actor_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public LocalDate getLast_update() {
		return last_update;
	}
	public void setLast_update(LocalDate last_update) {
		this.last_update = last_update;
	}
	public List<Live> getLives() {
		return lives;
	}
	public void setLives(List<Live> lives) {
		this.lives = lives;
	}
	@Override
	public int hashCode() {
		return Objects.hash(actor_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actor other = (Actor) obj;
		return Objects.equals(actor_id, other.actor_id);
	}
	
	
		

}
