package by.iba.shimanski.weapons;
public abstract class Weapon {

		private Double damage;
		
		private Double size;
		
		private Producer producer; 
		
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
