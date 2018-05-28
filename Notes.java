 Notes: EGIANTS VIDEOS

-> properties of class objects, instance variables, methods.

-> while compiling the program if there are any errors its callled compile time error.

-> while running/executing the program if there are any errors its called run time error.

-> if there arent any local variables to excute then the mehtod will 
look for excuting them through instance variables(which are declared in the class level) 
 if there are any declared in the class.

-> when we get an exception the other statements wont be excuted,
	 the program terminates as the exception occurs.

-> "this" is the keyword used to refer to the current object instance variable
 ex:
 class constructordemo{
 	int a;//instance variables
 	int b;//instance variables

 	ConstructorDemo(int a, int b)
 	{
 		this.a =a;//by using this.a we can refere the instance variable "a" to the local variable "a"
 		this.b =b;//by using this.a we can refere the instance variable "b" to the local variable "b"
 	}
 }
____________________________________________________________________________________________________________________

NOV 21st video

- class path is nothing but from where the class is excuting, from the folder where the class file is stored

jar - java archive file -> it contains classes 
 
- the defautl package for java is java.lang

- String class and System class these belong to java.lang package

ex: public static void main(String args[])
ex: System.out.println("");

- java pakcages is nothing but a folder with the contents classes and sub packages .

- a class can be an exception, enum, interface, ERRORS also and normal class we create

IN SYSTEM.OUT.PRINTLN("");

- out and print isnt not only for output devices and printing and monitoring.

- System.out - here we use the class name to access this variable 
  when we are using the dot operator it means a STATIC VARIABLE

- OUT is inside SYSTEM and PRINTLN is inside OUT.

- OUT is an object of print stream.

- PRINTLN is a method taken from printstream class, printstream is a functionality it can be embedded with output stream,
 output stream can be a file or a monitor

- there are different different println methods to display 
different data types like, boolean, char[], double, float, int, long, object, String

- we are calling println from the static method .

- to call the method first give classname.methodname,
   parseInt is an method in the integer class in java api documents 

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
NOV 22nd Video:
___________________________________________________________

CONSTRUCTORS:

-> Syntax for creating the constructor
classname(0 - n no. of parameters)
{

}

-> in every constructor by default there will be a super(); 
	which means its a call to execute the super class default constructor.

-> Syntax for calling the constructor
classname variable = new constructorname();

-> eventhough u mention the word super or not its doesnt matter,
	the contructor always by default takes the super(); 
	keyword in the first line of constructor.

->theres no return type for Constructors
->constructor name should be the class name only 

-> a constructor with zero  arguments is called as deafult constructor,
	why beacuse even if we don't create a constructor,
	 by default jvm will create an default constructor like this for us.

->Constructor should be created outside the method ie..below or above the main method/right after the class name
->to excute an constructor u need to create an object , 
 if we create an object it will be excuted internally automatically.

-> if we are not passing constructor the jvm will pass the default constructor.

->we can call the constructor using the object only once.

->if we provide any constructor jvm wont provide the default constructor if we dont proivde the constructor the jvm will provide the constructor.

-> technically u cant call multiple consturctor at a time .

-> to call multiple constructors at a time create multiple objects.

->creating of unnecesssary objects is invalid 

why exactly we need the constructor?
->
"this" is the keyword used to refer to the current object instance variable
 
 ex:
 class constructordemo{
 	int a;//instance variables
 	int b;//instance variables

 	ConstructorDemo(int a, int b)
 	{
 		super();
 		this.a =a;//by using this.a we can refere the instance variable "a" to the local variable "a"
 		//left side "a" is the instance variable and the right side "a" variable is the local variable
 		this.b =b;//by using this.a we can refere the instance variable "b" to the local variable "b"
 		//left side "b" is the instance variable and the right side "b" variable is the local variable
 	}
 }


Dynamic Input:

- is the interactive programming input from the user.
- we need to caputre the input stream first.
- InputStream ie..file input stream, keyboard
deafult InputStream: System.in 
 
 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader reader = new BufferedReader(isr);
 System.out.println("please enter a value:");
		String msg = reader.readLine();
		System.out.println(msg);

- InputStreamReader

- BufferedReader

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

NOV 25th videos:


THROWS IOEXCEPTION:

happy path: means running the program without any exception and without any failure test classes

-- WE NEED IOEXCEPTIONS WHENEVER WE USE AN READLINE() METHOD.

-- if we try to convert the abc string to integer it throws an error , 
	this is at run time its called exception.

-- when we gets the exception we need to handle the exception, we need to hide the exception message 
	and display the customized message.

-- to handle the messages properly we use EXCEPTIONAL HANDLING.
-- the entire main method is the scope of the code, the exception can happen anywhere in the main method.
-- in a single program 
	we can write only one try block and 
		any no. of catch blocks, 
		only one finally block if its existing and if it doesnt exists zero finally blocks.

-- is writing a catch block necessary when we write a try block?
-- writing try block alone will not work should write atleast finally block or catch block also !!!

-> throws is different from throw

-> throw means raising the exception manually in the program

-- let us assume :
	try 				batsman
	catch				fielders
	finally 			result

	throws IOEXCEPTIONS - we are discussing now!!!

	throw - to know this concept we need to know inheritance concept 

-- TRY BLOCK SYNTAX:

try
{
	suspected code
} 
catch(obj)//catch(ArithmeticException e) //need to write ExceptionName for which exception this catch block should act 
	{
			System.out.println("Inside ArithmeticException catch block:");

	}
	finally
	{
		System.out.println("Inside finally block;");

	}

combinations for try catch finally blocks:

REFER TO EXCPETIONALHANDLING SCREENSHOT IN THE EIANTS VIDEO FOLDER

- try.try = doesnt work it expects either catch block or finally block 
- try.catch = works 
- try.finally = works
- finally.try =doesnt work
- try.catch.catch  = works
- try.try.catch = doesnt work
- try.catch - try.catch = 2 sets of try and catch this works
	^
	|
any number of combinations of "try.catch" is a valid combinations

- catch.try is a invalid combinations doesnt work.

excpetions are categorized into 2 types again :

CHECKED EXCPETIONS:
checked excpetions are those which we are already aware of at the compile time, complie time EXCEPTIONS

UNCEHCKED EXCEPTIONS:
are those which we see at run time, run time excpetions
we dont know until it happened these are called UNCEHCKED excpetions.


INHERITANCE:

-- a concept of aquiring properties of one class into another class.

-- "TO ACCESS THE PARENT PROPERTIES BOTH THE PARENT OBJECT AND CHILD OBJECT IS OK, 
	BUT TO ACCESS THE CHILD PROPERTIES IT IS MANDATORY TO HAVE CHILD OBJECT only, 
		with the parent object you cant manage."

-- parent and child relationship ie.., children will be getting parents properties like anything 
		gold, money, land, walking style, genes etc...
-- in indian system children will have rights in parents property, 
	but parents will not have rights in children property.
-- the properties of parents will only be what they earned, 
	but the property of child will be what the child earned + what their paretns earned.

-- only the child need identity everytime.

-- syntax: example from these two program files ParentClass.java and ChildClass.java

ex: gopal son of siva

-> to explain/define the relation between two classes or child class to parent class 
	or subclass(child class) extends super class(parent class) we use "extends" keyword.

-> to explain the relation between class to interface we use "implements" keyword.

-> whenver we create an object, internally it calls the constructor.
-> first it will try to execute the child class constructor,
	 and then it will excute the parent class constructor. 

-> parentobject = parentobject;
-> if we  try to create a object for parent how many constructors it's going to call internally?
ans: 1

-> a constructor with zero  arguments is called as deafult constructor,
	why beacuse even if we don't create a constructor,
	 by default jvm will create an default constructor like this for us. 

->childobject = childobject + parentobject;
->if we try to create a object for child how many constructors it's going to call internally?
ans: 2 including childs object and parents object 

-> the child class always checks for available resources from itself,
	 then it goes to parent class to fetch the necessary resources when parent also doesnt have the 
	 resoruce then it will be a compile time error.

ex: 
	 class ChildClass extends ParentClass
{
	int a=100;/* its having a =100 so it takes a value from this class itself,
				rather than getting it form parent class*/
	
	int add()
	{
		return a + b;

	}
}

->There are types of inheritance:
1) SINGLE/SIMPLE INHERITANCE:

it will only have a parent class and a child class.

2) MULTIPLE INHERITANCE:

in this we have multiple parent classes and a single child class.
->to achieve multiple inheritance we need one class and n number of interfaces.
multiple inheritance: 0-1 class and 0ne to many interface's

->we can have n number of interface's.

can we achieve multiple inheritance in java?

"MULTIPLE INHERITANCE IS NOT SUPPORTED IN JAVA,
 BY USING PURE CLASSES IT CAN BE ACHIEVED BY USING INTERFACE'S." 

3) MULTILEVEL INHERITANCE:

in this we have one parent class(grandparent) and a child class(parent) and another child class(child).

parent is having child, this child is having one more child

diamond problem:

one person can have multiple parents 
 
one parent have two child and the above two child habe one parent

			parent
			^	^
			|	|
			child
			 ^  ^
			 |  |
			parent	 
____________________________________________________________________________________________________________________
Nov 26th video:

CREATING OF OUR OWN EXCEPTIONS:

-first we need to try analyze the relation between the exceptions we have already.
-the parent of arithmetic exception is runtime excpetion.
- excpetion class and all it's subclasses are excpetions only.
-all the excpetions are internally classe's only.
- if we want to create an excpetion it has to be an class, by extending a class its becomes an excpetions class
- EXCEPTION class is from java.lang package we dont have to write the impot package.
-> throws is different from throw
-> throw me raising the exception manually in the program

->java.lang is deafult package for all the class files.

-> throwing means ur ignoring the exception.
-> when u dont want to terminate the program if excpetion occurred then go for the try and catch block method.
-> if u want to simply terminate the program if exception occurs then go for throws ioexception, so that u can ignore exception and then it will teriminate the program.

-> 5 key words in ioexception:
try 
catch
finally
throw
throws

IDE:

-always download eclipse ide for java EE developers

- eclipse
- IntelliJ

-> open soruce(which u get free of cost and also u can edit the code) is different from free(which u get free of cost).

- IBM product is RAD which has more options than eclipse.
- MyEclipse
- NetBeans


____________________________________________________________________________________________________________________

Nov 27th video:

two catch's can be written in the same catch
syntax:

catch(exception1 | Exception2)
{

} {

}


ABOUT ABSTRACT CLASSES AND INTERFACE'S:

