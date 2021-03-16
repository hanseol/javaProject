package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
	public static void main(String[] args) {
		Path path = Paths.get("list.txt");
		try {
			Stream<String> stream = Files.lines(path);
			stream.forEach(file->System.out.println(file));
			
			Stream<Path> streamPath = Files.list(Paths.get("C:\\Program Files"));
			streamPath.forEach(f -> System.out.println(f.getFileName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
