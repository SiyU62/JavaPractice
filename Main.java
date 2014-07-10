import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	// private指定しとくとクラス外からのアクセスを防げる。
	// 場合によるけどグローバル変数はprivateしとくとバグを防げる。
	// BufferedReaderで入力を、PrintWriterで出力を管理。
	private BufferedReader Br;
	private PrintWriter Pw;

	// コンストラクタ。static回避したいだけ。
	public Main() {
		Br = new BufferedReader(new InputStreamReader(System.in));
		Pw = new PrintWriter(System.out);
		try {
			// 一行読み込んでそのまま出力してる。
			String str = Br.readLine();
			Pw.println(str);
			Pw.flush();
			// 使い終わったので閉じとく。
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
