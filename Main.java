import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	private BufferedReader Br;
	private PrintWriter Pw;

	public Main() {
		Br = new BufferedReader(new InputStreamReader(System.in));
		Pw = new PrintWriter(System.out);
		while (true) {
			try {
				String str = Br.readLine();
				if (str.equalsIgnoreCase("owari")) {
					break;
				}
				Pw.println(str);
				Pw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			Br.close();
			Pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}
