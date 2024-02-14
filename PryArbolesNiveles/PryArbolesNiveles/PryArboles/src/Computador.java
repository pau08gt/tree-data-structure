public class Computador {

    private int codigo;

    private String marca;
    private String procesador;
    private int capacidadRAM;
    private String tarjetaVideo;
    private String capacidadAlmacenamiento;

    public Computador(int codigo, String marca, String procesador, int capacidadRAM, String tarjetaVideo, String capacidadAlmacenamiento) {
        this.codigo = codigo;
        this.marca = marca;
        this.procesador = procesador;
        this.capacidadRAM = capacidadRAM;
        this.tarjetaVideo = tarjetaVideo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getCapacidadRAM() {
        return capacidadRAM;
    }

    public void setCapacidadRAM(int capacidadRAM) {
        this.capacidadRAM = capacidadRAM;
    }

    public String getTarjetaVideo() {
        return tarjetaVideo;
    }

    public void setTarjetaVideo(String tarjetaVideo) {
        this.tarjetaVideo = tarjetaVideo;
    }

    public String getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(String capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    @Override
    public String toString() {
        return "Computador " +
                "Codigo: " + codigo +
                ", Marca: '" + marca + '\'' +
                ", procesador='" + procesador + '\'' +
                ", RAM: " + capacidadRAM +"GB "+
                ", GPU: '" + tarjetaVideo + '\'' +
                ", NVME: '" + capacidadAlmacenamiento + '\''+"\n";
    }
}
