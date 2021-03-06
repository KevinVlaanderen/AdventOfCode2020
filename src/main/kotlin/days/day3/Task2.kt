package days.day3

import framework.Task
import java.net.URL

class Task2 : Task<Long>() {
    override fun run(input: URL): Result<Long> {
        val data = input
            .openStream()
            .bufferedReader()
            .readLines()

        val result: Long =
            countTrees(data, 1, 1).toLong() *
                    countTrees(data, 3, 1).toLong() *
                    countTrees(data, 5, 1).toLong() *
                    countTrees(data, 7, 1).toLong() *
                    countTrees(data, 1, 2).toLong()

        return Result.success(result)
    }
}


