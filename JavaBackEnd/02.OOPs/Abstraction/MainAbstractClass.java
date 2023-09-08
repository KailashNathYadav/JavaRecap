package OOPs.Abstraction;

abstract class Bike {
	public abstract void run();
}

class Bullet extends Bike{
	public void run() {
		System.out.println("Bullet is running.");
	}
}

class MainAbstractClass{
	public static void main(String[] args) {
		Bike bullet = new Bullet();
		bullet.run();
	}
}