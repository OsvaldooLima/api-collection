package me.osvaldolima

class Repositorio<T> {
   private val map = mutableMapOf<String, T>()

   fun create(id:String,value: T){
      map [id]=value
   }

   fun findByid(id:String) = map.get(id)

}
