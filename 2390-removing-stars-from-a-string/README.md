<h2><a href="https://leetcode.com/problems/removing-stars-from-a-string/">2390. Removing Stars From a String</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a string <code style="user-select: auto;">s</code>, which contains stars <code style="user-select: auto;">*</code>.</p>

<p style="user-select: auto;">In one operation, you can:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Choose a star in <code style="user-select: auto;">s</code>.</li>
	<li style="user-select: auto;">Remove the closest <strong style="user-select: auto;">non-star</strong> character to its <strong style="user-select: auto;">left</strong>, as well as remove the star itself.</li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">the string after <strong style="user-select: auto;">all</strong> stars have been removed</em>.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The input will be generated such that the operation is always possible.</li>
	<li style="user-select: auto;">It can be shown that the resulting string will always be unique.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "leet**cod*e"
<strong style="user-select: auto;">Output:</strong> "lecoe"
<strong style="user-select: auto;">Explanation:</strong> Performing the removals from left to right:
- The closest character to the 1<sup style="user-select: auto;">st</sup> star is 't' in "lee<strong style="user-select: auto;"><u style="user-select: auto;">t</u></strong>**cod*e". s becomes "lee*cod*e".
- The closest character to the 2<sup style="user-select: auto;">nd</sup> star is 'e' in "le<strong style="user-select: auto;"><u style="user-select: auto;">e</u></strong>*cod*e". s becomes "lecod*e".
- The closest character to the 3<sup style="user-select: auto;">rd</sup> star is 'd' in "leco<strong style="user-select: auto;"><u style="user-select: auto;">d</u></strong>*e". s becomes "lecoe".
There are no more stars, so we return "lecoe".</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "erase*****"
<strong style="user-select: auto;">Output:</strong> ""
<strong style="user-select: auto;">Explanation:</strong> The entire string is removed, so we return an empty string.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> consists of lowercase English letters and stars <code style="user-select: auto;">*</code>.</li>
	<li style="user-select: auto;">The operation above can be performed on <code style="user-select: auto;">s</code>.</li>
</ul>
</div>