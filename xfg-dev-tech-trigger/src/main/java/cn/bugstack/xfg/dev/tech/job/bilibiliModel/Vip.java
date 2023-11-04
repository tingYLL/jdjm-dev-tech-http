package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
public class Vip
{
    private int vipType;

    private int vipDueDate;

    private String dueRemark;

    private int accessStatus;

    private int vipStatus;

    private String vipStatusWarn;

    private int themeType;

    private Label label;

    private int avatar_subscript;

    private String nickname_color;

    public void setVipType(int vipType){
        this.vipType = vipType;
    }
    public int getVipType(){
        return this.vipType;
    }
    public void setVipDueDate(int vipDueDate){
        this.vipDueDate = vipDueDate;
    }
    public int getVipDueDate(){
        return this.vipDueDate;
    }
    public void setDueRemark(String dueRemark){
        this.dueRemark = dueRemark;
    }
    public String getDueRemark(){
        return this.dueRemark;
    }
    public void setAccessStatus(int accessStatus){
        this.accessStatus = accessStatus;
    }
    public int getAccessStatus(){
        return this.accessStatus;
    }
    public void setVipStatus(int vipStatus){
        this.vipStatus = vipStatus;
    }
    public int getVipStatus(){
        return this.vipStatus;
    }
    public void setVipStatusWarn(String vipStatusWarn){
        this.vipStatusWarn = vipStatusWarn;
    }
    public String getVipStatusWarn(){
        return this.vipStatusWarn;
    }
    public void setThemeType(int themeType){
        this.themeType = themeType;
    }
    public int getThemeType(){
        return this.themeType;
    }
    public void setLabel(Label label){
        this.label = label;
    }
    public Label getLabel(){
        return this.label;
    }
    public void setAvatar_subscript(int avatar_subscript){
        this.avatar_subscript = avatar_subscript;
    }
    public int getAvatar_subscript(){
        return this.avatar_subscript;
    }
    public void setNickname_color(String nickname_color){
        this.nickname_color = nickname_color;
    }
    public String getNickname_color(){
        return this.nickname_color;
    }

}