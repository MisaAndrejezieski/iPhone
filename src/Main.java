public class Main {
    public static void main(String[] args) {
        iPhone myiPhone = new iPhone("iPhone 13", 128);

        // Testando ReprodutorMusical
        myiPhone.play();
        myiPhone.pause();
        myiPhone.stop();

        // Testando AparelhoTelefonico
        myiPhone.makeCall("123-456-7890");
        myiPhone.endCall();

        // Testando NavegadorInternet
        myiPhone.openPage("https://www.example.com");
        myiPhone.addBookmark("https://www.example.com");

        // Exibindo informações do iPhone
        System.out.println(myiPhone);
    }
}

