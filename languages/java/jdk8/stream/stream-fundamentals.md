Stream
-----
If we want to process bulk objects of collection then go for streams concept.
Way to operate on collection in java 8 is Stream.
Its a special iterator class that allows processing collections of objects in a functional manner.
 
Eg : fetch all objects from collection of list whose value is greater than 15
 
Why streams were introduced in java 8 if we already had java.io.stream?
--- 
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
Configuration can be done by Map / Filter
 
    Stream s = collectionObject.stream().filter(i 🡪i % 2 ==0);
 
What if we don’t want to filter out.
We rather want to create new object against each existing stream object based on some function.
 
EG in given stream create new object by squaring  its value
 
If we want to fetch / filter objects from collection like eg : filter only even numbers from array list collection the use Filter for configuration of stream.
 
If we want to perform some operation on each objects of the collection then create another mapped object with different value(after operation is performed ) for each object of that collection, then use map.
 
In filter, because of filtering, number of objects in filtered list is less than original list While in Map  same number of objects are there in both new and original list created.



Different ways of creating Stream object
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



Stream Operations:
-------------------
- Intermediate Operation
    - Returns stream of elements as result
    - Example: filter(), map(), sorted(), distinct(), etc...

- Terminal Operation
    - returns non-stream values like premitives/object not return anything
    - Example: forEach(), collect(), reduce(), match(), count(), etc...
# Stream API

Stream API introduced in Java 8 allows processing collection objects in functional style.

Streams help process bulk collection data efficiently.

Example:

Fetch numbers greater than 15 from collection.

```java
list.stream()
.filter(i -> i > 15)
.collect(Collectors.toList());
```

## Why Java 8 Streams

Java IO Stream:

- File processing
- Binary data handling
- Character data handling

Java 8 Stream:

- Collection processing
- Functional programming support
- Bulk object operations

Java IO Streams work with files.

Java 8 Streams work with collections.

## Collection vs Stream

Collection:

- Store group of objects
- Data structure focused

Stream:

- Process collection objects
- Functional operation support

## Stream Processing Stages

Stage 1: Intermediate Operation

Examples:

- filter()
- map()
- flatMap()
- sorted()
- distinct()

Stage 2: Terminal Operation

Examples:

- collect()
- reduce()
- forEach()
- count()
- findFirst()

Example:

```java
list.stream()
.filter(i -> i % 2 == 0)
.collect(Collectors.toList());
```

## Filter

Purpose:

- Filter records
- Reduce result size

Example:

```java
list.stream()
.filter(i -> i % 2 == 0)
.collect(Collectors.toList());
```

Input:

1 2 3 4 5 6

Output:

2 4 6

## Map

Purpose:

- Transform object
- Create mapped value

Example:

```java
list.stream()
.map(i -> i * i)
.collect(Collectors.toList());
```

Input:

1 2 3

Output:

1 4 9

## Filter vs Map

Filter:

- Removes records
- Output count can change

Map:

- Transforms records
- Output count remains same

## Different Ways Of Creating Stream

### Empty Stream

```java
Stream<String> names = Stream.empty();
```

### Collection Stream

```java
Collection<String> names = Arrays.asList("Abhijit","Som");

Stream<String> stream = names.stream();
```

### Array Stream

```java
String[] arr = {"a","b","c"};

Stream<String> stream = Arrays.stream(arr);
```

### Builder Stream

```java
Stream<String> stream =
Stream.<String>builder()
.add("a")
.add("b")
.add("c")
.build();
```

## FlatMap

Purpose:

Convert nested collection into single stream.

Example:

```java
list.stream()
.flatMap(Collection::stream)
.collect(Collectors.toList());
```

## Reduce

Purpose:

Aggregate stream result.

Examples:

- Sum
- Maximum
- Minimum

```java
list.stream()
.reduce(Integer::sum);
```

## GroupBy vs PartitionBy

groupingBy():

- Multiple group keys possible

partitioningBy():

- Boolean grouping
- Two partitions only

## Parallel Stream

Purpose:

Improve bulk processing performance.

Example:

```java
list.parallelStream()
.filter(i -> i > 10)
.count();
```

Use carefully:

- CPU intensive processing
- Large dataset processing

## Backend Engineering Perspective

Java Stream improves:

- Collection processing
- Backend readability
- Data transformation
- Functional programming adoption
- Maintainability

## Notes

Streams improve collection processing readability and backend engineering coding efficiency.