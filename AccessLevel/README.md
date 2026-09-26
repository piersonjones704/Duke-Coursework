# APT: Access Level

**Full problem statement:** [APT: Access Level](https://www2.cs.duke.edu/csed/newapt/accesslevel.html)

## Class

```java
public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        // fill in code here
        return "";
    }
}
```

## Summary

Given each user's permission level and a minimum required permission, determine which users meet the threshold and which don't.

## Parameters

| Name | Type | Description |
|---|---|---|
| `rights` | `int[]` | Each user's permission level. |
| `minPermission` | `int` | The minimum permission level needed for access. |

## Returns

`String` — one character per user (same order as `rights`), marking whether that user is allowed or denied access.

*See the original problem page (linked above) for the full constraints and worked examples.*