open class Car(val name: String) {
    open var HorsePower: Int = 0
        set(HorsePower) {
            if ((HorsePower > 90) and (HorsePower < 1000))
                field = HorsePower
        }
        get() {
            return field
        }
    open var MaxSpeed: Int = 0
        set(speed) {
            if ((speed > 0) and (speed < 400))
                field = speed
        }
        get() {
            return field
        }

    open fun start(): String {
        print("Start:")
        return ("")
    }

    open fun drive(): String {
        print("Drive:")
        return ("")
    }
}

class BMW(empName: String, override var HorsePower: Int, override var MaxSpeed: Int) :
    Car(empName) {
    override fun start(): String {
        super.start()
        print("ththththth")
        return ("")
    }

    override fun drive(): String {
        super.drive()
        print("Vwum")
        return ("")
    }

    val CitySpeed: Int = 60
    val StartSpeed: Int = 0
    fun TurnОff(): String {
        print("thth.........")
        return ("")
    }

    fun GainSpeed(): String {
        for (i in 0..CitySpeed)
            if (i % 10 == 0) {
                print("${(i)} km/h \t")
            }
        return ("")
    }
}

fun main() {
    val bmw = BMW("BMW", 500, 420)
    println("NameCar: ${bmw.name}")
    println("HorsePower: ${bmw.HorsePower}")
    println("MaxSpeed: ${bmw.MaxSpeed}")
    println("${bmw.start()}")
    println("${bmw.StartSpeed} km/h")
    println("${bmw.drive()}")
    println("${bmw.GainSpeed()}")
    println("CitySpeed: ${bmw.CitySpeed} km/h")
    print("${bmw.TurnОff()}")

}