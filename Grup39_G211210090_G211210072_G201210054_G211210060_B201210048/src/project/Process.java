package project;


public class Process {
    
    int ID;
    int arrivingTime;
    int runTime;
    int priority;
    int overTime;
    int delay;
    int cpuUsage;
    int mdmUsage;
    int cdUsage;
    int yazcUsage;
    int trycUsage;

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }


    public int getArrivingTime() {
        return arrivingTime;
    }

    @Override
    public String toString() {
        return "process [Id=" + ID + ", arrivingTime=" + arrivingTime + ", runTime=" + runTime + ", priority="
                + priority + ", overTime="+ overTime + "]";
    }
    public void setArrivingTime(int arrivingTime) {
        this.arrivingTime = arrivingTime;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        ID = id;
    }
    public int getYazcUsage()
    {
    	return yazcUsage;
    	
    }
    public void setYazcUsage(int usage)
    {
    	
    	yazcUsage=usage;
    	
    	
    }
    public int getTrycUsage()
    {
    	return trycUsage;
    	
    }
    public void setTrycUsage(int usage)
    {
    	
    	trycUsage=usage;
    	
    	
    }
    public int getMdmUsage()
    {
    	return mdmUsage;
    	
    }
    public void setMdmUsage(int usage)
    {
    	
    	mdmUsage=usage;
    	
    	
    }
    public int getCpuUsage()
    {
    	return cpuUsage;
    	
    }
    public void setCpuUsage(int usage)
    {
    	
    	cpuUsage=usage;
    	
    	
    }
    public int getCdUsage()
    {
    	return cdUsage;
    	
    }
    public void setCdUsage(int usage)
    {
    	
    	cdUsage=usage;
    	
    	
    }
    public Process (int[] array ){

        this.ID=array[0];
        this.arrivingTime=array[1];
        this.priority=array[2];
        this.runTime=array[3];
        this.cpuUsage=array[4];
        this.yazcUsage=array[5];
        this.trycUsage=array[6];
        this.mdmUsage=array[7];
        this.cdUsage=array[8];
    }
    
}
