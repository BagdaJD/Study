package Kot

 class Address(val name: String, val street: String, val numberOfAddress: Int) {
     operator fun component1() = name
     operator fun component2() = street
     operator fun component3() = numberOfAddress

     fun copy(name: String = this.name, street: String = this.street, numberOfAddress: Int = this.numberOfAddress) : Address{
         return Address(name, street, numberOfAddress)
     }

     override fun equals(other: Any?): Boolean {
         if (this === other) return true
         if (javaClass != other?.javaClass) return false

         other as Address

         if (numberOfAddress != other.numberOfAddress) return false
         if (name != other.name) return false
         if (street != other.street) return false

         return true
     }

     override fun hashCode(): Int {
         var result = numberOfAddress
         result = 31 * result + name.hashCode()
         result = 31 * result + street.hashCode()
         return result
     }

     override fun toString(): String {
         return "Address(name='$name', street='$street', numberOfAddress=$numberOfAddress)"
     }
 }