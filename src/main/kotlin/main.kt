fun main() {
    var x:Int = 0
    var y = ""
    var z = ""
    var i = 0
    println("1.)Business\n" +
            "2.)Residential")

    i = readln().toInt()
    if (i>2){
        println("error")
    }
    else if(i==1){
        println("Phone Number: ")
        x = readln().toInt()
        println("Contact Name:")
        y = readln().toString()
        println("Business name: ")
        z = readln()
        rob(x, y, z)
    }
    else if(i==2){
        println("Phone Number: ")
        x = readln().toInt()
        println("Contact Name:")
        y = readln().toString()
        rob(x, y)
    }
}
fun rob(phone:Int, name:String){
    println("Phone: $phone \n" +
            "Name : $name")
}

fun rob(phone:Int, name:String, busName:String){
    println("Phone: $phone \n" +
            "Name : $name \n" +
            "Business : $busName")
}
