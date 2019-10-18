package Comparators;

import java.util.Comparator;

import Bulgaria.Team;

public class NamesComparator  implements Comparator<Team>{

	@Override
	public int compare(Team o1, Team o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
