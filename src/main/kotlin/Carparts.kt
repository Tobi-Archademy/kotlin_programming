class Carparts {
    val engine: Engine


    constructor(engine: Engine) {
        this.engine = engine
    }

    fun start() {
        engine.start()
    }
}

class Engine {
    fun start() {
        TODO("Not yet implemented")
    }
}