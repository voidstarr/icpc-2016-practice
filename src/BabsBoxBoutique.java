import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BabsBoxBoutique {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		int stack = 1;
		int[][] boxes = new int[n][3];
		ArrayList<Integer> answers = new ArrayList<Integer>();
		while ((n = Integer.parseInt(br.readLine())) != 0) {
			String[] box;
			for (int i = 0; i < n && (box = br.readLine().split(" ")) != null; i++) {
				System.out.println(box);
				boxes[i][0] = Integer.parseInt(box[0]);
				boxes[i][1] = Integer.parseInt(box[1]);
				boxes[i][2] = Integer.parseInt(box[2]);
			}

			// TODO: logix; push answer to answers

			stack++;
		}

		for (int i = 0; i < answers.size(); i++) {
			System.out.println("Case " + (i + 1) + ": " + answers.get(i));
		}

	}
}