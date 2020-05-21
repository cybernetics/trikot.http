package com.mirego.trikot.http

import com.mirego.trikot.foundation.CommonJSExport

@CommonJSExport
class HttpResponseException(
    val httpResponse: HttpResponse
) : Exception("HTTP error ${httpResponse.statusCode}")