package fr.diginamic.tp_grasps.beans;

import javax.persistence.Entity;

@Entity
public class ClientPremium extends Client {

	public ClientPremium(String identifiantClient) {
		super(identifiantClient);
	}

	@Override
	public double applyReduction(double montant, double pourcentageReduction) {
		return montant * (1 - pourcentageReduction / 100.0);
	}

}
