package com.mirego.trikot.http

import com.mirego.trikot.foundation.CommonJSExport
import com.mirego.trikot.streams.cancellable.CancellableManager
import org.reactivestreams.Publisher
import kotlin.js.JsName

@CommonJSExport
interface HttpRequest {
    @JsName("execute")
    fun execute(cancellableManager: CancellableManager): Publisher<HttpResponse>
}
