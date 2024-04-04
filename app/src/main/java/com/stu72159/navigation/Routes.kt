package com.stu72159.navigation


sealed class Routes(val route: String) {
    object FirstMovie : Routes("first_Movie")
    object SecondMovie : Routes("second_Movie")
    object ThirdMovie : Routes("third_Movie")
    object FourthMovie : Routes("fourth_Movie")
}