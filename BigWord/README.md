# BigWord APT

**Source:** [BigWord APT](https://www2.cs.duke.edu/csed/newapt/bigword.html)

## Class

```java
public class BigWord {
    public String most(String[] sentences) {
        // you write code here
    }
}
```

## Problem Statement

Determine and return the word that occurs most often across an array of sentences. The most frequently occurring word is guaranteed to be unique (no ties). The word returned should be all lowercase, regardless of the case used in `sentences`.

Each string in `sentences` represents several words delimited by spaces. Words are compared case-insensitively (e.g., "BIG" and "big" are the same word).

## Parameters

| Name | Type | Description |
|---|---|---|
| `sentences` | `String[]` | An array of space-delimited sentences. |

## Returns

`String` — the most frequently occurring word across all sentences, in lowercase.

## Constraints

- Each string in `sentences` will be at most 50 characters, containing only letters and spaces.
- `sentences` will have between 1 and 50 elements, inclusive.

## Examples

| `sentences` | Returns | Explanation |
|---|---|---|
| `["one fish two","fish red fish blue","fish this fish is black"]` | `"fish"` | "fish" occurs 5 times, more than any other word. |
| `["big bad dog","big bad toy","big bad cat","small bad cat"]` | `"bad"` | "bad" occurs 4 times vs. "big" (3) and "cat" (2). |
| `["This is the way","This is the way","this is this"]` | `"this"` | "this" occurs 4 times (case-insensitive) vs. "is" (3 times). |