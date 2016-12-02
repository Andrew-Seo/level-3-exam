import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int counter = 0;
		for (String p: hashmap1.keySet()) {
			String value = hashmap1.get(p);
			if (value.equals(hashmap2.get(p))){
				counter++;
			}
		}
		return counter;
	}

}
