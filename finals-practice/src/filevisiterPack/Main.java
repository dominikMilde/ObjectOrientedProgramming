/**
 * 
 */
package filevisiterPack;

import java.nio.file.*;

/**
 * @author Dominik
 *
 */
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Path path = Paths.get("D:\\JAVAVISITOR");
		MyFileVisiter mfv = new MyFileVisiter();
		
		try {
			Files.walkFileTree(path, mfv);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
