package com.example.finalproject

class ClothingLists {
    companion object {
        val coldWeatherTops = listOf(
            Clothing("Black Cold Weather Ski Jacket", R.drawable.ct_blackcoldweatherskijacket, 10),
            Clothing("Bogner Brand Ski Jacket", R.drawable.ct_bognerskijacket, -10),
            Clothing("Camo Ski Jacket", R.drawable.ct_camocoldskijacket, 10),
            Clothing("Descent Ski Apparel", R.drawable.ct_descenteskiapparel, -10),
            Clothing("Light Blue Puffy Jacket", R.drawable.ct_lightbluecoldweatherpuffyjacket, 10),

        )

        val warmWeatherTops = listOf(
            Clothing("American Golf Shirt", R.drawable.wt_americagolfshirt, 65),
            Clothing("Billy Reid Short Sleeve Button Down", R.drawable.wt_billyreidshortsleevebuttondown, 65),
            Clothing("Black Short Sleeve Collared Shirt", R.drawable.wt_blackshortsleevecollaredshirt, 65),
            Clothing("Joe's Surf Shop Tank Top", R.drawable.wt_joessurfshowtanktop, 65),
            Clothing("Johnnie-O Arie Short Sleeve Shirt", R.drawable.wt_johnnieoaireshortsleevebuttondown, 65),
        )

        val coldWeatherBottoms = listOf(
            Clothing("Black Overalls", R.drawable.cb_blackoveralls, 65),
            Clothing("Black Slim Winter Pants", R.drawable.cb_blackslimwinterpants, 65),
            Clothing("Heavy Black Winter Pants", R.drawable.cb_blackwinterpants, 65),
            Clothing("Camo Snow Pants", R.drawable.cb_camosnowpants, 65),
            Clothing("Gold Snow Pants", R.drawable.cb_goldsnowpants, 65),
        )


        val warmWeatherBottoms = listOf(
            Clothing("Black Athletic Shorts", R.drawable.wb_blackathleticshorts, 65),
            Clothing("Black Khaki Shorts", R.drawable.wb_blackkhakishorts, 65),
            Clothing("Cargo Shorts", R.drawable.wb_cargoshorts, 65),
            Clothing("Light Blue Athletic Shorts", R.drawable.wb_lightblueathleticshorts_1, 65),
            Clothing("Red Gym Shorts", R.drawable.wb_redgymshorts_1, 65),
        )
    }
}