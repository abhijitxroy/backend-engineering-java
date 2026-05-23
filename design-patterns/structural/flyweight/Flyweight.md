# Flyweight Design Pattern

## Overview

Flyweight is a structural design pattern used to reduce memory usage by sharing common object state across multiple objects.

The pattern separates:

- Intrinsic state (shared common information)
- Extrinsic state (object specific information)

Flyweight becomes useful when applications create a large number of similar objects and resource optimization becomes important.

## Structure

<img width="827" alt="image" src="https://github.com/abhijitxroy/design-pattern/assets/161963891/fbc772ed-9568-44db-b903-021a1f61d405">

## Where to Use

<img width="1273" alt="image" src="https://github.com/abhijitxroy/design-pattern/assets/161963891/ce1269d9-5684-4e9f-9188-b6f1d8cb2eb9">

## When to Use

<img width="826" alt="image" src="https://github.com/abhijitxroy/design-pattern/assets/161963891/51982df0-b203-462b-b86a-bced60e4ff82">

## Common Examples

- Design a word processor (Text Editor)
- Design a game engine
- Large scale object creation systems

## Benefits

- Reduced memory usage
- Better object reuse
- Improved scalability
- Better performance for large object collections

## Notes

Flyweight becomes increasingly useful when systems repeatedly create similar objects and optimization becomes important.