public class Glaceon extends Eevee{
    public Glaceon(){
        setTipo("Gelo");
        setEspecie("Pokémon Neve Fresca");
        setAltura(0.8f);
        setHp(65);
        setPeso(25.9);
        setEvolucao("Subir de Nível perto da Icy Rock | Pedra do Gelo");
        setHabilidade("Capa de Neve");
        setHabilidade2("Corpo de Gelo");
    }

    @Override
    public String ataque(){
        return "Vento Gelado - Icy Wind";
    }

    @Override
    public String defesa(){
        return "Granizo - Hail";
    }

    @Override
    public String especial(){
        return "Nevasca - Blizzard";
    }
}
