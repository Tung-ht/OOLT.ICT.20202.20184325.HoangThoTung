package hust.soict.globalict.garbage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ConcatenationInLoops {

	public static void main(String[] args) throws Exception {
		// We need to provide file path as the parameter:
		// double backquote is to avoid compiler interpret words
		// like \test as \t (ie. as a escape sequence)
		File file = new File("C:\\Users\\DaiPhongPC\\Desktop\\OOLT.ICT.20202.20184325.HoangThoTung\\AimsProject\\test.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		StringBuilder sb = new StringBuilder();
		String tmp = "";
		while ((tmp = br.readLine()) != null) {
			sb.append("\n" + tmp);
		}
		System.out.println(sb);
		br.close();
	}
}
