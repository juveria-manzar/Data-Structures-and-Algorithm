<h2><a href="https://leetcode.com/problems/reshape-the-matrix/">566. Reshape the Matrix</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">In MATLAB, there is a handy function called <code style="user-select: auto;">reshape</code> which can reshape an <code style="user-select: auto;">m x n</code> matrix into a new one with a different size <code style="user-select: auto;">r x c</code> keeping its original data.</p>

<p style="user-select: auto;">You are given an <code style="user-select: auto;">m x n</code> matrix <code style="user-select: auto;">mat</code> and two integers <code style="user-select: auto;">r</code> and <code style="user-select: auto;">c</code> representing the number of rows and the number of columns of the wanted reshaped matrix.</p>

<p style="user-select: auto;">The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.</p>

<p style="user-select: auto;">If the <code style="user-select: auto;">reshape</code> operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/24/reshape1-grid.jpg" style="width: 613px; height: 173px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> mat = [[1,2],[3,4]], r = 1, c = 4
<strong style="user-select: auto;">Output:</strong> [[1,2,3,4]]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/24/reshape2-grid.jpg" style="width: 453px; height: 173px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> mat = [[1,2],[3,4]], r = 2, c = 4
<strong style="user-select: auto;">Output:</strong> [[1,2],[3,4]]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m == mat.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == mat[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-1000 &lt;= mat[i][j] &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= r, c &lt;= 300</code></li>
</ul>
</div>