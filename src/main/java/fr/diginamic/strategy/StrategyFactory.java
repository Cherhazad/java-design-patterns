package fr.diginamic.strategy;

public class StrategyFactory {

	public static Strategy getStrategy(TypeStrategy typeStrategy) {

		if (typeStrategy == null) {
			return null;
		}
		
		switch (typeStrategy) {

		case BUBBLE:
			return new StrategyBubble();

		case INSERTION:
			return new StrategyInsertion();

		case DEFAUT:
			return new StrategyDefaut();

		default:
			return null;
		}
		


	}
	
}