REFER TO THE CALCULATOR.JAVA, SUBCLASSONE.JAVA, MYINTERFACE.JAVA, SUBCLASSTWO.JAVA FILES 
	FOR THE EXPLANATION OF ABSTRACT AND INTERFACES.
 
-parent class and sub class 
-parent class and child class relation is called inheritance
-by using the super class object you can access the super class from the sub class.

let's assume that a class with :

float calculate(int a, int b)
{
	return a+b;
}

the above calculate has different sub classes.

by using object we are trying to call the super class from the sub classes.

obj1- class 1 object
obj2- class 2 object
obj3- class 3 object
since all the classes are referring to the same method so it performs addition operation

modifying super class is not encouraged when we are having multiple sub classes.


 -eventhough when we dont have the method body in the sub class we cann call through creating object,
  and it directly calls from the suepr class.

 -we need to check what we have ourself in the child class first,
  then we need to go to parent method.
  
  -we should'nt change the code in the super class.
  
 -when we don't want to change the super class code then,
  we need to use method overriding and write a separate code inside the subclass which is called method overriding.
 
 -writing a method with the same signature in both super class,
  and sub class is called as method @overriding. 
 
 -writing a method with the different signature,
  but giving the same method name, this method is called @overloading.
 
 -we are creating sub structures,
  and we are expecting to execute them forcefully

 -we dont have to implement the method in the sub class which we have already implemented in the super class,
  because the method is already implemented defaultly & been calling from super class.
  so, in order to avoid this we want the sub class to forcefully avoid this for this,
  we dont need to write any default implementation method in the super class.

***********************************************************************************
Abstract Methods:

advantage:
Abstract classes are used to organize programs. 


 -To avoid the default implementation of a method we need to override that in the subclass.
 -if we are using abstract method then the class also should be abstract only
 -ABSTRACT CLASS: a class which is defined with abstract key word is abstract class.
 	Abstract class can contains 0 to n number of abstract methods.
 	Abstract class can contain 0 to n number of non abstract methods also.
 -ABSTRACT METHODS: Abstract method doesn't contain any body or methods with no body is called abstract methods,
  	 and should be in anstract class only.
  	 -abstract method cant be called directly without the method body.
  	 -if its a static abstract method, we can call the abstract method by using class name as reference  
  	 and if its a non static abstract method we call by using the object.
 -you CANT CREATE AN OBJECT FOR ABSTRACT CLASSES in the same abstract class file, the compiler says "cannot instantiate the type "class name" ".  
   if it allows to create an object then we can call the abstract method and call it in the same file itself which is not 
   	finally, if you want create object for the abstract method, in the particular subclass then we should be able to @Override all the abstract methods. 
   
   	- IN ANY ABSTRACT CLASS YOU CANT CREATE AN OBJECT EITHER IT IS PARENT CLASS OR CILD CLASS.
   WE DONT WANT TO RESTRICT THE CREATION OF OBJECT FOR CALLING OTHER NON ABSTRACT METHODS SO WE DONT USE ABSTRACT CLASS.

 -when parent class (Super class) is having an abstract class then creating the child class as abstract class doesnt let you create object, 
	- being a child class its child class responsibility to fulfill parent class'es needs, 
		it's not mandatory to fulfill all the needs if you can do that u then u need to or else u have to let them know that, doing nothing is not fair. 

 -abstract classes can contain 0 to n number of abstract methods and also non abstract methods also.
 -what happens when we call an abstract method without body?
 	ans: compiler will avoid all the ways of calling the abstract method.
 -if its a static we use class name for calling the method
 -if its a non static we use object for calling the method.
 -if we are not provide method body in super class, then we can provide abstract method body in the sub class.


Interface:
interface :
		- interface is like class only but in interface we only have structure here.
	- interfaces are mainly used in multiple inheritances.
 -if we have to use multiple inheritance then we have to use interfaces.
 -So, in the single level the maximum number of classes that you can use is only one and  the interfaces can be any number.

 when we have to use abstracts class and when we have to use interfaces?

 -interfaces can have only abstract methods, there will be no normal methods concepts here.
 -by default all the methods we write in the interface class are always abstract methods.
 		-we don't have give "abstract" keyboard here because we already gave abstract method in the parent class, even if we give also it doesnt matter.
 		ex:
 		public interface MyInterface 
 		{

				abstract boolean login();/*e don't have give "abstract" keyboard here because we already gave abstract method in the parent class, 
											even if we give also it doesnt matter.*/
				float calculate();
	
		}
	
 -instead of class we give interface while creating interface file.
 -ex:
	public "interface" MyInterface{
	}
	
	*/
 -interface doesnt suppport static and object creation.
 -if it is supporting static and object creation.
  	by using the static and object creation we call the other methods, if it supports these functionalities.  
  		to avoid these functionalities only it's not supporting static and object creation.
 -there's no non abstract methods in "interface",
 - the complete interface is like a strutcutre(means like a blue print) like a design if u want to make use of it,
 		to implement it we have to create another subclass and add the structures there
 		you have to implement the structure in the another subclass , if u have to implement the structure you have to use the key word "implements" like you use "extends".

 -to implement the abstract class and abstract methods in the interface we have to use abstract class while implementing the interface.
  
  2 ways :

  1) implementing those methods in the new subclass 
  2) make the subclass of interface as abstract class 

	ex:

public class SubClassTwo "implements" MyInterface
{
	//1st way implementing those methods in the new sub class which is SubClassTwo 
	@Override
	public boolean login() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float calculate() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

_____________________________________________________________________________________________________________________________________________________________________________

Nov 29th video:

whats the exact difference between abstract classes and interface ?

interface's have no implemented methods and abstract classes have implemented methods and unimplemented methods.


what is called as unimplemented methods?

and: A method which doesnt contain any body or body declaration,
		 these unimplemented methods are called abstract methods. 

interface's will contain only abstract methods and 

abstract classes can contain both abstract methods and non abstract methods.

if we want to define the relationshio betweem two class'es we use the keyword "extend".

today:
we will try to create couple of abstract classes and interfaces.

we will try to find what's the behavior of the member!!

we didnt find about the constructor behavior in the abstract classes and interfaces, we are not sure it will support constructors or not?
  so let's add some constructors and some instance variables with in these abstract classes and interfaces 

let's go instance variable's and constructors:

in MyInterface.java:

we can only create instance variable since, there's no method body to create local variable.
so we only have to create instance variable.


super class & Sub Class:

- we can store sub class object in the super class reference(child can act as a parent)
- we can't store parent object with in the child object.(parent can't take child properties)

	SubClassOne sOne = null;
	Calculator calc = null;
	
	calc = sOne;//storing sub class in the super class can be done.
	sOne = calc;//storing super class in the sub class can't be done


In Interface:

	- we can call this in another subclass by using MyInterface.a .
	    	since it's static we need to have static method there in sub class.
	started at 1250 pm
	
	only instance variable, can't create local variable becos there's no method body to create local variable
	if its  a non static instance variable we have to create a object to call it, but we can't create an object in interfaces.
	So, now how to access this w/o creating object in the interface? by implementing it in the another class.

	 * first we need to find the structure of the class, 
	 * to find the structure of the class we need to do it in the cmd prompt and access it using command javap "Filename".
	 * internally int a= 10; it's mentioned as public static final int a;
	 * public means we can access the method or variable or class anywhere
	 * static means w/o creation of the class or object we can access the property. 
	 * 			which mean i can directly give MyInterface.a
	 * final means that's it it is final, we can't change it it means it acts like a constant.
	 * 
	 * So, when u r creating instance variable in the interface by default
	 * 			 all the instance variables are going to be public static final. So, u can't change them.
	 * 
	 * coming to methods, internally by default all the methods we create in the interface are going to change to public abstract.

