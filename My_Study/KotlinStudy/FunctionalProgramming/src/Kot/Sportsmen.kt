package Kot

class Sportsmen{
    fun callVodonosa(vodonos: Vodonos){
        vodonos.prinestiVodu()
    }

    inline fun callVodonosa(bringWater: () -> Unit){
        bringWater()
    }
}