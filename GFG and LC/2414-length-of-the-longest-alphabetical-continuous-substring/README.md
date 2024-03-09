<h2><a href="https://leetcode.com/problems/length-of-the-longest-alphabetical-continuous-substring/">2414. Length of the Longest Alphabetical Continuous Substring</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">An <strong style="user-select: auto;">alphabetical continuous string</strong> is a string consisting of consecutive letters in the alphabet. In other words, it is any substring of the string <code style="user-select: auto;">"abcdefghijklmnopqrstuvwxyz"</code>.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, <code style="user-select: auto;">"abc"</code> is an alphabetical continuous string, while <code style="user-select: auto;">"acb"</code> and <code style="user-select: auto;">"za"</code> are not.</li>
</ul>

<p style="user-select: auto;">Given a string <code style="user-select: auto;">s</code> consisting of lowercase letters only, return the <em style="user-select: auto;">length of the <strong style="user-select: auto;">longest</strong> alphabetical continuous substring.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "abacaba"
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> There are 4 distinct continuous substrings: "a", "b", "c" and "ab".
"ab" is the longest continuous substring.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "abcde"
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong> "abcde" is the longest continuous substring.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> consists of only English lowercase letters.</li>
</ul>
</div>