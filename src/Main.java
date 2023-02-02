import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
	done w/ Gabriele Castiglione
 */
public class Main {
	public static void main(String[] args) {
		List<String> cityNames = Arrays.asList("Roma", "Milano", "Torino");
		/*
			Since it is an immutable list we can't add or  remove
			items from/into the list
		 */
		//cityNames.add("Napoli");
		cityNames.set(1, "Tegucigalpa");
		System.out.println(cityNames);

		List<String> kingsOfRome = new ArrayList<>();
		kingsOfRome.add("Romulus");
		kingsOfRome.add("Numa Pompilius");
		kingsOfRome.add("Tullus Hostilius");
		kingsOfRome.add("Ancus Marcius");
		kingsOfRome.add("Lucius Tarquinius Priscus");
		kingsOfRome.add("Servius Tullius");
		kingsOfRome.add("Lucius Tarquinius Superbus");
		System.out.println(kingsOfRome);
		String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
		kingsOfRomeArray[kingsOfRomeArray.length-1]="Lucius Tarquinius Supercar";
		System.out.println(Arrays.toString(kingsOfRomeArray));

	}
}