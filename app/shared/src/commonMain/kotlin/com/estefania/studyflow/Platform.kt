package com.estefania.studyflow

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform