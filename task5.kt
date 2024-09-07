fun main() {
    val boat = Boat(50, "ТК-50")
    boat.start()
    boat.stop()

    val airplane = Airplane(900, "Boeing 747")
    airplane.start()
    airplane.stop()

    val tank = Tank(40, "КВ-2")
    tank.start()
    tank.stop()
}

open class Vehicle(open var speed: Int = 0, open var name: String = "") {
    open fun start() {
        println("$name начал движение со скроостью $speed")
    }

    open fun stop() {
        println("$name прекратил движение")
    }
}

class Boat(override var speed: Int, override var name: String) : Vehicle(speed, name) {
    override fun start() {
        println("Лодка $name начала движение со скроостью $speed")
    }

    override fun stop() {
        println("Лодка $name прекратила движение")
    }
}

class Airplane(override var speed: Int, override var name: String) : Vehicle(speed, name) {
    override fun start() {
        println("Самолет $name начал движение со скроостью $speed")
    }

    override fun stop() {
        println("Самолет $name прекратил движение")
    }
}

class Tank(override var speed: Int, override var name: String) : Vehicle(speed, name) {
    override fun start() {
        println("Танк $name начал движение со скроостью $speed")
    }

    override fun stop() {
        println("Танк $name прекратил движение")
    }
}