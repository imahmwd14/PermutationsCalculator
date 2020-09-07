package Permutations

class SixLetterStringsContaining_A_and_B_Kotlin_Program {
    companion object {
        private val mutableList: MutableList<MutableList<Char>> = mutableListOf();

        @JvmStatic
        fun main(args: Array<String>) {
            permute(6)
            println(mutableList.size)
        }

        private fun permute(depth: Int, mutableList: MutableList<Char> = mutableListOf()) {
            if (depth == 0 && mutableList.run { contains('a') && contains('b') })
                Companion.mutableList.add(mutableList)

            if (depth > 0)
                for (i in 'a'..'z')
                    permute(depth - 1, mutableList.toMutableList().apply { add(i) })
        }
    }
}
