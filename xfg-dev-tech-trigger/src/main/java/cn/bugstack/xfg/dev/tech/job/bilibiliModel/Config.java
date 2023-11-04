package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
public class Config
{
    private int showtopic;

    private boolean show_up_flag;

    private boolean read_only;

    public void setShowtopic(int showtopic){
        this.showtopic = showtopic;
    }
    public int getShowtopic(){
        return this.showtopic;
    }
    public void setShow_up_flag(boolean show_up_flag){
        this.show_up_flag = show_up_flag;
    }
    public boolean getShow_up_flag(){
        return this.show_up_flag;
    }
    public void setRead_only(boolean read_only){
        this.read_only = read_only;
    }
    public boolean getRead_only(){
        return this.read_only;
    }

}