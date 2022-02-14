package hr.fer.oop.files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.file.FileStore;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.util.List;

public class Main {

	/*
	 * Na D particiji smo napravili sljedeæe datoteke i direktorije: 
	 * D:\test\CILE.txt
	 * D:\test\doc.txt
	 * D:\test\file2.txt
	 * D:\test\mile.txt
	 * D:\test\novidir 
	 */
	
	public static void main(String[] args) throws Exception {
//		File f1 = new File("D:\\test\\doc.txt");
//		File f2 = new File("D:\\test\\docsdfdgdsf.txt");
//		File dir = new File("D:/test/");
//		
//		System.out.println(f1.exists());
//		System.out.println(f2.exists());
//		System.out.println(dir.exists());
//		
//		System.out.println(f1.length());
//		System.out.println(dir.isDirectory());
		
//		try {
//			for (Path p : Files.newDirectoryStream(dir.toPath())) {
//				System.out.println(p);
//			}
//		} catch (IOException e) {}
//		
//		System.out.println("----");
//		
//		try {
//			for (Path p : Files.newDirectoryStream(dir.toPath(), new DirFilter())) {
//				System.out.println(p);
//			}
//		} catch (IOException e) {}
//		
//		Path p = Paths.get("c:/");
//		FileStore fileStore;
//		try {
//			fileStore = Files.getFileStore(p);
//			System.out.println("Slobodno: " + fileStore.getUnallocatedSpace()/1024/1024/1024 + " GB");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		FileVisitor<Path> fv = new MyFileVisitor();
//		Path root = Paths.get("D:/test/");
//		
//		try {
//			Files.walkFileTree(root, fv);
//		} catch (IOException e) {}
//		
//		//Vježba - izraèunali smo velièine datoteka u svakom dir-u
//		// i to spremili u Map-u <Path,Long>		
//		System.out.println(((MyFileVisitor)fv).sizes);
		
//		//SimpleFileVisitor - konkretna klasa koja implementira FileVisitor
//		//Malo jednostavnija za korištenje:
//		//Naslijedimo SimpleFileVisitor i nadjaèamo metode koje nam trebaju
//		SimpleFileVisitor<Path> sfv = new MySimpleFileVisitor();
//		
//		try {
//			Files.walkFileTree(Paths.get("D:/test/"), sfv);
//		} catch (IOException e) {}		
		
//		//Èitanje txt datoteke #1 - tipièni idiom
//		//Imput stream (bytes) nad datotekom 
//		//pa dekoratori... do buffered readera (znakovi)
//		BufferedReader br = new BufferedReader(
//				  new InputStreamReader(
//				    new BufferedInputStream(
//				      new FileInputStream("D:\\test\\lyrics.txt")),"UTF-8"));
//
//		//èitanje jedne linije
//		System.out.println(br.readLine());
//		
//		
//		//èitanje cijele datoteke, linija po linija
//		String line;		
//		while ((line = br.readLine()) != null)
//			System.out.println(line);
		
		//Èitanje txt datoteke #2 - pretpostavljamo UTF-8
		List<String> lines = Files.readAllLines(Paths.get("D:\\test\\lyrics.txt"));
		for (String l : lines)
			System.out.println(l);
	
	}

}
