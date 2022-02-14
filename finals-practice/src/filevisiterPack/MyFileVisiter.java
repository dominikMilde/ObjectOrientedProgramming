package filevisiterPack;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author Dominik
 *
 */
public class MyFileVisiter extends SimpleFileVisitor<Path> {

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Sada ću ući u: " + dir.getFileName());
		if(dir.getFileName().toString().equals("3")) {
			return FileVisitResult.SKIP_SUBTREE;
		}
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(file.getFileName());
		if(file.getFileName().toString().endsWith(".txt")) {
			BufferedReader bw = new BufferedReader(
									new InputStreamReader(
											new BufferedInputStream(
													new FileInputStream(file.toString())), "UTF-8"));
			String linija;
			while((linija = bw.readLine())!= null) {
				System.out.println(linija);
			}
		}
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		// TODO Auto-generated method stub
		System.err.println("Nisam uspio u : " + file.getFileName());
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Izlazim iz: " + dir.getFileName());
		return FileVisitResult.CONTINUE;
	}
	
}
