//endtime - deadline
//profit associated with job - profit
//job identifier - id / name

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class jobSched{
    int id,profit,deadline;
    //string type,owner;
    //int startTime,executionTime;

    jobSched(){}
    jobSched(int id, int profit, int deadline){
        this.id = id;
        this.profit = profit;
        this.deadline = deadline;
    }
    public void scheduleJob(ArrayList<jobSched> jobList){
        int size = jobList.size();
        //sort job list based on profit
        //sorting criteria can be changed based on requirement
        Collections.sort(jobList,(a, b)->b.profit - a.profit);
        //track free slots
        int nSlot = 3;
        boolean slot[]=new boolean[nSlot];
        //save scheduled job list
        int seq[] = new int[nSlot];
        //iterate through jobList
        for(int i=0;i<size;i++){
            //find free slot from slot[]
            for(int j = Math.min(nSlot-1,jobList.get(i).deadline-1);j>=0;j--){
                if(slot[j]==false){
                    slot[j] = true;
                    seq[j] = jobList.get(i).id;
                    break;
                }
            }
        }
        //print job sequence
        for(int i:seq){
            System.out.println(i + " ");
        }
    }
}
public class jobSchedule {
    public static void main(String[] args) {
        ArrayList<jobSched> jobList = new ArrayList<>();
        jobList.add(new jobSched(1,80,3));
        jobList.add(new jobSched(2,90,1));
        jobList.add(new jobSched(4,40,5));
        jobList.add(new jobSched(3,30,6));
        jobList.add(new jobSched(5,40,1));

     jobSched js = new jobSched();
     js.scheduleJob(jobList);
    }
}
