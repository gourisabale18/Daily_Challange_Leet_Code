class Solution {
    public double averageWaitingTime(int[][] customers) {

        if(customers==null || customers.length==0)
        {
            return -1;
        }

        int currentT=0;
        double waitingT=0.0;
    
        for(int i=0;i<customers.length;i++)
        {
            int arrivalT=customers[i][0];
            int time=customers[i][1];

            if(currentT>=arrivalT)
            {
                currentT+=time;
            }
            else
            {
                currentT=arrivalT+time;
            }
            waitingT+=currentT-arrivalT;
            
        }

        return waitingT/customers.length;
    }
}