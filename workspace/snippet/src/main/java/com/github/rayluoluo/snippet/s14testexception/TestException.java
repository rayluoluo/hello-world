package com.github.rayluoluo.snippet.s14testexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class TestException {
	// throws方式处理异常
	public static void main(String[] args) throws IOException {

		System.out.println(System.getProperty("user.dir"));

		FileWriter writer = new FileWriter("helloworld.txt");
		writer.write("您好，世界！");
		writer.close();

		// try...catch方式处理异常
		try {
			File file = new File("helloworld.txt");
			InputStream stream = new FileInputStream(file);
			int length = 0;
			byte[] buffer = new byte[1024];
			while (-1 != (length = stream.read(buffer))) {
				System.out.println(new String(buffer, 0, length));
			}
			stream.close();

			FileReader reader = new FileReader(file);
			char[] chars = new char[1024];
			while (-1 != (length = reader.read(chars))) {
				System.out.println(new String(chars, 0, length));
			}
			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("run in finally");
		}
	}
}
