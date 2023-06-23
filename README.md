# Comparison-of-Heapsort-Shellsort-Introsort
* In the heapSort method, implement a maximum heap to sort the given array.

* In the shellSort method, implement an improved version of the insertion sort algorithm.

  ![image](https://github.com/kaans4nli/Comparison-of-Heapsort-Shellsort-Introsort/assets/107371841/6fa16636-4232-4d85-be5e-50f2214aab23)

  The first pass, 5-sorting, performs insertion sort on five separate subarrays (a1, a6, a11), (a2, a7, a12), (a3, a8), (a4, a9), (a5, a10). For instance, it changes the subarray (a1, a6, a11) from (62, 17, 25) to (17, 25, 62). The next pass, 3-sorting, performs insertion sort on three subarrays (a1, a4, a7, a10), (a2, a5, a8, a11), (a3, a6, a9, a12). The last pass, 1-sorting, is an ordinary insertion sort of the entire array (a1 ,..., a12).

  Researchers have published different approaches for gap sequences. Used Shell’s original sequence, which is ⌊N/2 , N/4 , …, 1⌋.

* In the introSort method, implement a hybrid sorting algorithm. When the recursion depth exceeds a level based on (the logarithm of) the number of elements being sorted. The maximum recursion depth is defined as follows.

  maxdepth = [log(length(Input))] × 2
