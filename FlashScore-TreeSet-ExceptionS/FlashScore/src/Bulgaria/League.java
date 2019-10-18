package Bulgaria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import Comparators.DefeatGoalsComparator;
import Comparators.DrawsComparator;
import Comparators.GoalDifComparator;
import Comparators.LosesComparator;
import Comparators.NamesComparator;
import Comparators.PointsComparator;
import Comparators.ScoreGoalsComparator;
import Comparators.SortBy;
import Comparators.WinsComparator;

public class League {
	Scanner sc = new Scanner(System.in);
	private String name;
	private List<Team> teams = new ArrayList<>();

	public League(String name) {
		try {
			this.name = name;
			System.out.println("Po kakvo da ti gi naredq?");
			SortBy sortBy = SortBy.valueOf(sc.next().toUpperCase());
			Set<Team> teams = null;
			if((sortBy.equals(SortBy.DEFEATGOALS)) || (sortBy.equals(SortBy.DRAWS)) || (sortBy.equals(SortBy.GOALDIF)) || (sortBy.equals(SortBy.LOSES)) || (sortBy.equals(SortBy.NAME)) || (sortBy.equals(SortBy.SCOREGOALS)) || (sortBy.equals(SortBy.WINS)) || (sortBy.equals(SortBy.POINTS))) {  
				if (sortBy.equals(SortBy.DEFEATGOALS)) {
					teams = new TreeSet<Team>(new DefeatGoalsComparator());
				} else {
					if (sortBy.equals(SortBy.DRAWS)) {
						teams = new TreeSet<Team>(new DrawsComparator());
					} else {
						if (sortBy.equals(SortBy.GOALDIF)) {
							teams = new TreeSet<Team>(new GoalDifComparator());
						} else {
							if (sortBy.equals(SortBy.LOSES)) {
								teams = new TreeSet<Team>(new LosesComparator());
							} else {
								if (sortBy.equals(SortBy.NAME)) {
									teams = new TreeSet<Team>(new NamesComparator());
								} else {
									if (sortBy.equals(SortBy.SCOREGOALS)) {
										teams = new TreeSet<Team>(new ScoreGoalsComparator());
									} else {
										if (sortBy.equals(SortBy.WINS)) {
											teams = new TreeSet<Team>(new WinsComparator());
										} else {
											teams = new TreeSet<Team>(new PointsComparator());
										}
									}
								}
							}
						}
					}
				}
			} else {
				throw new IllegalArgumentException();
			}
			teams.add(new Team("ArdaK", 8, 3, 3, 2, 13, 12, 1, 12));
			teams.add(new Team("Beroe", 8, 4, 0, 4, 15, 13, 2, 12));
			teams.add(new Team("BotVr", 8, 2, 2, 4, 9, 13, -4, 8));
			teams.add(new Team("BotPl", 8, 2, 3, 3, 9, 12, -3, 9));
			teams.add(new Team("4More", 8, 2, 5, 1, 10, 7, 3, 11));
			teams.add(new Team("CSKA-", 8, 3, 4, 1, 12, 11, 1, 13));
			teams.add(new Team("Ludog", 8, 5, 3, 0, 12, 4, 8, 18));
			teams.add(new Team("LevSf", 8, 5, 2, 1, 17, 7, 10, 17));
			teams.add(new Team("LokPl", 8, 4, 2, 2, 18, 12, 6, 14));
			teams.add(new Team("SlaSf", 8, 2, 3, 3, 12, 13, -1, 9));
			teams.add(new Team("Dunav", 8, 2, 2, 4, 10, 15, -5, 8));
			teams.add(new Team("EtarT", 8, 1, 5, 2, 10, 11, -1, 8));
			teams.add(new Team("CSelo", 8, 2, 2, 4, 8, 12, -4, 8));
			teams.add(new Team("VitBi", 8, 1, 0, 7, 7, 20, -13, 3));
	
			for (Iterator<Team> it = teams.iterator(); it.hasNext();) {
				System.out.println(it.next());
			}
		} catch (IllegalArgumentException i) {
			System.out.println("Not valid value, Enter new comparator");
		}
	}
		

//	public League(String name, int numOfTeams) {
//		this.name = name;
//		System.out.println("Add team for, number, name, match played, wins, draws, loses, points");
//		for (int n = 0; n < numOfTeams; n++) {
//			System.out.println("Team " + n);
////			Team currTeam = new Team(sc.nextShort(), sc.next(), sc.nextShort(), sc.nextShort(), sc.nextShort(), sc.nextShort(), sc.nextShort());
//			teams.add(new Team(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
//		}
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

}
