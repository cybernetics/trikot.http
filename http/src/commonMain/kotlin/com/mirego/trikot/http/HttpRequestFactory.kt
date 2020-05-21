package com.mirego.trikot.http

import com.mirego.trikot.foundation.CommonJSExport
import kotlin.js.JsName

@CommonJSExport
interface HttpRequestFactory {
    /**
     * Create an HttpRequest for a request builder
     * @param requestBuilder RequestBuilder to create a HttpRequest for
     * @return A ready to be executed HttpRequest
     */
    @JsName("request")
    fun request(requestBuilder: RequestBuilder): HttpRequest
}
