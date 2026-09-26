# CounterAttack APT

**Source:** [CounterAttack APT](https://www2.cs.duke.edu/csed/newapt/counterattack.html)

## Class

```java
public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        // change this code
        return new int[0];
    }
}
```

## Problem Statement

Count how many times each element of `words` occurs as a white-space-delimited string in parameter `str`. Return the counts in an `int[]`, so the number of times `words[k]` occurs in `str` is given by the k-th value of the returned array.

## Parameters

| Name | Type | Description |
|---|---|---|
| `str` | `String` | A string of space-delimited words to search within. |
| `words` | `String[]` | The words to count occurrences of. |

## Returns

`int[]` — an array where element `k` is the number of times `words[k]` appears as a whole word in `str`.

## Constraints

- Each word in `str` is separated from other words by exactly one white-space character.
- `words` contains no more than 50 strings.
- `str` contains no more than 50 white-space-delimited strings.
- There are no duplicate strings in `words`.

## Examples

| `str` | `words` | Returns | Explanation |
|---|---|---|---|
| `"a a a b b c"` | `{"d","c","b","a"}` | `{0,1,2,3}` | "d" doesn't occur; "a" occurs 3 times. |
| `"a a a b b c"` | `{"a","b","c","d"}` | `{3,2,1,0}` | Same string, different word order in `words` changes output order. |
| `"one two one two one two vorpal blade"` | `{"snicker","one","blade","runner"}` | `{0,3,1,0}` | "one" occurs 3 times, "blade" once, others 0. |