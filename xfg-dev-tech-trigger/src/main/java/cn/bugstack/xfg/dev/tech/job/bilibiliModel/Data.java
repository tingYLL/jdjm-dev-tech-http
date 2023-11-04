package cn.bugstack.xfg.dev.tech.job.bilibiliModel;
import java.util.ArrayList;
import java.util.List;
public class Data
{
    private Cursor cursor;

    private List<Replies> replies;

    private Top top;

    private String top_replies;

    private Up_selection up_selection;

    private Effects effects;

    private int assist;

    private int blacklist;

    private int vote;

    private Config config;

    private Upper upper;

    private Control control;

    private int note;

    private String callbacks;

    private String esports_grade_card;

    private String context_feature;

    public void setCursor(Cursor cursor){
        this.cursor = cursor;
    }
    public Cursor getCursor(){
        return this.cursor;
    }
    public void setReplies(List<Replies> replies){
        this.replies = replies;
    }
    public List<Replies> getReplies(){
        return this.replies;
    }
    public void setTop(Top top){
        this.top = top;
    }
    public Top getTop(){
        return this.top;
    }
    public void setTop_replies(String top_replies){
        this.top_replies = top_replies;
    }
    public String getTop_replies(){
        return this.top_replies;
    }
    public void setUp_selection(Up_selection up_selection){
        this.up_selection = up_selection;
    }
    public Up_selection getUp_selection(){
        return this.up_selection;
    }
    public void setEffects(Effects effects){
        this.effects = effects;
    }
    public Effects getEffects(){
        return this.effects;
    }
    public void setAssist(int assist){
        this.assist = assist;
    }
    public int getAssist(){
        return this.assist;
    }
    public void setBlacklist(int blacklist){
        this.blacklist = blacklist;
    }
    public int getBlacklist(){
        return this.blacklist;
    }
    public void setVote(int vote){
        this.vote = vote;
    }
    public int getVote(){
        return this.vote;
    }
    public void setConfig(Config config){
        this.config = config;
    }
    public Config getConfig(){
        return this.config;
    }
    public void setUpper(Upper upper){
        this.upper = upper;
    }
    public Upper getUpper(){
        return this.upper;
    }
    public void setControl(Control control){
        this.control = control;
    }
    public Control getControl(){
        return this.control;
    }
    public void setNote(int note){
        this.note = note;
    }
    public int getNote(){
        return this.note;
    }
    public void setCallbacks(String callbacks){
        this.callbacks = callbacks;
    }
    public String getCallbacks(){
        return this.callbacks;
    }
    public void setEsports_grade_card(String esports_grade_card){
        this.esports_grade_card = esports_grade_card;
    }
    public String getEsports_grade_card(){
        return this.esports_grade_card;
    }
    public void setContext_feature(String context_feature){
        this.context_feature = context_feature;
    }
    public String getContext_feature(){
        return this.context_feature;
    }

}