package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
import java.util.ArrayList;
import java.util.List;
public class Fallback_layers
{
    private List<Layers> layers;

    private boolean is_critical_group;

    public void setLayers(List<Layers> layers){
        this.layers = layers;
    }
    public List<Layers> getLayers(){
        return this.layers;
    }
    public void setIs_critical_group(boolean is_critical_group){
        this.is_critical_group = is_critical_group;
    }
    public boolean getIs_critical_group(){
        return this.is_critical_group;
    }

}