public class Vaporeon extends Eevee{
    public Vaporeon() {
        setTipo("Água");
        setEspecie("Pokémon Jato de Bolhas");
        setAltura(1.0f);
        setHp(130);
        setPeso(29.0);
        setEvolucao("Pedra da Água");
        setHabilidade("Absorção de Água");
        setHabilidade2("Hidratação");
    }

    @Override
    public String ataque(){
        return "Pulso de Água - Water Pulse";
    }

    @Override
    public String defesa(){
        return "Anel de Água - Aqua Ring";
    }

    @Override
    public String especial(){
        return "Hidro Bomba - Hydro Pump";
    }
}
