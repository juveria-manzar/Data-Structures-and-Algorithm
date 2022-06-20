<h2><a href="https://leetcode.com/problems/short-encoding-of-words/">820. Short Encoding of Words</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">A <strong style="user-select: auto;">valid encoding</strong> of an array of <code style="user-select: auto;">words</code> is any reference string <code style="user-select: auto;">s</code> and array of indices <code style="user-select: auto;">indices</code> such that:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">words.length == indices.length</code></li>
	<li style="user-select: auto;">The reference string <code style="user-select: auto;">s</code> ends with the <code style="user-select: auto;">'#'</code> character.</li>
	<li style="user-select: auto;">For each index <code style="user-select: auto;">indices[i]</code>, the <strong style="user-select: auto;">substring</strong> of <code style="user-select: auto;">s</code> starting from <code style="user-select: auto;">indices[i]</code> and up to (but not including) the next <code style="user-select: auto;">'#'</code> character is equal to <code style="user-select: auto;">words[i]</code>.</li>
</ul>

<p style="user-select: auto;">Given an array of <code style="user-select: auto;">words</code>, return <em style="user-select: auto;">the <strong style="user-select: auto;">length of the shortest reference string</strong> </em><code style="user-select: auto;">s</code><em style="user-select: auto;"> possible of any <strong style="user-select: auto;">valid encoding</strong> of </em><code style="user-select: auto;">words</code><em style="user-select: auto;">.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["time", "me", "bell"]
<strong style="user-select: auto;">Output:</strong> 10
<strong style="user-select: auto;">Explanation:</strong> A valid encoding would be s = <code style="user-select: auto;">"time#bell#" and indices = [0, 2, 5</code>].
words[0] = "time", the substring of s starting from indices[0] = 0 to the next '#' is underlined in "<u style="user-select: auto;">time</u>#bell#"
words[1] = "me", the substring of s starting from indices[1] = 2 to the next '#' is underlined in "ti<u style="user-select: auto;">me</u>#bell#"
words[2] = "bell", the substring of s starting from indices[2] = 5 to the next '#' is underlined in "time#<u style="user-select: auto;">bell</u>#"
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["t"]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> A valid encoding would be s = "t#" and indices = [0].
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words.length &lt;= 2000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words[i].length &lt;= 7</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">words[i]</code> consists of only lowercase letters.</li>
</ul>
</div>