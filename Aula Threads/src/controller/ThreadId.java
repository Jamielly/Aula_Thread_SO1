package controller;

//extends Threads
//Parametros por construtor
//método run()

public class ThreadId extends Thread{

	private int idThread;
	
	public ThreadId(int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		//so se executa o que esta dentro
		for (int idThread = 0; idThread < 5; idThread++) {
		System.out.println(idThread);
		Thread threadId = new ThreadId(idThread);
		threadId.start();
	}
	
}
}

