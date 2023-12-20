package domein;

import java.util.List;

import persistentie.EdeleMapper;

public class EdeleRepository {
	private final EdeleMapper mapper;
	
	public EdeleRepository() {
		mapper = new EdeleMapper();
	}
	
	public List<Edele> geefEdelen(){
		List<Edele>lijstEdele = mapper.lijstEdelen();
		return lijstEdele;
	}
}