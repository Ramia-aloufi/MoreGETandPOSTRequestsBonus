package com.example.moregetandpostrequestsbonus

 class Names {
     var name :List<NamesItem>? = null

     data class NamesItem(
         var name: String? = null,
         var pk: Int? = null
     )
 }