In abstract class:
	 * 
	 * if it's abstract method we need to add abstract key word and there can't be any body
	 * if it's non - abstract method don't need to add abstract key word and we have to add body
	 *
	 * note: whatever changes we make even the minor one's the eclipse will be compiling the program internally always.
	 *in bin folder we get the auto compiled program only.
	 * 
	 *
	 * when we give instance variable in the abstract class:
	 *  when we check the structure of the abstract class file in the cmd prompt, 
	 * 		we find there are no additional keywords attached to it like they were added in the interface file 
	 * 			ex: final, static , public
	 *  	
	 * In the abstract class when we declare a variable as final,
	 * 	 	then we cannot increment that(means Calling) variable inside the normal method using "this" keyword, because it wont allow any kind of editing. 
	 * ex: public abstract class Calculator{
	 *  final int a=10;
	 *   float calculate(inta, int b)
	 * 	{
	 * 		S.o.p("Inside calculator.calculate()");
	 * 		this.a++;
	 * 		return a+b;
	 * 	}
	 * }
	 *  normally, we can call the variable using this."VariableName", but the variable has been declared as final so we can't change it or edit it.
	 * 
	 * static : if u don't want to create an object to access any property of a class then u have to use static
	 * 			suppose if u want to use instance variable inside the the static method then
	 * 			 we use static keyword for the instance variable and make it available for the static method for calling using the class name as reference.
	 * 
	 * final: you just can't edit it inside the method when calling it.
	 * 
	 * for methods also we can use final variable and for classes also we can use final variable.
	 * 
	 * when your'e using "final" for the method then it can't be changed or edited anywhere else like when calling it in the sub classes or anywhere else,
	 * 	 except it can be changed or edited in the same class file where final has be declared.
	 *  ex:
	 *  
	 *  final float calculate (int a , int b)//float method
	 *  when creating final method it will allow u to change anything only here in this class file and in this code. 
	 *	{
	 *	System.out.println("Inside Calculator.calculate()); //we wrote calculate() to mean calculate method
	 	int  c = a+b;
	 	return c;
		}

	  - the intention of using abstract keyword is we used abstract to implement it later but not right now.
	  
	  - abstract and final keywords can't be used together.
	  - abstract and static keywords also can't be used together.
	  
	  - abstract class can't be final because is incomplete, because the methods are not complete in the other sub classes.
	  
	  - the class can be either abstract or final it can't be both, So final class can't be used for abstract class.
	  
	  - final can't be used even for abstract methods also,
	  
	  		int a =10;
	 		float b = 20;
	    we can't store value of b in a 
	    we can store value of a in b, because the float value is bigger than int value.
	  
_____________________________________________________________________________________________________________________________________________________________________________

	   CollectioFrameWork:
	  
	  collection is nothing but a group of elements.
	  what are the draw back s of array?
	  ans: arrays store single data type
	  		arrays size is not dynamic, means once u declare an array u can't increase the size or u can'tshrink the size.
	   
	   by considering the drawbacks of arrays they came up with collection frame work:
	   
	   collection is nothing but a group objects,
	    it will only store objects within the collection object,
	    	it can't store primitive data types(character, float, int, long) values.
	  
	  collection will only store a group of objects with in the collection object .
	  
	  if you go one time you have to get the data in a single chunk itself.
	  
	  when in a network or any communication you have to pass some data, 
	  		you will grouping the data together and sending the grouped object only.
	  
	  ex:
	  obj1 
	  obj2
	  obj3
	  obj4 
	  we have 4 objects and we need to move all of them from one place to another place or from one class to another class.
	  	instead of sending obj1 once, obj2 next and obj3 in the third iteration, obj4 in the fourth iterations, 
	  		we can be wrapping everything together by using the collection object,
	 			so in this collection object you will be adding obj1, obj2, obj3, obj4 
	 				now by adding all these four object this will become a single collection object
	 					you'll be moving this single collection object to another place might be a java program or network transfer
						So, now whoever receives this collectiong object will be fetching the data from this single collection object itself.
	 	
	 		-this same thing can be done with arrays also, but using arrays all the objects your keep in the array
	 			 should only be a single data type.
	 		-but coming to collection here like, you can give a collection of data types also. 
	 			it's not mandatory to use a single data type you can keep different data types under one single object 
	 				and send it anywhere you want or the other party.
	 
	  		-Here different data types means not only the "primitive data types, A class can also be considered as a data type 
	  
	  advantages of collection frame work is:
	 * 
	 * 1) if u want to add one more element you can add one more element to the single collection object set.
	 * 		you can also remove objects if you don't want.
	 * 2) it will be supporting multiple data types.
	 * 
	 * we can group the entire collection object into four interfaces here, 
	 * 		one single interface can have multiple implementation classes,
	 * 			based on the implementation classes we will be using them or dividing them based on our requirement.
	 * 
	 * 
	 * 		interfaces 				|	implementation classes
	 * 	_______________________________________________________________________
	 * 			Set	interface has 	|			hashSet as implementation classes
	 *								|
	 * 								|
	 * 			List	||			|			LinkedList
	 *								|			ArrayList
	 * 								|
	 * 			Queue	||			|			LinkedList
	 * 								|
	 * 								|
	 * 			Map		||			|			HashMap
	 * 								|
	 * 
	 * LinkedList is a multiple inheritance becos it's having List and Queue as parents classes
	 * 
	 * 
	 * set/queue/list/map the purpose is we have to use them for grouping the elements only, 
	 * 		depending on the requirements we will be using whether to go for set or map or queue or list.
	 * 
	 * Now, Set is a group of elements where it won't support duplicates means ex: 123 then size of set is three 
	 * 					then again if u r adding 3 or 2 it wont be increasing the size, but instead it will be overriding with the previous value only.
	 * 
	 * Now, List is a group of elements / collection of objects but this supports duplicate elements.
	 * 	ex: if we add 123 now the size is 3 and again if we add 1 then the size will be increasing to four.
	 * 
	 * Now, Queue will be using internally first in first out(FIFO) mechanism.
	 * 
	 * Now, Map will be expecting "keys" and "values" pair where key should be unique and values can be duplicated.
	 * 			basically, key is like a identifier and value can be duplicates.
	 *				keys is like set and values are like List 
	 *
	 *def: an object that maps keys to values. a map contains duplicate keys, each key can map to at most one value.
	 *
	 * Note: all these classes and interfaces belong java.util package.
	 * 

	 	we don't create any variables with any access specifiers.
	 * access specifiers : public, private, protected, default
	 * 			default is not a keyword, default is default only we don't use it as keyword.
	 * 			most of the time we will create with "private" only.
	 * 	we should mention the type of access specifiers then only it will be applicable
	 * 	ex: if u use public then only it will be public
	 * 		if u use private then only it will be private
	 * 		if u use protected then only it will be protected 
	 * 		if u don't give anything it will be default access only providing default access only.
	 * 		
	 *-the particular class with only getter and setter methods is called "bean class",
	 *		in this particular class we only write a few variables and getter and setter methods that's all.
	 *
	 *-in this bean class whenever your'e creating an instance variable we need to use private as access specifier.
	 *- if private is given this particular variable cannot be accessed outside, 
	 *			but still if u want to access the name variable outside we can make use of our public methods get"variablename" and set"variablename" methods.
	 * 
	 *- if u want to set go for calling set"variablename" methods. 
	 *- if u want to go for getting the value  go for calling get"variablename" methods.
	 *
	 *if you don't give private access specifiers for the variable then u can use the variables directly without using get and set methods.
	 *		So, to avoid calling directly we are giving private access specifier
	 

-to initialize the instance variables we can use constructor method. you can create an object and call the object.
		if you don't want to use constructor method to initialize these instance variables,
				we can use the method called setter method. */
		
-setter method -> whatever we have written in between constructor the same thing we will be dividing into different methods
		format: 
		public int getAge() {//all the getter methods depends on the data type(which data type they are returning)
		return age;
	}
	public void setAge(int age) {//all the setter methods are with the return type void, because we are setting here not returning anything
		this.age = age;
	}

ex:

import java.util.HashMap;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//now we are creating map<k,v> object
		HashMap<String,Student> map = new HashMap<String,Student>();
		we are replacing v with Student here why because the type of values, 
		 * 	which i am  going to deal in my example is student class objects, 
		 * 		we just mentioned the type of object name here the type is nothing but student 
		 * we need to consider that even the class acts as a data type internally.
		 * since, we string keys we change the k as String
		 * 
		 * ctrl+shift+o is for organizing java.util packages.

		 * 	now after creating hash method object, now need to store or keep some data with in the map,
		 * 		now we need to find couple of methods to add or store the data
		 * 			the names for adding or storing the data is "put, store, add" to search them in the java api documentation.
		 *  
		 *  put(K key, V value) - to store or add 
		 *  
		 *  Now we need to create methods which gives student object (means student class object).
		 *  	ex:if it is going to give integer object we need to make the return type as integer.
		 *  		same way since, when it's returning student object we need to make the return type as student.
		 *  
		 *  key should be unique, even though if u use the same key for another value its gonna override the previous value
		 *  
		 *  Now, to call the create student method again i have to create the different different students object by passing the three parameters for the application class, 
		 *  	just to avoid that we are making the below student method as static. 	
		 *  		this is just for our convenience.
		 * 
		 *  we have created the map variable here only with in the main method so which means your'e creating the variable and 
		 *  	using it in the same method both things are happening in the static context only.
		 *  
		 
		//now, we are trying to store the createstudent parameters in the st1 variable and we are passing the three parameters we are not using object or classname as reference
		Student st1 = createStudent("name1","address1", 26);
		Student st2 = createStudent("name2","address2", 26);
		
		 we r not using create student object or classname as reference, we can use this directly when this is in the same class, 
		 * 		but when it is in different class we can't call it directly and also it will be checking in the current class only, 
		 * 			so when we are calling outside this same class we need to call using "classname.createStudent".
		 * 
		 * Now, we have to add  the above two objects st1 and st2 with in the map, 
		 * 		to the add data to the map the method we have seen is "put(K key, V value)" in this we replaced k with string and v with student here.
		 * 			so now when we try to call map.put it's gonna show us string, student.
		 * 
		 * Here internally, put method is non static method, but we are still able to use it here because we are not only using put method directly, 
		 * 		for calling that method we are calling it with object(map is the object) now.
		 *  		thats why it's working now, if your'e not using object and ur trying to call it directly it's not gonna work it's gonna throw an error.
		 *  
		 * if the method is not in the static context but the method your'e trying to call is combined with the static context object it will work without errors. 
		 * ex: map.put(K Key, V value), put is a non static method but map object is a static variable sp if u combine these two it will work.
		 *  
		 *  static variables can't be created within the method, you can only create in class levels only.
		 *  
		 *  
		 *  
		 
		map.put("ID1",st1);//key value as ID1 and value as st1 which we stored the parameters in the above create student
		map.put("ID2",st2);
		//map doesn't support duplicate values in the key , if u give duplicate value its gonna override the old one and keep the new value.
		 
		 	now we need to fetch the data form the map above and  read the objects here, 
		 * 		we need to check what are all the method it supports for fetching the data.
		 * 			method: map.get()
		 * 
		 
		Student st = map.get("ID2");//storing the data in a variable st 
		System.out.println("Name:" + st.getName());//displaying the  value
		System.out.println("Address:" + st.getAddress());
		System.out.println("Age:" + st.getAge());
		
	}
	
	//Student method
	static Student createStudent(String name, String address, int age)//based on the 3 values we are preparing the student object 
		//here, create student is method of this particular class only if u have to call it outside this class you need to use"MyApplication.createStudent" 
		//since create student is also static method, we are able to call it in the above static main function.
		{
			Student st = new Student();//creating student object 
			//calling all the setter methods
			st.setName(name);//passing name
			st.setAddress(address);//passing address
			st.setAge(age);//passing age
			return st;//returning the student class object here
		}
		
	}

___________________________________________________________________________________________________________________________________________________________________________________________________________

Nov 30th video:


whats the difference between linked list and array list ?

if there are any multiple implentation classes  either linked list or array list will be synchronized the other one is not synchronized.

its matter of order: one will be following the order the other may not be following the order.


ex: for file system  program 
				|

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	
	public static void main (String args[]) throws IOException
	{
		FileInputStream fis /*fis is the object*/ = new FileInputStream("/Users/saigopal/Documents/javapractice/BasicCalc.java");
		 
		/*when the string contains invalid escape or valid escape characters,
		 *		instead of giving backward slash you can use forward slash or you can also give two backwards slashes "\\".
		 * Now, we need to read the file to display the output to do that we have to use read().
		 * to close fis we use "fis.close"
		 */
		
		int size = fis.available();
		
		/* the below code for reading by iterating multiple no. of times
		 * 
		for (int i =0; i<size; i++)
		{
			int a = fis.read();//assigning a  variable to the read method.
			System.out.print((char)a);//for converting integer value to character value.
				//to print in the same line we removed ln in println 
		}
		fis.close();
		*/
		
		
		//for reading data at a single shot
		byte data[] = new byte[size];
		fis.read(data);
		String fileContent = new String(data);
		System.out.println(fileContent);
		
		
		}
		
	}
 *  
 * after one hour:
 * 
 * file system: refer to FileRead.java , FileWrite.java files for more information.
 * 
 * to read from the file and to write to the file.
 * 
 * fileinputstream and filereader  are both recommended for reading a file.
 * 
 * ex: to read ur resume or any other text file.
 * 
 * FileInputStream(String name) : method is the easy way to call a file .
 * 
 * convert and integer value to character you can directly give "(char)" .

 	so, it doesn't matter if your'e using FileInputStream(reads byte arrays) or FileReader(reads character arrays),
 * 		 FileOutputStream(reads byte arrays) or FileWriter(reads character arrays).
 * 
 	we have total two sets of files one will be reading byte arrays and the other one will be reading character arrays.
 * 
 * 
 	internally if we have any huge contextual data to read then we have to go for filereaders and filewriters.

