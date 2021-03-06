package days.day8.machine

enum class Operation(val keyword: String) {
    ACCUMULATE("acc"), JUMP("jmp"), NOOP("nop");

    companion object {
        fun getOperationByKeyword(keyword: String) = Operation.values().find { it.keyword == keyword }!!
    }
}