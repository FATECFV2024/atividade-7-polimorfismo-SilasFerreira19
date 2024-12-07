public class Jolteon extends Eevee {
    
    public Jolteon(){
        setTipo("Eletrico");
        setEspecie("Pokémon Relâmpago");
        setAltura(0.8f);
        setHp(65);
        setPeso(24.5);
        setEvolucao("Pedra do Trovão");
        setHabilidade("Absorção de Volts");
        setHabilidade2("Passos Rapidos");
    }

    @Override
    public String ataque(){
        return "Trovoada - Thunder Shock";
    }

    @Override
    public String defesa(){
        return "Carga - Charge";
    }

    @Override
    public String especial(){
        return "Trovão - Thunder";
    }
}

