package EVA3_12_APPEND_TXT;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EVA3_12_APPEND_TXT {

	public EVA3_12_APPEND_TXT() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String ruta = "C:\\archivos\\";
			writeUsingBufferedWrite(ruta, "Prueba de APPEND!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void writeUsingFileWriter(String ruta, String datos) throws IOException {
		File file = new File(ruta + "ArchivosFileWriter.txt");
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(datos);
		fileWriter.close();
	}
	
	public static void writeUsingBufferedWrite(String ruta, String datos) throws IOException {
		File file = new File(ruta + "ArchivoBufferedWriter.txt");
		FileWriter fileWriter = new FileWriter(file, true);
		BufferedWriter bufWrite = new BufferedWriter(fileWriter);
		for (int i = 0; i < 10; i++) {
			bufWrite.write((i + 1) + " " + datos);
			bufWrite.write("\n");
		}
		bufWrite.close();
		fileWriter.close();
	}
}
