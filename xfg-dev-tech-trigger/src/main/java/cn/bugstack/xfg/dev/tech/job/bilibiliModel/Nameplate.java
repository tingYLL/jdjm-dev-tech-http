package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
public class Nameplate
{
    private int nid;

    private String name;

    private String image;

    private String image_small;

    private String level;

    private String condition;

    public void setNid(int nid){
        this.nid = nid;
    }
    public int getNid(){
        return this.nid;
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
    public void setImage_small(String image_small){
        this.image_small = image_small;
    }
    public String getImage_small(){
        return this.image_small;
    }
    public void setLevel(String level){
        this.level = level;
    }
    public String getLevel(){
        return this.level;
    }
    public void setCondition(String condition){
        this.condition = condition;
    }
    public String getCondition(){
        return this.condition;
    }

}