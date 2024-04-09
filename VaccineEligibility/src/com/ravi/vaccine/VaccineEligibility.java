package com.ravi.vaccine;

public class VaccineEligibility {
private int age;
private boolean hashealthCondition;

public VaccineEligibility(int age, boolean hashealthCondition) {
	super();
	this.age = age;
	this.hashealthCondition = hashealthCondition;
}
   public boolean isEligible()
{
if(age>=18 && hashealthCondition==true) {
	System.out.println("booked");
	return true;
}
else {
	return false;
}

}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public boolean isHashealthCondition() {
	return hashealthCondition;
}

public void setHashealthCondition(boolean hashealthCondition) {
	this.hashealthCondition = hashealthCondition;
}
}
