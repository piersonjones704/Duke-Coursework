# Totality APT

**Source:** [Totality APT](https://www2.cs.duke.edu/csed/newapt/totality.html)

## Class

```java
public class Totality {
    public int sum(int[] a, String stype) {
        // you add code here
        return 0;
    }
}
```

## Problem Statement

Given an array of `int` values, return the sum of those values that are at odd indexes, even indexes, or every index, depending on whether the value of the String `stype` is `"odd"`, `"even"`, or `"all"`, respectively.

## Parameters

| Name | Type | Description |
|---|---|---|
| `a` | `int[]` | The array of values to sum from. |
| `stype` | `String` | Which indexes to include: `"odd"`, `"even"`, or `"all"`. |

## Returns

`int` — the sum of the values at the indexes specified by `stype`.

## Constraints

- `a[]` will have between 2 and 50 values (inclusive).
- The sum of the values in `a[]` will be less than `Integer.MAX_VALUE`.
- `stype` will be `"odd"`, `"even"`, or `"all"`.

## Examples

| `a` | `stype` | Returns | Explanation |
|---|---|---|---|
| `{1,2,3,4,5}` | `"odd"` | `6` | Values 2 and 4 occur at odd indexes (1 and 3). |
| `{1,2,3,4,5}` | `"even"` | `9` | Values 1, 3, and 5 occur at even indexes (0, 2, 4). |
| `{1,2,3,4,5}` | `"all"` | `15` | Sum of every value. |
| `{22,23}` | `"even"` | `22` | Only index 0 is even. |