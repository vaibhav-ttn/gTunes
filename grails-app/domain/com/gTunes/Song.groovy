package com.gTunes

class Song {
    String title
    String artist
    Integer duration
    //static belongsTo = Album
    Album album

    static constraints = {
        title(blank: false)
        artist(blank:false)
        duration(min:1)
    }
}
