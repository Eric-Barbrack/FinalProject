package com.example.finalproject

class ClothingLists {
    companion object {
        val coldWeatherTops = listOf(
            Clothing("Black Cold Weather Ski Jacket", R.drawable.ct_blackcoldweatherskijacket, 10),
            Clothing("Bogner Brand Ski Jacket", R.drawable.ct_bognerskijacket, -10),
            Clothing("Camo Ski Jacket", R.drawable.ct_camocoldskijacket, 10),
            Clothing("Descent Ski Apparel", R.drawable.ct_descenteskiapparel, -10),
            Clothing("Light Blue Puffy Jacket", R.drawable.ct_lightbluecoldweatherpuffyjacket, 10),
            Clothing("Light Green Padded Jacket", R.drawable.ct_lightgreenpaddedjacket, -10),
            Clothing("Long Dark Blue Puffy Jacket", R.drawable.ct_longdarkbluepuffyjacket, 10),
            Clothing("Insulated Flannel", R.drawable.ct_paddedcoldweatherflannel, -10),
            Clothing("Padded Sports Jacket", R.drawable.ct_paddedsportsjacket, 10),
            Clothing("Thick Puffy Jacket", R.drawable.ct_thickpuffyjacket, -10)
        )

        val mediumWeatherTops = listOf(
            Clothing("Black and Red Flannel", R.drawable.mt_blackandredflannel, 55),
            Clothing("Black Suit Jacket", R.drawable.mt_blacksuitjacket, 10),
            Clothing("Grey Suit Jacket", R.drawable.mt_greysuitjacket, 55),
            Clothing("Joe's Surf Shop Long Sleeve T-Shirt", R.drawable.mt_joessurfshoplongsleevetee, 10),
            Clothing("Blue Flannel", R.drawable.mt_longsleeveflannel, 55),
            Clothing("Los Angeles Sweat Shirt", R.drawable.mt_losangelessweatshirt, 10),
            Clothing("PBR Team Shirt", R.drawable.mt_pbrteamsshirt, 55),
            Clothing("Ron Jon Sweat Shirt", R.drawable.mt_ronjonsweatshirt, 10),
            Clothing("White Dress Shirt", R.drawable.mt_whitelongsleevedressshirt, 55),
            Clothing("Blue and White Checkered Dress Shirt", R.drawable.mt_blueandwhitecheckereddressshirt, 10)
        )

        val warmWeatherTops = listOf(
            Clothing("American Golf Shirt", R.drawable.wt_americagolfshirt, 65),
            Clothing("Billy Reid Short Sleeve Button Down", R.drawable.wt_billyreidshortsleevebuttondown, 65),
            Clothing("Black Short Sleeve Collared Shirt", R.drawable.wt_blackshortsleevecollaredshirt, 65),
            Clothing("Joe's Surf Shop Tank Top", R.drawable.wt_joessurfshowtanktop, 65),
            Clothing("Johnnie-O Arie Short Sleeve Shirt", R.drawable.wt_johnnieoaireshortsleevebuttondown, 65),
            Clothing("Light Blue T-Shirt", R.drawable.wt_lightbluetee, 65),
            Clothing("Maroon Golf Shirt", R.drawable.wt_maroongolfshirt, 65),
            Clothing("Naturdays Tank Top", R.drawable.wt_naturdaystanktop, 65),
            Clothing("Ron Jon Short Sleeve T-Shirt", R.drawable.wt_ronjonshortsleevetee, 65),
            Clothing("Super Dry Yellow T-Shirt", R.drawable.wt_superdryyellowtee, 65)
        )

        val coldWeatherBottoms = listOf(
            Clothing("Cold Bottoms", R.drawable.cb_blackoveralls, 65),
            Clothing("Balmain Designer T-shirt", R.drawable.cb_blackslimwinterpants, 65),
            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.cb_blackwinterpants, 65),
            Clothing("Navy Blue Tank Top", R.drawable.cb_camosnowpants, 65),
            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.cb_goldsnowpants, 65),
            Clothing("Black T-Shirt", R.drawable.cb_greysnowpants, 65),
            Clothing("Balmain Designer T-shirt", R.drawable.cb_heavygreyoveralls, 65),
            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.cb_neonorangeoveralls, 65),
            Clothing("Navy Blue Tank Top", R.drawable.cb_tanbiboverall, 65),
            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.cb_tanpuffywinterpants, 65)
        )

        val mediumWeatherBottoms = listOf(
            Clothing("Medium Bottoms", R.drawable.mb_blacksuitpants, 65),
            Clothing("Balmain Designer T-shirt", R.drawable.mb_bluejeans, 65),
            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.mb_camojeans, 65),
            Clothing("Navy Blue Tank Top", R.drawable.mb_greysuitpants, 65),
            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.mb_greysweats, 65),
            Clothing("Black T-Shirt", R.drawable.mb_jeanswithholes, 65),
            Clothing("Balmain Designer T-shirt", R.drawable.mb_navybluecargopants, 65),
            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.mb_pinkchromaticasweats, 65),
            Clothing("Navy Blue Tank Top", R.drawable.mb_thrashersweats, 65),
            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.mb_yellowcamocargopants, 65)
        )

        val warmWeatherBottoms = listOf(
            Clothing("Warm Bottoms", R.drawable.wb_blackathleticshorts, 65),
            Clothing("Balmain Designer T-shirt", R.drawable.wb_blackkhakishorts, 65),
            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.wb_cargoshorts, 65),
            Clothing("Navy Blue Tank Top", R.drawable.wb_jeanshorts, 65),
            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.wb_jeanshortswithholes, 65),
            Clothing("Black T-Shirt", R.drawable.wb_khakishorts, 65),
            Clothing("Balmain Designer T-shirt", R.drawable.wb_lightblueathleticshorts_1, 65),
            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.wb_redgymshorts_1, 65),
            Clothing("Navy Blue Tank Top", R.drawable.wb_whitebattleshorts_1, 65),
            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.wb_yellowrunningshorts_1, 65)
        )