ex:

 import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 */

/**
 * @author saigopal
 *
 */
public class WriteFile {

	/**
	 * @param args
	 */
	public static void main (String args[]) throws IOException
	{
		
		int value = 10;
		FileInputStream fis /*fis is the object*/ = new FileInputStream("/Users/saigopal/Documents/workspace/cake.jpg");
		 
		/*when the string contains invalid escape or valid escape characters,
		 *		instead of giving backward slash you can use forward slash or you can also give two backwards slashes "\\".
		 * Now, we need to read the file to display the output to do that we have to use read().
		 * to close fis we use "fis.close"
		 */
		
		int size = fis.available();
		
		/* the below code for reading by iterating multiple no. of times
		 * 
		for (int i =0; i<size; i++)
		{
			int a = fis.read();//assigning a  variable to the read method.
			System.out.print((char)a);//for converting integer value to character value.
				//to print in the same line we removed ln in println 
		}
		fis.close();
		*/
		
		
		//for reading data at a single shot
		byte data[] = new byte[size];
		fis.read(data);
		String fileContent = new String(data);
		//fileContent = fileContent.replace("StringtoReplace", ""+10);//for replacing a particular old value into a give new value for the output file.
		
		FileOutputStream fos = new FileOutputStream("/Users/saigopal/Documents/javapractice/OutPut.jpg");
		//for writing the contents of the file to a new file
		//we are trying to copy byte to byte from one file to the another one.
		//fos.write(fileContent.getBytes()); //this works only for text and doesn't work for pictures
	
		fos.write(data);//this works for copying or reading and writing the pictures also
		fos.close();
		
		System.out.println(fileContent);
		fis.close();
		
		
		}
		

}

 so, it doesn't matter if your'e using FileInputStream(reads byte arrays) or FileReader(reads character arrays),
 * 		 FileOutputStream(reads byte arrays) or FileWriter(reads character arrays).
 * we have total two sets of files one will be reading byte arrays and the other one will be reading character arrays.
 * 
 * internally if we have any huge contextual data to read then we have to go for filereaders and filewriters.


_____________________________________________________________________________________________________________________________________________________________________________ 	__________________________________________________________________________________________________________________________________________________________________________
 
Dec 2nd video:

Networking:

the communication and connection between multiple machines.

internally, each and every domain is runned from a server, 
		if you want to access that we need the ip address of that machine.

masking of ip addresses with names is called host names or domain names.

ip addresses are referring to Inet4Addresses and Inet6Addresses in java which helps us in fetching ip address.

String hostname;
Inet4address 

ex: of a method name

public class FindHost {
	String hostname = "www.google.com";
	InetAddress ip = InetAddress.getByname(hostName);
	System.out.println(ip.);
}

Inet4address xyz(String)



//java program to get the ip address of given website name

import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindHost{
	public static void main (String args[])  throws UnknownHostException {
		
	//String hostName = "www.google.com";
	InetAddress ip = InetAddress.getByName("www.facebook.com");
	System.out.println(ip.getHostAddress());
	
	//ip.getHostAddress() -> return s the ip address string in textual representation
	
	}

}

 *we can't find multiple applications on a single port number
 * 
 * client should know the servers ip address and port number.
 * 
 * we should create an ouput channel for server and input channel for input
 * 		port number will be acting like a communication channel,
 * 		 	entry point or exit point for the particular channel
 * 
 * if your'e creating an object for the class it will be calling the constructor internally.
 


 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main (String args[]) throws IOException
	{
		ServerSocket ss = new ServerSocket(1099);
		System.out.println("trying to connect..");
		Socket s = ss.accept();//listens for a connection to be made to this socket and accepts it.
		System.out.println("Connected!!!");//we will get this msg after getting connected  
		//u shld msg from the socket , entire communication will happen only in socket.
		
		//from the socket we are trying to get the output stream, this is sockets outputstream
		OutputStream os = s.getOutputStream();//outputstream is for sending something out from this particular server .
		//after we get the outputstream we need to attach this to the printstream object
		//this OutputStream is not a normal outputstream, we are getting this one from the socket.
		PrintStream out = new PrintStream(os);//creating printstream object and passing output stream through it. 
		
		//this out.println() is going to send the message to the above outputstream 
		//out.println("hi how are you?");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
		String msg= "";
				while (  !(msg = br.readLine()).equals("exit") )
				{
					out.println(msg);
				}
		s.close();
		ss.close();
	}

}





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	public static void main (String args[]) throws IOException{
		Socket s = new Socket("localhost", 1099);
		/*creating socket object , inside passing host name and port number,
		 * 		local host means it's in the same machine.
		 * 
		 * 
		 * 
		 */
		 InputStream in = s.getInputStream();
		 InputStreamReader isr = new InputStreamReader(in);
		 BufferedReader br = new BufferedReader(isr);
		 
		 String msg = "";
		 while((msg = br.readLine() )!= null)
			 /* it will be keep on calling the readLine(),if there's something in the readLine() it and it stores the value in msg variable 
			  * 	if the msg is null it will come out of the loop,
			  * 		 if not it will execute the print statement.
			  */
		 
		 {
		
		 System.err.println("from server " +msg);
		 }
		 
		s.close();//closing the socket connection. 
		
	}

}

_____________________________________________________________________________________________________________________________________________________________________________

Dec 3rd video:
	
	What is a thread? ans: a thread is a light weight process.
	
	Threading is nothing but a separate part of execution.
	
	Thread is a class which is in java.lang package which is a default package.
	
	jvm allows you to have multithread environment.
	
	Every thread will has a priority, if a thread is having high priority it will be executed first.
		if a thread is having low priority its be executed next to the high priority.
	 
	A thread may or may not be marked as a daemon, 
		daemon thread means a thread which is a never ending thread.
			if it is required we mark it as a daemon, 
				if it is not required we don't mark it is a daemon.
	
	If you are trying to  create a thread, from another thread so the parent thread who's having a priority,
		to execute the parent thread that same priority will be applied/copied to the new thread also. 
	
	There are two ways to create a thread of execution.
	1) one is to declare a class to be a sub class of thread. 
			this subclass should override the run method of class thread.
				An instance(the Object of the subclass(create an object for the sub class)) of the sub class can be allocated and started.
				
	calling the run method directly is different from calling the start method. what's the difference?
		whenever we call the start method it will start the execution of the thread and it will also start the main method.
	answer:
		a)- when you execute run  method it will directly execute only the run method.
		
		b)- but when u call the start method internally it will start the execution of the thread, 
			now what will happen is we are executing the start() method internally we are triggering the run() method.    
			
		- The default running thread in java program is "main thread" it's not due to method main it's just a coincidence of the name.
			
			we can even set name for the thread 
			ex: demo1.setName("gopal");

		For each and every iteration we need to wait for one second, if we can make the thread wait for some time everything will be called in time.
			we need to use the sleep method here, sleep method is  an instance method so we can call directly by using the class name Thread.sleep(milliseconds)
				1000 milliseconds is one second
		
		In the thread class it's not throwing interrupted exception in the run method. 	
			in the java api documentation ther's no interface exception.
			if it is having interface exception we can use it as there's no throws interface exception thats the reason we have to use try catch block method.
			
		At one point of time, you may not be having any control over threads because the threads priority of execution or the threads order of execution.
		 	it will be depending on so many factors like the environment of execution it depends on running environment also, 
		 		sometimes it will be interrupted by eclispe environment also.
			
		
			If we don't want to support parallel execution, we need to use synchronization.
		we can make the complete run method as the complete synchronized method. if u make any method as synchronized only one thread will be executing at a time.
			
		ex: put this in the run method 
		synchronized(this)
		{
			//remaining code 
		}
			
	2) The other way to create a thread is to declare a class implements Runnableinterface, that class implements the run method. 
			An instance of the class can be allocated, passed as an argument when creating thread, and started.
			
			
			continuation in ThreadsDemoMethod2.java file

			the way they are running it:
			
				ex: PrimeRun p = new PrimeRun(143);//creating an object for the subclass
					if we have to use this instance somewhere else thats the reason we are storing this in the variable and we will be using that variable
					new Thread(p).start();//the subclass object they are trying to pass it through the thread class object
			
			this is also one way to create multiple threads, earlier if u go for extend thread class if u want to create multiple threads you may want to create multiple sub class objects.
			But in this case if you want to create  multiple threads you can use single object.(by using single object you can create multiple threads)
			
			when the object is synchronized and it is already being accessed by first thread it will be locked and the next thread cannot access it until the first finished the execution.
			so, just because of synchronization the second thread is not able access the run method object.
			
_____________________________________________________________________________________________________________________________________________________________________________		
		
	 
 dec4 th 
 * _________________________________
 * 
 * if it is a book ticket first we are trying to lock train object and 
 * 						then compartment object.
 * 
 * if it is a cancel ticket first we are trying to lock compartment object and 	
 * 						then trying to lock the train object.
 * 
 * both the resources and threads are occupied. so, one thread is locking resource 1 and it is waiting for resource 2. now, the thread two is locking resource 2 and waiting for resource 1.
 * both of them are not ready to release their resources, but of them are waiting for the other thread resources. so, now this wont terminate and this particular situation is known as "deadlock situation".
 * 
 * DeadLock:
 * means couple of threads are holding their resources, they are not releasing and waiting for the other threads resources, where the other thread are also doing the same.
 * 		both of them are not ready to release their own resources but waiting for other person to release the resources.
 * 
 * when executing this program, it is still running not terminated this is called deadlock situation.
 *
 * Solution to avoid deadlock situation:
 * to avoid we don't have any specific solution, the only thing is we are getting deadlock its due to developers logic.
 * so, whenever we write the logic we need to make sure that deadlock doesn't occur.
 * 
 *Now, instead of coming in two opposite directions. we need to use single direction like even while using CancelTicket we should try to lock train object first and then lock compartment object like TrainTicket, instead of compartment object first and then train object. 
 * 
 * when we access train object with CancelTicket in parallel to the train object with BookTicket, here only the program will try to make the CancelTicket wait for sometime until the BookTicket releases the train object because the BookTicket already locked the train object.
 * when BookTicket release train object it will now try to lock the compartment object, still CancelTicket is waiting for the train object which is ok.
 * 
 * Now, BookTicket will be locking the compartment object, as the compartment object is also free. Then, CancelTicket will be locking the train and then it will be locking the compartment object after this it will finish the execution.
 

