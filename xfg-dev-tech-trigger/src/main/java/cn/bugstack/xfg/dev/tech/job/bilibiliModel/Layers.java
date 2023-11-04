package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
public class Layers
{
    private boolean visible;

    private General_spec general_spec;

    private Layer_config layer_config;

    private Resource resource;

    public void setVisible(boolean visible){
        this.visible = visible;
    }
    public boolean getVisible(){
        return this.visible;
    }
    public void setGeneral_spec(General_spec general_spec){
        this.general_spec = general_spec;
    }
    public General_spec getGeneral_spec(){
        return this.general_spec;
    }
    public void setLayer_config(Layer_config layer_config){
        this.layer_config = layer_config;
    }
    public Layer_config getLayer_config(){
        return this.layer_config;
    }
    public void setResource(Resource resource){
        this.resource = resource;
    }
    public Resource getResource(){
        return this.resource;
    }

}