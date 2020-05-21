package com.mirego.trikot.http.exception

import com.mirego.trikot.foundation.CommonJSExport

@CommonJSExport
class HttpResponseNoInternetConnectionException(source: Throwable) : Exception(source)
