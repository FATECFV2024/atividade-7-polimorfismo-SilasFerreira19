
public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee e = new Eevee();
        Vaporeon v = new Vaporeon();
        Jolteon j = new Jolteon();
        Flareon f= new Flareon();
        Espeon e1 = new Espeon();
        Umbreon u = new Umbreon();
        Leafeon l = new Leafeon();
        Glaceon g = new Glaceon();
        Sylveon s = new Sylveon();

        System.out.println("=================== Pokédex ===================");
        System.out.println("\n#0133 Eevee");
        e.imprimir();
        System.out.println("======================================");

        System.out.println("\n#0134 Vaporeon");
        v.imprimir();
        System.out.println("======================================");

        System.out.println("\n#0135 Jolteon");
        j.imprimir();
        System.out.println("======================================");

        System.out.println("\n#0136 Flareon");
        f.imprimir();
        System.out.println("======================================");

        System.out.println("\n#0196 Espeon");
        e1.imprimir();
        System.out.println("======================================");

        System.out.println("\n#0197 Umbreon");
        u.imprimir();
        System.out.println("======================================");

        System.out.println("\n#0470 Leafeon");
        l.imprimir();
        System.out.println("======================================");

        System.out.println("\n#0471 Glaceon");
        g.imprimir();
        System.out.println("======================================");

        System.out.println("\n#0700 Sylveon");
        s.imprimir();
        System.out.println("======================================");
        System.out.println("\n=============== Fim do Registro ==============");


        // System.out.println("Eu sou: Eevee ");
        // System.out.println("Ataque: "+e.ataque());
        // System.out.println("Defesa: "+e.defesa());
        // System.out.println("Especial: "+e.especial());

        // System.out.println("");
        
        // System.out.println("Eu sou: Jolteon ");
        // System.out.println("Ataque: "+j.ataque());
        // System.out.println("Defesa: "+j.defesa());
        // System.out.println("Especial: "+j.especial());
        
        // e=j;
        // System.out.println("Ataque: "+e.ataque());
        // System.out.println("Defesa: "+e.defesa());
        // System.out.println("Especial: "+e.especial());
    }
}