# Stream Fundamentals

Java Stream API introduced in Java 8 allows processing collection objects in a functional style.

Streams simplify filtering, transformation, aggregation, grouping, analytics, and reporting operations.

## Why Backend Engineers Must Know Streams

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | API Response Processing |
| ⭐⭐⭐⭐⭐ | Collection Transformation |
| ⭐⭐⭐⭐⭐ | Reporting Systems |
| ⭐⭐⭐⭐⭐ | Analytics Processing |
| ⭐⭐⭐⭐ | Event Processing |
| ⭐⭐⭐⭐ | Dashboard Metrics |

## Stream API

Stream API introduced in Java 8 allows processing collection objects in functional style.

Streams help process bulk collection data efficiently.

Example:

Fetch numbers greater than 15 from collection.

```java
list.stream()
.filter(i -> i > 15)
.collect(Collectors.toList());
```

## Why Streams Were Introduced

### Java IO Streams

- File processing
- Binary data handling
- Character data handling

### Java 8 Streams

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

## Common Stream Pipeline

```text
Collection
    ↓
Filter
    ↓
Transform
    ↓
Aggregate
    ↓
Collect
```

## Stream Processing Stages

### Stage 1: Intermediate Operations

Examples:

- filter()
- map()
- flatMap()
- sorted()
- distinct()

### Stage 2: Terminal Operations

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

### Input

1 2 3 4 5 6

### Output

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

### Input

1 2 3

### Output

1 4 9

## Filter vs Map

Filter:

- Removes records
- Output count can change

Map:

- Transforms records
- Output count remains same

## Map vs FlatMap

| map() | flatMap() |
| ------- | -------- |
| One-to-One Transformation | One-to-Many Flattening |
| Output Remains Nested | Output Becomes Flat |
| Used For Object Transformation | Used For Nested Collections |

Example:

```java
employees.stream()
         .map(Employee::getSkills);
```

Output:

```text
List<List<String>>
```

Example:

```java
employees.stream()
         .flatMap(employee -> employee.getSkills().stream());
```

Output:

```text
List<String>
```

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

## Collectors

Collectors are terminal operations used to gather Stream results.

Common Collectors:

```java
Collectors.toList()
Collectors.toSet()
Collectors.toMap()
Collectors.joining()
Collectors.counting()
Collectors.groupingBy()
Collectors.partitioningBy()
```

Example:

```java
names.stream()
     .collect(Collectors.toList());
```

## GroupBy vs PartitionBy

### groupingBy()

- Multiple group keys possible

### partitioningBy()

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

## Stream Lifecycle

```text
Collection
    ↓
stream()
    ↓
Intermediate Operations
(filter/map/sorted)
    ↓
Terminal Operation
(collect/reduce/count)
    ↓
Result
```

Important:

- Streams do not store data.
- Streams cannot be reused.
- Terminal operation triggers execution.

## Production Engineering Perspective

Streams are heavily used for:

- API Response Transformation
- Collection Processing
- Reporting Pipelines
- Analytics Workloads
- Event Processing
- Dashboard Generation

Understanding Stream operations helps write cleaner, more maintainable, and less error-prone collection processing code.

## Most Asked Interview Topics

- filter() vs map()
- map() vs flatMap()
- reduce()
- groupingBy() vs partitioningBy()
- Stream vs Parallel Stream
- Intermediate vs Terminal Operations
- Stream Lifecycle
- Collectors API
- Collection vs Stream
- Lazy Evaluation
- Streams Cannot Be Reused

## Quick Revision

### Highest ROI Topics

1. filter()
2. map()
3. flatMap()
4. collect()
5. reduce()
6. groupingBy()
7. partitioningBy()
8. Parallel Stream

### Remember

- Streams process collection data.
- filter() selects records.
- reduce() aggregates results.
- groupingBy() is heavily used in reporting systems.
- Streams reduce collection processing boilerplate.
- map() performs one-to-one transformation.
- flatMap() flattens nested collections.
- collect() gathers Stream results.
- Streams are lazily evaluated.
- Streams cannot be reused after terminal operations.