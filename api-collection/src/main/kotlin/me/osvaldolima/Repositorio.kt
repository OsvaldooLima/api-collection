package me.osvaldolima

class Repositorio<T> {
   private val map = mutableMapOf<String, T>()

   fun create(id:String,value: T){
      map [id]=value
   }

   fun remove(id:String) = map.remove(id)

   fun findByid(id:String) = map.get(id)

   fun findAll () = map.values
}
