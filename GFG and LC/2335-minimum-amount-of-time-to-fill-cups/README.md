<h2><a href="https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups/">2335. Minimum Amount of Time to Fill Cups</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You have a water dispenser that can dispense cold, warm, and hot water. Every second, you can either fill up <code style="user-select: auto;">2</code> cups with <strong style="user-select: auto;">different</strong> types of water, or <code style="user-select: auto;">1</code> cup of any type of water.</p>

<p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">amount</code> of length <code style="user-select: auto;">3</code> where <code style="user-select: auto;">amount[0]</code>, <code style="user-select: auto;">amount[1]</code>, and <code style="user-select: auto;">amount[2]</code> denote the number of cold, warm, and hot water cups you need to fill respectively. Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum</strong> number of seconds needed to fill up all the cups</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> amount = [1,4,2]
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong> One way to fill up the cups is:
Second 1: Fill up a cold cup and a warm cup.
Second 2: Fill up a warm cup and a hot cup.
Second 3: Fill up a warm cup and a hot cup.
Second 4: Fill up a warm cup.
It can be proven that 4 is the minimum number of seconds needed.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> amount = [5,4,4]
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong> One way to fill up the cups is:
Second 1: Fill up a cold cup, and a hot cup.
Second 2: Fill up a cold cup, and a warm cup.
Second 3: Fill up a cold cup, and a warm cup.
Second 4: Fill up a warm cup, and a hot cup.
Second 5: Fill up a cold cup, and a hot cup.
Second 6: Fill up a cold cup, and a warm cup.
Second 7: Fill up a hot cup.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> amount = [5,0,0]
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong> Every second, we fill up a cold cup.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">amount.length == 3</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= amount[i] &lt;= 100</code></li>
</ul>
</div>