package linkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author tinarambo
 *
 */

public class Reader {

	/**
	 * @return int from user input
	 * @exception if input isn't an int
	 */
	public int readInt() {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			try {
				return Integer.valueOf(b.readLine().trim()).intValue();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public int readInt(String message) {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.print(message);
			try {
				return Integer.valueOf(b.readLine().trim()).intValue();
			} catch (Exception e) {
				System.out.println("Ugyldig input! Vennligst tast inn et tall.\n");
			}
		}
	}

}
