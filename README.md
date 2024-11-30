
# Project Title

The following were a team effort of Leetcode challenges completed during bootcamp. The following project was built in a Maven Java application where we solved five different Leetcode questions which included:
#### 1. Average Salary Excluding the Minimum and Maximum Salary
#### 2. Squares of a Sorted Array
#### 3. Missing Number    
#### 4. Add Two Numbers
#### 5. Merge Two Sorted Lists
Each question is put into its own package, which is named in order (challenge1, challenge2, etc.). We also used the JUnit testing framework to test our solutions. The values of the test cases used are the same as the ones used in the test cases on Leetcode.
## How To run Junit Test
1. clone The repo using git (install git if you not installed it already)
```bash
  // open gitbash or terminal
  git clone https://github.com/hjob-1/team-challenge-obsidi-team-3.git
```
2. open eclipse or other IDE right click on the project select maven from the listed options then update maven the project.
3. After That Expand src/test/java package open **LeetCodeJunit** test class then run it as a junit application.

## Logic
Below is an explaination of each problem statement and thier corresponding logic.
### The Average Salary excluding the maximum and minimum salary: 
First get the salary list and initialize it with default values. We find the minimum and maximum salaries in an array by looping through the list, if salary is greater than maxSalary set to maxSalary and if less than minSalary set to minSalary. Subtract minimum and maximum from total sum and then divide the remaining sum by count to return averageSalary.
### Squares of a Sorted array: 
Loop through each element of the array list for a comparison. If the value on the left is greater than the value on the right, swap values till loop ends and return sorted list in ascending order.
### Missing Number: 
Get the list of numbers where start range is 0 - n to find the missing number and return it. set false to found, loop through the list. If value of current number is equal to start range, set true to found and end loop. If not found, set range to missing number = -1.
### Add Two Number: 
This adds two nodes list with two non null integers. Default sum is set to 0, if node1 is not null which means it has a value, add value to sum and same for node2. If the value if the sum is 2 digit, we pass the remainder to the next sum calculation(create a new nodelist). We move the pointer, end loop and return the head.
### Merge Two Sorted Lists: 
Given two list, compare the value of both list, set new listNode to default value (0), if list1 is less that list2, assign the current next pointer to this list Node1. Else, set current next pointer to list Node2 and end loop. If list Node1 is not null set current next pointer to list Node1 and same for list Node2.

## Acknowledgements
 - [What is ListNode ](https://www.javatpoint.com/java-list-node)
 - [Sorting Algorithms](https://favtutor.com/blogs/sorting-algorithms-java)

