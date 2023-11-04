package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
public class Draw
{
    private int draw_type;

    private int fill_mode;

    private Color_config color_config;

    public void setDraw_type(int draw_type){
        this.draw_type = draw_type;
    }
    public int getDraw_type(){
        return this.draw_type;
    }
    public void setFill_mode(int fill_mode){
        this.fill_mode = fill_mode;
    }
    public int getFill_mode(){
        return this.fill_mode;
    }
    public void setColor_config(Color_config color_config){
        this.color_config = color_config;
    }
    public Color_config getColor_config(){
        return this.color_config;
    }

}