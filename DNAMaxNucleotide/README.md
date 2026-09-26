# APT: DNA Max

**Source:** [APT: DNA Max](https://www2.cs.duke.edu/csed/newapt/dnamax.html)

## Class

```java
public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        // fill in code here
    }
}
```

## Problem Statement

Find which of the strands representing DNA in `String[] strands` has the most occurrences of the nucleotide represented by parameter `nuc`.

If more than one strand has the same maximal number of the specified nucleotide, return the *longest* strand among those tied. All DNA strands have different lengths, so the maximal strand will be unique once length is accounted for.

Each DNA strand contains only the characters `'c'`, `'g'`, `'t'`, and `'a'` (cytosine, guanine, thymine, adenine). If no strand contains the specified nucleotide at all, return the empty string `""`.

## Parameters

| Name | Type | Description |
|---|---|---|
| `strands` | `String[]` | Array of DNA strands (each a different length). |
| `nuc` | `String` | A single character string: `"a"`, `"g"`, `"t"`, or `"c"`. |

## Returns

`String` — the strand with the most occurrences of `nuc` (ties broken by length); `""` if no strand contains `nuc`.

## Constraints

- `strands` will contain no more than 50 elements; each element is a different length, using only characters `'a'`, `'g'`, `'t'`, `'c'`.
- `nuc` will be a one-character string: `"a"`, `"g"`, `"t"`, or `"c"`.

## Examples

| `strands` | `nuc` | Returns | Explanation |
|---|---|---|---|
| `{"agt","aagt","taattt","ccatg"}` | `"a"` | `"taattt"` | Both "aagt" and "taattt" have two 'a's, but "taattt" is longer. |
| `{"agt","aagt","taattt","ccatc"}` | `"g"` | `"aagt"` | Both "aagt" and "agt" have one 'g', but "aagt" is longer. |
| `{"g","gg","ggg","gggg"}` | `"c"` | `""` | No strand contains 'c'. |