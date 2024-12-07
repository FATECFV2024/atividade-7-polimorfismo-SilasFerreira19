public class Flareon extends Eevee{
    public Flareon(){
        setTipo("Fogo");
        setEspecie("Pokémon Chama");
        setAltura(0.9f);
        setHp(65);
        setPeso(25.0);
        setEvolucao("Pedra do Fogo");
        setHabilidade("Fogo Rápido");
        setHabilidade2("Coragem");
    }

    @Override
    public String ataque(){
        return "Brasa - Ember";
    }

    @Override
    public String defesa(){
        return "Fogo-Fátuo - Will-O-Wisp";
    }

    @Override
    public String especial(){
        return "Blitz Flamejante - Flare Blitz";
    }
}
