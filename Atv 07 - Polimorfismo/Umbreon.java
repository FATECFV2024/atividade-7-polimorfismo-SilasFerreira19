public class Umbreon extends Eevee{
    public Umbreon(){
        setTipo("Sombrio");
        setEspecie("Pokémon Luar");
        setAltura(1.0f);
        setHp(95);
        setPeso(27.0);
        setEvolucao("Felicidade (Noite)");
        setHabilidade("Sincronizar");
        setHabilidade2("Foco Interno");
    }

    @Override
    public String ataque(){
        return "Mordida - Bite";
    }

    @Override
    public String defesa(){
        return "Provocar - Taunt";
    }

    @Override
    public String especial(){
        return "Pulso Sombrio - Dark Pulse";
    }
}
