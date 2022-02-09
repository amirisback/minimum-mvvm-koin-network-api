package com.frogobox.minimummvvm.sources

import com.frogobox.minimummvvm.model.ArticleResponse
import com.frogobox.minimummvvm.model.SourceResponse

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * consumable-code-news-api
 * Copyright (C) 15/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.news.data.source
 *
 */
interface NewsDataSource {

    // Get Top Headline
    fun getTopHeadline(
        apiKey: String,
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        pageSize: Int?,
        page: Int?,
        callback: ApiResponse.DataResponse<ArticleResponse>
    )

    // Get Everythings
    fun getEverythings(
        apiKey: String,
        q: String?,
        from: String?,
        to: String?,
        qInTitle: String?,
        sources: String?,
        domains: String?,
        excludeDomains: String?,
        language: String?,
        sortBy: String?,
        pageSize: Int?,
        page: Int?,
        callback: ApiResponse.DataResponse<ArticleResponse>
    )

    // Get Sources
    fun getSources(
        apiKey: String,
        language: String,
        country: String,
        category: String,
        callback: ApiResponse.DataResponse<SourceResponse>
    )

    // Please Add Your Code Under This Line --------------------------------------------------------

}