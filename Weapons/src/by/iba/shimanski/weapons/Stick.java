package by.iba.shimanski.weapons;
public class Stick extends Weapon {

	private Double weight; 
	
	public Stick() {}

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
		return "Stick [weight=" + weight + ", damage=" + getDamage() + ", size="
				+ getSize() + ", producer=" + getProducer() + "]";
	}

}
