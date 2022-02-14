package hr.fer.oop.zi.zad1;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class MainLogic {
	public static void main(String[] args) {
		List<Car> listOfCars = new LinkedList<Car>();
		String filename = "D:/test/Archive.zip";
		// otvaranje .zip datoteke
		try (ZipFile zip = new ZipFile(filename)) {
			Enumeration<? extends ZipEntry> entries = zip.entries();
			// iteriranje elementima u zip datoteci i pronalazak tekstualnih datoteka
			while (entries.hasMoreElements()) {
				ZipEntry entry = entries.nextElement();
				if (entry.getName().endsWith(".txt")) {

					// stvaranje InputStream-a nad tekstualnom datotekom
					try (InputStream stream = zip.getInputStream(entry)) {
						BufferedReader br = new BufferedReader(
								new InputStreamReader(new BufferedInputStream(stream), "UTF-8"));

						// stvaranje instanci klase Car
						while (true) {
							String line = br.readLine();
							if (line == null || line == "")
								break;
							String[] e = line.split(";");
							Car car = new Car(e[0], e[1], Integer.parseInt(e[2]), Integer.parseInt(e[3]), e[4],
									Integer.parseInt(e[5]), Double.parseDouble(e[6]));
							listOfCars.add(car);
						}
					} catch (IOException e) {
					}
				}
			}
		} catch (IOException e) {
		}

		try {
			Writer bw = new BufferedWriter(new OutputStreamWriter(
					new BufferedOutputStream(new FileOutputStream("D:/test/izvjestaj.txt")), "UTF-8"));
			List<String> manufacturers = new LinkedList<>();
			listOfCars.stream().map(c -> c.getManufacturer()).distinct().forEach(m -> manufacturers.add(m));

			// ispis broja automobila po proizvo�a�u u datoteku
			for (String s : manufacturers) {
				long count = listOfCars.stream().filter(c -> c.getManufacturer().equals(s)).count();
				bw.write(s + " : " + count);
			}
			// ispis prosje�ne potro�nje
			bw.write(Double.toString(listOfCars.stream().filter(c -> c.getYearOfManufacture() < 2015)
					.mapToDouble(c -> c.getGasConsumption()).average()
					// .orElse(-1)));
					.getAsDouble()));
			bw.close();
		} catch (IOException e) {
		}
	}
}
