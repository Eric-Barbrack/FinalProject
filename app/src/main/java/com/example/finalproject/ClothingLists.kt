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
            Clothing("Black Overalls", R.drawable.cb_blackoveralls, 65),
            Clothing("Black Slim Winter Pants", R.drawable.cb_blackslimwinterpants, 65),
            Clothing("Heavy Black Winter Pants", R.drawable.cb_blackwinterpants, 65),
            Clothing("Camo Snow Pants", R.drawable.cb_camosnowpants, 65),
            Clothing("Gold Snow Pants", R.drawable.cb_goldsnowpants, 65),
            Clothing("Grey Snow Pants", R.drawable.cb_greysnowpants, 65),
            Clothing("Heavy Grey Overalls", R.drawable.cb_heavygreyoveralls, 65),
            Clothing("Neon Orange Overalls", R.drawable.cb_neonorangeoveralls, 65),
            Clothing("Tan Bib-Style Overalls", R.drawable.cb_tanbiboverall, 65),
            Clothing("Tan Puffy Winter Pants", R.drawable.cb_tanpuffywinterpants, 65)
        )

        val mediumWeatherBottoms = listOf(
            Clothing("Black Suit Pants", R.drawable.mb_blacksuitpants, 65),
            Clothing("Blue Jeans", R.drawable.mb_bluejeans, 65),
            Clothing("Camo Jeans", R.drawable.mb_camojeans, 65),
            Clothing("Grey Suit Pants", R.drawable.mb_greysuitpants, 65),
            Clothing("Grey Sweat Pants", R.drawable.mb_greysweats, 65),
            Clothing("Jeans With Holes", R.drawable.mb_jeanswithholes, 65),
            Clothing("Navy Blue Cargo Pants", R.drawable.mb_navybluecargopants, 65),
            Clothing("Pink Chromatic Sweatpants", R.drawable.mb_pinkchromaticasweats, 65),
            Clothing("Thrasher Brand Sweat Pants", R.drawable.mb_thrashersweats, 65),
            Clothing("Yellow Camo Cargo Pants", R.drawable.mb_yellowcamocargopants, 65)
        )

        val warmWeatherBottoms = listOf(
            Clothing("Black Athletic Shorts", R.drawable.wb_blackathleticshorts, 65),
            Clothing("Black Khaki Shorts", R.drawable.wb_blackkhakishorts, 65),
            Clothing("Cargo Shorts", R.drawable.wb_cargoshorts, 65),
            Clothing("Jean Shorts", R.drawable.wb_jeanshorts, 65),
            Clothing("Jean Shorts With Holes", R.drawable.wb_jeanshortswithholes, 65),
            Clothing("Khaki Shorts", R.drawable.wb_khakishorts, 65),
            Clothing("Light Blue Athletic Shorts", R.drawable.wb_lightblueathleticshorts_1, 65),
            Clothing("Red Gym Shorts", R.drawable.wb_redgymshorts_1, 65),
            Clothing("White Battle Shorts", R.drawable.wb_whitebattleshorts_1, 65),
            Clothing("Yellow Running Shorts", R.drawable.wb_yellowrunningshorts_1, 65)
        )
        val coldWeatherShoes = listOf(
            Clothing("Black Insulated Work Boots", R.drawable.cs_blackheavilyinsulatedworkboots, 65),
            Clothing("Brown Leather Boots", R.drawable.cs_brownleatherboots, 65),
            Clothing("Green and Orange Work Boots", R.drawable.cs_greenandorangeworkboots, 65),
            Clothing("High Black Snow Boots", R.drawable.cs_highblacksnowboots, 65),
            Clothing("Light Green Salomon Brand Boots", R.drawable.cs_lightgreensalomonboots, 65),
            Clothing("Tall Sore Brand Insulated Snow Boots", R.drawable.cs_tallsorelinsulatedsnowboots, 65),
            Clothing("Tan Heavy Nike Boots", R.drawable.cs_tanheavynikeboots, 65),
            Clothing("Tan TimberLands", R.drawable.cs_tantimberlands, 65),
            Clothing("Tank Work Boots", R.drawable.cs_tanworkboots, 65),
            Clothing("White Laced Nike Snow Boots", R.drawable.cs_whitenikelacedsnowboots, 65)
        )

        val mediumWeatherShoes = listOf(
            Clothing("Black Leather High Tops", R.drawable.ms_blackleatherhightops, 65),
            Clothing("Brown Leather Dress Sneakers", R.drawable.ms_brownleatherdresssneaker, 65),
            Clothing("Grey Light Sneakers", R.drawable.ms_greylightsneakers, 65),
            Clothing("Grey Low-Top Sneakers", R.drawable.ms_greylowtopsneakers, 65),
            Clothing("Louis Vuitton Sneakers", R.drawable.ms_lousvuittonsneakers, 65),
            Clothing("Navy Blue Nautica Sneakers", R.drawable.ms_navybluenauticasneakers, 65),
            Clothing("Navy Blue Sneakers", R.drawable.ms_navybluesneakers, 65),
            Clothing("Red White and Blue Sneakers", R.drawable.ms_redwhiteandbluesneaker, 65),
            Clothing("White and Blue Sneakers", R.drawable.ms_whiteandbluesneakers, 65),
            Clothing("White ThursdayBoot Brand Sneakers", R.drawable.ms_whitethursdaybootbrandsneakers, 65)
        )

        val warmWeatherShoes = listOf(
            Clothing("America Crocs", R.drawable.ws_americacrocs, 65),
            Clothing("Black and White Nike Slides", R.drawable.ws_blackandwhitenikeslidees, 65),
            Clothing("Black Flip Flops", R.drawable.ws_blackflipflops, 65),
            Clothing("Coach Brand Shoes", R.drawable.ws_coachbrandshoes, 65),
            Clothing("Dark Grey Hey Dudes!", R.drawable.ws_darkgreyheydudes, 65),
            Clothing("Light Grey Hey Dudes!", R.drawable.ws_lightgreyheydudes, 65),
            Clothing("Light Weight Blue Sneakers", R.drawable.ws_lightweightbluesneakers, 65),
            Clothing("Tan Flip Flops", R.drawable.ws_tanflipflops, 65),
            Clothing("Yeezy Slides", R.drawable.ws_yeezyslides, 65)
        )
        val coldWeatherAccessories = listOf(
            Clothing("Authentic Snow Shoes", R.drawable.ca_authenticsnowshoes, 65),
            Clothing("Black and Blue Snow Gear", R.drawable.ca_blackandbluesnowgear, 65),
            Clothing("Black and White Scarf", R.drawable.ca_blackandwhitescarf, 65),
            Clothing("Black Ear Muffs", R.drawable.ca_blackearmuffs, 65),
            Clothing("Black Shiesty", R.drawable.ca_blackshiesty, 65),
            Clothing("Black Ski Mask", R.drawable.ca_blackskimask, 65),
            Clothing("Blue Scarf", R.drawable.ca_bluescarf, 65),
            Clothing("Grey Ear Muffs", R.drawable.ca_greyearmuffs, 65),
            Clothing("Grey Snow Shoes", R.drawable.ca_greysnowshoe, 65),
            Clothing("Pink Ski Mask", R.drawable.ca_pinkskimask, 65)
        )

        val mediumWeatherAccessories = listOf(
            Clothing("Beaded Bracelet", R.drawable.ma_beadbracelet, 65),
            Clothing("Black and Silver Mont Blanc Watch", R.drawable.ma_blackandsilvermontblancwatch, 65),
            Clothing("Blue and White Mont Blanc Watch", R.drawable.ma_blueandwhitemontblancwatch, 65),
            Clothing("Blue Beaded Bracelet", R.drawable.ma_bluebeadbracelet, 65),
            Clothing("Double Chain", R.drawable.ma_doublechian, 65),
            Clothing("FitBit Smart Watch", R.drawable.ma_fitbitsmartwatch, 65),
            Clothing("FitBit Versa 2", R.drawable.ma_fitbitversa2, 65),
            Clothing("Jesus Piece", R.drawable.ma_jesuspiece, 65),
            Clothing("Red Apple Watch", R.drawable.ma_redapplewatch, 65),
            Clothing("Thin Silver Chain", R.drawable.ma_thinsilverchain, 65)
        )

        val warmWeatherAccessories = listOf(
            Clothing("Beaded Bracelet", R.drawable.ma_beadbracelet, 65),
            Clothing("Black and Silver Mont Blanc Watch", R.drawable.ma_blackandsilvermontblancwatch, 65),
            Clothing("Blue and White Mont Blanc Watch", R.drawable.ma_blueandwhitemontblancwatch, 65),
            Clothing("Blue Beaded Bracelet", R.drawable.ma_bluebeadbracelet, 65),
            Clothing("Double Chain", R.drawable.ma_doublechian, 65),
            Clothing("FitBit Smart Watch", R.drawable.ma_fitbitsmartwatch, 65),
            Clothing("FitBit Versa 2", R.drawable.ma_fitbitversa2, 65),
            Clothing("Jesus Piece", R.drawable.ma_jesuspiece, 65),
            Clothing("Red Apple Watch", R.drawable.ma_redapplewatch, 65),
            Clothing("Thin Silver Chain", R.drawable.ma_thinsilverchain, 65)
        )
    }
}