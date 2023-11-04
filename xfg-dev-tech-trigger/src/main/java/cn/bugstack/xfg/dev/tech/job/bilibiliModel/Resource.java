package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
public class Resource
{
    private int res_type;

    private Res_image res_image;

    public void setRes_type(int res_type){
        this.res_type = res_type;
    }
    public int getRes_type(){
        return this.res_type;
    }
    public void setRes_image(Res_image res_image){
        this.res_image = res_image;
    }
    public Res_image getRes_image(){
        return this.res_image;
    }

}