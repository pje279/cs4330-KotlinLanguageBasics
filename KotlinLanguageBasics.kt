fun main(args: Array<String>)
{
	val sample1: Byte = 0x3A
    var sample2: Byte = 58
    var heartRate: Int = 85
    var deposits: Double = 135002796.0
    val acceleration: Float = 9.800f
    var mass: Float = 14.6f
    var distance: Double = 129.763001
    var lost: Boolean = true
    var expensive: Boolean = true
    var choice: Int = 2
    val integral: Char = '\u222B'
    val greeting: String = "Hello"
    var name: String = "Karen"
    
    if (sample1 == sample2)
    {
        println("The samples are equal.")
    } //End if (sample1 == sample2)
    else
    {
        println("The samples are not equal.")
    } //End else
    
    if (heartRate > 40 && heartRate <= 80)
    {
		println("Heart rate is normal.")
    } //End if (heartRate > 40 && heartRate <= 80)
    else
    {
        println("Heart rate is not normal.")
    } //End else
    
    if (deposits >= 100000000)
    {
        println("You are exceedingly wealthy.")
    } //End if (deposits >= 100000000)
    else
    {
        println("Sorry you are so poor.")
    } //End else
    
    var force: Float = mass * acceleration
    println("force = $force")
    
    println("$distance is the distance.")
    
    if (lost && expensive)
    {
        println("I am really sorry! I will get the manager.")
    } //End if (lost && expensive)
    else if (lost && !expensive)
    {
        println("Here is coupon for 10% off.")
    } //End if (lost ** !expensive)
    
    when (choice)
    {
        1 -> println("You chose 1.")
        2 -> println("You chose 2.")
        3 -> println("You chose 3.")
        else -> println("You made and unknown choice.")
    } //End when (choice)
    
    println("$integral is an integral.")
    
    for (i: Int in 5..10)
    {
        println("i=$i")
    } //End for (i: Int in 5..10)
    
    var age: Int = 0
    
    while (age < 6)
    {
        println("age = $age")
        age++
    } //End while (age < 6)
    
    println(greeting + " " + name)
    
} //End fun main(args: Array<String>)