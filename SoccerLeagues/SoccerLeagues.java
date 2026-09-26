import java.util.*;

public class SoccerLeagues {
    public int[] points(String[] matches) {
        int size = matches.length;
        ArrayList<Integer> team_scores = new ArrayList<>(Collections.nCopies(size, 0));
        int team_num = 0;
        for (String i : matches) {
            for (int j = 0; j < i.length(); j++) {
                if (j == team_num) {} 
                else {
                    // if team i won then team j lost
                    if (i.charAt(j) == 'W') {
                        team_scores.set(team_num, team_scores.get(team_num) + 3);
                    }
                    // if team i lost then team j won
                    if (i.charAt(j) == 'L') {
                        team_scores.set(j, team_scores.get(j) + 3);
                    }
                    // if team i got a draw, then team j got a draw
                    if (i.charAt(j) == 'D') {
                        team_scores.set(team_num, team_scores.get(team_num) + 1);
                        team_scores.set(j, team_scores.get(j) + 1);
                    }
                }
            }
            team_num += 1;
        }
    int [] array_t_scores = team_scores.stream().mapToInt(Integer::intValue).toArray();
    return array_t_scores;
    }
    public static void main(String[] args) {
        System.err.println("hello");
    }
}


