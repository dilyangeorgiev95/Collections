package Comparators;

import java.util.Comparator;

import Bulgaria.Team;

public class MatchPlayedComparator  implements Comparator<Team>{

	@Override
	public int compare(Team o1, Team o2) {
		if(o1.getMatchPlayed()==o2.getMatchPlayed()) {
			if(o1.getPoints()==o2.getPoints()) {
				if(o1.getGoalDifference()==o2.getGoalDifference()) {
					if(o1.getScoreGoals()==o2.getScoreGoals()) {
						return o1.getName().compareTo(o2.getName());
					}
					return o1.getScoreGoals()-o2.getScoreGoals();
				}
				return o1.getGoalDifference()-o2.getGoalDifference();
			}
			return o1.getPoints()-o2.getPoints();
		}
		return o1.getMatchPlayed() - o2.getMatchPlayed();
	}
	
}
