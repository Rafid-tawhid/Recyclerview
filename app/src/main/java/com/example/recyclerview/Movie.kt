package com.example.recyclerview

data class Movie(
    val id:Int,
    val name:String,
    val category:String,
    val rating:Double,
    var poster:Int=R.drawable.frozen
)
val movieList= mutableListOf<Movie>(
    Movie(1,"Titanic","Drama",8.2),
    Movie(2,"Frozen","Animation",9.2),
    Movie(3,"Hero","Cartoon",7.2),
    Movie(4,"Transformer","Action",5.2),
    Movie(5,"SpiderMan","Drama",6.2),
    Movie(6,"Batman","Drama",4.2),
    Movie(7,"Antman","Drama",3.2),
    Movie(1,"Cool","Drama",4.2),
    Movie(1,"Titanic","Drama",5.2),
    Movie(1,"Titanic","Drama",9.2),
    Movie(1,"Titanic","Drama",8.2),
    Movie(1,"Titanic","Drama",8.2),
    Movie(1,"Hero 6","Thriller",7.2),
    Movie(18,"Ra One","Comedy",7.2),
    Movie(19,"Ranji","Drama",8.2),
    Movie(20,"Ludo","Action",6.2),
)
