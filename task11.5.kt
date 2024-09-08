fun main() {
    val ufo = Ufo(0, 0)

    messageParse("wWDaasA", { steps -> ufo.move(Command.Up(steps)) },
        { steps -> ufo.move(Command.Down(steps)) },
        { steps -> ufo.move(Command.Left(steps)) },
        { steps -> ufo.move(Command.Right(steps)) })

    println(ufo)
}

fun messageParse(encryptedMessage: String, eventUp:( Int ) -> Unit, eventDown:( Int ) -> Unit, eventLeft:( Int ) -> Unit, eventRight:( Int ) -> Unit) {
    for (char in encryptedMessage) {
        when (char) {
            'A' -> eventLeft(2)
            'D' -> eventRight(2)
            'W' -> eventUp(2)
            'S' -> eventDown(2)
            'a' -> eventLeft(1)
            'd' -> eventRight(1)
            'w' -> eventUp(1)
            's' -> eventDown(1)
        }
    }
}

sealed class Command {
    data class Up(val steps: Int) : Command()
    data class Down(val steps: Int) : Command()
    data class Left(val steps: Int) : Command()
    data class Right(val steps: Int) : Command()
}

class Ufo(var x: Int, var y: Int) {
    override fun toString(): String {
        return "Текущие координаты: x = $x, y = $y"
    }

    fun move(command: Command) {
        when (command) {
            is Command.Up -> {
                y += command.steps
                println("Тарелка Рика сместилась вверх на ${command.steps}")
            }
            is Command.Down -> {
                y -= command.steps
                println("Тарелка Рика сместилась вниз на ${command.steps}")
            }
            is Command.Left -> {
                x -= command.steps
                println("Тарелка Рика сместилась влево на ${command.steps}")
            }
            is Command.Right -> {
                x += command.steps
                println("Тарелка Рика сместилась вправо на ${command.steps}")
            }
        }
    }
}