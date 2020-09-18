package Permutations

import java.io.File

class SixLetterStringsContaining_A_and_B_Kotlin_Program {
    companion object {
        private val mutableList: MutableList<MutableList<Char>> = mutableListOf();
        private val printer = File("Permutations.txt").printWriter().apply { write("") }

        @JvmStatic
        fun main(args: Array<String>) {
            permute(6)
            printer.close()
        }

        private fun permute(depth: Int, charArray: CharArray = CharArray(depth)) {
            if (depth == 0 /*&& mutableList.run { contains('a') && contains('b') }*/)
                printer.println(charArray.joinToString(""))


            if (depth > 0)
                for (i in 'a'..'z')
                    permute(depth - 1, charArray.apply { this[depth - 1] = i })
        }
    }
}
