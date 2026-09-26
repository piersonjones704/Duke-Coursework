# Follower APT

## Class

```java
public class Follower {
    public int[] follows(String[] words) {
        // write code here
        return null;
    }
}
```

## Problem Statement

In an array of Strings, a string at index `k` is said to be **followed** if the same string occurs again at some index greater than `k`.

Write method `follows` that returns an array of the indexes of the Strings in `words` that are followed, in order from lowest to highest.

Note that "followed" is specific to an index, not just a value — so if `"ant"` appears three times, it will be followed twice, since both its first and second occurrences are each followed by a later occurrence.

## Parameters

| Name | Type | Description |
|---|---|---|
| `words` | `String[]` | The array of strings to check. |

## Returns

`int[]` — the indexes (ascending order) of elements in `words` that have a matching value appearing later in the array.

## Constraints

- `words` contains between 1 and 50 Strings, inclusive.

## Examples

| `words` | Returns | Explanation |
|---|---|---|
| `["this","is","a","test","it","is","only","a","test"]` | `[1,2,3]` | "is" (index 1), "a" (index 2), and "test" (index 3) each have a later matching occurrence. |
| `["world","the","the","the","hello","world"]` | `[0,1,2]` | "world" (0) is followed by the later "world" (5); "the" (1) and "the" (2) are each followed by a later "the". |
| `["world","the","the","the","hello","world","the","world"]` | `[0,1,2,3,5]` | Each of these indexes has a matching value at a later index. |
| `["what","value","is","returned"]` | `[]` | No repeated words. |