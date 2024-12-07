public class Eevee {
    private String tipo;
    private float altura;
    private String especie;
    private int hp;
    private Double peso;
    private String evolucao;
    private String habilidade;
    private String habilidade2;   

    

    public Eevee() {
        this.tipo = "Normal";
        this.especie = "Pokémon Evolução";
        this.altura = 0.3f;
        this.hp = 55;
        this.peso = 6.5;
        this.evolucao = "Não Há";
        this.habilidade = "Fugir";
        this.habilidade2 = "Adaptabilidade";
    }

    public String getTipo() {
        return tipo;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getEvolucao() {
        return evolucao;
    }

    public void setEvolucao(String evolucao){
        this.evolucao = evolucao;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade){
        this.habilidade = habilidade;
    }

    public String getHabilidade2() {
        return habilidade2;
    }

    public void setHabilidade2(String habilidade2){
        this.habilidade2 = habilidade2;
    }

    public String ataque(){
        return "Ataque Rapido - Quick Attack";
    }

    public String defesa(){
        return "Balanço de Cauda - Tail Whip";
    }

    public String especial(){
        return "Desmantelar - Take Down";
    }

    public void imprimir(){
        System.out.println("Tipo: " + getTipo());
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Altura: " + getAltura() + " m");
        System.out.println("HP: " + getHp());
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Forma de evoluir: "+getEvolucao());
        System.out.println("Habilidade Primária: "+getHabilidade());
        System.out.println("Habilidade Secundaria: "+getHabilidade2());
        System.out.println("--------------------------------------");
        System.out.println("Ataque: " + ataque());
        System.out.println("Defesa: " + defesa());
        System.out.println("Especial: " + especial());
    }
}

