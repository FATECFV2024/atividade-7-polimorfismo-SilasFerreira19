public class Espeon extends Eevee{
    public Espeon(){
        setTipo("Psíquico");
        setEspecie("Pokémon Sol");
        setAltura(0.9f);
        setHp(65);
        setPeso(26.5);
        setEvolucao("Felicidade (Dia)");
        setHabilidade("Sincronizar");
        setHabilidade2("Salto Mágico");
    }

    @Override
    public String ataque(){
        return "Raio Psíquico - Psybeam";
    }

    @Override
    public String defesa(){
        return "Mente Calma - Calm Mind";
    }

    @Override
    public String especial(){
        return "Psíquico - Psychic";
    }
}
