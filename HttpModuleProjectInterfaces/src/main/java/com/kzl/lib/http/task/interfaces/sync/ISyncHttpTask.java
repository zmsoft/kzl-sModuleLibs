package com.kzl.lib.http.task.interfaces.sync;


import com.kzl.lib.http.client.interfaces.callback.IHttpResponseFilter;
import com.kzl.lib.http.client.interfaces.model.EmptyHttpRequest;
import com.kzl.lib.http.client.interfaces.model.EmptyHttpResponse;
import com.kzl.lib.http.client.interfaces.utils.HttpResponseMapper;
import com.kzl.lib.http.task.interfaces.GPConstantValues;

/**
 * http同步请求执行接口
 * Project:LuLuModuleLibs<br/>
 * Email: <A href="kezhenlu@qq.com">kezhenlu@qq.com</A><br/>
 * User: kenny.ke<br/>
 * Date: 2014/4/21<br/>
 * Time: 17:32<br/>
 * To change this template use File | Settings | File Templates.
 */
public interface ISyncHttpTask<T extends EmptyHttpResponse> {
    final static String LOG_TAG = GPConstantValues.LOG_TAG;

    /**
     * sync http execute
     * @param request
     * @param url
     * @param mapper
     * @param filter
     * @return
     */
    public T execute(final EmptyHttpRequest request, final String url, final HttpResponseMapper mapper, final IHttpResponseFilter filter);

}
