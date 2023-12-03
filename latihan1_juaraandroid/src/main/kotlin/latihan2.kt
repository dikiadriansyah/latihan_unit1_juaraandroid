fun main(){
//    println("Use the val keyword when the value doesn't change.")
//    println("Use the var keyword when the value can change.")
//    println("When you define a function, you define the parameters that can be passed to it.")
//    println("When you call a function, you pass arguments for the parameters.\n")
//------------------------------------
//    println("New chat message from a friend")
    //------------------------------------
//    var discountPercentage: Int = 0
//    var offer: String = ""
//    val item = "Google Chromecast"
//    discountPercentage = 20
//    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

//    println(offer)
    /*
    Sale - Up to 20% discount on Google Chromecast! Hurry up!
     */
//    -------------------
//    val numberOfAdults = 20
//    val numberOfKids = 30
//    val total = numberOfAdults + numberOfKids
//    println("The total party size is: $total")
    //    -------------------
//    val baseSalary = 5000
//    val bonusAmount = 1000
//    val totalSalary = "$baseSalary + $bonusAmount"
//    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
    //    -------------------
//    val firstNumber = 10
//    val secondNumber = 5
//val result: Int = firstNumber + secondNumber
//    println("$firstNumber + $secondNumber = $result")
//    ----------------
//    val firstNumber = 10
//    val secondNumber = 5
//    val thirdNumber = 8
//
//    val result = add(firstNumber, secondNumber)
//    val anotherResult = add(firstNumber, thirdNumber)
//
//    println("$firstNumber + $secondNumber = $result")
//    println("$firstNumber + $thirdNumber = $anotherResult")
//    --------------
//    val operatingSystem = "Chrome OS"
//    val emailId = "sample@gmail.com"
//    println(displayAlertMessage(operatingSystem, emailId))
//---------
//    val firstUserEmailId = "user_one@gmail.com"
//    val os = "Unknown OS"
//
//    println(displayAlertMessage(operatingSystem = os,emailId = firstUserEmailId))
//    println()
//
//    val secondUserOperatingSystem = "Windows"
//    val secondUserEmailId = "user_two@gmail.com"
//
//    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
//    println()
//
//    val thirdUserOperatingSystem = "Mac OS"
//    val thirdUserEmailId = "user_three@gmail.com"
//
//    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
//    println()
    //---------
//    val steps = 4000
//    val caloriesBurned = pedometerStepsToCalories(steps)
//    println("Walking $steps steps burns $caloriesBurned calories")
    //---------
println("Have I spent more time using my phone today ${compareTwoNumber(300, 250)}")
println("Have I spent more time using my phone today ${compareTwoNumber(300, 300)}")
println("Have I spent more time using my phone today ${compareTwoNumber(300, 220)}")

    //---------


// duplicateCode("Ankara", 27, 31, 82)
// duplicateCode("Tokyo", 32, 36, 10)
// duplicateCode("Cape Town", 59, 64, 2)
// duplicateCode("Guatemala City", 50, 55, 7)
}


//fun add(firstNumber: Int, secondNumber: Int): Int{
//return firstNumber + secondNumber
//}

//fun displayAlertMessage(operatingSystem: String, emailId: String): String{
//return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
//}

//fun displayAlertMessage(operatingSystem: String, emailId: String): String{
//    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
//}

//fun pedometerStepsToCalories(numberOfSteps: Int): Double{
//    val caloriesBurnedForeachStep = 0.04
//    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForeachStep
//    return totalCaloriesBurned
//}

fun compareTwoNumber(timeSpentToday: Int, timeSpentYesterday: Int): Boolean{
    return timeSpentToday > timeSpentYesterday
}

fun duplicateCode(city: String, lowTemprature: Int, highTemprature: Int, chanceRain: Int):Unit{
    println("City: $city")
    println("Low temperature: $lowTemprature, High temperature: $highTemprature")
    println("Chance of rain: $chanceRain%")
    println()
}