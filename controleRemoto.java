public class controleRemoto implements controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public controleRemoto(){
       this.volume = 50;
       this.ligado = false;
       this.tocando = false;
    }
    private int getVolume(){
        return volume;
    }
    private boolean getligado(){
        return ligado;
    }
    private boolean getTocando(){
        return tocando;
    }
    private void setVolume(int v){
        this.volume = v;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }
    @Override
    public  void ligar(){
       this.setLigado(true);
       this.setTocando(true);
    }
    @Override
    public  void desligar(){
       this.setLigado(false);
       this.setTocando(false);
    }
    @Override
    public  void abrirMenu(){
        System.out.println("-------MENU-------");
        System.out.println("está ligado? "+ this.getligado());
        System.out.println("está tocando? : " +this.getTocando());
        System.out.print("volume:" +this.getVolume());
        for(int i=0;i<=this.getVolume();i+=10){
            System.out.print("|");
        }
    }
    @Override
    public  void fecharMenu(){
       System.out.println("fechando menu...");
    }
    @Override
    public  void maisVolume(){
       if(this.getligado()){
        this.setVolume(this.getVolume()+1);
       }
    }
    @Override
    public  void menosVolume(){
        if(this.getligado()){
            this.setVolume(this.getVolume()-1);
           }
    }
    @Override
    public  void ligarMudo(){
        if(this.getligado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    @Override
    public  void desligarMudo(){
        if(this.getligado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    @Override
    public  void play(){
       if(this.getligado() && !(this.getTocando())){
        this.setTocando(true);
       }
    }
    @Override
    public  void pause(){
      if(this.getligado()&&this.getTocando()){
         this.setTocando(false);
      }
    }
}
