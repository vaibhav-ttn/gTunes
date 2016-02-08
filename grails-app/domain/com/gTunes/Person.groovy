package com.gTunes

class Person {

    String firstName
    String lastName
    Integer age
    static mapping = {
        id column:'person_id'
        firstName column:'person_first_name'
        lastName column:'person_last_name'
        age column:'person_age'
        version false
        table 'people'
    }
}
