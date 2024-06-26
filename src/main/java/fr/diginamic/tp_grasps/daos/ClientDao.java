package fr.diginamic.tp_grasps.daos;

import java.util.List;
import java.util.Optional;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.ClientPremium;

public class ClientDao {

	private static Client[] clients = {new ClientPremium("1"), new ClientPremium("2"), new Client("3")};
	
	public Client extraireClient(String id) {
		
		Optional<Client> opt = List.of(clients).stream().filter(c->c.getIdentifiantClient().equals(id)).findAny();
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

}
