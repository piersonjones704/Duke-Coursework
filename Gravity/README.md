# APT: Gravity

**Source:** [APT: Gravity](https://www2.cs.duke.edu/csed/newapt/gravity.html)

## Class

```java
public class Gravity {
    public double falling(double time, double velo) {
        // fill in code here
        return 1.0;
    }
}
```

## Problem Statement

Elphaba drops or throws an object from the top of an infinitely tall building and times how long it falls. Write method `falling` that returns the number of meters the object has fallen after `time` seconds have elapsed, given it was thrown with an initial velocity of `velo` meters/sec.

Ignore friction, air resistance, etc. Acceleration due to gravity is 9.8 m/sec². Use the formula:

```
d = v0 * t + 0.5 * a * t^2
```

where `v0` is the initial velocity and `a` is 9.8 m/sec².

## Parameters

| Name | Type | Description |
|---|---|---|
| `time` | `double` | Elapsed time, in seconds. |
| `velo` | `double` | Initial velocity, in meters/sec. |

## Returns

`double` — the distance fallen, in meters, after `time` seconds.

## Constraints

- `time` will be greater than zero and less than the number of seconds in a week.
- `velo` will be non-negative.

## Examples

| `time` | `velo` | Returns | Explanation |
|---|---|---|---|
| `3` | `5` | `59.1` | Thrown at 5 m/sec for 3 seconds. |
| `3` | `0` | `44.1` | Dropped (no initial velocity) for 3 seconds. |
| `3600` | `0` | `63504000.0` | After an hour, ~63,504 km fallen. |
| `86400` | `0` | `36578304000.0` | After a day, over 22 million miles fallen. |