<h2><a href="https://leetcode.com/problems/node-with-highest-edge-score/">2374. Node With Highest Edge Score</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a directed graph with <code style="user-select: auto;">n</code> nodes labeled from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">n - 1</code>, where each node has <strong style="user-select: auto;">exactly one</strong> outgoing edge.</p>

<p style="user-select: auto;">The graph is represented by a given <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">edges</code> of length <code style="user-select: auto;">n</code>, where <code style="user-select: auto;">edges[i]</code> indicates that there is a <strong style="user-select: auto;">directed</strong> edge from node <code style="user-select: auto;">i</code> to node <code style="user-select: auto;">edges[i]</code>.</p>

<p style="user-select: auto;">The <strong style="user-select: auto;">edge score</strong> of a node <code style="user-select: auto;">i</code> is defined as the sum of the <strong style="user-select: auto;">labels</strong> of all the nodes that have an edge pointing to <code style="user-select: auto;">i</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the node with the highest <strong style="user-select: auto;">edge score</strong></em>. If multiple nodes have the same <strong style="user-select: auto;">edge score</strong>, return the node with the <strong style="user-select: auto;">smallest</strong> index.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img src="https://assets.leetcode.com/uploads/2022/06/20/image-20220620195403-1.png" style="width: 450px; height: 260px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> edges = [1,0,0,0,0,7,7,5]
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong>
- The nodes 1, 2, 3 and 4 have an edge pointing to node 0. The edge score of node 0 is 1 + 2 + 3 + 4 = 10.
- The node 0 has an edge pointing to node 1. The edge score of node 1 is 0.
- The node 7 has an edge pointing to node 5. The edge score of node 5 is 7.
- The nodes 5 and 6 have an edge pointing to node 7. The edge score of node 7 is 5 + 6 = 11.
Node 7 has the highest edge score so return 7.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img src="https://assets.leetcode.com/uploads/2022/06/20/image-20220620200212-3.png" style="width: 150px; height: 155px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> edges = [2,0,0,2]
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong>
- The nodes 1 and 2 have an edge pointing to node 0. The edge score of node 0 is 1 + 2 = 3.
- The nodes 0 and 3 have an edge pointing to node 2. The edge score of node 2 is 0 + 3 = 3.
Nodes 0 and 2 both have an edge score of 3. Since node 0 has a smaller index, we return 0.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == edges.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= edges[i] &lt; n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">edges[i] != i</code></li>
</ul>
</div>