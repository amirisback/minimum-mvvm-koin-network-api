package com.frogobox.minimummvvm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.frogobox.minimummvvm.model.Article
import com.frogobox.minimummvvm.model.ArticleResponse
import com.frogobox.minimummvvm.sources.ApiResponse
import com.frogobox.minimummvvm.sources.NewsRepository
import com.frogobox.minimummvvm.util.NewsConstant
import com.frogobox.minimummvvm.util.NewsUrl

/*
 * Created by faisalamir on 08/02/22
 * recyclercoroutines
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Mona Primaveras Inc.      
 * All rights reserved
 *
 */

class MainViewModel(application: Application, private val repository: NewsRepository) :
    AndroidViewModel(application) {

    private val tempData = mutableListOf<Article>()
    val listMainData = MutableLiveData<MutableList<Article>>()

    fun setupData() {
        repository.getEverythings(
            NewsUrl.API_KEY,
            "Teknologi",
            null,
            null,
            NewsConstant.COUNTRY_ID,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            object : ApiResponse.DataResponse<ArticleResponse> {
                override fun onShowProgress() {
                }

                override fun onHideProgress() {
                }

                override fun onEmpty() {
                }

                override fun onSuccess(data: ArticleResponse) {
                    data.articles?.let { tempData.addAll(it) }
                    listMainData.postValue(tempData)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                }
            })

    }

}