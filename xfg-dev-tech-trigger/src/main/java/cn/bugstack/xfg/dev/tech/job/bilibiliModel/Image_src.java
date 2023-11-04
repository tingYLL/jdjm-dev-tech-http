package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
public class Image_src
{
    private int src_type;

    private int placeholder;

    private Remote remote;

    public void setSrc_type(int src_type){
        this.src_type = src_type;
    }
    public int getSrc_type(){
        return this.src_type;
    }
    public void setPlaceholder(int placeholder){
        this.placeholder = placeholder;
    }
    public int getPlaceholder(){
        return this.placeholder;
    }
    public void setRemote(Remote remote){
        this.remote = remote;
    }
    public Remote getRemote(){
        return this.remote;
    }

}