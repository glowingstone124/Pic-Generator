import Request.*
import com.google.gson.Gson
class MinecraftTool {
    data class GameStats(
        val onlinecount: Int,
        val mspt: Double
    )
    val json = Request.sendGetRequest("http://qoriginal.vip:8080/qo/download/status").trimIndent()

    val gson = Gson()
    val gameStats = gson.fromJson(json, GameStats::class.java)
    fun getStat():GameStats{
        return gameStats
    }
}