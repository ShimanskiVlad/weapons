package by.iba.shimanski.weapons;
public class MachineGun<T> extends Weapon implements Demountable, Shootable {
	private T name;	

	public MachineGun() {}

	public MachineGun(Double damage, Double size, T name, Producer producer) {
		super(damage, size, producer);
		this.name = name;
	}
	
	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "MachineGun [name=" + name + ", damage=" + getDamage() + ", size="
				+ getSize() + ", producer=" + getProducer() + "]";
	}

	@Override
	public void demount() {
		System.out.println("Demount a MachineGun!");
	}

	@Override
	public void shoot() {
		System.out.println("Shoot from MachineGun!");
	}

	
	@Override
	public Double bit() {
		System.out.println("Bit from MachineGun");
		return super.bit();
	}
}
