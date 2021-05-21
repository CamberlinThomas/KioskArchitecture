package com.decathlon.archi

class Secrets {

    //Method calls will be added by gradle task hideSecret
    //Example : external fun getWellHiddenSecret(packageName: String): String

    companion object {
        init {
            System.loadLibrary("secrets")
        }
    }

    external fun gettestouille(packageName: String): String

    external fun gettestouille2(packageName: String): String
}