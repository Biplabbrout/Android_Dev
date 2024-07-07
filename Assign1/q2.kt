import kotlin.math.pow
fun main(){
    val num=153
    var a=0
    var num1=num
    while(num1!=0)
    {
        num1=num1/10
        a++
    }
    num1=num
    var arm=0
    while(num1!=0)
    {
        var arm = (num1%10).toDouble().pow(a).toInt() + arm
        num1=num1/10
    }
    if(num == arm)
    {
        println("$num is an Armstrong number")
    }
    else 
    {
        println("$num is not an Armstrong number")
    }
}
