class Player(val name: String, val surname: String) {
    var totalScore = 0
    var personalBestScore = 0
    fun fullName() : String {
        return this.name + " " + this.surname
    }

}
class Scores(){
    fun checkScore(current: Int, best: Int): Int{
        if (best < current){
            return current
        }
        return best
    }
}
fun main() {
    val p1 = Player("Nicola", "Tesla")
    val p2 = Player("Thomas", "Edison")
    val scoring = Scores()
    var lvlScore = 0

    // level 1
    lvlScore = 20
    p1.totalScore+= lvlScore
    p1.personalBestScore = scoring.checkScore(current = lvlScore, best = p1.personalBestScore)
    lvlScore = 10
    p2.totalScore+= lvlScore
    p2.personalBestScore = scoring.checkScore(current = lvlScore, best = p2.personalBestScore)
    // level 2
    lvlScore = 35
    p1.totalScore+= lvlScore
    p1.personalBestScore = scoring.checkScore(current = lvlScore, best = p1.personalBestScore)
    lvlScore = 15
    p2.totalScore+= lvlScore
    p2.personalBestScore = scoring.checkScore(current = lvlScore, best = p2.personalBestScore)
    // level 3
    lvlScore = 25
    p1.totalScore+= lvlScore
    p1.personalBestScore = scoring.checkScore(current = lvlScore, best = p1.personalBestScore)
    lvlScore = 20
    p2.totalScore+= lvlScore
    p2.personalBestScore = scoring.checkScore(current = lvlScore, best = p2.personalBestScore)
    if (p1.totalScore > p2.totalScore){
        println("The winner is ${p1.fullName()} with a score of ${p1.totalScore}")
        println("Personal best score is ${p1.personalBestScore}")
    }
    else{
        println("The winner is ${p2.fullName()} with a score of ${p2.totalScore}")
        println("Personal best score is ${p2.personalBestScore}")
    }
}