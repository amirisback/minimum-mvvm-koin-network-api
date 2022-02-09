package com.frogobox.minimummvvm

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.frogobox.minimummvvm.model.Article


/*
 * Created by faisalamir on 07/02/22
 * recyclercoroutines
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 FrogoBox Inc.      
 * All rights reserved
 *
 */

class MainHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun bindItem(data: Article, listener: MainItemListener) {
        view.findViewById<TextView>(R.id.frogo_rv_list_type_11_tv_title).text = data.title
        view.findViewById<TextView>(R.id.frogo_rv_list_type_11_tv_subtitle).text = data.description
        Glide.with(view.context).load(data.urlToImage).into(view.findViewById(R.id.frogo_rv_list_type_11_iv_poster))
        itemView.setOnClickListener { listener.onClickListener(data) }
    }

}