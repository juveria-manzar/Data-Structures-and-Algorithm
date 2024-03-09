<h2><a href="https://leetcode.com/problems/longest-subsequence-with-limited-sum/">2389. Longest Subsequence With Limited Sum</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an integer array <code style="user-select: auto;">nums</code> of length <code style="user-select: auto;">n</code>, and an integer array <code style="user-select: auto;">queries</code> of length <code style="user-select: auto;">m</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">an array </em><code style="user-select: auto;">answer</code><em style="user-select: auto;"> of length </em><code style="user-select: auto;">m</code><em style="user-select: auto;"> where </em><code style="user-select: auto;">answer[i]</code><em style="user-select: auto;"> is the <strong style="user-select: auto;">maximum</strong> size of a <strong style="user-select: auto;">subsequence</strong> that you can take from </em><code style="user-select: auto;">nums</code><em style="user-select: auto;"> such that the <strong style="user-select: auto;">sum</strong> of its elements is less than or equal to </em><code style="user-select: auto;">queries[i]</code>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">subsequence</strong> is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [4,5,2,1], queries = [3,10,21]
<strong style="user-select: auto;">Output:</strong> [2,3,4]
<strong style="user-select: auto;">Explanation:</strong> We answer the queries as follows:
- The subsequence [2,1] has a sum less than or equal to 3. It can be proven that 2 is the maximum size of such a subsequence, so answer[0] = 2.
- The subsequence [4,5,1] has a sum less than or equal to 10. It can be proven that 3 is the maximum size of such a subsequence, so answer[1] = 3.
- The subsequence [4,5,2,1] has a sum less than or equal to 21. It can be proven that 4 is the maximum size of such a subsequence, so answer[2] = 4.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,3,4,5], queries = [1]
<strong style="user-select: auto;">Output:</strong> [0]
<strong style="user-select: auto;">Explanation:</strong> The empty subsequence is the only subsequence that has a sum less than or equal to 1, so answer[0] = 0.</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == nums.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">m == queries.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n, m &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i], queries[i] &lt;= 10<sup style="user-select: auto;">6</sup></code></li>
</ul>
</div>