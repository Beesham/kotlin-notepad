package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

/**
 * Created by Beesham on 12/22/2017.
 */

val Context.layoutInflater get() = LayoutInflater.from(this)