Next topic: AWT (Abstract Window Tool Kit)
 
SWING is extending the feature of AWT, swing is the child of AWT.

AWT is the old topic, SWING is the current trending concept.

now, we are creating the single window or frame using AWT concept.




____________________________________________________________________________________________________________________

December 5th Video:

JDBC : Java Database Connectivity
by using jdbc we can interact with the database servers.
-interacting with the database servers, to store permanently we use the file system.
-if you want persist some data, we have th eoption of file system. to store or open or read we used file systems until now.
-But, in database server we use to store all the personal data.

-		file system 						vs 			database 
 
- oracle database, my sql are similar but not same.

how to interact with the oracle database ?
- client is an application where it is trying to access the server.
- tools to connect with the database tod , oracle sql developer and more different kinds of applications.  
- a client is nothing but an application or program trying to access the server.
- connecting with the database server:
				command : "connect username/password"

steps: to ineract with the database servers:

First, we need to know the driver to access the database server 
depending on the database server we need to change the driver names.
"Driver is nothing but an entity which is acting as a medium in between the client and a server", using the driver only we can establish the connection.
1.Register Driver
		which driver we need to register? -we need to register the "oracle driver",then java will understand ok i am trying to talk to the "oracle sql server". 
		-if we need to access the postgrade sql then we need to register that particular driver.
		-if we need to access the my sql server then we need to register the "mysql" driver.
		-to register driver: we need to know which driver and what it will do? and what oracle server driver is?
						DriverManager class -- makes a connection with a driver
						(Driver is used by DriverManager Class only)
						implementation of driver: who will be implenting the driver? the oracle database server will be implementing the oracle driver interface.
						Driver interface -- provides the API for registering and connecting drivers based on JDBC technology ("JDBC drivers"); generally used only by the DriverManager class
				why do we need driver interface ? just to main the structure in a unique form
				Jdbc and Odbc drivers are two types of drivers 
				everyone uses the thin driver now a days.
2.Get connection             -> DriverManager(to get/create the connection we need the driver manager), Connection(used to manage the connection we need the connection interface only)
				1.Location
				2.username
				3.password

3.Create statements  		->statement, Prepared Statements, CallableStatements.
4.Execute Query
5.Close Connection

Relational Database:
a relation is nothing but table only(tables and columns)


some useful hints in using the jdbc driver:
1) import the necessary JDBC classes in your programs that use JDBC.
 	ex: import java.sql.*;
 		import java.math.*;//if needed

 2)URL: jdbc:oracle:thin:@localhost:1521/xe
 UserName: UserName(your)
 Password: password(your)

 Driver -> oracle.jdbc.OracleDriver

 3)Connection conn = new oracle.jdbc.OracleDriver().defaultConnection();

there are three types of statements:
  we can execute the "prepared statement", "statement", "callable statement".





____________________________________________________________________________________________________________________

December 6th :

JDBCDemo.java file check for example.

in database query executions while updating the tables to avoid lnger time executions, 
	we can USE "PreparedStatements"

	PreparedStatements: we use "?" this is nothing but place holders they are called "positional parameters"

	ex: String query = "insert into classes values('chemistry',"+i+")";

		String query = "insert into classes values(?, ?)"; -> this is called prepared statement

			//passing prepared statement values
			pstmt.setString(1, "physics");
			pstmt.setInt(2,i);
			pstmt.executeUpdate();

		PreparedStatements should take less time than the usual statement.



CallableStatements: used for stored procedures 

- to execute stored procedure or resuing the code.
- write the code one's and execute it multiple times.
- In database we will be creating some procedures, 
		where we will be creating a group of statements which will be excuted together whenever we are calling it, is called stored procedure.

- Stored procedure is a kind of method which resides at database level.
-if you dont want put burden on the java servers then you can use "stored procedures".
ex:i want to increase the score for all the students id available at test3 database.
		so we write the code at server level which is stored procedures.

if we want to create the procedure;
	command -> creat procedure "name of the procedure"
	ex: create procedure myproc
		create procedure sai

if the procedure is existing we dont want the query to fail.
	so for that what we do is? 
		ex: create or replace procedure myproc
			create or replace procedure sai
	the above create or replace means, if it is not existing it will create it and if it is existing it will try to replace it.

in database first we have to give the variable name and then data type.

ex: +------------+------------------+------+-----+---------+-------+
| Field      | Type             | Null | Key | Default | Extra |
+------------+------------------+------+-----+---------+-------+
| student_id | int(10) unsigned | NO   | PRI | NULL    |       |
| test_id    | int(10) unsigned | NO   | PRI | NULL    |       |
| score      | int(11)          | NO   |     | NULL    |       |
+------------+------------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

ex: 

create or replace procedure myproc(no in int, inscore  out int) as
score int;
begin; 
select score int inscore form scores where id = student_id;
inscore := score + 10;
end;
/







_____________________________________________________________________________________________________________________________________________________________________________

Dec 7th : Now Entering into "Java Enterprise Edition"   We google "java Enterprise Edition 8 API Specifications"

Java Servelets

what is Servelets and why we need servlets?
when we are entering URL, it goes to the server. we get some information about that website, the internal process what had happened we dont know but for dynamic web pages we use Servelets.

we will be using servlets for the web based applications.

Servelets is also nothing but a java program, but this wont be having any main method. In java Servelets we will be writing program without main method.



From java Enterprise Edition 7 API Specifications:

java.xservlet -> The javax.servlet package contains a number of classes and interfaces that describe and define the contracts between a servlet class and the runtime environment provided for an instance of such a class by a conforming servlet container.

Servelet container means a container which is having a group of Servelets. So, we will be calling a "servlet container is nothing but server only"

Servlet:
A servlet is a java program which will be executing at server side.

programatically: Servelet is a java program, which will be implementing servlet interface.

we will be running the servlet programs in the server only.

Now, the javax.servlet package we may be able to find out at the server side only.

coming to javax.Servelet package we can identify that partticular jar file in the server side only.

coming to servers we have different different servers in the market, 
if we want to run servlet programs we can choose any Web Server or Application Server anything is fine.

1. Web server:
		Tomcat is from apache organisation.
		Jetty

2. Application server: Is nothing but normal webserver only, but we will be having some additional features. 
							So, whatever the program we are able to execute in the Web Server, the same can be executed in the Application Server also. 
									But you cannot execute the Application Server program in Web Server Program.
		WebSpeher (Premium Version)
		Jboss (Opern Source)
In tomcat folder you can find the .jar files in bin folder.
servet-api.jar is the one whic we use for java servlets.

To set class path use this command in terminal :
		export CLASSPATH=$CLASSPATH:/path/to/file/java-servlet-api.jar
then:

source .bash_profile
Solution 2: Open terminal, type command:

vim ~/.bash_profile

press i, add your file to classpath like sample.

then, press esc, type :wq, then return

Make effective: don't need restart, type:

source .bash_profile


After compiling the MyServlet1.java file:

If we want to verify the program and if we want to verify the functionality. I need to deploy the same thing in the server application.
we need to create the web application first.

Web Application:(folder structure)
	ProjectName
		WEB-INF
			classes(if my project is containing any separate classes put them in this folder.)
			lib(if my project contains any jar files put them in the lib folder.)
			web.xml(this is called as deployment descriptor)

web application means we can access everything by URL's.

* once the project folder is ready we need to copy this project folder into the tomcat server folder.

-while writing xml file for the elements we will find the ? and * after the name of the elements word,
		they are for ? - 0 to 1 time which if there is a "?" after any name of the element that element can only be used 1 time in the xml document.
				 for * - 0 to n times which if there is a "*" after any element that element can be used 0 or n number of times in the xml document.
-if there's no ? or * after element that means they have to be written compulsorily/mandatory and used only one time.

we can write web app without any servlet element tag or with any n no. of servlet elements tags.

	<servlet-class> or <servlet-jsp-file> elements are mandatory to implement in the web.xml file.

Whenever, we are writing any tag or something in xml we can find two types of tags.
 	1) one tag which is expecting data in that particular tag.
 	2) and one tag which is expecting sub tags within that particular tag, 
 				if it is expecting the sub tag it will be mentioned with what are all the sub tags available in the dtd.
 				if it is not expecting any sub tags and it is expecting data it will be mentioned with (#PCDATA) inside the element tag.
 
 refer to web.xml file in ServletDemo folder.

 						ex: <!ELEMENT servlet-name(#PCDATA)>
 					for this above particular tag the data will be used in servlet mapping, filtering also.

 		<!ELEMENT servlet-class (#PCDATA)> -> the servlet-class element contains the fully qualified class name of the servlet.

 		<!ELEMENT Servlet-mapping> -> with in the servlet mapping also we need to put Servlet-name as well, 
 											the same name should match with anyone of the servlet tags.	
 														when we have multiple servlet-name tags, 	
 																to differentiate for which servlet-name we are writing the servlet-mapping we have to write <servlet-name> tag as the mandatory in the <Servlet-mapping>
 		The servlet-mapping is used to access the particular java program when the url pattern is being called. when we have many servlets and we need to call them we mention servlet name and url-pattern in the <Servlet-mapping> tags.
 		if we have 10 differnet servlets then we have to write 10 different servelt-mappings. if they have different url's.

 		after that, for that particular servlet name or servlets what is the particular URL pattern <url-pattern> that your'e going to support? that one also we need to mention in the <Servlet-mapping>
 				<url-pattern> 
					/testURL	//so when ever i give the testURL in the browser it will be internally trying to execut the MyServlet1 java program. 
			</url-pattern>
			so, to open the particular mentioned java program we use <url-pattern> tag and mention the url name in the url pattern tag.

whatever, application we have written we put in the server and to interact with that particualr server we need a client application. that client is nothing but the browser here, 
			by using browser only we can access the web server applications right. webpages or websites we can access by using browser only. so, a browser is ntohing but a webclient for us.

so, even now when we need to access the web applciation or web pages we need to give the ip address. since we are deploying in our local laptop we use localhost.
		ex: https://localhost:8014/ServletDemo(ProjectName)//testURl(url-pattern)

____________________________________________________________________________________________________________________


Dec 9th video:

check MyServlet2.java, web.xml, Registration.html file for this example explanation.

In how many ways can we create a servlet program?
if we want to make a normal java program as servlet what we have to do? 
ans: we need to implement Servlet interface.
	ex: public class MyServlet1 implement Servlet

for every servlet program we need to have java servlet file, web.xml file and html file.
	- folder WEB-INF is used for server purpose and it is called as private directory.
		we can't access the resource which is in WEB-INF direclty, which is the reason we create web.xml file and we will be giving some "url" for the matching java program in the backend.
			ex: we gave "/testURL" so whenever it hits /testURL we shall execute that paritcular java program which it is mapped with. So, whenever we hit /testURL it will be redirecting to MyServlet java program whatever methods are inside that java program.
			


Now try to identify how many implementation classes are there?
ans:-> google java ee api documentation
	-> there are 3 types of implementing classes faceservlet, genericservlet, httpservlet
	-> we normally use httpservlet and genericservlet, we dont use faceservlet much.
	-> in genericservlet the parent class is servlet.
	-> the httpservlet is extending genericservlet.
			->which means grandparent is Servlet, parent is genericservlet and the child is httpservlet.
			->which one should we use now? ans: httpservlet why? because it can inherit all the parent classes
So, if we go for servlet inerfaces in the MULTILEVEL inheritance you can implement only the servlet interface nature.
	if we go for genericservlet, you can extend generic Servelet nature and servlets nature also.
	if we go for the bottom layer httpservlet also you can get the properties of httpservlet and genericservlet and Servelet interface as well.

thats the reason a better way to create a servlet program is let's go for "httpservlet" 

 Now, we have to identify what's the difference between httpservlet and genericservlet?
-> genericservlet is a abstract class and "we cannot create objects for abstract classes"

-> if the class is marked as abstract means 1)we cannot create an object.		
 											2)we have to extend this 
 											3)There's a chance of havig abstract methods with in the genericservlet class.
