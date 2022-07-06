<h2><a href="https://leetcode.com/problems/decode-the-message/">2325. Decode the Message</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given the strings <code style="user-select: auto;">key</code> and <code style="user-select: auto;">message</code>, which represent a cipher key and a secret message, respectively. The steps to decode <code style="user-select: auto;">message</code> are as follows:</p>

<ol style="user-select: auto;">
	<li style="user-select: auto;">Use the <strong style="user-select: auto;">first</strong> appearance of all 26 lowercase English letters in <code style="user-select: auto;">key</code> as the <strong style="user-select: auto;">order</strong> of the substitution table.</li>
	<li style="user-select: auto;">Align the substitution table with the regular English alphabet.</li>
	<li style="user-select: auto;">Each letter in <code style="user-select: auto;">message</code> is then <strong style="user-select: auto;">substituted</strong> using the table.</li>
	<li style="user-select: auto;">Spaces <code style="user-select: auto;">' '</code> are transformed to themselves.</li>
</ol>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, given <code style="user-select: auto;">key = "<u style="user-select: auto;"><strong style="user-select: auto;">hap</strong></u>p<u style="user-select: auto;"><strong style="user-select: auto;">y</strong></u> <u style="user-select: auto;"><strong style="user-select: auto;">bo</strong></u>y"</code> (actual key would have <strong style="user-select: auto;">at least one</strong> instance of each letter in the alphabet), we have the partial substitution table of (<code style="user-select: auto;">'h' -&gt; 'a'</code>, <code style="user-select: auto;">'a' -&gt; 'b'</code>, <code style="user-select: auto;">'p' -&gt; 'c'</code>, <code style="user-select: auto;">'y' -&gt; 'd'</code>, <code style="user-select: auto;">'b' -&gt; 'e'</code>, <code style="user-select: auto;">'o' -&gt; 'f'</code>).</li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">the decoded message</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/05/08/ex1new4.jpg" style="width: 752px; height: 150px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
<strong style="user-select: auto;">Output:</strong> "this is a secret"
<strong style="user-select: auto;">Explanation:</strong> The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "<u style="user-select: auto;"><strong style="user-select: auto;">the</strong></u> <u style="user-select: auto;"><strong style="user-select: auto;">quick</strong></u> <u style="user-select: auto;"><strong style="user-select: auto;">brown</strong></u> <u style="user-select: auto;"><strong style="user-select: auto;">f</strong></u>o<u style="user-select: auto;"><strong style="user-select: auto;">x</strong></u> <u style="user-select: auto;"><strong style="user-select: auto;">j</strong></u>u<u style="user-select: auto;"><strong style="user-select: auto;">mps</strong></u> o<u style="user-select: auto;"><strong style="user-select: auto;">v</strong></u>er the <u style="user-select: auto;"><strong style="user-select: auto;">lazy</strong></u> <u style="user-select: auto;"><strong style="user-select: auto;">d</strong></u>o<u style="user-select: auto;"><strong style="user-select: auto;">g</strong></u>".
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/05/08/ex2new.jpg" style="width: 754px; height: 150px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb"
<strong style="user-select: auto;">Output:</strong> "the five boxing wizards jump quickly"
<strong style="user-select: auto;">Explanation:</strong> The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "<u style="user-select: auto;"><strong style="user-select: auto;">eljuxhpwnyrdgtqkviszcfmabo</strong></u>".
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">26 &lt;= key.length &lt;= 2000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">key</code> consists of lowercase English letters and <code style="user-select: auto;">' '</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">key</code> contains every letter in the English alphabet (<code style="user-select: auto;">'a'</code> to <code style="user-select: auto;">'z'</code>) <strong style="user-select: auto;">at least once</strong>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= message.length &lt;= 2000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">message</code> consists of lowercase English letters and <code style="user-select: auto;">' '</code>.</li>
</ul>
</div>