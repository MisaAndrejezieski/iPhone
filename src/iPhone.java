public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String model;
    private int storageCapacity;

    // Construtor da classe iPhone
    public iPhone(String model, int storageCapacity) {
        this.model = model;
        this.storageCapacity = storageCapacity;
    }

    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music...");
    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }


    @Override
    public void endCall() {
        System.out.println("Ending call...");
    }

    // Implementação dos métodos de NavegadorInternet
    
    @Override
    public void openPage(String url) {
        System.out.println("Opening page " + url + "...");
    }

    
    @Override
    public void addBookmark(String url) {
        System.out.println("Adding bookmark for " + url + "...");
    }

    // Métodos adicionais para a classe iPhone
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return "iPhone{" +
                "model='" + model + '\'' +
                ", storageCapacity=" + storageCapacity +
                '}';
    }
}

