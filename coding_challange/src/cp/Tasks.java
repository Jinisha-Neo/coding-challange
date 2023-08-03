/*
* Given a list of tasks with deadlines and total profit earned on completing a task, find the maximum profit earned by executing the tasks within the specified deadlines. Assume that each task takes one unit of time to complete, and a task can’t execute beyond its deadline. Also, only a single task will be executed at a time.

For example, consider the following set of tasks with a deadline and the profit associated with it. If we choose tasks 1, 3, 4, 5, 6, 7, 8, and 9, we can achieve a maximum profit of 109. Note that task 2 and task 10 are left out.
Tasks	Deadlines	Profit
1	9	15
2	2	2
3	5	18
4	7	1
5	4	25
6	2	20
7	5	8
8	7	10
9	4	12
10	3	5
* */


package coding_challange.src.cp;

import java.util.*;

class Job{
    int task;
    int deadline;
    int profit;

    public Job(int taskId, int deadline, int profit)
    {
        this.task = taskId;
        this.deadline = deadline;
        this.profit = profit;
    }
 }
public class Tasks {

    public static void main(String args[])
    {

        List<Job> jobs = Arrays.asList(
                new Job(1, 9, 15), new Job(2, 2, 2), new Job(3, 5, 18),
                new Job(4, 7, 1), new Job(5, 4, 25), new Job(6, 2, 20),
                new Job(7, 5, 8), new Job(8, 7, 10), new Job(9, 4, 12),
                new Job(10, 3, 5));

        int profit = 0;

        int[] slot = new int[15];
        Arrays.fill(slot, -1);
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);


        for(Job job:jobs){
            for (int j = job.deadline - 1; j >= 0; j--)
            {
                if (slot[j] == -1)
                {
                    slot[j] = job.task;
                    profit += job.profit;
                    break;
                }
                else {
                    System.out.println(slot[j]);
                }
            }
        }
       System.out.println(profit);
    }
}
