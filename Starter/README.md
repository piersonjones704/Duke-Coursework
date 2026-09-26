# Starter APT

**Source:** [Starter APT](https://www2.cs.duke.edu/csed/newapt/starter.html)

## Class

```java
public class Starter {
    public int begins(String[] words, String first) {
        // replace this code
        return 0;
    }
}
```

## Problem Statement

Determine how many unique words in an array of words start with a specified letter. Write method `begins` that determines how many different strings in `words` have a first letter equal to `first`.

## Parameters

| Name | Type | Description |
|---|---|---|
| `words` | `String[]` | The array of words to check. |
| `first` | `String` | A single-character string representing the letter to match. |

## Returns

`int` — the count of *unique* strings in `words` that start with `first`.

## Constraints

- `words` will have at most 50 elements.
- `first` will be a single character string.

## Examples

| `words` | `first` | Returns | Explanation |
|---|---|---|---|
| `{"easy","lies","the","head","that","wears","yellow"}` | `"e"` | `1` | Only "easy" starts with "e". |
| `{"easy","lies","the","head","that","wears","yellow"}` | `"z"` | `0` | No word starts with "z". |
| `{"zebras","zebra","aardvarks","yak","yaks","zebras",  "elephants","zebras","zebra","aardvarks","yak","yaks",  "zebras","elephants"}` | `"z"` | `2` | "zebra" and "zebras" are the unique words starting with "z" (duplicates don't add to the count). |
| `{"one","two","one","two"}` | `"p"` | `0` | No word starts with "p". |