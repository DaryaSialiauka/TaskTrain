package by.it_academy.simpleclass.train;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<String> str = initlist();
		Train[] tr = new Train[6];
		String[] parts;

		for (int i = 0; i < tr.length; i++) {
			parts = str.get(i).toString().split("\\s+");
			tr[i] = new Train(parts[0], parts[1], parts[2]);
		}
		sort(tr);
		printtrain(tr);
	}

	public static void printtrain(Train[] tr) {
		for (Train temp : tr) {
			System.out.println(temp.getStation() + " - №" + temp.getNumber() + " время отпр. " + temp.getdepTime());
		}
	}

	public static void sort(Train[] tr) {
		for (int i = 0; i < tr.length - 1; i++) {
			for (int j = 0; j < tr.length - 1 - i; j++) {
				if (tr[j].getNumber().compareToIgnoreCase(tr[j + 1].getNumber()) > 0) {
					Train temp = tr[j];
					tr[j] = tr[j + 1];
					tr[j + 1] = temp;
				}
			}
		}
	}

	private static List<String> initlist() {

		List<String> strings = new ArrayList<String>();
		try {
			File file = new File("/source.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				strings.add(scanner.nextLine());
			}
			scanner.close();
		} catch (

		FileNotFoundException e) {

			e.printStackTrace();

		}

		return strings;
	}

}
