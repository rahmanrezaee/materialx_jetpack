package com.example.materialx_jetpack.model

import android.graphics.Bitmap


data class ComponentItemList(var name:String,var icon: Bitmap, var listSub:List<SubComponentItemList>)


data class SubComponentItemList(var name:String,var icon: Bitmap)