<h2><a href="https://leetcode.com/problems/check-distances-between-same-letters/">2399. Check Distances Between Same Letters</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> string <code style="user-select: auto;">s</code> consisting of only lowercase English letters, where each letter in <code style="user-select: auto;">s</code> appears <strong style="user-select: auto;">exactly</strong> <strong style="user-select: auto;">twice</strong>. You are also given a <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">distance</code> of length <code style="user-select: auto;">26</code>.</p>

<p style="user-select: auto;">Each letter in the alphabet is numbered from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">25</code> (i.e. <code style="user-select: auto;">'a' -&gt; 0</code>, <code style="user-select: auto;">'b' -&gt; 1</code>, <code style="user-select: auto;">'c' -&gt; 2</code>, ... , <code style="user-select: auto;">'z' -&gt; 25</code>).</p>

<p style="user-select: auto;">In a <strong style="user-select: auto;">well-spaced</strong> string, the number of letters between the two occurrences of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> letter is <code style="user-select: auto;">distance[i]</code>. If the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> letter does not appear in <code style="user-select: auto;">s</code>, then <code style="user-select: auto;">distance[i]</code> can be <strong style="user-select: auto;">ignored</strong>.</p>

<p style="user-select: auto;">Return <code style="user-select: auto;">true</code><em style="user-select: auto;"> if </em><code style="user-select: auto;">s</code><em style="user-select: auto;"> is a <strong style="user-select: auto;">well-spaced</strong> string, otherwise return </em><code style="user-select: auto;">false</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "abaccb", distance = [1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong>
- 'a' appears at indices 0 and 2 so it satisfies distance[0] = 1.
- 'b' appears at indices 1 and 5 so it satisfies distance[1] = 3.
- 'c' appears at indices 3 and 4 so it satisfies distance[2] = 0.
Note that distance[3] = 5, but since 'd' does not appear in s, it can be ignored.
Return true because s is a well-spaced string.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "aa", distance = [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
<strong style="user-select: auto;">Output:</strong> false
<strong style="user-select: auto;">Explanation:</strong>
- 'a' appears at indices 0 and 1 so there are zero letters between them.
Because distance[0] = 1, s is not a well-spaced string.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= s.length &lt;= 52</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> consists only of lowercase English letters.</li>
	<li style="user-select: auto;">Each letter appears in <code style="user-select: auto;">s</code> exactly twice.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">distance.length == 26</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= distance[i] &lt;= 50</code></li>
</ul>
</div>