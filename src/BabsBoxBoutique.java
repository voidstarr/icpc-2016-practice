import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BabsBoxBoutique {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		int stack = 0;
		while ((n = Integer.parseInt(br.readLine())) != 0) {
			String[] box;
			int[][][] boxes = new int[stack][n][3];
			for (int i = 0; i < n && (box = br.readLine().split(" ")) != null; i++) {
				System.out.println(box);
				boxes[stack][i][0] = Integer.parseInt(box[0]);
				boxes[stack][i][1] = Integer.parseInt(box[1]);
				boxes[stack][i][2] = Integer.parseInt(box[2]);
			}
			stack++;
		}

	}
}