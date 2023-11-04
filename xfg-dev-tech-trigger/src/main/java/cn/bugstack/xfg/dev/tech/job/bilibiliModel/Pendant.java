package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
public class Pendant
{
    private int pid;

    private String name;

    private String image;

    private int expire;

    private String image_enhance;

    private String image_enhance_frame;

    private int n_pid;

    public void setPid(int pid){
        this.pid = pid;
    }
    public int getPid(){
        return this.pid;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setImage(String image){
        this.image = image;
    }
    public String getImage(){
        return this.image;
    }
    public void setExpire(int expire){
        this.expire = expire;
    }
    public int getExpire(){
        return this.expire;
    }
    public void setImage_enhance(String image_enhance){
        this.image_enhance = image_enhance;
    }
    public String getImage_enhance(){
        return this.image_enhance;
    }
    public void setImage_enhance_frame(String image_enhance_frame){
        this.image_enhance_frame = image_enhance_frame;
    }
    public String getImage_enhance_frame(){
        return this.image_enhance_frame;
    }
    public void setN_pid(int n_pid){
        this.n_pid = n_pid;
    }
    public int getN_pid(){
        return this.n_pid;
    }

}