In, genericservlet class there's only one abstract method and that is service.
		if we are implementating Servelet interface then we have to override all the 5 methods here.
		if we are going for extending Servlet then we no need to override al the 5 methods, then we can only implement one method called as service method.
Coming, to httpservlet is it abstract class or non-abstract class? it is abstract class.
	so, in httpservlet can we create an object directly? if it is an abstract class we cannot create an object directly.

So, now what we have to do if we really want to create httpservlet object we have to "extend" it. 
	As it is marked as abstract class are there any chances of having abstract methods inside that? yes there are abstract methods.
	Is it mandatory to have an abstract methods with in an abstract class? no, it is not mandatory.
Coming to abstract class we can write 
					-> 0 to N number of abstract methods.
					-> 0 to N number of non-abstract methods.

Abstract class is a combination of both abstract methods and non abstract methonds.
		 we can write any number of methods, Even if we create an empty class with an abstract keyword that is fine.

So, now let's check for any abstract methods are there in httpservlet abstract class.
	there are no abstract methods in the httpservlet class. so, we dont have to provide any methods in this class now.

When we are trying to extend httpservlet we dont even have to provide service method also. It will be having it's own default implentation.

But our requirement is not like that, if we want to do something we have to override service method and we have to our own business logic.

		Service method is something like "main method" for your servlet program.
	What exactly will main method does in our java core program? Whenever we are trying to execute the program by default it will be start the execution from the main method.
	In the same way,Coming to Servlets whenever we are doing something in the servlet program, the method which is going to execute all the things is like "service method".
	Now, if we observe in the httpservlet class. There are 2 service methods are there.
					1) Service(HttpservletRequest req, HttpservletResponse res)
 					|->Now when we go for , if we observer Httpservlet interface is extending with Servlet request interface. So, whos is parent(Super Class) ? who is child(who is Sub Class)? 
 						ServletRequest is SUPER class here & HttpservletRequest is the child.
 						SO, which one we have to go for now? we have to go for child(becos child will be extending the properties of parent) If we take child it is equivalent to taking child and parent properties.
 						whenever we have multiple choices we have to go for Child(Sub Class).If we take parent alone we wont get the child properties. So, that's why we have to go for choosing child(Sub Class) properties.
 						
 			That is the reason i am going for service method which is expecting "Service(HttpservletRequest req, HttpservletResponse res)" as parameters.	
 			This service method is expecting two parameters HttpservletRequest and HttpservletResponse, request object and response object.	

 			If we want display at the broswer(Client side application), at client level i want to display something but not in the server console, what we have to do?
 			So, how are we gonna trigger the service method? or If i want to call the service method what we have to do?
 			We won't call the service method directly, 
 			When will the service method be executed? when we hit the URL button it will first goto inti method and then it will be going to service method.
 			We are not passing the request and response object here. 
 				we are jus tmentioning that service method is expecting the two parameters we are not passing the request and response objects here why because is we are not the person whose calling the service method, internally the server is calling the service method. 		
 				ex: we use tomcat server for hosting the webapplication, internally the tomcat server is calling the method.
 				why is it calling the method only and what exactly it is doing?
 				-> it is providing both the request object and response object. The request object is nothing but HttpServletRequest  and the response object is nothing but HttpservletResponse.
 					How we are calling this is just by clicking the browser button from the browser only we are calling it.
 	Why we are calling it from the browser?  whatever the request we are passing right that comeplete request related information will be caputred by the request object.
 		ex: from the browser if we are passing any headers or something or any form related data or if we are passing url related everything will be coming in the request object. That means the complete request related information we can get it from the request.

 			so, the complete response the response is nothing but what we are trying to display/sent back to the browser. If we are swnding any cookies or textual data or any header information or whatever the complete response will be handled by response object.
 			This is how internally how request and response objects will be working in the servlets program.

	whatever the response related information we need to send back to the browser. that will be handled by the response object.
	whatever the request related information we need to get intp the program. that will be handled by the request object here.
SO, Now im trying display something on the browser so, if i want to display something on teh browser which one i have to use?request object or response object?
	ans: response object.
			if it is request method, initially it will try to initiate the service method and it will be trigerring that. that means this is request, but whatever we are seeing in the browser is response. we have to use response object.

			let's go for ex: resp(object).addcookie
								resp.getOutputStream();

 					2) Service(ServletRequest req, ServletResponse res)

 	
TASK: i am trying to get something from a browser like a form data. So, if i want to create a form something like registration form. The registration from contains name, address & country only these 3 parameters.	
		So, this is a static form or dynamic form. is this going to change from person to person?
			obviously no, it will be same for all the persons. To create these kind of static html pages we no need to use servlets. 

Servlets programming why we are using is to do something with the server code. we dont need server to create a simple html form.

Static html pages doesn't need or doesn't require any server. som if we do any changes in the html pages also we dont need to reset the server.

AS per our previous session what we did is? we kept all the non java programs we have to keep them with in the project folder but it should be outside WEB-INF.
	whatever the html pages we create those should be inside webcontent folder and outside WEB-INF folder.
	Select html file in the webcontent -> new -> html file.
	where we will have name, address, country and clear button.
->The common locatoin where both the servlets can share the data that particular object is called "Servlet Context Object"
->If you keep something in the servlet context object it will be available for the entire application so, whoever wants to reuse the servlet context object they can use it by different servlets.
->So, we have seen the servlet cofig object as part of the default methods in servlet interface. This particular config object will be actually for per servlet, 
	So each and every servlet will be having one servlet config object but the entire application will be having a single "servlet context object"
	If we add any parameter in the servlet context object then it will be availabel for the entire application.


____________________________________________________________________________________________________________________

Dec 10th Video:

check the project folder 09- ServletDemo folder for the all the examples programs and their explanations.

In the servelt programs that we saw on dec 9th video we saw what are the objects we have seen?
ans: request objects and response objects.

if we want to create a program with java servlet and jdbc we need to create jdbc connection inside servlet only.
 
//creating table in MySql:
create table JDBCDemo(Name varchar2(25),
	Address varchar2(25),
	Country varchar2(25));

Servlet context :
Application related objects like connection object or internal kind of object are there. So, those objects they can be kept in the application servlet context.
	that means those objects are not specific to the user, they are specific to the entire  application those objects only we have to keep in the application servlet context object.
		thats why everyone will keep the object name as the "application".
__________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

Dec 12th video: continuation of java servlets....

- what ever sensitive information/data we are passig in the webpages like username and password they are supposed to be only available for that particular session, 
			they should not be available after we close the browser page/tab/session.
	
	so, where do we keep the data and this type of activity is called what?	for this what should we do?
ans: They are called session, so whatever data we are passing here should only be available for this session, it should not be available for the other session. In this kind of cases we need to use session object here.
		So, we can make use of session object. We only get session object from "request" only.
			ex: req.getSession();


JSP => Java Server pages

we use JSP for UI purpose, for the UI purpose what we can do is instead of using basic servlets we use JSP's.


_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________


Dec 14th Video:   Hibernate

where do the jar files gets saved or downloaded?
macintosh hd -> users-> saigopal -> .m2 -> repository -> (you can find all the jar files downloaded) -> hibernate -> hibernate-core -> "jar files"
to track the hibernate related jar files, track for the hibernate rekatede group name "org"  -> hibernate.org -> hibernate  

what exactly hibernate ? why do we need hibernate? what are all the advantages of hibernate?
ex: we are trying to create the user management service, as we spoke earlier.
 		we are trying to work with the "user management" crud operation.

 		CRUD - Creating , Retrieving, Updating, Deleting
 				creating the user
 				Retrieving the user
 				Updating the user
 				Deleting the user
we have 4 operation that supporting our application.

let's take an example still we are using oracle database server, in that oracle database server's table  to insert the data we will be writing one insert query. 
	ex:  insert into "table name" values .....
	coming to mysql or any other database server's its not the same exact query. it may be little different in the syntax also.
	may be minor difference only but it is little different, coming to selecting the records also. 
			The way we are selecting the data from the oracle database server might be different from the  data we are trying to fetch from the sql database server.
	it is different for the other updating, deleting, the record.
	May be there might be small changes might be there, that we need to write for queries. 

Now, what we have done is we finsihed the entire program for the user management service using oracle database server. 
	So, while we are submitting the code i came to know we r not supposed to use  oracle database but we have to use MySql database server. So, now what is the amount of change? what are all the places we need to update?
		
In order to interact with the database, we use the 5 steps:
		- registering the driver  -> change the driver form oracle driver to MySql driver. ( we never use multiple database server )
		- creating the connection -> change the conenction properties, connection URL, changing connection username and password.
		- creating statement -> as there is a change in the query, we need to update the query.
		- executing query 
		- closing the connection
so, if you see the larger picture here. we need to chnage the 80% of the logic.

let's take an example the application is already in porduction and already available for the end user, they are actively working on that application. so, if there are any java code changes what will be the expectation.
again we need to test it? yes 
if we are changing the application we need to build the whole application and write the test cases? yes
we need to build it form the scartch again then deploy in the lower environment and test the code? yes
	These above mentioned changes are all the java code changes, we are not at all supported to directly deploy in the production environment, first we have to test it lower environment.
