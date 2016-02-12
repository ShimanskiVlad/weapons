interface Demountable {
	
	void demount();
	
}


interface Shootable {
	
	void shoot();
	
}


abstract class Weapon {
	
	protected Double damage;
	
	protected Double size;
	
	protected Producer producer; 
	
	public Weapon() {
		this.damage = (double) 0;
		this.size = (double) 0;
	}
	
	public Weapon(Double damage, Double size, Producer producer) {
		this.damage = damage;
		this.size = size;
		this.producer = producer;
	}
	
	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public Double getDamage() {
		return damage;
	}
	
	public void setDamage(Double damage) {
		this.damage = damage;
	}
	
	public Double getSize() {
		return size;
	}
	
	public void setSize(Double size) {
		this.size = size;
	}

	public Double bit() {
		return damage * size;
	}

	@Override
	public String toString() {
		return "Weapon [damage=" + damage + ", size=" + size + ", producer="
				+ producer + "]";
	}
		
}


class Stick extends Weapon {
	
	private Double weight; 
	
	public Stick() {
		weight = (double) 0;
	}

	public Stick(Double damage, Double size, Double weight, Producer producer) {
		super(damage, size, producer);
		this.weight = weight;
	}
	
	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public Double bit() {
		System.out.println("Bit by Stick!");
		return super.bit();
	}

	@Override
	public String toString() {
		return "Stick [weight=" + weight + ", damage=" + damage + ", size="
				+ size + ", producer=" + producer + "]";
	}
		
}


class Handgun extends Weapon implements Shootable {
	
	private int version;
	
	public Handgun() {
		version = 0;
	}

	public Handgun(Double damage, Double size, int version, Producer producer) {
		super(damage, size, producer);
		this.version = version;
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}	
	
	@Override
	public String toString() {
		return "Handgun [version=" + version + ", damage=" + damage + ", size="
				+ size + ", producer=" + producer + "]";
	}

	@Override
	public void shoot() {
		System.out.println("Shoot from Handgun!");		
	}

	
	@Override
	public Double bit() {
		System.out.println("Bit by HandGun!");
		return super.bit();
	}
	
}


class MachineGun<T> extends Weapon implements Shootable, Demountable {

	private T name;	
	
	public MachineGun() {
		name = null;
	}

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
		return "MachineGun [name=" + name + ", damage=" + damage + ", size="
				+ size + ", producer=" + producer + "]";
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


enum Producer {
	ISRAEL, MAUSER, BERETTA
}


public class Main {
	public static void main(String[] args) {
		MachineGun<String> machineGun = new MachineGun<String>(1.0, 1.0, "qq", Producer.BERETTA);
		Handgun handgun = new Handgun(2.0, 2.0, 5, Producer.ISRAEL);
		Stick stick = new Stick(4.0, 5.6, 3.8, Producer.MAUSER);
		Weapon w = new Handgun();
		System.out.println(machineGun);
		System.out.println(handgun);
		System.out.println(stick);
		machineGun.bit();
		Stick st = new Stick();
		st.setProducer(Producer.ISRAEL);
		System.out.println(st);
		System.out.println("111222111");
		System.out.println("111111111");
	}
}
