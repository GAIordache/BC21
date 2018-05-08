package threadsafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				while (true) {
					synchronized (list) {

						if (!list.isEmpty()) {
							list.remove(0);
						} else {
							break;
						}

					}
				}

			}
		};
		for (int i = 0; i < 20; i++) {

			new Thread(runnable).start();
		}
	}

}
