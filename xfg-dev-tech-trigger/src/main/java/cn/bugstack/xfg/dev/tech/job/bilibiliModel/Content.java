package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
import java.util.ArrayList;
import java.util.List;
public class Content
{
    private String message;

    private List<String> members;

    private Jump_url jump_url;

    private int max_line;

    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
    public void setMembers(List<String> members){
        this.members = members;
    }
    public List<String> getMembers(){
        return this.members;
    }
    public void setJump_url(Jump_url jump_url){
        this.jump_url = jump_url;
    }
    public Jump_url getJump_url(){
        return this.jump_url;
    }
    public void setMax_line(int max_line){
        this.max_line = max_line;
    }
    public int getMax_line(){
        return this.max_line;
    }

}