package ie.rufino.controller;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ie.rufino.entity.BeerEntity;
import ie.rufino.http.Beer;
import ie.rufino.repository.BeerRepository;

@Path("/service")
public class ServiceController {

	private final BeerRepository repository = new BeerRepository();
	
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/randomBeer")
	public Beer randomBeer(){
		
		List<BeerEntity> randomBeer = repository.randomBeer();
		Beer beer = new Beer();
		if (!randomBeer.isEmpty()){
			Collections.shuffle(randomBeer);
			for (BeerEntity beerEntity : randomBeer) {
				beer = new Beer(beerEntity.getName(), 
						beerEntity.getDescription(), beerEntity.getAlcohol(), 
						beerEntity.getBreweryLocation());
				break;
			}
			
		}
		
		return beer;
	}
}
