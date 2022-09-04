package view;

import controller.ThreadId;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int idThread = 0; idThread < 5; idThread++) {
			System.out.println(idThread);
			Thread threadId = new ThreadId(idThread);
			threadId.start();
	}
	}
}
