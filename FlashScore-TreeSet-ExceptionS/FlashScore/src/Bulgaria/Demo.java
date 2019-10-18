package Bulgaria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import Comparators.*;

public class Demo {
	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);

		League parvaLiga = new League("Parva Liga");
//		System.out.println("Enter Comparator");
//		SortBy sortBy = SortBy.valueOf(sc.next().toUpperCase());
//		Set<Team> teams;
//
//		if((sortBy.equals(SortBy.DEFEATGOALS)) || (sortBy.equals(SortBy.DRAWS)) || (sortBy.equals(SortBy.GOALDIF)) || (sortBy.equals(SortBy.LOSES)) || (sortBy.equals(SortBy.NAME)) || (sortBy.equals(SortBy.SCOREGOALS)) || (sortBy.equals(SortBy.WINS)) || (sortBy.equals(SortBy.POINTS))) {  
//			if (sortBy.equals(SortBy.DEFEATGOALS)) {
//				teams = new TreeSet<Team>(new DefeatGoalsComparator());
//			} else {
//				if (sortBy.equals(SortBy.DRAWS)) {
//					teams = new TreeSet<Team>(new DrawsComparator());
//				} else {
//					if (sortBy.equals(SortBy.GOALDIF)) {
//						teams = new TreeSet<Team>(new GoalDifComparator());
//					} else {
//						if (sortBy.equals(SortBy.LOSES)) {
//							teams = new TreeSet<Team>(new LosesComparator());
//						} else {
//							if (sortBy.equals(SortBy.NAME)) {
//								teams = new TreeSet<Team>(new NamesComparator());
//							} else {
//								if (sortBy.equals(SortBy.SCOREGOALS)) {
//									teams = new TreeSet<Team>(new ScoreGoalsComparator());
//								} else {
//									if (sortBy.equals(SortBy.WINS)) {
//										teams = new TreeSet<Team>(new WinsComparator());
//									} else {
//										teams = new TreeSet<Team>(new PointsComparator());
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		} else {
//			System.out.println("Not valid value, choose from AGE NAME SALARY");
//			System.out.println("Enter Comparator");
//			sortBy = SortBy.valueOf(sc.next().toUpperCase());
//		}
//		teams.add(new Team("ArdaK", 8, 3, 3, 2, 13, 12, 1, 12));
//		teams.add(new Team("Beroe", 8, 4, 0, 4, 15, 13, 2, 12));
//		teams.add(new Team("BotVr", 8, 2, 2, 4, 9, 13, -4, 8));
//		teams.add(new Team("BotPl", 8, 2, 3, 3, 9, 12, -3, 9));
//		teams.add(new Team("4More", 8, 2, 5, 1, 10, 7, 3, 11));
//		teams.add(new Team("CSKA-", 8, 3, 4, 1, 12, 11, 1, 13));
//		teams.add(new Team("Ludog", 8, 5, 3, 0, 12, 4, 8, 18));
//		teams.add(new Team("LevSf", 8, 5, 2, 1, 17, 7, 10, 17));
//		teams.add(new Team("LokPl", 8, 4, 2, 2, 18, 12, 6, 14));
//		teams.add(new Team("SlaSf", 8, 2, 3, 3, 12, 13, -1, 9));
//		teams.add(new Team("Dunav", 8, 2, 2, 4, 10, 15, -5, 8));
//		teams.add(new Team("EtarT", 8, 1, 5, 2, 10, 11, -1, 8));
//		teams.add(new Team("CSelo", 8, 2, 2, 4, 8, 12, -4, 8));
//		teams.add(new Team("VitBi", 8, 1, 0, 7, 7, 20, -13, 3));
//
//		for (Iterator<Team> it = teams.iterator(); it.hasNext();) {
//			System.out.println(it.next());
//		}
	}
}