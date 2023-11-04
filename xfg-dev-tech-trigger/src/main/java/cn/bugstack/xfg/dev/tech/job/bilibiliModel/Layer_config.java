package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
public class Layer_config
{
    private Tags tags;

    private boolean is_critical;

    private Layer_mask layer_mask;

    public void setTags(Tags tags){
        this.tags = tags;
    }
    public Tags getTags(){
        return this.tags;
    }
    public void setIs_critical(boolean is_critical){
        this.is_critical = is_critical;
    }
    public boolean getIs_critical(){
        return this.is_critical;
    }
    public void setLayer_mask(Layer_mask layer_mask){
        this.layer_mask = layer_mask;
    }
    public Layer_mask getLayer_mask(){
        return this.layer_mask;
    }

}