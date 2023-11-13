package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {
        val angka1 = 10
        val angka2 = 0
        val hasil = angka1/angka2
        println("Hasil Pembagian $hasil")
    } catch (e: ArithmeticException) {
        println("Terjadi Kesalahan aritmatika: ${e.message}")
    } finally {
        println("Blok finally dijalankan")
    }
}

