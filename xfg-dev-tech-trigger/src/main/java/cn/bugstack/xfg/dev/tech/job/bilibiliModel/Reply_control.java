package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
public class Reply_control
{
    private int max_line;

    private String time_desc;

    private String location;

    public void setMax_line(int max_line){
        this.max_line = max_line;
    }
    public int getMax_line(){
        return this.max_line;
    }
    public void setTime_desc(String time_desc){
        this.time_desc = time_desc;
    }
    public String getTime_desc(){
        return this.time_desc;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return this.location;
    }

}