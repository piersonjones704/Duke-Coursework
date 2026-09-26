# StringCuts APT

**Source:** [StringCuts APT](https://www2.cs.duke.edu/csed/newapt/stringcuts.html)

## Class

```java
public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        // replace this with your code
        return new String[0];
    }
}
```

## Problem Statement

Write method `filter`, which takes a `String[]` of data to be filtered and an `int` indicating the minimum acceptable length for the string data.

Return a `String[]` of the *unique* strings in `list` whose lengths are greater than or equal to `minLength`. The returned strings should appear in the same order as in `list`; for duplicates, only the first occurrence that passes the length requirement is included.

## Parameters

| Name | Type | Description |
|---|---|---|
| `list` | `String[]` | The array of strings to filter. |
| `minLength` | `int` | The minimum acceptable string length. |

## Returns

`String[]` — the unique strings from `list` with length ≥ `minLength`, in original order.

## Constraints

- `list` will contain at most 50 elements.

## Examples

| `list` | `minLength` | Returns | Explanation |
|---|---|---|---|
| `["huge","enormous","big","gigantic"]` | `5` | `["enormous","gigantic"]` | "huge" and "big" are too short. |
| `["compsci","is","fun","sometimes"]` | `10` | `[]` | Nothing passes. |
| `["over","and","over","and","over"]` | `3` | `["over","and"]` | All pass length check, but duplicates are removed. |
| `["boisterous"]` | `10` | `["boisterous"]` | Single element passes. |