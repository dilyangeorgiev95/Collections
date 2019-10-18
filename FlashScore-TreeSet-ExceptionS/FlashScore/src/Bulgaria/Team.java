package Bulgaria;

public class Team{
	private short position;
	private String name;
	private int matchPlayed;
	private int wins;
	private int draws;
	private int loses;
	private int scoreGoals;
	private int defeatGoals;
	private int goalDifference;
	private int points;

	public Team(String name, int scoreGoals, int goalDifference, int points) {
		this.name = name;
		this.scoreGoals = scoreGoals;
		this.goalDifference = goalDifference;
		this.points = points;
	}

	public Team(String name, int matchPlayed, int wins, int draws, int loses, int scoreGoals, int defeatGoals,
			int goalDifference, int points) {
		this.name = name;
		this.matchPlayed = matchPlayed;
		this.wins = wins;
		this.draws = draws;
		this.loses = loses;
		this.scoreGoals = scoreGoals;
		this.defeatGoals = defeatGoals;
		this.goalDifference = goalDifference;
		this.points = points;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", matchPlayed=" + matchPlayed + ", wins=" + wins + ", draws=" + draws
				+ ", loses=" + loses + ", scoreGoals=" + scoreGoals + ", defeatGoals=" + defeatGoals
				+ ", goalDifference=" + goalDifference + ", points=" + points + "]";
	}
//
//	@Override
//	public int compareTo(Team team2) {
//		if(this.points==team2.points) {
//			if(this.goalDifference==team2.goalDifference) {
//				if(this.scoreGoals==team2.scoreGoals) {
//					return this.name.compareTo(team2.name);
//				}
//				return this.scoreGoals-team2.scoreGoals;
//			}
//			return this.goalDifference-team2.goalDifference;
//		}
//		return this.points-team2.points;
//	}

	public short getPosition() {
		return position;
	}

	public void setPosition(short position) {
		this.position = position;
	}

	public int getMatchPlayed() {
		return matchPlayed;
	}

	public void setMatchPlayed(int matchPlayed) {
		this.matchPlayed = matchPlayed;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getDraws() {
		return draws;
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}

	public int getLoses() {
		return loses;
	}

	public void setLoses(int loses) {
		this.loses = loses;
	}

	public int getScoreGoals() {
		return scoreGoals;
	}

	public void setScoreGoals(int scoreGoals) {
		this.scoreGoals = scoreGoals;
	}

	public int getDefeatGoals() {
		return defeatGoals;
	}

	public void setDefeatGoals(int defeatGoals) {
		this.defeatGoals = defeatGoals;
	}

	public int getGoalDifference() {
		return goalDifference;
	}

	public void setGoalDifference(int goalDifference) {
		this.goalDifference = goalDifference;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
}
