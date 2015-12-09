package com.gTunes

class Album {
    String title

    static hasMany = [songs: Song]
    static belongsTo = [artist: Artist]

    SortedSet songs
}
