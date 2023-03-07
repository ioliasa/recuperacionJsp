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
@Table(name="country")
public class Country {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer country_Id;
	private String country;
	private LocalDate last_Update;
	@OneToMany(mappedBy="country")
	private List<City> cities = new ArrayList<City>();
	
	
	public Country(Integer countryId, String country, LocalDate lastUpdate) {
		super();
		this.country_Id = countryId;
		this.country = country;
		this.last_Update = lastUpdate;
	}
	public Country(String country, LocalDate lastUpdate) {
		super();
		this.country = country;
		this.last_Update = lastUpdate;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getCountry_Id() {
		return country_Id;
	}
	public void setCountry_Id(Integer country_Id) {
		this.country_Id = country_Id;
	}
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public LocalDate getLast_Update() {
		return last_Update;
	}
	public void setLast_Update(LocalDate last_Update) {
		this.last_Update = last_Update;
	}
	@Override
	public int hashCode() {
		return Objects.hash(country_Id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(country_Id, other.country_Id);
	}
	
	

}
