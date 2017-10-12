package assignment3_2;//package name

class Parent{//parent class
	
	int demoVar=10;//variable
	
	public Parent(String str){//constructor
		System.out.println("Parent class constructor "+str);
	}
	
	public void display(){//method
		System.out.println("Display method in Parent class");
	}
	
}//end of class

class Child extends Parent{//child class extending parent class
	
	int demoVar=super.demoVar;//variable
	
	public Child(String str){//child class constructor
		super(str);//calls super class constructor
		System.out.println("Child class constructor "+str);
	}
	
	public void display(){//child class method
		super.display();//calls super class method
		System.out.println("Display method in Child class");
		System.out.println("Printing value of super class"+demoVar);
	}
}//end of class

public class SuperKeyWordClass {//super keyword demonstration class
	public static void main(String args[]){//main method
		//create child class object
		Child childVar=new Child("called");
		childVar.display();//calling method of child class
		
	}//end of main

}//end of class
