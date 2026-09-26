# APT SoccerLeagues

**Source:** [APT SoccerLeagues](https://www2.cs.duke.edu/csed/newapt/soccerleagues.html)

## Class

```java
public class SoccerLeagues {
    public int[] points(String[] matches) {
        // you write code here
    }
}
```

## Problem Statement

In a soccer league, each team plays every other team twice — once at home, once away. Each match results in a home win (`'W'`), a draw (`'D'`), or an away win (`'L'`). A win is worth 3 points, a draw is worth 1 point to each team, and a loss is worth 0 points.

You are given `String[] matches`, where the j-th character of the i-th element denotes the result of the match between team `i` (home) and team `j` (away), played at team `i`'s stadium. The diagonal characters are always `'-'` (a team doesn't play itself). Return an `int[]` where element `i` is the total points earned by team `i` across all its matches (both home and away).

## Parameters

| Name | Type | Description |
|---|---|---|
| `matches` | `String[]` | An n×n grid of match results; `matches[i].charAt(j)` is the result of team i (home) vs. team j (away). |

## Returns

`int[]` — the total points earned by each team.

## Constraints

- `matches` will contain exactly `n` elements, where `n` is between 2 and 50, inclusive.
- Each element of `matches` will contain exactly `n` characters.
- `matches` will contain only `'-'`, `'W'`, `'D'`, and `'L'` characters.
- For all `i`, the i-th character of the i-th element will be `'-'`, and no other characters will be `'-'`.

## Examples

| `matches` | Returns | Explanation |
|---|---|---|
| `{"-WW","W-W","WW-"}` | `{6,6,6}` | Every home team wins its match, so all three teams get 2 wins each (6 points). |
| `{"-DD","L-L","WD-"}` | `{5,2,8}` | Team 0: 1 win + 2 draws = 5; team 1: 2 draws = 2; team 2: 2 wins + 2 draws = 8. |
| `{"-DWWD","L-WLL","DD-WD","DDL-L","DDLL-"}` | `{14,7,12,8,10}` | Larger 5-team example; see original page for full breakdown. |