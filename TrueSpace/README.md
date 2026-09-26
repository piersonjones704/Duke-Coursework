# True Space

**Full problem statement:** [True Space](https://www2.cs.duke.edu/csed/newapt/truespace.html)

## Class

```java
public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        // fill in code here
    }
}
```

## Summary

Calculate the actual disk space used to store a set of files, given that a filesystem allocates space in fixed-size clusters and each cluster can only hold data from one file.

## Parameters

| Name | Type | Description |
|---|---|---|
| `sizes` | `int[]` | The size (in bytes) of each file. |
| `clusterSize` | `int` | The filesystem's cluster size (in bytes). |

## Returns

`long` — the total disk space used across all files, after rounding each file up to a whole number of clusters.

*See the original problem page (linked above) for the full constraints and worked examples.*