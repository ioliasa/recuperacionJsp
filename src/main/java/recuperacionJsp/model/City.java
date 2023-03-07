package recuperacionJsp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="city")
public class City {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer city_id;
	private String city;
	private LocalDate last_update;
	@OneToMany(mappedBy="city")
	private List<Live> lives = new ArrayList<Live>();
	
	@ManyToOne
	@JoinColumn(name="country_id")
	private Country country;
	
	
	
	public City(Integer cityId, String city, LocalDate lastUpdate) {
		super();
		this.city_id = cityId;
		this.city = city;
		this.last_update = lastUpdate;
	}
	public City(String city, LocalDate lastUpdate) {
		super();
		this.city = city;
		this.last_update = lastUpdate;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Integer getCity_id() {
		return city_id;
	}
	public void setCity_id(Integer city_id) {
		this.city_id = city_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(city_id, other.city_id);
	}
	
	

}
