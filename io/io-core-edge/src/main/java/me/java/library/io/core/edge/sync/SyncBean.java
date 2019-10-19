package me.java.library.io.core.edge.sync;

import com.google.common.util.concurrent.SettableFuture;
import me.java.library.io.base.Cmd;

/**
 * File Name             :  SyncBean
 *
 * @Author :  sylar
 * @Create :  2019-10-19
 * Description           :
 * Reviewed By           :
 * Reviewed On           :
 * Version History       :
 * Modified By           :
 * Modified Date         :
 * Comments              :
 * CopyRight             : COPYRIGHT(c) me.iot.com   All Rights Reserved
 * *******************************************************************************************
 */
public class SyncBean {
    private Cmd request;
    private Cmd response;
    private final SettableFuture<Cmd> future;

    public SyncBean(Cmd request) {
        this.request = request;
        this.future = SettableFuture.create();
    }

    public Cmd getRequest() {
        return request;
    }

    public Cmd getResponse() {
        return response;
    }

    public void setResponse(Cmd response) {
        this.response = response;
    }

    public SettableFuture<Cmd> getFuture() {
        return future;
    }
}
