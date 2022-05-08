<h2><a href="https://leetcode.com/problems/largest-3-same-digit-number-in-string/">2264. Largest 3-Same-Digit Number in String</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a string <code style="user-select: auto;">num</code> representing a large integer. An integer is <strong style="user-select: auto;">good</strong> if it meets the following conditions:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">It is a <strong style="user-select: auto;">substring</strong> of <code style="user-select: auto;">num</code> with length <code style="user-select: auto;">3</code>.</li>
	<li style="user-select: auto;">It consists of only one unique digit.</li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">maximum good </strong>integer as a <strong style="user-select: auto;">string</strong> or an empty string </em><code style="user-select: auto;">""</code><em style="user-select: auto;"> if no such integer exists</em>.</p>

<p style="user-select: auto;">Note:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">A <strong style="user-select: auto;">substring</strong> is a contiguous sequence of characters within a string.</li>
	<li style="user-select: auto;">There may be <strong style="user-select: auto;">leading zeroes</strong> in <code style="user-select: auto;">num</code> or a good integer.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> num = "6<strong style="user-select: auto;"><u style="user-select: auto;">777</u></strong>133339"
<strong style="user-select: auto;">Output:</strong> "777"
<strong style="user-select: auto;">Explanation:</strong> There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> num = "23<strong style="user-select: auto;"><u style="user-select: auto;">000</u></strong>19"
<strong style="user-select: auto;">Output:</strong> "000"
<strong style="user-select: auto;">Explanation:</strong> "000" is the only good integer.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> num = "42352338"
<strong style="user-select: auto;">Output:</strong> ""
<strong style="user-select: auto;">Explanation:</strong> No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">3 &lt;= num.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">num</code> only consists of digits.</li>
</ul>
</div>