# Java-8

Lambda
------------------------------------------

	- Anonymous Function
	- Not having any name
	- Not having any return type
	- Not having any modifiers
	- Only applicable on Functional Interface 
 
Lambda Vs Anonymous Inner Class
------------------------------------------


Functional interface
------------------------------------------
	- Only Single Abstract Method (SAM)
	- Might have any number of default method
	- Might have any number of static method

Default Method
------------------------------------------


Static Method
------------------------------------------


Interface Vs Abstract class
------------------------------------------


Predefined FI (java.util.function)
------------------------------------------


	1. Predicate<T>
	- To implement conditional check, we should go for Predicate
	- SAM = boolean test(T t);
	- Default method = and, or, negate
	- Input any type but output(return) type boolean always
	
	2. Function<R,T>
	- To perform certain operation and to return some result, we should go for Function 
	- Input any type but output(return) also any type
	- SAM = R apply(T t)
	
	3. Consumer<T>
	- Input any type but no output(return)
	- SAM =  void accept(T t)
	
	4. Supplier<R>
	- No Input but output any type(return)
	- SAM = R get()

 
Method Reference(::)
------------------------------------------

- Purpose: Already written method we can reuse (without writing any method) with the help of Method reference
- Both method should have the same argument type.
- Method name, return type, modifiers could be different
 Syntax - ClassName::methodName ( MethodeReferenceDemo::method2)
	
		public class MethodeReferenceDemo {
		    public static void method2(){
		        System.out.println("Abhijit");
		        System.out.println("Subhasree");
		        System.out.println("avu");
		        System.out.println("Som");
		    }
	    
	    public static void main(String[] args) {
	        MethodReferenceInterface mri = MethodeReferenceDemo::method2;
	        mri.method1();
	    }
		}


Stream
------------------------------------------

If we want to process bulk objects of collection then go for streams concept.
Way to operate on collection in java 8 is Stream.
Its a special iterator class that allows processing collections of objects in a functional manner.
 
Eg : fetch all objects from collection of list whose value is greater than 15
 
Why streams were introduced in java 8 if we already had java.io.stream?
 
Java io streams is a sequence of characters or binary data which is used to be written to a file or to read data from a file.
While streams java 1.8 is no where related to files, its related to collection object.
Java io streams related to file whereas java 8 streams are related to collection object.
Hence if we need to perform some operations on collection there we should go for streams.
 
To represent group of collection as single entity then we should use collection concept.
 
If we want to perform operation on bulk objects in collection then we should go for Streams.
 
We can get stream object by :
 
	Stream s = collectionObject.stream();
Once we get stream object we can process the object of collection.
Processing of stream consists of 2 steps/ stages
Configuration of stream
Processing that configuration
Configuration can be done by 
Map 
Filter
 
	Stream s = collectionObject.stream().filter(i 🡪i % 2 ==0);
 
What if we don’t want to filter out.
We rather want to create new object against each existing stream object based on some function.
 
EG in given stream create new object by squaring  its value
 
If we want to fetch / filter objects from collection like eg : filter only even numbers from array list collection the use Filter for configuration of stream.
 
 If we want to perform some operation on each objects of the collection then create another mapped object with different value(after operation is performed ) for each object of that collection, then use map.
 
In filter, because of filtering, number of objects in filtered list is less than original list While in Map  same number of objects are there in both new and original list created.


Different ways of creating Stream object:
------------------------------------------
1. Creating empty stream object which allowed string values only
	- Stream<String> names = Stream.empty()
2. Creating stream object from collection Object
	- Collection<String> names = Arrays.asList("Abhijit", "Som");
	- Stream nameStream = names.stream();
3. Creating stream from Array
	- String[] arr = new String[] {"a", "b", "c"};
	- Stream<String> streamOfArray = Arrays.stream(arr);
4. We can create Stream object by using builder method
	- When builder is used, the desired type should be additionally specified in the right part of the statement, 
	otherwise the build() method will create an instance of the Stream<Object>
	- Stream<String>namesStream = Stream.<String>builder().add("a").add("b")add("c").build();

GroupBy Vs PartitionBy
------------------------------------------
- partitioningBy method will return a map whose key is always a Boolean value
- In the case of groupingBy method, the key can be of any Object type

