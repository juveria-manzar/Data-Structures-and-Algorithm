# 2. Addition Under Modulo
## Easy
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given two numbers a and b, find the sum of a and b. Since the sum can be very large, find the sum&nbsp;modulo <strong style="user-select: auto;">10<sup style="user-select: auto;">9</sup>+7.</strong></span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>a = 9223372036854775807
b = 9223372036854775807
<strong style="user-select: auto;">Output: </strong>582344006
<strong style="user-select: auto;">Explanation: 
</strong>9223372036854775807 + 9223372036854775807 
= 18446744073709551614.
18446744073709551614 mod (10<sup style="user-select: auto;">9</sup>+7)
= 582344006</span></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>a = 1000000007
b = 1000000007
<strong style="user-select: auto;">Output: </strong>0
<strong style="user-select: auto;">Explanation: </strong>1000000007 + 1000000007 =
(2000000014) mod (10<sup style="user-select: auto;">9</sup>+7) = 0</span></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function<strong style="user-select: auto;"> </strong> <strong style="user-select: auto;">sumUnderModulo()&nbsp;</strong>that takes<strong style="user-select: auto;"> a and b as input parameters</strong> and <strong style="user-select: auto;">returns sum </strong>of a and b under modulo <strong style="user-select: auto;">10<sup style="user-select: auto;">9</sup>+7</strong>. </span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity</strong> : O(1)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxilliary Space </strong>:&nbsp; O(1)</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Constraints:</span></strong><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">1 &lt;= a,b &lt;= 2<sup style="user-select: auto;">63</sup>-1</span></p>
 <p style="user-select: auto;"></p>
            </div>