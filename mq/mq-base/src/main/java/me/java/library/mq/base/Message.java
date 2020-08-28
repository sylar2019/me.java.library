package me.java.library.mq.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import me.java.library.utils.base.JsonUtils;

/**
 * @author :  sylar
 * @FileName :  Message
 * @CreateDate :  2017/11/08
 * @Description :
 * @ReviewedBy :
 * @ReviewedOn :
 * @VersionHistory :
 * @ModifiedBy :
 * @ModifiedDate :
 * @Comments :
 * @CopyRight : COPYRIGHT(c) xxx.com All Rights Reserved
 * *******************************************************************************************
 */
public class Message {
    private String topic;
    private String content;
    private String tags;
    private String keys;
    private Object ext;

    public Message(String topic) {
        this.topic = topic;
    }

    public Message(String topic, String content) {
        this.topic = topic;
        this.content = content;
    }

    public Message(String topic, String content, String tags, String keys) {
        this.topic = topic;
        this.content = content;
        this.tags = tags;
        this.keys = keys;
    }

    @Override
    public synchronized String toString() {
        return JsonUtils.toJSONString(this);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @JsonIgnore
    public Object getExt() {
        return ext;
    }

    public void setExt(Object ext) {
        this.ext = ext;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

}
