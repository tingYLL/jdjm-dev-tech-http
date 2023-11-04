package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
public class Avatar_item
{
    private Container_size container_size;

    private Fallback_layers fallback_layers;

    private String mid;

    public void setContainer_size(Container_size container_size){
        this.container_size = container_size;
    }
    public Container_size getContainer_size(){
        return this.container_size;
    }
    public void setFallback_layers(Fallback_layers fallback_layers){
        this.fallback_layers = fallback_layers;
    }
    public Fallback_layers getFallback_layers(){
        return this.fallback_layers;
    }
    public void setMid(String mid){
        this.mid = mid;
    }
    public String getMid(){
        return this.mid;
    }

}