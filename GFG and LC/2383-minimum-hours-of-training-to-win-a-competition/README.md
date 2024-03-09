<h2><a href="https://leetcode.com/problems/minimum-hours-of-training-to-win-a-competition/">2383. Minimum Hours of Training to Win a Competition</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are entering a competition, and are given two <strong style="user-select: auto;">positive</strong> integers <code style="user-select: auto;">initialEnergy</code> and <code style="user-select: auto;">initialExperience</code> denoting your initial energy and initial experience respectively.</p>

<p style="user-select: auto;">You are also given two <strong style="user-select: auto;">0-indexed</strong> integer arrays <code style="user-select: auto;">energy</code> and <code style="user-select: auto;">experience</code>, both of length <code style="user-select: auto;">n</code>.</p>

<p style="user-select: auto;">You will face <code style="user-select: auto;">n</code> opponents <strong style="user-select: auto;">in order</strong>. The energy and experience of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> opponent is denoted by <code style="user-select: auto;">energy[i]</code> and <code style="user-select: auto;">experience[i]</code> respectively. When you face an opponent, you need to have both <strong style="user-select: auto;">strictly</strong> greater experience and energy to defeat them and move to the next opponent if available.</p>

<p style="user-select: auto;">Defeating the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> opponent <strong style="user-select: auto;">increases</strong> your experience by <code style="user-select: auto;">experience[i]</code>, but <strong style="user-select: auto;">decreases</strong> your energy by <code style="user-select: auto;">energy[i]</code>.</p>

<p style="user-select: auto;">Before starting the competition, you can train for some number of hours. After each hour of training, you can <strong style="user-select: auto;">either</strong> choose to increase your initial experience by one, or increase your initial energy by one.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum</strong> number of training hours required to defeat all </em><code style="user-select: auto;">n</code><em style="user-select: auto;"> opponents</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> initialEnergy = 5, initialExperience = 3, energy = [1,4,3,2], experience = [2,6,3,1]
<strong style="user-select: auto;">Output:</strong> 8
<strong style="user-select: auto;">Explanation:</strong> You can increase your energy to 11 after 6 hours of training, and your experience to 5 after 2 hours of training.
You face the opponents in the following order:
- You have more energy and experience than the 0<sup style="user-select: auto;">th</sup> opponent so you win.
  Your energy becomes 11 - 1 = 10, and your experience becomes 5 + 2 = 7.
- You have more energy and experience than the 1<sup style="user-select: auto;">st</sup> opponent so you win.
  Your energy becomes 10 - 4 = 6, and your experience becomes 7 + 6 = 13.
- You have more energy and experience than the 2<sup style="user-select: auto;">nd</sup> opponent so you win.
  Your energy becomes 6 - 3 = 3, and your experience becomes 13 + 3 = 16.
- You have more energy and experience than the 3<sup style="user-select: auto;">rd</sup> opponent so you win.
  Your energy becomes 3 - 2 = 1, and your experience becomes 16 + 1 = 17.
You did a total of 6 + 2 = 8 hours of training before the competition, so we return 8.
It can be proven that no smaller answer exists.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> initialEnergy = 2, initialExperience = 4, energy = [1], experience = [3]
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> You do not need any additional energy or experience to win the competition, so we return 0.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == energy.length == experience.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= initialEnergy, initialExperience, energy[i], experience[i] &lt;= 100</code></li>
</ul>
</div>