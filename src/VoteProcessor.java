import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> vote) {
		String s = "";
		String[] m;
		for (String p : vote) {
			s = p.toLowerCase();
			m = s.split(",");
			if (m[0] > m[1]) {
				return m[0];
			}
			if (m[1] > m[0]) {
				return m[1];
			} else {
				return "TIE";
			}
		}
	}
}
