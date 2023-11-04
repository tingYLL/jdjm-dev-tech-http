package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
public class Layer_mask
{
    private General_spec general_spec;

    private Mask_src mask_src;

    public void setGeneral_spec(General_spec general_spec){
        this.general_spec = general_spec;
    }
    public General_spec getGeneral_spec(){
        return this.general_spec;
    }
    public void setMask_src(Mask_src mask_src){
        this.mask_src = mask_src;
    }
    public Mask_src getMask_src(){
        return this.mask_src;
    }

}