now let take an example:
	instead of keeping the complete information in the java program, how about keeping the information in a file and reading the file dynamically.  That means what i am trying to do is.
			I am trying to seperate the java logic with the configuration.  
				So, this configuration file will be having  the driver class name,  then URL, User_Name and password like these kind of stuff. So, now it will be little easy right? yes
						we dont need to change any java code right? yes 
							In java code we can write the logic like this. we will writing all the information in some "xyz" properties file, from this properties file whatever the information is there
									we will be capturing that based on that  we will be creating the driver obejct and whatever the driver object you want to create here dynamically.

So, might be externalize the connection. so that you can reduce the complexity of the connection at the databse servers at the end of the developement but still coming to  URL again we have to hard code the URL also right? everything we have to do.

each and every datbase servers might not be supporting all the sql queries. They may be supporting the sql queries but there may be  a small syntax level chnages will be there. So, now over all ehat exactly it is happening is like 

whatever the java program we are writing here, this is not platform independent "directly depending on database server we are trying to use"
-this program became database dependent program.

whatever program we are writing is depending on database server so, obviously its a drawback for us.
whereas java programs should be platform independent. it should be independent in nature.

so, just to avoid these kind of issues we use "hibernate" here.

													HIBERNATE IS A FRAMEWORK WHICH IS TRYING TO DEAL WITH THE DATABASE SERVER.

So, in real scenario we never use JDBC we always use "hibernate" framework.

what exactly will hibernate do is? 
	hibernate will help you to provide the persistence framework which is independent on the database server. 	
			Connection.
			Direct SQL statements are avoided
			HQL Query(Hibernate Query Language)


	Hibernate is a persistence framework which is independent of database servers.
Means, we dont have to hardcode the URL's, we dont have to hard code all the connection information including URL's, UserName and password, drivers.
Apart from that we never give any direct sql in the statement. "Giving direct sql statements are avoided" 

Internally what we will be doing is, we will be giving HQL Query. instead of supporting all these direct SQL queries this will be supporting HQL queries.
where it will be helping you to write the database independent logic.

			HIBERNATE IS A ORM FRAMEWORK WHICH IS INDEPENDENT OF DATABASE SERVERS.
					ORM stands for "Object Relational Model" as per the name it is trying to relate with object and relation.

	Relation - mens nothing but a table.
	object - related to java class.

						This model is something like "Object Related Mapping" only.
We will be mapping a java class with a table.
 
						Hibernate is the easiest framework in the entire java application. 


Maven:
ex: Hibernate is a frame to deal with that we need 10 jar files, instead of us going and downloading the each and every jar files. what we are doing is we are taking help of MAVEN.
		Who is maven? MAVEN is an application building tool. if we tell maven which version and which project we need then it will be trying to interact with the online repository, 
								it will be downloading all the jar file and putting them in the buildpath.
		Maven is only used for building the application and project setup only, once it is done on top of that we can use nay type of programming we can write hibernate application with maven,
				we can write sprin g application with maven, we can write hibernate + spring application with maven.
		Till now we are adding OJDBC 14.rar manually, but now we can add that dependency in the pom.xml it will be directly downloading the OJDBC rar file and putting it in the buildpath.
		Maven is only restricted to that project setup level only not for the code level.

The main purpose of MAVEN is a building tool.

_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________

Dec 15th Video:

Maven: the main purpose of maven is a building tool.
Building an application means its not developing the application, here building means different.

Building an application means you will be getting it as either a jar file or an war file.
-jar files we can run directly.
-war files we have to run them in the webservers.
Building an application means it should generate either jar file or war file.

jar files will be directly executable.
war files means we need to place them in the webservers, so that it will be hosted and executed.

while building the application we will be getting the file in 2 formats:
		1) JAR file (JAVA ARCHIVE FILES) can execute directly.
 		2) WAR file (WEB ARCHIVE FILES) should be deployed in webservers.

HIBERNATE:

HIBERNATE is an ORM framework which is independent of database server.
ORM - object relational mapping
	This is nothing but we have to provide mapping between object and relation.
			Object - is nothing but an instance of a class.
			Relation - Relation is nothing but a table.

now we are creating a table and mapping it to java program.

create table student ("within this pair of parenthesis we have give the column names");

ex: create table student (
		student_id int,->         in HQL first we need to give the variable name and then define the data type (Exact opposite of java)
		student_name varchar(25),
		student_address varchar(25),
		country varchar(25),  
		primary key (student_id)
			);

we need to give the student_id as the primary key.

Now that we have creted table with the aboce command, we need to convert this table into an object.

Since, the table is having four columns we need to convert the table into class and the columns into fields or instance variables.
To avoid confusion, we shall take class name also same as table name. For the table(Relation) we have created now we need to create an suitable class with the same structure.
	If we consider entire table as a class then we have to consider all the columns in the table as instance variables in the class.

public class student {
	int student_id;
	String student_name;
	String student_address;
	String country;

}

we are internally mapping that class student should match with table student and int student_id should match with student_id column from the table, 
		string student_name should match with student_name from the column and s0 on for the string country.

when we are creating the instance variables, to access those instance variables what we will be doing?
		we need to use getters and setters methods.

To restrict the user only to use getters and setters methods we are making all these instance variables as private no one else can access the variables directly.
So, if they want to call the variables they need to call either get methods or set methods.

so, if we see the "below" class code this is nothing but a plain class we have written nothing, business logic nothing these kind of classes will be called as "pojo".
		POJO - Plain Old Java Object

	private int student_id;
	private String student_name;
	private String student_address;
	private String country;
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_address() {
		return student_address;
	}
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

Now, what we are thinking is the java class Student is referring student table internally 
		and their instance variables student_id, student_name, student_address, country are all referring Internally with table columns.

Since, this is all our assumption but we need to explain this to our compiler for this we need to create a mapping file "mapping xml" file.

we have to write all non java files in project folders -> resources folder 
now after creating Student.hbm.xml file , move this file to src/main/resources

<!--we are mapping Student class file with the Student table-->
<!-- type int is a primitive data type and we are using "id" tag to define the student_id column-->
<!-- we are using property tag to define name column -->
<!--type = String is a class type so it cannot be directly used as a primitive data type-->
<!-- If we observe in the entire program, we have one column with id tag(becos student_id is a primary key) and the rest three column s are with property tags. -->


Steps involved in hibernate:
1) we need to create POJO Class (nothing but mapping class for tables)
2) Mapping information(in XML format "abc.hbm.xml")//why we are giving .hbm.xml is just to understand that clearly that this xml is a mapping xml. 
 ex: in the above table when we added new column "mobile no:" then we need to add that in the mapping and also need to add, 
 		then we need to identify what is the table name, where we have mentioned, what is the class name suitable for it and where we have to mention the column. if we want to know that we have identify the right hibernate mapping file.
 				so for that particular purpose dont change the file name and make it as .hbm.xml give the "class name" or the "table name" as the identification.
 				Once, sfter providing the mapping information what we need to do is?
3) We need to create the configuration file.
what is the difference between bean class and a POJO?
	Both are same.
POJO class or bean means the class which is independent of any API.
ex: coming to the Student.java this is a plain class. we can use this anywhere since it is a plain class.
when we extend the  simple plain class to threads it is also plain class still.
ex: public class Student extend thread  -> POJO Class (this is a plain POJO class since, the threads concept is universal concept, it is not dependant on any api).
	public class Student implement Runnable -> POJO Class
4) we need to create the configuration file. (in this file we have to provide information about the connection, if we want to communicate with the database server we have to provide some minimum information here)
 			- DriverClass
 		The core concept to connect with databases is always JDBC, even though we deal with hibernate and other frameworks the main concept to deal with database is always JDBC.
 			- URL 
 			- UserName
 			- Password
 			- Dialect Class(DB Specific Dialect class)
 			- Add mapping files here in configuration file.
In the configuration only we will be giving the information about mapping files also.

As we discussed earlier HIBERNATE is a platform independent ORM framework, 
		that means if we are trying to connect with oracle database server what ever queries we are writing internally it will convert all those HQL queries into oracle specific query.
		and if we are going to use MySql database then hibernate will convert those queries into MySql specific query because of the dialect class.

*if we are trying to communicate with oracle database server, we need to give oracle server dialect class.
*if we are trying to communicate with MySql database server, we need to give MySql server dialect class.

- So, for all database servers you can find one dialect class in the hubernate packages.
Now, we need to create a configuration file: src/main/resources -> new -> other -> Hibernate configuration file (cfg.xml)
In , MySql.cfg.xml file goto sessionfactory tab and add mappings from "resource" option select the "student.hbm.xml" file and select it.

5) Now, "CREATING CLIENT APPLICATION".(is an application to execute the hibernate program)
 	(A class with main method)
-Now, in the class application we need to get the configuration information for getting the connection.
	we have all that information in MySql.cfg.xml so we have to read that information from that file.

-So, we have to "CREATE CONFIGURATION OBJECT". (whenever we choose the configuration related objects there will be so many listings will be there we have to choose the hibernate related one)

-After creating the configuration object we have to "READ THE CONFIGURATION FROM MYSQL.CFG.XML FILE". 

-After reading, we have to "CREATE THE SESSIONFACTORY" as per the name it will be producing "sessions".

-After creating the sessionfactory, we have to "EXECUTE THE OPERATION".

-After executing the operation, we have to "CLOSE THE CONNECTION".
		If we want to close the conenction, we have to "CLOSE THE SESSION"
		Then we need to close the "SESSIONFACTORY".
		if configuration is there then we have to "CLOSE THE CONFIGURATION" also

Inorder to execute any kind of query we are trying making use of session object. By, using session object only we are trying to execute the query.

So, now we have to create a configuration class here, configuration is a class in hibernate packages.

So, to access the hibernate package which API we need to open? java se or java ee? it is neither related to java se and java ee because hibernate is provided by 3rd party framework. 
		So, whoever providing the framework they only have to provide the API also.

Now, we have to search for Hibernate API in google and get the documentation. We need to find the result for hibernate organization.

								"Hibernate is the product of JBOSS"

org.hibernate.cfg -> this package defines api for configuring hibernate and classes for building the hibernate configuration time meta-model.

Insert into Student values (1, 'Abc', 'VJW', 'INDIA' );

Now, when we try to save a record from the java program we cant see it in the table, becos coming to hibernate right it is well designed highly performable architecture actually.
ex:
	Student st = new Student();
		st.setStudent_id(2);
		st.setStudent_name("Xyz");
		st.setStudent_address("Hyd");
		st.setCountry("India");
		
		//To insert the above information into the database we need to search for other method called "save"
		session.save( st); 

