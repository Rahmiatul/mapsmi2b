package com.rahmi.mapsmi2b

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rahmi.mapsmi2b.Adapter.adapterWisata
import com.rahmi.mapsmi2b.Model.ModelWisata


class ListMapActivity : AppCompatActivity() {

    private lateinit var RecyclerViewMenu: RecyclerView
    private lateinit var AdapterMenu: adapterWisata

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_map)

        val menuIcons = listOf(
            ModelWisata(
                R.drawable.jamgadang,
                "Jam gadang Bukittinggi",
                "Bukittinggi, Sumatera Barat",
                "Jam Gadang adalah menara jam yang menjadi penanda atau ikon Kota Bukittinggi Sumatera Barat Indonesia. ",
                -0.3049441760037679,
                100.36948795756079
            ),
            ModelWisata(
                R.drawable.alunalun,
                "Ulun danu Beratan Bedugul",
                "Bali",
                "Pura Ulun Danu Bratan, Pura Ulun Danu Beratan atau Bratan Pura merupakan sebuah pura dan candi air besar di Bali, Indonesia - candi utama air lainnya menjadi Pura Ulun Danu Batur.",
                -8.275021434769968,
                115.16680193649081
            ),
            ModelWisata(
                R.drawable.borobudur,
                "Candi borobudur",
                "Magelang",
                "Dibangun dari abad ke-9, situs ini terkenal sebagai candi Buddha terbesar di dunia",
                -7.604879709882314, 110.2035859416411
            ),
            ModelWisata(
                R.drawable.labuanbajo,
                "Labuan Bajo",
                "NTT",
                "Labuan Bajo merupakan salah satu kelurahan yang berada di Kecamatan Komodo, Kabupaten Manggarai Barat, Provinsi Nusa Tenggara Timur, Indonesia.",
                -8.437930350601835, 119.86714452945427
            ),
            ModelWisata(
                R.drawable.danautoba,
                "Danau Toba",
                "Sumatera Utara",
                "Danau Toba adalah danau alami berukuran besar di Sumatera Utara, Indonesia yang terletak di kaldera gunung supervulkan. ",
                2.8018526643909647, 98.77124925053705
            )

        )

        RecyclerViewMenu = findViewById(R.id.rvwisata)
        RecyclerViewMenu.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL, false
        )
        AdapterMenu = adapterWisata(menuIcons)
        RecyclerViewMenu.adapter = AdapterMenu

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}