import java.util.ArrayList;
import java.util.HashMap;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> vote) {
		String s = "";
		String[] m;
		String Winner = "TIE";
		int mostVotes = 0;
		HashMap <String, Integer> sa = new HashMap<>();
		for (String a : vote) {
			int votes = 1;
			s = a.toLowerCase();
			if (sa.containsKey(s)) {
				votes = sa.get(s);
				votes++;
				sa.put(s, votes);
			}
			else {
				sa.put(s, votes);
			}
			if (votes == mostVotes) {
				Winner = "TIE";
			}
			else if(votes > mostVotes){
				Winner = s;
				mostVotes = votes;
			}
		}
		return Winner;
	}
}
