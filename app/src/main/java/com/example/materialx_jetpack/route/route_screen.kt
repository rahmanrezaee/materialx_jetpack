package com.example.materialx_jetpack.route

sealed class Screen(var route:String){

    object Home  : Screen("/");
    object NavBasic  : Screen("/nav/basic");
    object NavPrimary  : Screen("/nav/primary");
    object NavShifting  : Screen("/nav/shifting");
    object NavMain  : Screen("/nav/main");
    object NavBadge  : Screen("/nav/badge");
    object NavIcon  : Screen("/nav/icon");
    object ButBasic  : Screen("/but/basic");
    object BotSheetBasic  : Screen("/bottom_sheet/basic");
}
