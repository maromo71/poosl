public class Computador {

    //Atributos
    private String marca;
    private String cor;
    private String modelo;
    private long numeroSerie;
    private double preco;

   

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public long getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Métodos
    public void imprimir(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Número de Série: " + this.numeroSerie);
        System.out.println("Preço: " + this.preco);
    }

    public void calcularValor(){
        if(marca.equalsIgnoreCase("HP")){
            preco *= 1.30;
            return;
        }
        if(marca.equalsIgnoreCase("IBM")){
            preco *= 1.50;
        }
    }

    public boolean alterarValor(double valor){
        if(valor > 0){
            preco = valor;
            return true;
        }
        return false;
    }
    

}