//        val coldWeatherShoes = listOf(
//            Clothing("Cold Shoes", R.drawable.blacktee, 65),
//            Clothing("Balmain Designer T-shirt", R.drawable.blamaintee, 65),
//            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.blackcollared, 65),
//            Clothing("Navy Blue Tank Top", R.drawable.perfecttanktop, 65),
//            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.plaidcollared, 65),
//            Clothing("Black T-Shirt", R.drawable.blacktee, 65),
//            Clothing("Balmain Designer T-shirt", R.drawable.blamaintee, 65),
//            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.blackcollared, 65),
//            Clothing("Navy Blue Tank Top", R.drawable.perfecttanktop, 65),
//            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.plaidcollared, 65)
//        )
//
//        val mediumWeatherShoes = listOf(
//            Clothing("Medium Shoes", R.drawable.blacktee, 65),
//            Clothing("Balmain Designer T-shirt", R.drawable.blamaintee, 65),
//            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.blackcollared, 65),
//            Clothing("Navy Blue Tank Top", R.drawable.perfecttanktop, 65),
//            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.plaidcollared, 65),
//            Clothing("Black T-Shirt", R.drawable.blacktee, 65),
//            Clothing("Balmain Designer T-shirt", R.drawable.blamaintee, 65),
//            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.blackcollared, 65),
//            Clothing("Navy Blue Tank Top", R.drawable.perfecttanktop, 65),
//            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.plaidcollared, 65)
//        )
//
//        val warmWeatherShoes = listOf(
//            Clothing("Warm Shoes", R.drawable.blacktee, 65),
//            Clothing("Balmain Designer T-shirt", R.drawable.blamaintee, 65),
//            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.blackcollared, 65),
//            Clothing("Navy Blue Tank Top", R.drawable.perfecttanktop, 65),
//            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.plaidcollared, 65),
//            Clothing("Black T-Shirt", R.drawable.blacktee, 65),
//            Clothing("Balmain Designer T-shirt", R.drawable.blamaintee, 65),
//            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.blackcollared, 65),
//            Clothing("Navy Blue Tank Top", R.drawable.perfecttanktop, 65),
//            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.plaidcollared, 65)
//        )
//        val coldWeatherAccessories = listOf(
//            Clothing("Cold Accessories", R.drawable.blacktee, 65),
//            Clothing("Balmain Designer T-shirt", R.drawable.blamaintee, 65),
//            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.blackcollared, 65),
//            Clothing("Navy Blue Tank Top", R.drawable.perfecttanktop, 65),
//            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.plaidcollared, 65),
//            Clothing("Black T-Shirt", R.drawable.blacktee, 65),
//            Clothing("Balmain Designer T-shirt", R.drawable.blamaintee, 65),
//            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.blackcollared, 65),
//            Clothing("Navy Blue Tank Top", R.drawable.perfecttanktop, 65),
//            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.plaidcollared, 65)
//        )
//
//        val mediumWeatherAccessories = listOf(
//            Clothing("Medium Accessories", R.drawable.blacktee, 65),
//            Clothing("Balmain Designer T-shirt", R.drawable.blamaintee, 65),
//            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.blackcollared, 65),
//            Clothing("Navy Blue Tank Top", R.drawable.perfecttanktop, 65),
//            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.plaidcollared, 65),
//            Clothing("Black T-Shirt", R.drawable.blacktee, 65),
//            Clothing("Balmain Designer T-shirt", R.drawable.blamaintee, 65),
//            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.blackcollared, 65),
//            Clothing("Navy Blue Tank Top", R.drawable.perfecttanktop, 65),
//            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.plaidcollared, 65)
//        )
//
//        val warmWeatherAccessories = listOf(
//            Clothing("Warm Accessories", R.drawable.blacktee, 65),
//            Clothing("Balmain Designer T-shirt", R.drawable.blamaintee, 65),
//            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.blackcollared, 65),
//            Clothing("Navy Blue Tank Top", R.drawable.perfecttanktop, 65),
//            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.plaidcollared, 65),
//            Clothing("Black T-Shirt", R.drawable.blacktee, 65),
//            Clothing("Balmain Designer T-shirt", R.drawable.blamaintee, 65),
//            Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.blackcollared, 65),
//            Clothing("Navy Blue Tank Top", R.drawable.perfecttanktop, 65),
//            Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.plaidcollared, 65)
//        )
    }
}