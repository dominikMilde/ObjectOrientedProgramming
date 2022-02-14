package hr.fer.oop.files;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MySimpleFileVisitor extends SimpleFileVisitor<Path> {
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println(file + " : " + attrs.size() + " bytes");
		return FileVisitResult.CONTINUE;
	}
	
}
