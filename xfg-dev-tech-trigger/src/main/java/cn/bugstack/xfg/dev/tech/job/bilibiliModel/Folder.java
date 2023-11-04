package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
public class Folder
{
    private boolean has_folded;

    private boolean is_folded;

    private String rule;

    public void setHas_folded(boolean has_folded){
        this.has_folded = has_folded;
    }
    public boolean getHas_folded(){
        return this.has_folded;
    }
    public void setIs_folded(boolean is_folded){
        this.is_folded = is_folded;
    }
    public boolean getIs_folded(){
        return this.is_folded;
    }
    public void setRule(String rule){
        this.rule = rule;
    }
    public String getRule(){
        return this.rule;
    }

}