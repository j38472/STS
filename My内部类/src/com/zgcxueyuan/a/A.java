package com.zgcxueyuan.a;

public class A {
	int id;

	public class Name {
		String lastName;
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		String firstName;

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String joinName(int i) {
			switch (i) {
			case 1:
				return lastName;
			case 2:
				return firstName;
			default:
				return "0";
			}
			
		}
		public String name() {
			return firstName+lastName;
		}
		

	}

}
