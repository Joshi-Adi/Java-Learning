Day 20 - Abstraction in Java
What is abstraction?
Abstraction is the process of filtering out unnecessary details to focus on the essential characteristics of a concept or system.
Why abstraction?
Abstraction is essential as it hides background process and shows the required part.
Abstract classes are like incomplete blueprint that will be filled based on the child class code.
Abstract methods:
Its a method that is declare but contains no code or logic, It does not contain curly braces {} or any executable steps. It ends immediately with a semicolon ;.
Normal methods in abstract class are common methods that are inherited by child classes.
Abstract classes can have constructors even if they dont have direct objects.their main purpose is to initialize the commonly used variables where every child class inherits those variables, we must use super() in child class for referring constructor of abstract class.
Object creation for abstract class is not possible but we can create refernce point variable using polymorphism.
Questions:
What is abstraction?
Abstraction is oops concept where it shows essential data but hides implementation process.

Why do we use abstraction?
we use abstraction to hide complex background details and show essential features.

What is an abstract class?
abstract class is a class with empty blocks or no code, incomplete blueprint that gets filled.

What is an abstract method?
A method that contains no code or incomplete end with ;.

Can an abstract class have normal methods?
Yes

Can an abstract class have a constructor?
yes

Can we create an object of an abstract class?
No we cant create direct object for abstract class but we can use polymorphism

Why can't we instantiate an abstract class?
because abstract class is empty as it doesn't have anything.

Can an abstract class have variables?
Yes

What happens if a child class doesn't implement an abstract method?
compile time error, child class must override the abstract method.

Difference between abstract class and normal class?
abstract class is empty placeholder that gets complete when needed and normal class is complete code

How does abstraction relate to polymorphism?
Abstraction hides essential data and abstract classes have childs to access them we use polymorphism

Can an abstract class have both abstract and non-abstract methods?
Yes
