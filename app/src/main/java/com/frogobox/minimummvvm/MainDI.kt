package com.frogobox.minimummvvm

import com.frogobox.minimummvvm.sources.NewsRepository
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


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

val repositoryModule = module {

    single {
        NewsRepository
    }

    // Please Add Your Code Under This Line --------------------------------------------------------

}

val viewModelModule = module {

    viewModel {
        MainViewModel(androidApplication(), get())
    }

    // Please Add Your Code Under This Line --------------------------------------------------------

}