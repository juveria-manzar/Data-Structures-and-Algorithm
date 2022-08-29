<h2><a href="https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/">2391. Minimum Amount of Time to Collect Garbage</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> array of strings <code style="user-select: auto;">garbage</code> where <code style="user-select: auto;">garbage[i]</code> represents the assortment of garbage at the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> house. <code style="user-select: auto;">garbage[i]</code> consists only of the characters <code style="user-select: auto;">'M'</code>, <code style="user-select: auto;">'P'</code> and <code style="user-select: auto;">'G'</code> representing one unit of metal, paper and glass garbage respectively. Picking up <strong style="user-select: auto;">one</strong> unit of any type of garbage takes <code style="user-select: auto;">1</code> minute.</p>

<p style="user-select: auto;">You are also given a <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">travel</code> where <code style="user-select: auto;">travel[i]</code> is the number of minutes needed to go from house <code style="user-select: auto;">i</code> to house <code style="user-select: auto;">i + 1</code>.</p>

<p style="user-select: auto;">There are three garbage trucks in the city, each responsible for picking up one type of garbage. Each garbage truck starts at house <code style="user-select: auto;">0</code> and must visit each house <strong style="user-select: auto;">in order</strong>; however, they do <strong style="user-select: auto;">not</strong> need to visit every house.</p>

<p style="user-select: auto;">Only <strong style="user-select: auto;">one</strong> garbage truck may be used at any given moment. While one truck is driving or picking up garbage, the other two trucks <strong style="user-select: auto;">cannot</strong> do anything.</p>

<p style="user-select: auto;">Return<em style="user-select: auto;"> the <strong style="user-select: auto;">minimum</strong> number of minutes needed to pick up all the garbage.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> garbage = ["G","P","GP","GG"], travel = [2,4,3]
<strong style="user-select: auto;">Output:</strong> 21
<strong style="user-select: auto;">Explanation:</strong>
The paper garbage truck:
1. Travels from house 0 to house 1
2. Collects the paper garbage at house 1
3. Travels from house 1 to house 2
4. Collects the paper garbage at house 2
Altogether, it takes 8 minutes to pick up all the paper garbage.
The glass garbage truck:
1. Collects the glass garbage at house 0
2. Travels from house 0 to house 1
3. Travels from house 1 to house 2
4. Collects the glass garbage at house 2
5. Travels from house 2 to house 3
6. Collects the glass garbage at house 3
Altogether, it takes 13 minutes to pick up all the glass garbage.
Since there is no metal garbage, we do not need to consider the metal garbage truck.
Therefore, it takes a total of 8 + 13 = 21 minutes to collect all the garbage.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> garbage = ["MMM","PGM","GP"], travel = [3,10]
<strong style="user-select: auto;">Output:</strong> 37
<strong style="user-select: auto;">Explanation:</strong>
The metal garbage truck takes 7 minutes to pick up all the metal garbage.
The paper garbage truck takes 15 minutes to pick up all the paper garbage.
The glass garbage truck takes 15 minutes to pick up all the glass garbage.
It takes a total of 7 + 15 + 15 = 37 minutes to collect all the garbage.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= garbage.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">garbage[i]</code> consists of only the letters <code style="user-select: auto;">'M'</code>, <code style="user-select: auto;">'P'</code>, and <code style="user-select: auto;">'G'</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= garbage[i].length &lt;= 10</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">travel.length == garbage.length - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= travel[i] &lt;= 100</code></li>
</ul>
</div>