class Animal{
	public void makeSound(){
		System.out.println("\nAnimal is making sound");
	}
}

class Dog extends Animal{
	
	@Override
	public void makeSound(){
		System.out.println("\nBark");
	} 	
}

class Cat extends Animal{
	
	@Override
	public void makeSound(){
		System.out.println("\nMeow");
	} 
}

class Que9{
	public static void main(String args[]){
		
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		System.out.print("\nDog ---> ");
		a1.makeSound();
		System.out.print("\nCat ---> ");
		a2.makeSound();
	}
}
