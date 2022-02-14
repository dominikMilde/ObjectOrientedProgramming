package hr.fer.oop.files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;

public class DirFilter implements DirectoryStream.Filter<Path>{

	@Override
	public boolean accept(Path entry) throws IOException {
		if (entry.toString().contains("ile"))
			return true;
		return false;
	}

}
