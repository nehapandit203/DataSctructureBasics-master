package problems;

import java.util.*;

class TournamentWinner {

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.

        Map<String, Integer> teamScore = new HashMap();
        for (int i = 0; i < competitions.size(); i++) {

            if (results.get(i) == 0) {
                String teamName = competitions.get(i).get(1);
                if (teamScore.containsKey(teamName)) {
                    teamScore.put(teamName, teamScore.get(teamName) + 3);
                } else
                    teamScore.put(teamName, 3);
            } else {
                String teamName = competitions.get(i).get(0);
                if (teamScore.containsKey(teamName)) {
                    teamScore.put(teamName, teamScore.get(teamName) + 3);
                } else
                    teamScore.put(teamName, 3);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competiotors =
                new ArrayList<>();

        // Create n lists one by one and append to the
        // master list (ArrayList of ArrayList)
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("HTML");
        a1.add("C");
        competiotors.add(a1);

        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("C");
        a2.add("PYTHON");
        competiotors.add(a2);

        ArrayList<String> a3 = new ArrayList<String>();
        a3.add("PYTHON");
        a3.add("HTML");
        competiotors.add(a3);

        ArrayList<Integer> results = new ArrayList();
        results.add(0);
        results.add(0);
        results.add(1);
        TournamentWinner.tournamentWinner(competiotors, results);
    }
}
