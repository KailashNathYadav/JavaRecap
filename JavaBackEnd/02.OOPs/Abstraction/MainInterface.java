package OOPs.Abstraction;

interface Bike{
	void run();
}

class Bullet implements Bike{
	public void run(){
		System.out.println("Bullet is running");
	}
}

class MainInterface{
	public static void main(String[] args) {
		Bike bullet = new Bullet();
		bullet.run();
	}
}
