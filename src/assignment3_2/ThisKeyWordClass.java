package assignment3_2;//package name

class ThisKeyWord{//class 
	int demoVar=5;//class variable
	
	public ThisKeyWord(){//default constructor
		
		this("called");//this key word to call single argument constructor
		System.out.println("default constructor ");
			
		
		
	}
	
	public ThisKeyWord(String str){//single argument constructor
		System.out.println("single argument constructor "+str);
		
		
	}
	
	public void demoMethod(int demoVar){//demo method to demonstrate instance and local variable
		
		System.out.println("Printing instance varibale with this keyword "+this.demoVar);
		System.out.println("Printing local variable value "+demoVar);
		this.demoVar=demoVar;
		System.out.println("Printing instance varibale after assingning value "+this.demoVar);
		demoMethod2(this);//calling second method passing this keyword as object parameter
		
	}
	
	public void demoMethod2(ThisKeyWord t){//second method
		System.out.println("second method");;
	}
	
}

public class ThisKeyWordClass {
	
	public static void main(String args[]){//main method
		
		//create ThisKeyword object
		ThisKeyWord t1=new ThisKeyWord();
		t1.demoMethod(40);
		
		
	}

}
