<h2><a href="https://leetcode.com/problems/find-the-town-judge/">997. <lclighter data-id="lgt257713177" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;">Find the Town Judge</lclighter><div class="LinerThreadIcon LinerFirst " data-highlight-id="257713177" data-bundle-id="0" id="lgt257713177" style="background-image: url(&quot;https://profile.getliner.com/liner-service-bucket/user_photo_default/color-10/W.svg&quot;); user-select: auto;">
        <div class="LinerThreadIcon__dim" style="user-select: auto;"></div>
        <div class="LinerThreadIcon__mentioned" style="user-select: auto;">
          <div class="LinerThreadIcon__mentionedImg" style="user-select: auto;"></div>
        </div>
        <div class="LinerThreadIcon__onlyMe" style="user-select: auto;">
          <div class="LinerThreadIcon__onlyMeImg" style="user-select: auto;"></div>
        </div>
      </div></a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">In a town, there are <code style="user-select: auto;">n</code> people labeled from <code style="user-select: auto;">1</code> to <code style="user-select: auto;">n</code>. There is a rumor that one of these people is secretly the town judge.</p>

<p style="user-select: auto;">If the town judge exists, then:</p>

<ol style="user-select: auto;">
	<li style="user-select: auto;">The town judge trusts nobody.</li>
	<li style="user-select: auto;">Everybody (except for the town judge) trusts the town judge.</li>
	<li style="user-select: auto;">There is exactly one person that satisfies properties <strong style="user-select: auto;">1</strong> and <strong style="user-select: auto;">2</strong>.</li>
</ol>

<p style="user-select: auto;">You are given an array <code style="user-select: auto;">trust</code> where <code style="user-select: auto;">trust[i] = [a<sub style="user-select: auto;">i</sub>, b<sub style="user-select: auto;">i</sub>]</code> representing that the person labeled <code style="user-select: auto;">a<sub style="user-select: auto;">i</sub></code> trusts the person labeled <code style="user-select: auto;">b<sub style="user-select: auto;">i</sub></code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the label of the town judge if the town judge exists and can be identified, or return </em><code style="user-select: auto;">-1</code><em style="user-select: auto;"> otherwise</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 2, trust = [[1,2]]
<strong style="user-select: auto;">Output:</strong> 2
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 3, trust = [[1,3],[2,3]]
<strong style="user-select: auto;">Output:</strong> 3
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 3, trust = [[1,3],[2,3],[3,1]]
<strong style="user-select: auto;">Output:</strong> -1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= trust.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">trust[i].length == 2</code></li>
	<li style="user-select: auto;">All the pairs of <code style="user-select: auto;">trust</code> are <strong style="user-select: auto;">unique</strong>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">a<sub style="user-select: auto;">i</sub> != b<sub style="user-select: auto;">i</sub></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= a<sub style="user-select: auto;">i</sub>, b<sub style="user-select: auto;">i</sub> &lt;= n</code></li>
</ul>
</div>