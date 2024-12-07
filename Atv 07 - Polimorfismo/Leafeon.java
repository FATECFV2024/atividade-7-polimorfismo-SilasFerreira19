public class Leafeon extends Eevee{
    public Leafeon(){
        setTipo("Grama");
        setEspecie("Pokémon Verdejante");
        setAltura(1.0f);
        setHp(65);
        setPeso(25.5);
        setEvolucao("Subir de Nível perto da Mossy Rock | Pedra da Folha");
        setHabilidade("Proteção de Folhas");
        setHabilidade2("Clorofila");
    }

    @Override
    public String ataque(){
        return "Folha Navalha - Razor Leaf";
    }

    @Override
    public String defesa(){
        return "Síntese - Synthesis";
    }

    @Override
    public String especial(){
        return "Lâmina de Folha - Leaf Blade";
    }
}
