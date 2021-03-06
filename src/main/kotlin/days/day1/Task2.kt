package days.day1

import framework.Task
import framework.exceptions.AnswerNotFoundException
import java.net.URL

class Task2 : Task<Int>() {
    override fun run(input: URL): Result<Int> {
        val data = input
            .openStream()
            .bufferedReader()
            .lineSequence()
            .map { it.toInt() }
            .toList()

        for ((firstIndex, first) in data.withIndex())
            for ((secondIndex, second) in data.drop(firstIndex + 1).withIndex())
                for (third in data.drop(secondIndex + 1)) {
                    if (first + second + third == 2020) {
                        return Result.success(first * second * third)
                    }
                }

        return Result.failure(AnswerNotFoundException())
    }
}


