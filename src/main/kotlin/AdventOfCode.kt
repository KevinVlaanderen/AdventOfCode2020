import framework.Day
import framework.TaskDescription
import framework.TaskRunner

val daysList = mapOf(
    1 to Day(
        "Report Repair", mapOf(
            1 to TaskDescription(days.day1.Task1),
            2 to TaskDescription(days.day1.Task2)
        ),
        "/day1"
    ),
    2 to Day(
        "Password Philosophy", mapOf(
            1 to TaskDescription(days.day2.Task1),
            2 to TaskDescription(days.day2.Task2)
        ),
        "/day2"
    ),
    3 to Day(
        "Toboggan Trajectory", mapOf(
            1 to TaskDescription(days.day3.Task1),
            2 to TaskDescription(days.day3.Task2)
        ),
        "/day3"
    ),
    4 to Day(
        "Passport Processing", mapOf(
            1 to TaskDescription(days.day4.Task1),
            2 to TaskDescription(days.day4.Task2)
        ),
        "/day4"
    ),
    5 to Day(
        "Binary Boarding", mapOf(
            1 to TaskDescription(days.day5.Task1),
            2 to TaskDescription(days.day5.Task2)
        ),
        "/day5"
    ),
    6 to Day(
        "Custom Customs", mapOf(
            1 to TaskDescription(days.day6.Task1),
            2 to TaskDescription(days.day6.Task2)
        ),
        "/day6"
    ),
    7 to Day(
        "Handy Haversacks", mapOf(
            1 to TaskDescription(days.day7.Task1),
            2 to TaskDescription(days.day7.Task2)
        ),
        "/day7"
    ),
    8 to Day(
        "Handheld Halting", mapOf(
            1 to TaskDescription(days.day8.Task1),
            2 to TaskDescription(days.day8.Task2)
        ),
        "/day8"
    ),
    9 to Day(
        "Encoding Error", mapOf(
            1 to TaskDescription(days.day9.Task1),
            2 to TaskDescription(days.day9.Task2)
        ),
        "/day9"
    )
)

fun main() {
    for (day in daysList) {
        println("Day ${day.key}: ${day.value.title}")

        for (taskDescription in day.value.taskDescriptions) {
            val result = TaskRunner.run(
                taskDescription.value.task,
                taskDescription.value.resourcePathOverride ?: day.value.defaultResourcePath!!
            )

            println("\tResult for task ${taskDescription.key}: ${result.getOrNull()}")
        }
    }
}
