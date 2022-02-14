/**
 * 
 */
package zip;

import java.io.IOException;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * @author Dominik
 *
 */
public class ZipExample {
	public static void writeLines(ZipFile zip, ZipEntry entry) {
		try(Scanner sc = new Scanner(zip.getInputStream(entry))){
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (ZipFile zip = new ZipFile("D:/test/lyrics.zip")){
			zip.stream()
				.filter(entry -> entry.getName().endsWith(".txt"))
				.forEach(entry -> writeLines(zip, entry));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
