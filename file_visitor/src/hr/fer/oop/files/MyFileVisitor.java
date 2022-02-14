package hr.fer.oop.files;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class MyFileVisitor implements FileVisitor<Path>{

	//public long size = 0;
	public Map<Path, Long> sizes = new HashMap<>();
	
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		sizes.put(dir, 0L);
		//System.out.println("in:" + dir);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		//System.out.println("file:" + file + " " + attrs.size() + " bytes");
		sizes.put(file.getParent(), sizes.get(file.getParent())+ attrs.size() );
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		//System.out.println("out:" + dir);
		//System.out.println(size + " bytes");
		//size = 0;
		return FileVisitResult.CONTINUE;
	}

}
