package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
public class General_spec
{
    private Pos_spec pos_spec;

    private Size_spec size_spec;

    private Render_spec render_spec;

    public void setPos_spec(Pos_spec pos_spec){
        this.pos_spec = pos_spec;
    }
    public Pos_spec getPos_spec(){
        return this.pos_spec;
    }
    public void setSize_spec(Size_spec size_spec){
        this.size_spec = size_spec;
    }
    public Size_spec getSize_spec(){
        return this.size_spec;
    }
    public void setRender_spec(Render_spec render_spec){
        this.render_spec = render_spec;
    }
    public Render_spec getRender_spec(){
        return this.render_spec;
    }

}