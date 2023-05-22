package EVA3_10_ESCRITURA_ARCHIVOS_TXT;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EVA3_10_ESCRITURA_ARCHIVOS_TXT {

	public EVA3_10_ESCRITURA_ARCHIVOS_TXT() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "C:\\archivos\\";
		try {
			writeUsingFiles(ruta, "Prueba de escritura de archivos usando Clase Files");
			writeUsingFileWriter(ruta, "Prueba de escritura de archivos usando Clase FilesWriter");
			writeUsingBufferedWrite(ruta, "Prueba de escritura de archivos usando Clase BufferedWrite");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void writeUsingFiles(String ruta, String datos) throws IOException {
		//Si el archivo no existe lo crea
		//Si el archivo existe, lo sobreescribe
		Path path = Paths.get(ruta + "ArchivosFiles.txt");
		Files.write(path,datos.getBytes());
	}
	
	public static void writeUsingFileWriter(String ruta, String datos) throws IOException {
		File file = new File(ruta + "ArchivosFileWriter.txt");
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(datos);
		fileWriter.close();
	}
	
	public static void writeUsingBufferedWrite(String ruta, String datos) throws IOException {
		Path path = Paths.get(ruta + "ArhivoBufferedWriter.txt");
		OutputStream out = Files.newOutputStream(path);
		OutputStreamWriter osWriter = new OutputStreamWriter(out);
		BufferedWriter bufWrite = new BufferedWriter(osWriter);
		for (int i = 0; i < 10; i++) {
			bufWrite.write((i + 1) + " " + datos);
			bufWrite.write("\n");
		}
		bufWrite.close();
		osWriter.close();
	}
}
