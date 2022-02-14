package fileSearcher;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class FileSearcher {

	private FileSearchMonitor monitor;

	public FileSearcher(FileSearchMonitor monitor) {
		this.monitor = monitor;
	}

	public List<String> findPDFsInRange(String from, String to) {

		List<String> pdfs = new ArrayList<>();
		Path fromPath = Paths.get(from).toAbsolutePath();
		Path toPath = Paths.get(to).toAbsolutePath();

		try {
			Files.walkFileTree(fromPath, new MyFileVisitor(toPath.toString(), pdfs));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		monitor.searchFinished();
		return pdfs;
		// TODO
		// KOD NAPISATI NA POSEBNOM LISTU (KOD METODE findPDFsInRange I SVE ŠTO SE
		// NALAZI
		// ISPOD U METODI

	}

	private class MyFileVisitor extends SimpleFileVisitor<Path> {

		private Path to;
		private List<String> fileNameList;

		public MyFileVisitor(String toDirectory, List<String> list) {
			this.to = Paths.get(toDirectory);
			this.fileNameList = list;
		}

		@Override
		public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
			boolean onGoodPath = to.startsWith(dir);
			// ili uspoređivati to.GetName(i) i dir.GetName(i) za i od 0 do
			// dir.getNameCount()

			if (onGoodPath) {
				monitor.directoryChangedTo(dir.toString());
				return FileVisitResult.CONTINUE;
			} else {
				return FileVisitResult.SKIP_SUBTREE;
			}
		}

		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
			if (file.toString().toUpperCase().endsWith(".PDF")) {
				monitor.fileFound(file.toString());
				fileNameList.add(file.toString());
			}
			return FileVisitResult.CONTINUE;
		}

		@Override
		public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
			return FileVisitResult.CONTINUE;
		}
	}
}