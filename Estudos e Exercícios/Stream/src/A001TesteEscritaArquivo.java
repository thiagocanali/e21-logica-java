import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class A001TesteEscritaArquivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//conjunto b�sico para fazer o stream de dados no java
		//stream de saida
		OutputStream fos = new FileOutputStream("texto.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Ol� mundo");
		bw.newLine();
		bw.write("Isto � um arquivo gerado pelo java");
		
		bw.close();
		
		
		
	}

}
