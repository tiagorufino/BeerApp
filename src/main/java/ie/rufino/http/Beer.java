package ie.rufino.http;

public class Beer {

	public Beer(){
		
	}
	
	public Beer(String name, String description, String alcohol, String breweryLocation) {
		super();
		this.name = name;
		this.description = description;
		this.alcohol = alcohol;
		this.breweryLocation = breweryLocation;
	}
	
	private Integer codigo;
	private String  name;
	private String  description;
	private String  alcohol;
	private String  breweryLocation;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}
	public String getBreweryLocation() {
		return breweryLocation;
	}
	public void setBreweryLocation(String breweryLocation) {
		this.breweryLocation = breweryLocation;
	}

}
