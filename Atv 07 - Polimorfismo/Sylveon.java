public class Sylveon extends Eevee{
    public Sylveon(){
        setTipo("Fada");
        setEspecie("Pokémon Entrelaçado");
        setAltura(1.0f);
        setHp(95);
        setPeso(23.5);
        setEvolucao("Felicidade alta após aprender ataque tipo Fada");
        setHabilidade("Charme Fofo");
        setHabilidade2("Pixilar");
    }

    @Override
    public String ataque(){
        return "Beijo Drenante - Draining Kiss";
    }

    @Override
    public String defesa(){
        return "Terreno Nebuloso - Misty Terrain";
    }

    @Override
    public String especial(){
        return "Explosão lunar - Moonblast";
    }
}
