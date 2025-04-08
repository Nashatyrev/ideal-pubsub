package net.nashat.ideal

import org.junit.jupiter.api.Test

class IdealPubsub2Test {

    @Test
    fun sanityTest() {

        val r0 = IdealPubsub2.calculateRelativeTime(1000, 128, 13)
        println(r0)

        assert(r0 in 1.484..1.485)
    }
}