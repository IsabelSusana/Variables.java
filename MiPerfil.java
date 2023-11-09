public class MiPerfil {
    public static void main(String[] args) {
        //inserto mis datos para mi perfil
        String nombre="IsabelSuarez";
        int edad=26;
        double salarioDeseado=12000.00;
        char genero='f';
        boolean buscandoTrabajo=true;
        //Lo que queremos que se muestre
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(String.format("%.2f",salarioDeseado));
        System.out.println(genero);
        System.out.println(buscandoTrabajo);
    }
}
