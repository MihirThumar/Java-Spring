package com.springcore.auto.wire;

public class Emp {
		private Address addres;

		public Address getAddres() {
			return addres;
		}

		public void setAddres(Address addres) {
			System.out.println("Setting value");
			this.addres = addres;
		}

		public Emp(Address addres) {
			super();
			System.out.println("inside constructer");
			this.addres = addres;
		}

		public Emp() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Emp [addres=" + addres + "]";
		}

		

		
		
}
