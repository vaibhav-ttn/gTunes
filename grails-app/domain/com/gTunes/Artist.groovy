package com.gTunes

class Artist {
    String name
    static hasMany = [albums: Album]
}
