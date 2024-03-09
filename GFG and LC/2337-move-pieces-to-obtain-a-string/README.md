<h2><a href="https://leetcode.com/problems/move-pieces-to-obtain-a-string/">2337. Move Pieces to Obtain a String</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given two strings <code style="user-select: auto;">start</code> and <code style="user-select: auto;">target</code>, both of length <code style="user-select: auto;">n</code>. Each string consists <strong style="user-select: auto;">only</strong> of the characters <code style="user-select: auto;">'L'</code>, <code style="user-select: auto;">'R'</code>, and <code style="user-select: auto;">'_'</code> where:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The characters <code style="user-select: auto;">'L'</code> and <code style="user-select: auto;">'R'</code> represent pieces, where a piece <code style="user-select: auto;">'L'</code> can move to the <strong style="user-select: auto;">left</strong> only if there is a <strong style="user-select: auto;">blank</strong> space directly to its left, and a piece <code style="user-select: auto;">'R'</code> can move to the <strong style="user-select: auto;">right</strong> only if there is a <strong style="user-select: auto;">blank</strong> space directly to its right.</li>
	<li style="user-select: auto;">The character <code style="user-select: auto;">'_'</code> represents a blank space that can be occupied by <strong style="user-select: auto;">any</strong> of the <code style="user-select: auto;">'L'</code> or <code style="user-select: auto;">'R'</code> pieces.</li>
</ul>

<p style="user-select: auto;">Return <code style="user-select: auto;">true</code> <em style="user-select: auto;">if it is possible to obtain the string</em> <code style="user-select: auto;">target</code><em style="user-select: auto;"> by moving the pieces of the string </em><code style="user-select: auto;">start</code><em style="user-select: auto;"> <strong style="user-select: auto;">any</strong> number of times</em>. Otherwise, return <code style="user-select: auto;">false</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> start = "_L__R__R_", target = "L______RR"
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> We can obtain the string target from start by doing the following moves:
- Move the first piece one step to the left, start becomes equal to "<strong style="user-select: auto;">L</strong>___R__R_".
- Move the last piece one step to the right, start becomes equal to "L___R___<strong style="user-select: auto;">R</strong>".
- Move the second piece three steps to the right, start becomes equal to "L______<strong style="user-select: auto;">R</strong>R".
Since it is possible to get the string target from start, we return true.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> start = "R_L_", target = "__LR"
<strong style="user-select: auto;">Output:</strong> false
<strong style="user-select: auto;">Explanation:</strong> The 'R' piece in the string start can move one step to the right to obtain "_<strong style="user-select: auto;">R</strong>L_".
After that, no pieces can move anymore, so it is impossible to obtain the string target from start.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> start = "_R", target = "R_"
<strong style="user-select: auto;">Output:</strong> false
<strong style="user-select: auto;">Explanation:</strong> The piece in the string start can move only to the right, so it is impossible to obtain the string target from start.</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == start.length == target.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">start</code> and <code style="user-select: auto;">target</code> consist of the characters <code style="user-select: auto;">'L'</code>, <code style="user-select: auto;">'R'</code>, and <code style="user-select: auto;">'_'</code>.</li>
</ul>
</div>