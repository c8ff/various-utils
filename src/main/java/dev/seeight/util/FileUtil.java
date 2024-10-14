/*
 * various-utils
 * Copyright (C) 2024 c8ff
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

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
