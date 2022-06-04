<h2><a href="https://leetcode.com/problems/apply-discount-to-prices/">2288. Apply Discount to Prices</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">A <strong style="user-select: auto;">sentence</strong> is a string of single-space separated words where each word can contain digits, lowercase letters, and the dollar sign <code style="user-select: auto;">'$'</code>. A word represents a <strong style="user-select: auto;">price</strong> if it is a sequence of digits preceded by a dollar sign.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, <code style="user-select: auto;">"$100"</code>, <code style="user-select: auto;">"$23"</code>, and <code style="user-select: auto;">"$6"</code> represent prices while <code style="user-select: auto;">"100"</code>, <code style="user-select: auto;">"$"</code>, and <code style="user-select: auto;">"$1e5"</code> do not.</li>
</ul>

<p style="user-select: auto;">You are given a string <code style="user-select: auto;">sentence</code> representing a sentence and an integer <code style="user-select: auto;">discount</code>. For each word representing a price, apply a discount of <code style="user-select: auto;">discount%</code> on the price and <strong style="user-select: auto;">update</strong> the word in the sentence. All updated prices should be represented with <strong style="user-select: auto;">exactly two</strong> decimal places.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">a string representing the modified sentence</em>.</p>

<p style="user-select: auto;">Note that all prices will contain <strong style="user-select: auto;">at most</strong> <code style="user-select: auto;">10</code> digits.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> sentence = "there are $1 $2 and 5$ candies in the shop", discount = 50
<strong style="user-select: auto;">Output:</strong> "there are $0.50 $1.00 and 5$ candies in the shop"
<strong style="user-select: auto;">Explanation:</strong> 
The words which represent prices are "$1" and "$2". 
- A 50% discount on "$1" yields "$0.50", so "$1" is replaced by "$0.50".
- A 50% discount on "$2" yields "$1". Since we need to have exactly 2 decimal places after a price, we replace "$2" with "$1.00".
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> sentence = "1 2 $3 4 $5 $6 7 8$ $9 $10$", discount = 100
<strong style="user-select: auto;">Output:</strong> "1 2 $0.00 4 $0.00 $0.00 7 8$ $0.00 $10$"
<strong style="user-select: auto;">Explanation:</strong> 
Applying a 100% discount on any price will result in 0.
The words representing prices are "$3", "$5", "$6", and "$9".
Each of them is replaced by "$0.00".
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= sentence.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">sentence</code> consists of lowercase English letters, digits, <code style="user-select: auto;">' '</code>, and <code style="user-select: auto;">'$'</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">sentence</code> does not have leading or trailing spaces.</li>
	<li style="user-select: auto;">All words in <code style="user-select: auto;">sentence</code> are separated by a single space.</li>
	<li style="user-select: auto;">All prices will be <strong style="user-select: auto;">positive</strong> integers without leading zeros.</li>
	<li style="user-select: auto;">All prices will have <strong style="user-select: auto;">at most</strong> <code style="user-select: auto;">10</code> digits.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= discount &lt;= 100</code></li>
</ul>
</div>