So, whenever we are trying to save the above record or any other record it will be expecting us to create the transaction, for getting the data from the table there is no issue.
	when we are trying to save any record it expects us to create a transaction.
		In general a "transaction is nothing but a group of operations".
			Even if a single operation is failed we will consider that transaction is failed.
				If all the transactions are success then only we will consider that transaction is successfull.

			ex: Transaction transaction = session.begintransaction(); 

Refer to the program in the project folder 10-HibernateDemo for the example.

_____________________________________________________________________________________________________________________________________________________________________________

Dec 16th 2017:

whats the difference between select queires and non select queries in hibernate?
-If you are PERFORMING A SELECT QUERY then you are just fetching the data, for fetching the data we dont need to select any transaction in the hibernate session.
-But if you are PERFORMING NON-SELECT queries like insertion/updation/Deletion like that as it is a operation which is going to update the database, we need to go fo creation of a transaction.

Based on the execution status either we can commit the transaction or we can rollback the transaction.

In the previous session on dec 15th we have created a table in a database. Now, since we created the table with student, we should create the class name also with student only.

In Java program:
public class student {                                         
	int student_id;
	String student_name;
	String student_address;
	String country;

}

note: the String country will match with the country varchar(25) now mapping is done.

In database:
create table student (
		student_id int,->         in HQL first we need to give the variable name and then define the data type (Exact opposite of java)
		student_name varchar(25),
		student_address varchar(25),
		country varchar(25),  
		primary key (student_id)
			);

After mapping is done, what we need to do is right?  we need to provide the information.
	Because, we have 3 strings and compiler doesnt know which string is trying to refer to the other 3 strings in the student table.
		That is the reason we need to provide mapping information here.

Mapping information is done in "name.hbm.xml", but coming to hibernate xml mapping alternate we have 
"annotations" also.

Annotations is nothing but using "@" some xyz. If it is starting with @ symbol then we call it as annotation.

Coming to the mapping information, we are providing XML mapping information here.
	If we consider that some file name is 'abc' then the mapping file name should be "abc.hbm.xml"
		here also, giving the naming is not necessary but recommended.

For "primary key s only we use ID tag" and "for all the other normal columns we use property tag".

what will be dialect class doing here?
Dialect class will be helping the hibernate to understand which database server technology is it trying to connect and from there it will be converting the queries also.
Once, the creaton of dialect class is done, we need to add the hbm mapping file(which means whatever mapping information we are giving we need to add that in the Hibernat.cfg.xml file)

Now, we goto the main method java program:
- Within the main method java program what we are doing first we are simply trying to create the configuration object.
			-> Configuration cfg = new Configuration().configure();

- After creating the object we are trying to call cfg.configure(). 
		What exactly this configure() method will be doing it will be trying to read the configure from the default configuration file that is nothing but hibernate.cfg.xml file.
			-> cfg = cfg.configure();

- Coming to configure(), as we also have the same hibernate.cfg.xml we are not giving anything.
		ex: our cfg.xml file is named with oracle.cfg.xml then what we need to do is with in the pair of paranthesis of configure() with in double quotes we have to mention file name.
				ex: cfg=cfg.configure("oracle.cfg.xml");

That means if we are giving other than "hibernate.cfg.xml" we have to mention the file name in the configure("") with in the double quotes.

- After reading the configuration file, from that particular configuration we have to build the session factory here.
		Coming to the session factory, from the sessionfactory we can create any number of sessions but coming to the application sessionfactory should only be "one"
				-> SessionFactory factory = cfg.buildSessionFactory();
					we can create any number of sessions, but at the "end of the session we have to close it".
						But coming to the session factories, we are not supposed to create multiple sessionfactory 's. We are only supposed to create one sessionfactory here.
							Once, that is done we are creating the session, after creating the session, by using the session we are begining the transaction
								-> Session session = factory.openSession();
								-> Transaction transaction = session.beginTransaction();

- Once the transaction is started we are trying to do the persistence operation here.
		-> session.save(st);
		To store the data in the database we use "save" method.
			persistence operation is nothing but storing the data in the database. We are trying to call the save method, if we call the save method what will happen it will be storing the data in the database.
				After that we are trying to "commit" the transaction. If we are not giving the transaction, the program will not give any error for us but still the object will not be saved here.

"To get the data we dont have to give any transaction here, but to update or insert or delete we need to use transactions"
	To get the data form the database table we are using get() method.

-After the transaction is committed we  close the session and session factory.

		"Hibernate is a database independent framework, internally it will convert all the hibernate related queries into (SQl, MySql) database dependent queries"

- As it is able to excute the insert query  successfully " session.save(st) " we are able to insert the record in the database table.

Now, i want internally it should give which query it is trying to execute the particular statement.
	I want to find the generated query by the hibernate.
			for that purpose what we can do is we can go to hibernate.cfg.xml in this file we can give one more property 
 				<property name = "show_sql"> true </property>
the above line allows us to show the internal hibernate query language which it executes internally.

Now, I want dont want to give the configuration information within the student.hbm.xml file. So, instead of doing that we can go with the "annotations" here.

Coming to Student.java, as i am telling annotations, how annotations will look like -> "@"
	to mention student class is a "mapping class" we  can internally call them as "entity class" also.

 	"All the POJO classes cannot be entity classes, but all the entity classes can be pojo classes".

POJO class: "plain old java object" this particular class shouldnt be dependent on any api.
 
But this particular pojo class what we are doing?
-we are trying to make it as entity class. "Student class"

So, to use it as an entity class what we need to do is? we will be giving the mapping xml file but now what we are doing we r not suppposed to use the mapping xml file, 
		we are deleting the "<mapping resource ="Student.hbm.xml"/> from the configuration file also. Ok so we are not supposed to use the mapping xml file.

So, for that purpose as i need to mention the Student class as an entity class we are giving the annotations as "@entity" here in Student.java file.

@Entity //by giving entity here, internally the compiler will understand that this is an entity class that means we are trying to map this class with some table
//after mentioning entity, we also need to mention which table is trying to map with this particular class. So, for that purpose we need to give "@Table" annotation.
@Table(name="Student") -> we need to mention the table name inside paranthesis to which table we are trying to map.


We have @Table annotation from javax.persistence also and org.hibernate.annotations also. So even if we use from org.hibernate.annotations it is part of javax.persistence only.

In the Student.java  Student Class we 4 instance varaibles,  we have setStudent_id as primary key. SO, for that purpose we have to give "@ID" annotation there.
	after finishing annotation to all the classes.

In hibernate.cfg.xml file we need to add the "mapping information", earlier what we have done is we have added the "mapping resource = student.hbm.xml file"

But, now we have to add the class. 
		ex: <mapping class ="Student"/>


Notes:
Apart form this normal query we have a few more queries like native query, hibernate query language, named query 

what is the use of annotations?
When we see the Student.hbm.xml here we are giving a lot configuration to mention some meta-information we are giving this much of information, these much of statements we are giving in the xml.
but when coming to annotations in the POJO class file, we are giving @entity, @id, @column, @table. By giving this information we can append the property on top of that particular class.
	ex: we can append the entity property on top of the class student.
		By giving @Table annotation what we are doing we are telling that class student is mapping with the table student in the database. 
			It is something like appending the meta information.
				That means, we are giving the information that we are telling that class student is internally mapping with table student.

- Instead of using hbm.xml file for mapping, we can also use "@" annotations in the java file for mapping the file.

-When we are creating annotations, creation of hbm.xml file is not necessary.
		It is something like either we have to use hbm.xml file or annotations.

We are not using annotations only for hibernate actually, we use annotations in many applications. 
	If we go for our threads programming, @Override annotation on top of the 
	public void run(){ 

							}
- Using JDBC also we can create the table and database why we are using these complex hibernate and using these ?
ans) when we have only one application with one database and table we dont have to go for this much of heavy setup. We can directly use JDBC instead of hibernate.
 		Whereas when it comes to bigger applications and Retrieving data from 1000s of different tables and displaying it to the user.
 			Eventhough if u use the JDBC it is internally communicating with the Hibernate only.

JDBC is replaced by Hibernate. (Hibernate is on top of JDBC only)
Servlets is replaced by Spring framework.(Spring is on top of servlets only)

most of the applicationswe see in the market will be hibernate+Spring framework related projects.
	ex:
		<property name="hbm2ddl.auto">value</property>
		 By defining the hbm2ddl.auto we can execute the ddl (Data Definition Language) commands (CREATE,ALTER,DROP AND TRUNCATE) from the hibernate framework.
		 	We can create the entire table architecture if the table is not existing in the database server.
		 		We can create the entire table architecture based on the entity class if the tables are not exixting in the database. 
		 			For that purpose what we are doing is we are using the "hbm2auto.ddl" in the hibernate configuration file by making it as create.
		 				This particular hbm2ddl.auto tool right it this property expects 3 values "create, update, drop"

Algorithms in hibernate is ntohing a mechanisam to generating the primary keys automatically. So that we never face any kindof unique constraint violation exception in the future.
In the real scenario we never give any annotations and value for the id will be automatically generated by the algorithms.

________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

Dec 18th:

Topic: algorithms in hibernate

- In order to EXECUTE ANY KIND OF QUERIES until now we are USING SESSION OBJECT. By using the session object only we are trying to execute the queires.
- To store the data in the database we use save method. To get the data form the database table we are using get method.
- Coming to this getter method right? here coming to this particular getter method we need to give "entity class name" and the serializable id we have to give.
	ex: session.get(Student.class, 1);
		 So, after this it will be generating internally one select query and it will be fetching the data for us.
		 	internally, it will be executing the select query and the fteching the data from the table in the database.

When we are using annotations, its not at all necessary to use hibernate mapping file. It's either we have to use 

So, now my requirement is i want to fetch all the records that are existing inthe student table.

hbm2ddl.auto:

If we give create right, what exactly it does is it doesnt matter if the table is already existing or not. Even if the table is existing right it will try to drop first and then try to create the table again.
	Even if the table is existing also it will be removing the table and then it will be creating the table again.
	
This HBM2DDL.auto will be expecting three values here: Create, Drop, Update.

CREATE:
If we give "Create" it doesnt matter if the table is existing or not. Even if the table is existing right it will be trying to drop the table and create the table again.
	The entire data in the table will be removed here, and new table will be created.

Update:
If the table is there, it will be updating the table. But, if the table is not there it will creating the table and updating the table.

To remember this:
HBM2DDL.auto 

HBM: hibernate mapping
DDL: Data Definition Language

"HibernateMapping2Sqlqueries.auto" => "HBM2DDL.auto"

















