/* fun main(arg: Array<String>) {

   val telefono : MutableMap<String,Int>=MutableMapOf();

    print(telefono)

}
 */
 class puntoCartesiano {
    var x:Int=0;
    var y:Int=0;
    
    fun constructor(x:Int,y:Int){
        this.x=x
        this.y=y
    }

    fun constructor2(){
        println("ingresa la x");
        this.x=readLine()!!.toInt();
        println("ingresa la Y");
        this.y=readLine()!!.toInt();
    }

    fun posicion(){
        if(x == 0){
            print("La x esta en el eje")
            
            if(x >= 0 && y > 0){
                println("Cuadrante 1")
            }
            if(x < 0 && y > 0){
                println("Cuadrante 2")
            }
            if(x < 0 && y < 0){
                println("Cuadrante 3")
            }
            if(x > 0 && y < 0){
                println("Cuadrante 4")
            }
        };if(y==0){
            print("La y esta en el eje")
            
            if(x > 0 && y >= 0){
                println("Cuadrante 1")
            }
            if(x < 0 && y > 0){
                println("Cuadrante 2")
            }
            if(x < 0 && y < 0){
                println("Cuadrante 3")
            }
            if(x > 0 && y < 0){
                println("Cuadrante 4")
            }
        }else{
            if(x > 0 && y >= 0){
                println("Cuadrante 1")
            }
            if(x < 0 && y > 0){
                println("Cuadrante 2")
            }
            if(x < 0 && y < 0){
                println("Cuadrante 3")
            }
            if(x > 0 && y < 0){
                println("Cuadrante 4")
            }
        }
    }
 }

fun main(arg: Array<String>) {

  val punto1:puntoCartesiano
  punto1=puntoCartesiano()
  punto1.constructor(0,3)
  punto1.posicion()

  val punto2:puntoCartesiano
  punto2=puntoCartesiano()
  punto2.constructor(-2,-3)
  punto2.posicion()

  val punto3:puntoCartesiano
  punto3=puntoCartesiano()
  punto3.constructor2()
  punto3.posicion()

}
