package pe.certus.clases;

public class items {
   Integer id;
   String nombre_item;
   Integer cantidad;

   public items(Integer id, String nombre_item, Integer cantidad) {
      this.id = id;
      this.nombre_item = nombre_item;
      this.cantidad = cantidad;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getNombre_item() {
      return nombre_item;
   }

   public void setNombre_item(String nombre_item) {
      this.nombre_item = nombre_item;
   }

   public Integer getCantidad() {
      return cantidad;
   }

   public void setCantidad(Integer cantidad) {
      this.cantidad = cantidad;
   }
}
