package com.kafein.kotlinedu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Val && var example
        var metin: String = "Kelime"
        var sayi: Int = 0
        var doubleSayi: Double = 0.0
        var floatSayi: Float = 0F

        var sayi1 = 5
        var sayi3 = 10
        //Dört işlem
        var toplama = sayi1 + sayi3
        var cikarma = sayi1 - sayi3
        var carpma = sayi1 * sayi3
        var bolme = sayi1 / sayi3

        processIf()
        processWhen()
        processArrayList()
        processMultiTypeList()

        Log.i("Liste toplama sonucu", toplama(5,7).toString())
        var name = "Murat Karabulut"
        Log.i("Liste string işlemleri", name.uppercase())
        Log.i("Liste string işlemleri", name.lowercase())
        Log.i("Liste string işlemleri", name.plus(" Derste"))
        Log.i("Liste string işlemleri", name.get(3).toString())
        Log.i("Liste string işlemleri", name.substring(6,8))

        var splitName = name.split(" ").toTypedArray()
        Log.i("Liste split", splitName.get(0) +" ---- "+ splitName.get(1))
        var nameSplit = splitName.get(0).substring(0,1) //M
        var surnameSplit = splitName.get(1).substring(0,1)// K
        Log.i("Liste adım", nameSplit + "****")
        Log.i("Liste soyadım", surnameSplit + "****")

        filter()
    }

    fun processIf(){
         val dersVarmi: Boolean = false
         if (dersVarmi){
             Log.i("test","deneme")
             Toast.makeText(this, "Ders var", Toast.LENGTH_LONG).show()
         }
         else{
             Log.i("test","deneme")
             Toast.makeText(this, "Ders var mı yok mu belli değil", Toast.LENGTH_LONG).show()
         }
     }
    fun processWhen(){
        var whenSayi = 0
        when(whenSayi){
            5 -> {
                Toast.makeText(this, "Evet Zaim", Toast.LENGTH_LONG).show()
            }
            6 -> {
                Toast.makeText(this, "Burası EDU", Toast.LENGTH_LONG).show()
            }
            else->{
                Toast.makeText(this, "Burası neresi", Toast.LENGTH_LONG).show()
            }
        }
    }
    fun processArrayList(){
        var liste: ArrayList<String> = arrayListOf()
        liste.add("Ahmet") //0
        liste.add("Mehmet")// 1
        liste.add("Yusuf")// 2

        Log.i("Liste ilk eleman", liste.first())
        Log.i("Liste son eleman", liste.last())
        Log.i("Liste boyut", liste.size.toString())
        Log.i("Liste elemanı", liste.get(1))
        //Döngüler
        // x = 0
        for (x in 0..2){
            Log.i("liste x", liste.get(x))
        }
        Log.i("Liste","Foreach ile çözüm")
        liste.forEach {
            Toast.makeText(this, it, Toast.LENGTH_LONG).show()
        }
    }
    fun processMultiTypeList(){
        var listeSayilar: ArrayList<Int> = arrayListOf()
        for (i in 0..5){
            listeSayilar.add(i)
        }
        var allTypeList: ArrayList<Any> = arrayListOf()
        allTypeList.add("ahmet")
        allTypeList.add(45)
        allTypeList.add(0.0)
    }
    fun filter(){
        val cityList: ArrayList<String> = arrayListOf()
        cityList.add("İstanbul")
        cityList.add("İzmir")
        cityList.add("Malatya")
        cityList.add("Sivas")
        cityList.add("İzmir")
        cityList.add("İzmir")
        cityList.add("İzmir")

        val cityTempList: ArrayList<String> = arrayListOf()

        cityList.filter { cityName-> cityName == "Malatya" }.forEach { filterLast->
            cityTempList.add(filterLast)
        }
        Log.i("Liste size",cityList.filter { cityName-> cityName == "Malatya" }.size.toString())
        cityTempList.forEach {
            Log.i("Liste şehir", it)
        }


    }
    fun toplama(ilkSayi: Any, ikinciSayi: Int) : Int{
        return ilkSayi as Int + ikinciSayi
    }

}