Example:
	
 	public class GroupByVsPartitionBy {
	
		public static void main(String[] args) {
			Personn p1 = new Personn("Kosa", 21);
			Personn p2 = new Personn("Saosa", 21);
			Personn p3 = new Personn("Tia", 22);
			Personn p4 = new Personn("Komal", 22);
			Personn p5 = new Personn("Kanan", 25);
			Personn p6 = new Personn("Kanan", 25);
			Personn p7 = new Personn("Tia", 22);
			ArrayList<Personn> list = new ArrayList<>();
			list.add(p1);
			list.add(p2);
			list.add(p3);
			list.add(p4);
			list.add(p5);
			list.add(p6);
			list.add(p7);
	
			// groupingBy
	//		Map<Object, List<Personn>> list2 = list.stream().collect(Collectors.groupingBy(p -> p.getAge() == 22));
	//		System.out.println("grouping by age -> " + list2);
	
			// partitioningBy
	//		Map<Boolean, List<Personn>> list3  = list.stream().collect(Collectors.partitioningBy(p -> p.getAge() == 22));
	//		System.out.println("partitioning by age -> " + list3);
			
	//		list.stream()
	//		.collect(Collectors.groupingBy(Personn::getName, Collectors.counting()))
	//		.entrySet()
	//		.stream()
	//		.filter(e -> e.getValue()>1)
	//		.collect(Collectors.toSet()).forEach(System.out::println);
			
			Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Personn::getName, Collectors.counting()));
			//System.out.println(map);
			map.entrySet().stream().map(e -> e).forEach(System.out::println);
	
		}
	
	}
	
	class Personn {
		String name;
		int age;
	
		Personn(String name, int age) {
			this.name = name;
			this.age = age;
		}
	
		public String getName() {
			return name;
		}
	
		public int getAge() {
			return age;
		}
	
		public String toString() {
			return this.name;
		}
	}



# Java 8

Java 8 introduced functional programming capabilities, Stream API enhancements and modern collection processing patterns that significantly improved backend engineering development.

## Coverage

### Functional Programming

Topics:

- Lambda Expression
- Functional Interface
- Default Method
- Static Method
- Method Reference
- Anonymous Inner Class vs Lambda
- Interface vs Abstract Class
- Predefined Functional Interface

### Stream API

Topics:

- Stream Fundamentals
- Stream Creation
- Filter
- Map
- Reduce
- FlatMap
- GroupBy
- PartitionBy
- Stream Transformation
- Collection Processing

### Problem Solving Examples

Coverage:

- Duplicate element detection
- First non repeated element
- Character occurrence count
- Prime number detection
- Average calculation
- Sum calculation
- Longest string
- Grouping operations
- Partitioning operations
- Employee stream problems

## Lambda Expression

Characteristics:

- Anonymous function
- No explicit modifier
- No explicit return type declaration required
- Primarily used with Functional Interface

Example:

```java
(list) -> list.size();
```

## Lambda vs Anonymous Inner Class

Lambda:

- Less boilerplate
- Functional programming style
- Better readability

Anonymous Inner Class:

- More verbose
- Creates separate anonymous implementation

## Functional Interface

Functional Interface contains only Single Abstract Method (SAM).

Can contain:

- Default methods
- Static methods

Example:

```java
@FunctionalInterface
interface Calculator {
 int add(int a,int b);
}
```

## Predefined Functional Interface

### Predicate<T>

Purpose:

- Conditional validation

Method:

```java
boolean test(T t)
```

Examples:

- Filter even numbers
- Validation logic

### Function<T,R>

Purpose:

- Transform input to output

Method:

```java
R apply(T t)
```

### Consumer<T>

Purpose:

- Consume input without return value

Method:

```java
void accept(T t)
```

### Supplier<T>

Purpose:

- Supply value without input

Method:

```java
T get()
```

## Method Reference (::)

Purpose:

Reuse existing method implementation.

Syntax:

```java
ClassName::methodName
```

Benefits:

- Cleaner code
- Improved readability
- Reuse existing logic

## Stream API

Stream API processes collection objects functionally.

Example:

```java
list.stream()
.filter(i -> i > 15)
.collect(Collectors.toList());
```

Benefits:

- Functional processing
- Better readability
- Reduced boilerplate
- Collection transformation

## Stream Processing Stages

Stage 1:

- Configuration

Examples:

- Filter
- Map
- FlatMap

Stage 2:

- Terminal operation

Examples:

- Collect
- Reduce
- Count

## Filter vs Map

Filter:

- Removes records
- Result count can change

Map:

- Transform records
- Result count remains same

## Stream Creation

Examples:

### Empty Stream

```java
Stream.empty();
```

### Collection Stream

```java
collection.stream();
```

### Array Stream

```java
Arrays.stream(array);
```

### Builder Stream

```java
Stream.builder();
```

## GroupBy vs PartitionBy

groupingBy:

- Key can be any object
- Flexible grouping

partitioningBy:

- Key always Boolean
- Binary partitioning

## Backend Engineering Perspective

Java 8 features improve:

- Backend code readability
- Collection processing
- Functional programming adoption
- Data transformation efficiency
- Stream processing maintainability

## Repository Structure

```text
java-8/
├── functional-interface/
├── stream/
│   ├── basics/
│   └── employee-programs/
└── README.md
```

## Notes

Java 8 concepts are foundational for backend engineering interviews, production coding standards and scalable Java application development.