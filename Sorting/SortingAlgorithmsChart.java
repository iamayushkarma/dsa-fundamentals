package Sorting;

/*
===============================================================
                  SORTING ALGORITHMS CHART
===============================================================

+------------+------------+------------+------------+------------------+----------+----------+
| Algorithm  | Worst      | Average    | Best       | Space Complexity | Stable   | In-Place |
+------------+------------+------------+------------+------------------+----------+----------+
| Bubble     | O(n^2)     | O(n^2)     | O(n)       | O(1)             | Yes      | Yes      |
| Selection  | O(n^2)     | O(n^2)     | O(n^2)     | O(1)             | No       | Yes      |
| Insertion  | O(n^2)     | O(n^2)     | O(n)       | O(1)             | Yes      | Yes      |
| Merge      | O(n log n) | O(n log n) | O(n log n) | O(n)             | Yes      | No       |
| Quick      | O(n^2)     | O(n log n) | O(n log n) | O(log n)         | No       | Yes*     |
| Counting   | O(n + k)   | O(n + k)   | O(n + k)   | O(k)             | Yes      | No       |
| Radix      | O(d(n+k))  | O(d(n+k))  | O(d(n+k))  | O(n + k)         | Yes      | No       |
| Bucket     | O(n^2)     | O(n + k)   | O(n + k)   | O(n)             | Depends  | No       |
+------------+------------+------------+------------+------------------+----------+----------+

WC  -> Worst Case
AC  -> Average Case
BC  -> Best Case

Notes:
In-Place (Yes*): Quick Sort rearranges elements within the same array
  and does not use extra arrays, but it requires recursion.
  The recursion stack uses O(log n) space on average
  (O(n) in the worst case), so it is not strictly O(1) space.
k -> Range of input values
d -> Number of digits (Radix Sort)
Bucket Sort stability depends on the sorting method used inside buckets.
Counting, Radix, and Bucket are non-comparison based sorting algorithms.


===============================================================
*/

public class SortingAlgorithmsChart {
  // This class intentionally contains no code.
  // The purpose of this file is documentation only.
}
