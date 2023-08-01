package dev.seeight.util;

import java.io.*;

public class FileUtil {
	public static StringBuilder readFile(File file) throws IOException {
		return FileUtil.readFile(file, '\n');
	}

	public static StringBuilder readFile(File file, char newLineChar) throws IOException {
		StringBuilder builder = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = reader.readLine()) != null) {
				builder.append(line).append(newLineChar);
			}
		}

		return builder;
	}

	public static StringBuilder readFileJar(String path, char newLineChar) throws IOException {
		StringBuilder builder = new StringBuilder();

		try (InputStream stream = FileUtil.class.getResourceAsStream(path)) {
			if(stream != null) {
				try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
					String line;
					while ((line = reader.readLine()) != null) {
						builder.append(line).append(newLineChar);
					}
				}
			} else {
				throw new FileNotFoundException("Couldn't find file inside jar '" + path + "'.");
			}
		}

		return builder;
	}
}
