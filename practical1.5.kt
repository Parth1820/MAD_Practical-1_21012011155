fun main()
{
    print("Enter Month Number:")
    var num = readLine()
    when(num)
    {
        "1"-> println("JANUARY")
        "2"-> println("FEBRUARY")
        "3"-> println("MARCH")
        "4"-> println("APRIL")
        "5"-> println("MAY")
        "6"-> println("JUNE")
        "7"-> println("JULY")
        "8"-> println("AUGUST")
        "9"-> println("SEPTEMBER")
        "10"-> println("OCTOBER")
        "11"-> println("NOVEMBER")
        "12"-> println("DECEMBER")

        else-> println("Enter Valid Number!")
    }
}