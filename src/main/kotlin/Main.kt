/*
     A car is moving at a speed of 1000m/s at an acceleration of 25m/s/s
     Find the time it will take to move a distance of 5km
     Hint - acceleration = speed/time
     speed = distance/time
 */

fun main(){
    val distance = 5000.0 // km im m
    val initialSpeed = 1000.0 // m/s
    val acceleration = 250.0 // m/s^2

    val time = distance / initialSpeed + (0.5 * acceleration *
            (initialSpeed / acceleration)* (initialSpeed / acceleration))

    println("The time it will take to move a distance of 5km is $time seconds")
}
