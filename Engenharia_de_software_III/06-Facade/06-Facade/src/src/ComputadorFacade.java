package src;

/* Facade */
class ComputadorFacade {
    private UnidadeCentralDeProcessamento unidadeCentralDeProcessamento /*atributo*/;
    private Memoria memoria;
    private DiscoRigido discoRigido;
 
    public ComputadorFacade() {
        this.unidadeCentralDeProcessamento = new UnidadeCentralDeProcessamento();
        this.memoria = new Memoria/*classe*/ ();
        this.discoRigido = new DiscoRigido();
    }
 
    public void run() {
        unidadeCentralDeProcessamento.processarDado/*metodo*/();
        memoria.carregarDado();
        discoRigido.lerDado();
    }
}